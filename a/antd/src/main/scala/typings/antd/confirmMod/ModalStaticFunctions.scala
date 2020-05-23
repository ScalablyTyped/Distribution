package typings.antd.confirmMod

import typings.antd.anon.Destroy
import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalStaticFunctions extends js.Object {
  var confirm: ModalFunc
  var error: ModalFunc
  var info: ModalFunc
  var success: ModalFunc
  var warn: ModalFunc
  var warning: ModalFunc
}

object ModalStaticFunctions {
  @scala.inline
  def apply(
    confirm: /* props */ ModalFuncProps => Destroy,
    error: /* props */ ModalFuncProps => Destroy,
    info: /* props */ ModalFuncProps => Destroy,
    success: /* props */ ModalFuncProps => Destroy,
    warn: /* props */ ModalFuncProps => Destroy,
    warning: /* props */ ModalFuncProps => Destroy
  ): ModalStaticFunctions = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[ModalStaticFunctions]
  }
}

