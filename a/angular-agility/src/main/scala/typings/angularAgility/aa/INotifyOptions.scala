package typings.angularAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyOptions extends js.Object {
  var allowHtml: Boolean = js.native
  var cssClasses: js.UndefOr[String] = js.native
  var message: String = js.native
  var messageType: String = js.native
}

object INotifyOptions {
  @scala.inline
  def apply(allowHtml: Boolean, message: String, messageType: String): INotifyOptions = {
    val __obj = js.Dynamic.literal(allowHtml = allowHtml.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyOptions]
  }
  @scala.inline
  implicit class INotifyOptionsOps[Self <: INotifyOptions] (val x: Self) extends AnyVal {
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
    def setAllowHtml(value: Boolean): Self = this.set("allowHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssClasses(value: String): Self = this.set("cssClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClasses: Self = this.set("cssClasses", js.undefined)
  }
  
}

