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
    getChildType: js.Function2[scala.Double, scala.Double, scala.Double],
    getChildTypeCount: js.Function0[scala.Double],
    getGroupType: js.Function1[scala.Double, scala.Double],
    getGroupTypeCount: js.Function0[scala.Double]
  ): HeterogeneousExpandableList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildType")(getChildType)
    __obj.updateDynamic("getChildTypeCount")(getChildTypeCount)
    __obj.updateDynamic("getGroupType")(getGroupType)
    __obj.updateDynamic("getGroupTypeCount")(getGroupTypeCount)
    __obj.asInstanceOf[HeterogeneousExpandableList]
  }
}

