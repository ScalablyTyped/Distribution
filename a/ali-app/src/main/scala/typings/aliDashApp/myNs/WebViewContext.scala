package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region webview组件控制 https://docs.alipay.com/mini/api/webview-context
trait WebViewContext extends js.Object {
  def postMessage(param: js.Any): Unit
}

object WebViewContext {
  @scala.inline
  def apply(postMessage: js.Any => Unit): WebViewContext = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
  
    __obj.asInstanceOf[WebViewContext]
  }
}

