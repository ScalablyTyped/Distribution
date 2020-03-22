package typings.antd.hookModalMod

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookModalRef extends js.Object {
  def destroy(): Unit
  def update(config: ModalFuncProps): Unit
}

object HookModalRef {
  @scala.inline
  def apply(destroy: () => Unit, update: ModalFuncProps => Unit): HookModalRef = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HookModalRef]
  }
}

