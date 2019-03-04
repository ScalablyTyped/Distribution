package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the distance settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorderDistances::Is...DistanceValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding distance should be set or if the old value should be kept.
  */
trait TableBorderDistances extends js.Object {
  /** contains the distance between the bottom lines and other contents. */
  var BottomDistance: scala.Double
  /** specifies whether the value of TableBorder::BottomDistance is used. */
  var IsBottomDistanceValid: scala.Boolean
  /** specifies whether the value of TableBorder::LeftDistance is used. */
  var IsLeftDistanceValid: scala.Boolean
  /** specifies whether the value of TableBorder::RightDistance is used. */
  var IsRightDistanceValid: scala.Boolean
  /** specifies whether the value of TableBorder::TopDistance is used. */
  var IsTopDistanceValid: scala.Boolean
  /** contains the distance between the left lines and other contents. */
  var LeftDistance: scala.Double
  /** contains the distance between the right lines and other contents. */
  var RightDistance: scala.Double
  /** contains the distance between the top lines and other contents. */
  var TopDistance: scala.Double
}

object TableBorderDistances {
  @scala.inline
  def apply(
    BottomDistance: scala.Double,
    IsBottomDistanceValid: scala.Boolean,
    IsLeftDistanceValid: scala.Boolean,
    IsRightDistanceValid: scala.Boolean,
    IsTopDistanceValid: scala.Boolean,
    LeftDistance: scala.Double,
    RightDistance: scala.Double,
    TopDistance: scala.Double
  ): TableBorderDistances = {
    val __obj = js.Dynamic.literal(BottomDistance = BottomDistance, IsBottomDistanceValid = IsBottomDistanceValid, IsLeftDistanceValid = IsLeftDistanceValid, IsRightDistanceValid = IsRightDistanceValid, IsTopDistanceValid = IsTopDistanceValid, LeftDistance = LeftDistance, RightDistance = RightDistance, TopDistance = TopDistance)
  
    __obj.asInstanceOf[TableBorderDistances]
  }
}

