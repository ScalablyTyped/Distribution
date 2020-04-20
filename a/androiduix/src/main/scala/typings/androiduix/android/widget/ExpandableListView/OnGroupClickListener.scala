package typings.androiduix.android.widget.ExpandableListView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupClickListener extends js.Object {
  def onGroupClick(
    parent: typings.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    id: Double
  ): Boolean
}

object OnGroupClickListener {
  @scala.inline
  def apply(
    onGroupClick: (typings.androiduix.android.widget.ExpandableListView, View, Double, Double) => Boolean
  ): OnGroupClickListener = {
    val __obj = js.Dynamic.literal(onGroupClick = js.Any.fromFunction4(onGroupClick))
    __obj.asInstanceOf[OnGroupClickListener]
  }
}

