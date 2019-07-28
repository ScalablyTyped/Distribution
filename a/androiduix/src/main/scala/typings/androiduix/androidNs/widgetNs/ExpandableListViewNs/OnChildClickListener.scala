package typings.androiduix.androidNs.widgetNs.ExpandableListViewNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.ExpandableListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChildClickListener extends js.Object {
  def onChildClick(parent: ExpandableListView, v: View, groupPosition: Double, childPosition: Double, id: Double): Boolean
}

object OnChildClickListener {
  @scala.inline
  def apply(onChildClick: (ExpandableListView, View, Double, Double, Double) => Boolean): OnChildClickListener = {
    val __obj = js.Dynamic.literal(onChildClick = js.Any.fromFunction5(onChildClick))
  
    __obj.asInstanceOf[OnChildClickListener]
  }
}

