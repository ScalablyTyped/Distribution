package typings.antd.popconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopconfirmLocale extends js.Object {
  var cancelText: String = js.native
  var okText: String = js.native
}

object PopconfirmLocale {
  @scala.inline
  def apply(cancelText: String, okText: String): PopconfirmLocale = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopconfirmLocale]
  }
  @scala.inline
  implicit class PopconfirmLocaleOps[Self <: PopconfirmLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
  }
  
}

