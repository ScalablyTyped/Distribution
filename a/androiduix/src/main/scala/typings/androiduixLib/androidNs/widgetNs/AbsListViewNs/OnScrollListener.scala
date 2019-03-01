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
    onScroll: js.Function4[
      androiduixLib.androidNs.widgetNs.AbsListView, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    onScrollStateChanged: js.Function2[androiduixLib.androidNs.widgetNs.AbsListView, scala.Double, scala.Unit]
  ): OnScrollListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onScroll")(onScroll)
    __obj.updateDynamic("onScrollStateChanged")(onScrollStateChanged)
    __obj.asInstanceOf[OnScrollListener]
  }
}

