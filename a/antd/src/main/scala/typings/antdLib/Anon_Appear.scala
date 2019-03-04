package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appear extends js.Object {
  def appear(): scala.Unit
  def enter(node: reactLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
  def leave(node: reactLib.HTMLElement, done: js.Function0[scala.Unit]): js.Any
}

object Anon_Appear {
  @scala.inline
  def apply(
    appear: js.Function0[scala.Unit],
    enter: js.Function2[reactLib.HTMLElement, js.Function0[scala.Unit], js.Any],
    leave: js.Function2[reactLib.HTMLElement, js.Function0[scala.Unit], js.Any]
  ): Anon_Appear = {
    val __obj = js.Dynamic.literal(appear = appear, enter = enter, leave = leave)
  
    __obj.asInstanceOf[Anon_Appear]
  }
}

