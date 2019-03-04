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
    onLoadMore: js.Function1[androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout, scala.Unit],
    onRefresh: js.Function1[androiduixLib.androiduiNs.widgetNs.PullRefreshLoadLayout, scala.Unit]
  ): RefreshLoadListener = {
    val __obj = js.Dynamic.literal(onLoadMore = onLoadMore, onRefresh = onRefresh)
  
    __obj.asInstanceOf[RefreshLoadListener]
  }
}

