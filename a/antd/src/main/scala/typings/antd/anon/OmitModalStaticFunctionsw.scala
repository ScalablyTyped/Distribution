package typings.antd.anon

import typings.antd.confirmMod.ModalFunc
import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<antd.antd/lib/modal/confirm.ModalStaticFunctions, 'warn'> */
trait OmitModalStaticFunctionsw extends js.Object {
  var confirm: ModalFunc
  var error: ModalFunc
  var info: ModalFunc
  var success: ModalFunc
  var warning: ModalFunc
}

object OmitModalStaticFunctionsw {
  @scala.inline
  def apply(
    confirm: /* props */ ModalFuncProps => Destroy,
    error: /* props */ ModalFuncProps => Destroy,
    info: /* props */ ModalFuncProps => Destroy,
    success: /* props */ ModalFuncProps => Destroy,
    warning: /* props */ ModalFuncProps => Destroy
  ): OmitModalStaticFunctionsw = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[OmitModalStaticFunctionsw]
  }
}

