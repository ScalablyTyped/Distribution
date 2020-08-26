package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OkText extends js.Object {
  var cancelText: String = js.native
  var okText: String = js.native
}

object OkText {
  @scala.inline
  def apply(cancelText: String, okText: String): OkText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkText]
  }
  @scala.inline
  implicit class OkTextOps[Self <: OkText] (val x: Self) extends AnyVal {
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

