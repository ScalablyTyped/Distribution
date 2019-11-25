package typings.antd.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalLocale extends js.Object {
  var cancelText: String
  var justOkText: String
  var okText: String
}

object ModalLocale {
  @scala.inline
  def apply(cancelText: String, justOkText: String, okText: String): ModalLocale = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModalLocale]
  }
}

