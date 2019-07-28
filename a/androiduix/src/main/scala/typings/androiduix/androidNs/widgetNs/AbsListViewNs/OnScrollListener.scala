package typings.androiduix.androidNs.widgetNs.AbsListViewNs

import typings.androiduix.androidNs.widgetNs.AbsListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollListener extends js.Object {
  def onScroll(view: AbsListView, firstVisibleItem: Double, visibleItemCount: Double, totalItemCount: Double): Unit
  def onScrollStateChanged(view: AbsListView, scrollState: Double): Unit
}

object OnScrollListener {
  @scala.inline
  def apply(
    onScroll: (AbsListView, Double, Double, Double) => Unit,
    onScrollStateChanged: (AbsListView, Double) => Unit
  ): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction4(onScroll), onScrollStateChanged = js.Any.fromFunction2(onScrollStateChanged))
  
    __obj.asInstanceOf[OnScrollListener]
  }
}

