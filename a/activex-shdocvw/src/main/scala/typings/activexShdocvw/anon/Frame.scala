package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends StObject {
  
  val Frame: js.Any = js.native
  
  val RedirectURL: js.Any = js.native
  
  val StartURL: js.Any = js.native
  
  val StatusCode: js.Any = js.native
  
  val pDisp: js.Any = js.native
}
object Frame {
  
  @scala.inline
  def apply(Frame: js.Any, RedirectURL: js.Any, StartURL: js.Any, StatusCode: js.Any, pDisp: js.Any): Frame = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], StartURL = StartURL.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: js.Any): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: js.Any): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartURL(value: js.Any): Self = StObject.set(x, "StartURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: js.Any): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
  }
}
