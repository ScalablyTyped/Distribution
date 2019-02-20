package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the style settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorder::Is...LineValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding line should be set or if the old value should be kept.
  */
trait TableBorder extends js.Object {
  /** determines the line style at the bottom edge. */
  var BottomLine: BorderLine
  /** contains the distance between the lines and other contents. */
  var Distance: scala.Double
  /** determines the line style of horizontal lines for the inner part of a cell range. */
  var HorizontalLine: BorderLine
  /** specifies whether the value of {@link TableBorder.BottomLine} is used. */
  var IsBottomLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder.Distance} is used. */
  var IsDistanceValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder.HorizontalLine} is used. */
  var IsHorizontalLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder.LeftLine} is used. */
  var IsLeftLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder.RightLine} is used. */
  var IsRightLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder.TopLine} is used. */
  var IsTopLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder.VerticalLine} is used. */
  var IsVerticalLineValid: scala.Boolean
  /** determines the line style at the left edge. */
  var LeftLine: BorderLine
  /** determines the line style at the right edge. */
  var RightLine: BorderLine
  /** determines the line style at the top edge. */
  var TopLine: BorderLine
  /** determines the line style of vertical lines for the inner part of a cell range. */
  var VerticalLine: BorderLine
}

