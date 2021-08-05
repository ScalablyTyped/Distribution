package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeException extends StObject {
  
  /* private */ @JSName("MSHTML.RangeException_typekey")
  var MSHTMLDotRangeException_typekey: RangeException
  
  var code: Double
  
  val message: String
}
object RangeException {
  
  inline def apply(MSHTMLDotRangeException_typekey: RangeException, code: Double, message: String): RangeException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.RangeException_typekey")(MSHTMLDotRangeException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeException]
  }
  
  extension [Self <: RangeException](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotRangeException_typekey(value: RangeException): Self = StObject.set(x, "MSHTML.RangeException_typekey", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
