package typings.antd.anon

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends js.Object {
  def destroy(args: js.Any*): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Update {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Unit, update: ModalFuncProps => Unit): Update = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Update]
  }
}

