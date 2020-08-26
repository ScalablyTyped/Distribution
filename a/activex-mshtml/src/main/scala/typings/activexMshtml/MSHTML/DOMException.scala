package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMException extends js.Object {
  @JSName("MSHTML.DOMException_typekey")
  var MSHTMLDotDOMException_typekey: DOMException = js.native
  var code: Double = js.native
  val message: String = js.native
}

object DOMException {
  @scala.inline
  def apply(MSHTMLDotDOMException_typekey: DOMException, code: Double, message: String): DOMException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMException_typekey")(MSHTMLDotDOMException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  @scala.inline
  implicit class DOMExceptionOps[Self <: DOMException] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotDOMException_typekey(value: DOMException): Self = this.set("MSHTML.DOMException_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

