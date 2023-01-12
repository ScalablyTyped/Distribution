package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLMediaError extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLMediaError_typekey")
  var MSHTMLDotHTMLMediaError_typekey: HTMLMediaError
  
  val code: Double
}
object HTMLMediaError {
  
  inline def apply(MSHTMLDotHTMLMediaError_typekey: HTMLMediaError, code: Double): HTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLMediaError_typekey")(MSHTMLDotHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLMediaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLMediaError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLMediaError_typekey(value: HTMLMediaError): Self = StObject.set(x, "MSHTML.HTMLMediaError_typekey", value.asInstanceOf[js.Any])
  }
}
