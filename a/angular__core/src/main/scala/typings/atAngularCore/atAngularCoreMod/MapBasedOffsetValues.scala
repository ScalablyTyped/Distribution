package typings.atAngularCore.atAngularCoreMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used a reference for all multi styling values (values that are assigned via the
  * `[style]` and `[class]` bindings).
  *
  * Single-styling properties (things set via `[style.prop]` and `[class.name]` bindings)
  * are not handled using the same approach as multi-styling bindings (such as `[style]`
  * `[class]` bindings).
  *
  * Multi-styling bindings rely on a diffing algorithm to figure out what properties have been added,
  * removed and modified. Multi-styling properties are also evaluated across directives--which means
  * that Angular supports having multiple directives all write to the same `[style]` and `[class]`
  * bindings (using host bindings) even if the `[style]` and/or `[class]` bindings are being written
  * to on the template element.
  *
  * All multi-styling values that are written to an element (whether it be from the template or any
  * directives attached to the element) are all written into the `MapBasedOffsetValues` array. (Note
  * that there are two arrays: one for styles and another for classes.)
  *
  * This array is shaped in the following way:
  *
  * [0]  = The total amount of unique multi-style or multi-class entries that exist currently in the
  *        context.
  * [1+] = Contains an entry of four values ... Each entry is a value assigned by a
  * `[style]`/`[class]`
  *        binding (we call this a **source**).
  *
  *        An example entry looks like so (at a given `i` index):
  *        [i + 0] = Whether or not the value is dirty
  *
  *        [i + 1] = The index of where the map-based values
  *                  (for this **source**) start within the context
  *
  *        [i + 2] = The untouched, last set value of the binding
  *
  *        [i + 3] = The total amount of unqiue binding values that were
  *                  extracted and set into the context. (Note that this value does
  *                  not reflect the total amount of values within the binding
  *                  value (since it's a map), but instead reflects the total values
  *                  that were not used by another directive).
  *
  * Each time a directive (or template) writes a value to a `[class]`/`[style]` binding then the
  * styling diffing algorithm code will decide whether or not to update the value based on the
  * following rules:
  *
  * 1. If a more important directive (either the template or a directive that was registered
  *    beforehand) has written a specific styling value into the context then any follow-up styling
  *    values (set by another directive via its `[style]` and/or `[class]` host binding) will not be
  *    able to set it. This is because the former directive has priorty.
  * 2. Only if a former directive has set a specific styling value to null (whether by actually
  *    setting it to null or not including it in is map value) then a less imporatant directive can
  *    set its own value.
  *
  * ## How the map-based styling algorithm updates itself
  */
@js.native
trait MapBasedOffsetValues
  extends Array[js.Any]

