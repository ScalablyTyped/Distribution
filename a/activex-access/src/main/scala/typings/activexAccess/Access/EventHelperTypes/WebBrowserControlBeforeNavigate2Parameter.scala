package typings.activexAccess.Access.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebBrowserControlBeforeNavigate2Parameter extends js.Object {
  
  var Cancel: Boolean = js.native
  
  val Headers: js.Any = js.native
  
  val PostData: js.Any = js.native
  
  val TargetFrameName: String | Null = js.native
  
  val URL: String = js.native
  
  val flags: Double = js.native
  
  val pDisp: js.Any = js.native
}
object WebBrowserControlBeforeNavigate2Parameter {
  
  @scala.inline
  def apply(Cancel: Boolean, Headers: js.Any, PostData: js.Any, URL: String, flags: Double, pDisp: js.Any): WebBrowserControlBeforeNavigate2Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserControlBeforeNavigate2Parameter]
  }
  
  @scala.inline
  implicit class WebBrowserControlBeforeNavigate2ParameterOps[Self <: WebBrowserControlBeforeNavigate2Parameter] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostData(value: js.Any): Self = this.set("PostData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = this.set("pDisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFrameName(value: String): Self = this.set("TargetFrameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFrameNameNull: Self = this.set("TargetFrameName", null)
  }
}
