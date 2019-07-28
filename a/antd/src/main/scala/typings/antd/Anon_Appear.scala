package typings.antd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appear extends js.Object {
  def appear(): Unit
  def enter(node: HTMLElement, done: js.Function0[Unit]): js.Any
  def leave(node: HTMLElement, done: js.Function0[Unit]): js.Any
}

object Anon_Appear {
  @scala.inline
  def apply(
    appear: () => Unit,
    enter: (HTMLElement, js.Function0[Unit]) => js.Any,
    leave: (HTMLElement, js.Function0[Unit]) => js.Any
  ): Anon_Appear = {
    val __obj = js.Dynamic.literal(appear = js.Any.fromFunction0(appear), enter = js.Any.fromFunction2(enter), leave = js.Any.fromFunction2(leave))
  
    __obj.asInstanceOf[Anon_Appear]
  }
}

