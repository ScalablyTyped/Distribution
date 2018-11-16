package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandEvent[CurrentTarget /* <: stdLib.EventTarget */]
  extends stdLib.CustomEvent[js.Any] {
  @JSName("currentTarget")
  var currentTarget_CommandEvent: CurrentTarget = js.native
  var keyBindingAborted: scala.Boolean = js.native
  var propagationStopped: scala.Boolean = js.native
  def abortKeyBinding(): scala.Unit = js.native
}

