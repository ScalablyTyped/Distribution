package typings
package androiduixLib.androiduiNs.nativeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeWebView")
@js.native
class NativeWebView protected ()
  extends androiduixLib.androidNs.webkitNs.WebView {
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: js.Any) = this()
  var mBoundRect: js.Any = js.native
  var mCanGoBack: js.Any = js.native
  var mLocationTmp: js.Any = js.native
  var mRectTmp: js.Any = js.native
  var mTitle: js.Any = js.native
  var mUrl: js.Any = js.native
}

/* static members */
@JSGlobal("androidui.native.NativeWebView")
@js.native
object NativeWebView extends js.Object {
  /* private */ def notifyLoadFinish(viewHash: js.Any, url: js.Any, title: js.Any): js.Any = js.native
  /* private */ def notifyWebViewHistoryChange(viewHash: js.Any, currentHistoryIndex: js.Any, historySize: js.Any): js.Any = js.native
}

