package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout")
@js.native
class PullRefreshLoadLayout protected ()
  extends androiduixLib.androidNs.widgetNs.FrameLayout {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
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
  def getFooterState(): scala.Double = js.native
  def getHeaderState(): scala.Double = js.native
  /* private */ def onContentOverScroll(scrollRangeY: js.Any, maxOverScrollY: js.Any, isTouchEvent: js.Any): js.Any = js.native
  def setAutoLoadMoreWhenScrollBottom(autoLoad: scala.Boolean): scala.Unit = js.native
  def setContentView(contentView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setFooterState(newState: scala.Double): scala.Unit = js.native
  def setFooterView(footerView: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayoutNs.FooterView): scala.Unit = js.native
  /* private */ def setFooterViewAppearDistance(distance: js.Any): js.Any = js.native
  def setHeaderState(newState: scala.Double): scala.Unit = js.native
  def setHeaderView(headerView: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayoutNs.HeaderView): scala.Unit = js.native
  /* private */ def setHeaderViewAppearDistance(distance: js.Any): js.Any = js.native
  def setLoadEnable(enable: scala.Boolean): scala.Unit = js.native
  def setRefreshEnable(enable: scala.Boolean): scala.Unit = js.native
  def setRefreshLoadListener(
    refreshLoadListener: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayoutNs.RefreshLoadListener
  ): scala.Unit = js.native
  def startLoadMore(): scala.Unit = js.native
  def startRefresh(): scala.Unit = js.native
}

/* static members */
@JSGlobal("androidui.widget.PullRefreshLoadLayout")
@js.native
object PullRefreshLoadLayout extends js.Object {
  var StateChangeLimit: org.scalablytyped.runtime.NumberDictionary[js.Array[scala.Double]] = js.native
  var State_Disable: scala.Double = js.native
  var State_Footer_LoadFail: scala.Double = js.native
  var State_Footer_Loading: scala.Double = js.native
  var State_Footer_NoMoreToLoad: scala.Double = js.native
  var State_Footer_Normal: scala.Double = js.native
  var State_Footer_ReadyToLoad: scala.Double = js.native
  var State_Header_Normal: scala.Double = js.native
  var State_Header_ReadyToRefresh: scala.Double = js.native
  var State_Header_RefreshFail: scala.Double = js.native
  var State_Header_Refreshing: scala.Double = js.native
}

