package typings.antd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppear extends js.Object {
  def appear(): Unit
  def enter(node: HTMLElement, done: js.Function0[Unit]): js.Any
  def leave(node: HTMLElement, done: js.Function0[Unit]): js.Any
}

object AnonAppear {
  @scala.inline
  def apply(
    appear: () => Unit,
    enter: (HTMLElement, js.Function0[Unit]) => js.Any,
    leave: (HTMLElement, js.Function0[Unit]) => js.Any
  ): AnonAppear = {
    val __obj = js.Dynamic.literal(appear = js.Any.fromFunction0(appear), enter = js.Any.fromFunction2(enter), leave = js.Any.fromFunction2(leave))
  
    __obj.asInstanceOf[AnonAppear]
  }
}

