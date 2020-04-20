package typings.antd.popconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmLocale extends js.Object {
  var cancelText: String
  var okText: String
}

object PopconfirmLocale {
  @scala.inline
  def apply(cancelText: String, okText: String): PopconfirmLocale = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopconfirmLocale]
  }
}

