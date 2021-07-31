package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLMediaError extends StObject {
  
  @JSName("MSHTML.IHTMLMediaError_typekey")
  var MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError
  
  val code: Double
}
object IHTMLMediaError {
  
  @scala.inline
  def apply(MSHTMLDotIHTMLMediaError_typekey: IHTMLMediaError, code: Double): IHTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLMediaError_typekey")(MSHTMLDotIHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLMediaError]
  }
  
  @scala.inline
  implicit class IHTMLMediaErrorMutableBuilder[Self <: IHTMLMediaError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLMediaError_typekey(value: IHTMLMediaError): Self = StObject.set(x, "MSHTML.IHTMLMediaError_typekey", value.asInstanceOf[js.Any])
  }
}
