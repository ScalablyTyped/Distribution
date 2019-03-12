package typings
package androiduixLib.androidNs.widgetNs.AbsListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollListener extends js.Object {
  def onScroll(
    view: androiduixLib.androidNs.widgetNs.AbsListView,
    firstVisibleItem: scala.Double,
    visibleItemCount: scala.Double,
    totalItemCount: scala.Double
  ): scala.Unit
  def onScrollStateChanged(view: androiduixLib.androidNs.widgetNs.AbsListView, scrollState: scala.Double): scala.Unit
}

object OnScrollListener {
  @scala.inline
  def apply(
    onScroll: (androiduixLib.androidNs.widgetNs.AbsListView, scala.Double, scala.Double, scala.Double) => scala.Unit,
    onScrollStateChanged: (androiduixLib.androidNs.widgetNs.AbsListView, scala.Double) => scala.Unit
  ): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction4(onScroll), onScrollStateChanged = js.Any.fromFunction2(onScrollStateChanged))
  
    __obj.asInstanceOf[OnScrollListener]
  }
}

