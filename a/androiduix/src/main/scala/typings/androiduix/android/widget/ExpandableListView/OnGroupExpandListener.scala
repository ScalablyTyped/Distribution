package typings.androiduix.android.widget.ExpandableListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupExpandListener extends js.Object {
  def onGroupExpand(groupPosition: Double): Unit
}

object OnGroupExpandListener {
  @scala.inline
  def apply(onGroupExpand: Double => Unit): OnGroupExpandListener = {
    val __obj = js.Dynamic.literal(onGroupExpand = js.Any.fromFunction1(onGroupExpand))
    __obj.asInstanceOf[OnGroupExpandListener]
  }
}

