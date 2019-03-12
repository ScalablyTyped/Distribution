package typings
package androiduixLib.androidNs.widgetNs.ExpandableListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupClickListener extends js.Object {
  def onGroupClick(
    parent: androiduixLib.androidNs.widgetNs.ExpandableListView,
    v: androiduixLib.androidNs.viewNs.View,
    groupPosition: scala.Double,
    id: scala.Double
  ): scala.Boolean
}

object OnGroupClickListener {
  @scala.inline
  def apply(
    onGroupClick: (androiduixLib.androidNs.widgetNs.ExpandableListView, androiduixLib.androidNs.viewNs.View, scala.Double, scala.Double) => scala.Boolean
  ): OnGroupClickListener = {
    val __obj = js.Dynamic.literal(onGroupClick = js.Any.fromFunction4(onGroupClick))
  
    __obj.asInstanceOf[OnGroupClickListener]
  }
}

