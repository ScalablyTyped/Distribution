package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCode extends StObject {
  
  var Cancel: Boolean = js.native
  
  val StatusCode: js.Any = js.native
  
  val TargetFrameName: String | Null = js.native
  
  val URL: String = js.native
  
  val pDisp: js.Any = js.native
}
object StatusCode {
  
  @scala.inline
  def apply(Cancel: Boolean, StatusCode: js.Any, URL: String, pDisp: js.Any): StatusCode = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  
  @scala.inline
  implicit class StatusCodeMutableBuilder[Self <: StatusCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: js.Any): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFrameNameNull: Self = StObject.set(x, "TargetFrameName", null)
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
