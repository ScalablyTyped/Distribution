package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeterogeneousExpandableList extends js.Object {
  def getChildType(groupPosition: Double, childPosition: Double): Double
  def getChildTypeCount(): Double
  def getGroupType(groupPosition: Double): Double
  def getGroupTypeCount(): Double
}

@JSGlobal("android.widget.HeterogeneousExpandableList")
@js.native
object HeterogeneousExpandableList extends js.Object {
  def isImpl(obj: js.Any): Boolean = js.native
}

