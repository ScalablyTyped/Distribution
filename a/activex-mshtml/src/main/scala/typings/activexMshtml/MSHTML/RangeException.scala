package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeException extends StObject {
  
  @JSName("MSHTML.RangeException_typekey")
  var MSHTMLDotRangeException_typekey: RangeException = js.native
  
  var code: Double = js.native
  
  val message: String = js.native
}
object RangeException {
  
  @scala.inline
  def apply(MSHTMLDotRangeException_typekey: RangeException, code: Double, message: String): RangeException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.RangeException_typekey")(MSHTMLDotRangeException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeException]
  }
  
  @scala.inline
  implicit class RangeExceptionMutableBuilder[Self <: RangeException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotRangeException_typekey(value: RangeException): Self = StObject.set(x, "MSHTML.RangeException_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
