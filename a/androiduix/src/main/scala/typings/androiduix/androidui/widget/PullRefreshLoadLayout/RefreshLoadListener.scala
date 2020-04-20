package typings.androiduix.androidui.widget.PullRefreshLoadLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshLoadListener extends js.Object {
  def onLoadMore(prll: typings.androiduix.androidui.widget.PullRefreshLoadLayout): Unit
  def onRefresh(prll: typings.androiduix.androidui.widget.PullRefreshLoadLayout): Unit
}

object RefreshLoadListener {
  @scala.inline
  def apply(
    onLoadMore: typings.androiduix.androidui.widget.PullRefreshLoadLayout => Unit,
    onRefresh: typings.androiduix.androidui.widget.PullRefreshLoadLayout => Unit
  ): RefreshLoadListener = {
    val __obj = js.Dynamic.literal(onLoadMore = js.Any.fromFunction1(onLoadMore), onRefresh = js.Any.fromFunction1(onRefresh))
    __obj.asInstanceOf[RefreshLoadListener]
  }
}

