package typings
package androiduixLib.androidNs.widgetNs.ExpandableListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChildClickListener extends js.Object {
  def onChildClick(
    parent: androiduixLib.androidNs.widgetNs.ExpandableListView,
    v: androiduixLib.androidNs.viewNs.View,
    groupPosition: scala.Double,
    childPosition: scala.Double,
    id: scala.Double
  ): scala.Boolean
}

object OnChildClickListener {
  @scala.inline
  def apply(
    onChildClick: (androiduixLib.androidNs.widgetNs.ExpandableListView, androiduixLib.androidNs.viewNs.View, scala.Double, scala.Double, scala.Double) => scala.Boolean
  ): OnChildClickListener = {
    val __obj = js.Dynamic.literal(onChildClick = js.Any.fromFunction5(onChildClick))
  
    __obj.asInstanceOf[OnChildClickListener]
  }
}

