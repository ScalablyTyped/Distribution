package typings.androiduix.androidNs.widgetNs.ExpandableListViewNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.ExpandableListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupClickListener extends js.Object {
  def onGroupClick(parent: ExpandableListView, v: View, groupPosition: Double, id: Double): Boolean
}

object OnGroupClickListener {
  @scala.inline
  def apply(onGroupClick: (ExpandableListView, View, Double, Double) => Boolean): OnGroupClickListener = {
    val __obj = js.Dynamic.literal(onGroupClick = js.Any.fromFunction4(onGroupClick))
  
    __obj.asInstanceOf[OnGroupClickListener]
  }
}

