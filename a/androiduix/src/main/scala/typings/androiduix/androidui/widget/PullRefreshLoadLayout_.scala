package typings.androiduix.androidui.widget

import typings.androiduix.android.view.View
import typings.androiduix.android.widget.FrameLayout
import typings.androiduix.androidui.widget.PullRefreshLoadLayout.FooterView
import typings.androiduix.androidui.widget.PullRefreshLoadLayout.HeaderView
import typings.androiduix.androidui.widget.PullRefreshLoadLayout.RefreshLoadListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRefreshLoadLayout_ extends FrameLayout {
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

