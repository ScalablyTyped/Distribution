package typings.androiduix.androiduiNs.widgetNs

import org.scalablytyped.runtime.NumberDictionary
import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.FrameLayout
import typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayoutNs.FooterView
import typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayoutNs.HeaderView
import typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayoutNs.RefreshLoadListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout")
@js.native
class PullRefreshLoadLayout protected () extends FrameLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var autoLoadScrollAtBottom: js.Any = js.native
  var contentOverY: js.Any = js.native
  var contentView: js.Any = js.native
  var footerView: js.Any = js.native
  var footerViewReadyDistance: js.Any = js.native
  var headerView: js.Any = js.native
  var overScrollLocker: js.Any = js.native
  var refreshLoadListener: js.Any = js.native
  /* private */ def checkHeaderFooterPosition(): js.Any = js.native
  /* private */ def checkLockOverScroll(): js.Any = js.native
  /* private */ def configContentView(): js.Any = js.native
  /* private */ def configFooterView(): js.Any = js.native
  /* private */ def configHeaderView(): js.Any = js.native
  def getFooterState(): Double = js.native
  def getHeaderState(): Double = js.native
  /* private */ def onContentOverScroll(scrollRangeY: js.Any, maxOverScrollY: js.Any, isTouchEvent: js.Any): js.Any = js.native
  def setAutoLoadMoreWhenScrollBottom(autoLoad: Boolean): Unit = js.native
  def setContentView(contentView: View): Unit = js.native
  def setFooterState(newState: Double): Unit = js.native
  def setFooterView(footerView: FooterView): Unit = js.native
  /* private */ def setFooterViewAppearDistance(distance: js.Any): js.Any = js.native
  def setHeaderState(newState: Double): Unit = js.native
  def setHeaderView(headerView: HeaderView): Unit = js.native
  /* private */ def setHeaderViewAppearDistance(distance: js.Any): js.Any = js.native
  def setLoadEnable(enable: Boolean): Unit = js.native
  def setRefreshEnable(enable: Boolean): Unit = js.native
  def setRefreshLoadListener(refreshLoadListener: RefreshLoadListener): Unit = js.native
  def startLoadMore(): Unit = js.native
  def startRefresh(): Unit = js.native
}

/* static members */
@JSGlobal("androidui.widget.PullRefreshLoadLayout")
@js.native
object PullRefreshLoadLayout extends js.Object {
  var StateChangeLimit: NumberDictionary[js.Array[Double]] = js.native
  var State_Disable: Double = js.native
  var State_Footer_LoadFail: Double = js.native
  var State_Footer_Loading: Double = js.native
  var State_Footer_NoMoreToLoad: Double = js.native
  var State_Footer_Normal: Double = js.native
  var State_Footer_ReadyToLoad: Double = js.native
  var State_Header_Normal: Double = js.native
  var State_Header_ReadyToRefresh: Double = js.native
  var State_Header_RefreshFail: Double = js.native
  var State_Header_Refreshing: Double = js.native
}

