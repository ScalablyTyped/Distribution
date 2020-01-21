package typings.antd

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: () => Unit, update: ModalFuncProps => Unit): AnonDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnonDestroy]
  }
}

