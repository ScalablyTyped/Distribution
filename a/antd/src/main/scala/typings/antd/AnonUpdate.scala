package typings.antd

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdate extends js.Object {
  def destroy(args: js.Any*): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object AnonUpdate {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Unit, update: ModalFuncProps => Unit): AnonUpdate = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnonUpdate]
  }
}

