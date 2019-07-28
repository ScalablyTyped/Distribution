package typings.androiduix.androidNs.widgetNs.ListPopupWindowNs

import typings.androiduix.androidNs.widgetNs.AbsListView
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.OnScrollListener
import typings.androiduix.androidNs.widgetNs.ListPopupWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow.PopupScrollListener")
@js.native
class PopupScrollListener protected () extends OnScrollListener {
  def this(arg: ListPopupWindow) = this()
  var _ListPopupWindow_this: ListPopupWindow = js.native
  /* CompleteClass */
  override def onScroll(view: AbsListView, firstVisibleItem: Double, visibleItemCount: Double, totalItemCount: Double): Unit = js.native
  /* CompleteClass */
  override def onScrollStateChanged(view: AbsListView, scrollState: Double): Unit = js.native
}

