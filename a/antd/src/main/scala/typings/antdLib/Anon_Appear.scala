package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appear extends js.Object {
  def appear(): scala.Unit
  def enter(node: stdLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
  def leave(node: stdLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
}

object Anon_Appear {
  @scala.inline
  def apply(
    appear: () => scala.Unit,
    enter: (stdLib.HTMLElement, js.Function0[scala.Unit]) => js.Any,
    leave: (stdLib.HTMLElement, js.Function0[scala.Unit]) => js.Any
  ): Anon_Appear = {
    val __obj = js.Dynamic.literal(appear = js.Any.fromFunction0(appear), enter = js.Any.fromFunction2(enter), leave = js.Any.fromFunction2(leave))
  
    __obj.asInstanceOf[Anon_Appear]
  }
}

