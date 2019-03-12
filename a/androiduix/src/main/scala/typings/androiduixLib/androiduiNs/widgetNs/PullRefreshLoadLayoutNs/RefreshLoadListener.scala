package typings
package androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshLoadListener extends js.Object {
  def onLoadMore(prll: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout): scala.Unit
  def onRefresh(prll: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout): scala.Unit
}

object RefreshLoadListener {
  @scala.inline
  def apply(
    onLoadMore: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout => scala.Unit,
    onRefresh: androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout => scala.Unit
  ): RefreshLoadListener = {
    val __obj = js.Dynamic.literal(onLoadMore = js.Any.fromFunction1(onLoadMore), onRefresh = js.Any.fromFunction1(onRefresh))
  
    __obj.asInstanceOf[RefreshLoadListener]
  }
}

