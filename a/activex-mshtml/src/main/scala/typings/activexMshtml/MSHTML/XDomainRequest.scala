package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDomainRequest extends js.Object {
  @JSName("MSHTML.XDomainRequest_typekey")
  var MSHTMLDotXDomainRequest_typekey: XDomainRequest
  val constructor: js.Any
}

object XDomainRequest {
  @scala.inline
  def apply(MSHTMLDotXDomainRequest_typekey: XDomainRequest, constructor: js.Any): XDomainRequest = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.XDomainRequest_typekey")(MSHTMLDotXDomainRequest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainRequest]
  }
}

