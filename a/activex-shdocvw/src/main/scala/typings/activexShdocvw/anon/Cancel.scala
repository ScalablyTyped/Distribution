package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var Cancel: Boolean
  
  val Frame: Any
  
  val StatusCode: Any
  
  val URL: Any
  
  val pDisp: Any
}
object Cancel {
  
  inline def apply(Cancel: Boolean, Frame: Any, StatusCode: Any, URL: Any, pDisp: Any): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Any): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Any): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setURL(value: Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
