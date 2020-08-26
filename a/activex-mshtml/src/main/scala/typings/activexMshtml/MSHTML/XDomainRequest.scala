package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDomainRequest extends js.Object {
  @JSName("MSHTML.XDomainRequest_typekey")
  var MSHTMLDotXDomainRequest_typekey: XDomainRequest = js.native
  val constructor: js.Any = js.native
}

object XDomainRequest {
  @scala.inline
  def apply(MSHTMLDotXDomainRequest_typekey: XDomainRequest, constructor: js.Any): XDomainRequest = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.XDomainRequest_typekey")(MSHTMLDotXDomainRequest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainRequest]
  }
  @scala.inline
  implicit class XDomainRequestOps[Self <: XDomainRequest] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotXDomainRequest_typekey(value: XDomainRequest): Self = this.set("MSHTML.XDomainRequest_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
  }
  
}

