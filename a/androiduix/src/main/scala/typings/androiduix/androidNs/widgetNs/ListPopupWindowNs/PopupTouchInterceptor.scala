package typings.androiduix.androidNs.widgetNs.ListPopupWindowNs

import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewNs.OnTouchListener
import typings.androiduix.androidNs.widgetNs.ListPopupWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow.PopupTouchInterceptor")
@js.native
class PopupTouchInterceptor protected () extends OnTouchListener {
  def this(arg: ListPopupWindow) = this()
  var _ListPopupWindow_this: ListPopupWindow = js.native
  /* CompleteClass */
  override def onTouch(v: View, event: MotionEvent): Unit = js.native
}

