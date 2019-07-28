package typings.androiduix.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeterogeneousExpandableList extends js.Object {
  def getChildType(groupPosition: Double, childPosition: Double): Double
  def getChildTypeCount(): Double
  def getGroupType(groupPosition: Double): Double
  def getGroupTypeCount(): Double
}

object HeterogeneousExpandableList {
  @scala.inline
  def apply(
    getChildType: (Double, Double) => Double,
    getChildTypeCount: () => Double,
    getGroupType: Double => Double,
    getGroupTypeCount: () => Double
  ): HeterogeneousExpandableList = {
    val __obj = js.Dynamic.literal(getChildType = js.Any.fromFunction2(getChildType), getChildTypeCount = js.Any.fromFunction0(getChildTypeCount), getGroupType = js.Any.fromFunction1(getGroupType), getGroupTypeCount = js.Any.fromFunction0(getGroupTypeCount))
  
    __obj.asInstanceOf[HeterogeneousExpandableList]
  }
}

