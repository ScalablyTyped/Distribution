package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLMediaError extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLMediaError_typekey")
  var MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError
  
  val code: Double
}
object IHTMLMediaError {
  
  inline def apply(MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError, code: Double): IHTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLMediaError_typekey")(MSHTMLDotIHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLMediaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHTMLMediaError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLMediaError_typekey(value: IHTMLMediaError): Self = StObject.set(x, "MSHTML.IHTMLMediaError_typekey", value.asInstanceOf[js.Any])
  }
}
