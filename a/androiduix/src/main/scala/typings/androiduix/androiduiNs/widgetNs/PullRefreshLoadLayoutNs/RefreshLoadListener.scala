package typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayoutNs

import typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshLoadListener extends js.Object {
  def onLoadMore(prll: PullRefreshLoadLayout): Unit
  def onRefresh(prll: PullRefreshLoadLayout): Unit
}

object RefreshLoadListener {
  @scala.inline
  def apply(onLoadMore: PullRefreshLoadLayout => Unit, onRefresh: PullRefreshLoadLayout => Unit): RefreshLoadListener = {
    val __obj = js.Dynamic.literal(onLoadMore = js.Any.fromFunction1(onLoadMore), onRefresh = js.Any.fromFunction1(onRefresh))
  
    __obj.asInstanceOf[RefreshLoadListener]
  }
}

