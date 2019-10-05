package typings.androiduix.android.widget.ExpandableListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupCollapseListener extends js.Object {
  def onGroupCollapse(groupPosition: Double): Unit
}

object OnGroupCollapseListener {
  @scala.inline
  def apply(onGroupCollapse: Double => Unit): OnGroupCollapseListener = {
    val __obj = js.Dynamic.literal(onGroupCollapse = js.Any.fromFunction1(onGroupCollapse))
  
    __obj.asInstanceOf[OnGroupCollapseListener]
  }
}

