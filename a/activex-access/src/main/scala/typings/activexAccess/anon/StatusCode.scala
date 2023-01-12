package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCode extends StObject {
  
  var Cancel: Boolean
  
  val StatusCode: Any
  
  val TargetFrameName: String | Null
  
  val URL: String
  
  val pDisp: Any
}
object StatusCode {
  
  inline def apply(Cancel: Boolean, StatusCode: Any, URL: String, pDisp: Any): StatusCode = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any], TargetFrameName = null)
    __obj.asInstanceOf[StatusCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusCode] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Any): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
    
    inline def setTargetFrameNameNull: Self = StObject.set(x, "TargetFrameName", null)
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
