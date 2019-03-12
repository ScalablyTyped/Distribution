package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeterogeneousExpandableList extends js.Object {
  def getChildType(groupPosition: scala.Double, childPosition: scala.Double): scala.Double
  def getChildTypeCount(): scala.Double
  def getGroupType(groupPosition: scala.Double): scala.Double
  def getGroupTypeCount(): scala.Double
}

object HeterogeneousExpandableList {
  @scala.inline
  def apply(
    getChildType: (scala.Double, scala.Double) => scala.Double,
    getChildTypeCount: () => scala.Double,
    getGroupType: scala.Double => scala.Double,
    getGroupTypeCount: () => scala.Double
  ): HeterogeneousExpandableList = {
    val __obj = js.Dynamic.literal(getChildType = js.Any.fromFunction2(getChildType), getChildTypeCount = js.Any.fromFunction0(getChildTypeCount), getGroupType = js.Any.fromFunction1(getGroupType), getGroupTypeCount = js.Any.fromFunction0(getGroupTypeCount))
  
    __obj.asInstanceOf[HeterogeneousExpandableList]
  }
}

