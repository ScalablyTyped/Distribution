package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends js.Object {
  
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
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrame(value: js.Any): Self = this.set("Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: js.Any): Self = this.set("RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartURL(value: js.Any): Self = this.set("StartURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: js.Any): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = this.set("pDisp", value.asInstanceOf[js.Any])
  }
}
