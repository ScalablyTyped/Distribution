package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppearDone extends js.Object {
  var appear: scala.Null
  def enter(node: stdLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
  def leave(node: stdLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
}

object Anon_AppearDone {
  @scala.inline
  def apply(
    appear: scala.Null,
    enter: (stdLib.HTMLElement, js.Function0[scala.Unit]) => js.Any,
    leave: (stdLib.HTMLElement, js.Function0[scala.Unit]) => js.Any
  ): Anon_AppearDone = {
    val __obj = js.Dynamic.literal(appear = appear, enter = js.Any.fromFunction2(enter), leave = js.Any.fromFunction2(leave))
  
    __obj.asInstanceOf[Anon_AppearDone]
  }
}

