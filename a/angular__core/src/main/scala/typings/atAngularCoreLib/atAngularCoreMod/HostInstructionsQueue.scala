package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A queue of all host-related styling instructions (these are buffered and evaluated just before
  * the styling is applied).
  *
  * This queue is used when any `hostStyling` instructions are executed from the `hostBindings`
  * function. Template-level styling functions (e.g. `elementStylingMap` and `elementClassProp`)
  * do not make use of this queue (they are applied to the styling context immediately).
  *
  * Due to the nature of how components/directives are evaluated, directives (both parent and
  * subclass directives) may not apply their styling at the right time for the styling
  * algorithm code to prioritize them. Therefore, all host-styling instructions are queued up
  * (buffered) into the array below and are automatically sorted in terms of priority. The
  * priority for host-styling is as follows:
  *
  * 1. The template (this doesn't get queued, but gets evaluated immediately)
  * 2. Any directives present on the host
  *   2a) first child directive styling bindings are updated
  *   2b) then any parent directives
  * 3. Component host bindings
  *
  * Angular runs change detection for each of these cases in a different order. Because of this
  * the array below is populated with each of the host styling functions + their arguments.
  *
  * context[HostInstructionsQueue] = [
  *   directiveIndex,
  *   hostStylingFn,
  *   [argumentsForFn],
  *   ...
  *   anotherDirectiveIndex, <-- this has a lower priority (a higher directive index)
  *   anotherHostStylingFn,
  *   [argumentsForFn],
  * ]
  *
  * When `renderStyling` is called (within `class_and_host_bindings.ts`) then the queue is
  * drained and each of the instructions are executed. Once complete the queue is empty then
  * the style/class binding code is rendered on the element (which is what happens normally
  * inside of `renderStyling`).
  *
  * Right now each directive's hostBindings function, as well the template function, both
  * call `elementStylingApply()` and `hostStylingApply()`. The fact that this is called
  * multiple times for the same element (b/c of change detection) causes some issues. To avoid
  * having styling code be rendered on an element multiple times, the `HostInstructionsQueue`
  * reserves a slot for a reference pointing to the very last directive that was registered and
  * only allows for styling to be applied once that directive is encountered (which will happen
  * as the last update for that element).
  */
@js.native
trait HostInstructionsQueue
  extends stdLib.Array[scala.Double | js.Function | js.Array[js.Any]]

