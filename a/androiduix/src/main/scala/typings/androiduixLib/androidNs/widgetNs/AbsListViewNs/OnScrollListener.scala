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

