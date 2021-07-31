package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDomainRequest extends StObject {
  
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
  
  @scala.inline
  implicit class XDomainRequestMutableBuilder[Self <: XDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotXDomainRequest_typekey(value: XDomainRequest): Self = StObject.set(x, "MSHTML.XDomainRequest_typekey", value.asInstanceOf[js.Any])
  }
}
