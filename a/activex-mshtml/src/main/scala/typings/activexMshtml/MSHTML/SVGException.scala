package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGException extends StObject {
  
  /* private */ @JSName("MSHTML.SVGException_typekey")
  var MSHTMLDotSVGException_typekey: SVGException
  
  var code: Double
  
  val message: String
}
object SVGException {
  
  inline def apply(MSHTMLDotSVGException_typekey: SVGException, code: Double, message: String): SVGException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGException_typekey")(MSHTMLDotSVGException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGException]
  }
  
  extension [Self <: SVGException](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGException_typekey(value: SVGException): Self = StObject.set(x, "MSHTML.SVGException_typekey", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
