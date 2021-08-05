package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDomainRequest extends StObject {
  
  /* private */ @JSName("MSHTML.XDomainRequest_typekey")
  var MSHTMLDotXDomainRequest_typekey: XDomainRequest
  
  val constructor: js.Any
}
object XDomainRequest {
  
  inline def apply(MSHTMLDotXDomainRequest_typekey: XDomainRequest, constructor: js.Any): XDomainRequest = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.XDomainRequest_typekey")(MSHTMLDotXDomainRequest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainRequest]
  }
  
  extension [Self <: XDomainRequest](x: Self) {
    
    inline def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotXDomainRequest_typekey(value: XDomainRequest): Self = StObject.set(x, "MSHTML.XDomainRequest_typekey", value.asInstanceOf[js.Any])
  }
}
