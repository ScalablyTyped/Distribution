package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region webview组件控制 https://docs.alipay.com/mini/api/webview-context
@js.native
trait WebViewContext extends js.Object {
  
  def postMessage(param: js.Any): Unit = js.native
}
object WebViewContext {
  
  @scala.inline
  def apply(postMessage: js.Any => Unit): WebViewContext = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[WebViewContext]
  }
  
  @scala.inline
  implicit class WebViewContextOps[Self <: WebViewContext] (val x: Self) extends AnyVal {
    
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
    def setPostMessage(value: js.Any => Unit): Self = this.set("postMessage", js.Any.fromFunction1(value))
  }
}
