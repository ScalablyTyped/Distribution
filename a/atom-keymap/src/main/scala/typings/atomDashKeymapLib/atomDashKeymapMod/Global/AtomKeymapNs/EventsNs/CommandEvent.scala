package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  This custom subclass of CustomEvent exists to provide the ::abortKeyBinding
  *  method, as well as versions of the ::stopPropagation methods that record the
  *  intent to stop propagation so event bubbling can be properly simulated for
  *  detached elements.
  */
@js.native
trait CommandEvent
  extends stdLib.CustomEvent[js.Any] {
  var keyBindingAborted: scala.Boolean = js.native
  var propagationStopped: scala.Boolean = js.native
  def abortKeyBinding(): scala.Unit = js.native
}

