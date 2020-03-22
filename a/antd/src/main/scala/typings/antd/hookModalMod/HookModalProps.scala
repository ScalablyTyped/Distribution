package typings.antd.hookModalMod

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookModalProps extends js.Object {
  var config: ModalFuncProps
  def afterClose(): Unit
}

object HookModalProps {
  @scala.inline
  def apply(afterClose: () => Unit, config: ModalFuncProps): HookModalProps = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookModalProps]
  }
}

