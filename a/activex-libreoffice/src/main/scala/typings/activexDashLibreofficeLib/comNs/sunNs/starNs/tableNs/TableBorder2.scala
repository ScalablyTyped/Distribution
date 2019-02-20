package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the style settings of the border lines of all cells in a cell range.
  *
  * {@link TableBorder2} is nearly identical to {@link TableBorder} , except that it has members of {@link BorderLine2} instead of {@link BorderLine} .
  *
  * In a queried structure, the flags in TableBorder2::Is...LineValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding line should be set or if the old value should be kept.
  * @since LibreOffice 3.6
  */
trait TableBorder2 extends js.Object {
  /** determines the line style at the bottom edge. */
  var BottomLine: BorderLine2
  /** contains the distance between the lines and other contents. */
  var Distance: scala.Double
  /** determines the line style of horizontal lines for the inner part of a cell range. */
  var HorizontalLine: BorderLine2
  /** specifies whether the value of {@link TableBorder2.BottomLine} is used. */
  var IsBottomLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder2.Distance} is used. */
  var IsDistanceValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder2.HorizontalLine} is used. */
  var IsHorizontalLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder2.LeftLine} is used. */
  var IsLeftLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder2.RightLine} is used. */
  var IsRightLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder2.TopLine} is used. */
  var IsTopLineValid: scala.Boolean
  /** specifies whether the value of {@link TableBorder2.VerticalLine} is used. */
  var IsVerticalLineValid: scala.Boolean
  /** determines the line style at the left edge. */
  var LeftLine: BorderLine2
  /** determines the line style at the right edge. */
  var RightLine: BorderLine2
  /** determines the line style at the top edge. */
  var TopLine: BorderLine2
  /** determines the line style of vertical lines for the inner part of a cell range. */
  var VerticalLine: BorderLine2
}

