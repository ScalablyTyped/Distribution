package typings.atomDashKeymap.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import typings.std.CustomEvent
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
  extends CustomEvent[js.Any] {
  var keyBindingAborted: Boolean = js.native
  var propagationStopped: Boolean = js.native
  def abortKeyBinding(): Unit = js.native
}

