package typings
package androiduixLib.androidNs.widgetNs.ExpandableListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupCollapseListener extends js.Object {
  def onGroupCollapse(groupPosition: scala.Double): scala.Unit
}

object OnGroupCollapseListener {
  @scala.inline
  def apply(onGroupCollapse: scala.Double => scala.Unit): OnGroupCollapseListener = {
    val __obj = js.Dynamic.literal(onGroupCollapse = js.Any.fromFunction1(onGroupCollapse))
  
    __obj.asInstanceOf[OnGroupCollapseListener]
  }
}

