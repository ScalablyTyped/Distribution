package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppearDone extends js.Object {
  var appear: scala.Null
  def enter(node: reactLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
  def leave(node: reactLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
}

object Anon_AppearDone {
  @scala.inline
  def apply(
    appear: scala.Null,
    enter: js.Function2[reactLib.HTMLElement, js.Function0[scala.Unit], js.Any],
    leave: js.Function2[reactLib.HTMLElement, js.Function0[scala.Unit], js.Any]
  ): Anon_AppearDone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appear")(appear)
    __obj.updateDynamic("enter")(enter)
    __obj.updateDynamic("leave")(leave)
    __obj.asInstanceOf[Anon_AppearDone]
  }
}

