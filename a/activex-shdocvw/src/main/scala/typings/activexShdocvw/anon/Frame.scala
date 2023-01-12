package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  val Frame: Any
  
  val RedirectURL: Any
  
  val StartURL: Any
  
  val StatusCode: Any
  
  val pDisp: Any
}
object Frame {
  
  inline def apply(Frame: Any, RedirectURL: Any, StartURL: Any, StatusCode: Any, pDisp: Any): Frame = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], StartURL = StartURL.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: Any): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: Any): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setStartURL(value: Any): Self = StObject.set(x, "StartURL", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Any): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
  }
}
