package typings.atAngularCore.atAngularCoreMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array located in the StylingContext that houses all directive instances and additional
  * data about them.
  *
  * Each entry in this array represents a source of where style/class binding values could
  * come from. By default, there is always at least one directive here with a null value and
  * that represents bindings that live directly on an element in the template (not host bindings).
  *
  * Each successive entry in the array is an actual instance of a directive as well as some
  * additional info about that entry.
  *
  * An entry within this array has the following values:
  * [0] = The instance of the directive (the first entry is null because its reserved for the
  *       template)
  * [1] = The pointer that tells where the single styling (stuff like [class.foo] and [style.prop])
  *       offset values are located. This value will allow for a binding instruction to find exactly
  *       where a style is located.
  * [2] = Whether or not the directive has any styling values that are dirty. This is used as
  *       reference within the `renderStyling` function to decide whether to skip iterating
  *       through the context when rendering is executed.
  * [3] = The styleSanitizer instance that is assigned to the directive. Although it's unlikely,
  *       a directive could introduce its own special style sanitizer and for this reach each
  *       directive will get its own space for it (if null then the very first sanitizer is used).
  *
  * Each time a new directive is added it will insert these four values at the end of the array.
  * When this array is examined then the resulting directiveIndex will be resolved by dividing the
  * index value by the size of the array entries (so if DirA is at spot 8 then its index will be 2).
  */
@js.native
trait DirectiveRegistryValues
  extends Array[Null | js.Object | Boolean | Double | StyleSanitizeFn]

