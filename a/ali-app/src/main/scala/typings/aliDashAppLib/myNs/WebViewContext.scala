package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region webview组件控制 https://docs.alipay.com/mini/api/webview-context
trait WebViewContext extends js.Object {
  def postMessage(param: js.Any): scala.Unit
}

object WebViewContext {
  @scala.inline
  def apply(postMessage: js.Function1[js.Any, scala.Unit]): WebViewContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postMessage")(postMessage)
    __obj.asInstanceOf[WebViewContext]
  }
}

