package typings
package androiduixLib.androidNs.widgetNs.ExpandableListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupExpandListener extends js.Object {
  def onGroupExpand(groupPosition: scala.Double): scala.Unit
}

object OnGroupExpandListener {
  @scala.inline
  def apply(onGroupExpand: scala.Double => scala.Unit): OnGroupExpandListener = {
    val __obj = js.Dynamic.literal(onGroupExpand = js.Any.fromFunction1(onGroupExpand))
  
    __obj.asInstanceOf[OnGroupExpandListener]
  }
}

