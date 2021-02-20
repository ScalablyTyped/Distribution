package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Frame: js.Any = js.native
  
  val StatusCode: js.Any = js.native
  
  val URL: js.Any = js.native
  
  val pDisp: js.Any = js.native
}
object Cancel {
  
  @scala.inline
  def apply(Cancel: Boolean, Frame: js.Any, StatusCode: js.Any, URL: js.Any, pDisp: js.Any): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: js.Any): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: js.Any): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: js.Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
