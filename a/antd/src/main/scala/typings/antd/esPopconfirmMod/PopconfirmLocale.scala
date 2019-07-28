package typings.antd.esPopconfirmMod

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
    val __obj = js.Dynamic.literal(cancelText = cancelText, okText = okText)
  
    __obj.asInstanceOf[PopconfirmLocale]
  }
}

