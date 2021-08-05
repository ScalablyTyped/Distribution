package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMException extends StObject {
  
  /* private */ @JSName("MSHTML.DOMException_typekey")
  var MSHTMLDotDOMException_typekey: DOMException
  
  var code: Double
  
  val message: String
}
object DOMException {
  
  inline def apply(MSHTMLDotDOMException_typekey: DOMException, code: Double, message: String): DOMException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMException_typekey")(MSHTMLDotDOMException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  
  extension [Self <: DOMException](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotDOMException_typekey(value: DOMException): Self = StObject.set(x, "MSHTML.DOMException_typekey", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
