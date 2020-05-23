package typings.antd.anon

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroy extends js.Object {
  def destroy(): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Destroy {
  @scala.inline
  def apply(destroy: () => Unit, update: ModalFuncProps => Unit): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Destroy]
  }
}

