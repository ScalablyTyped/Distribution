package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Pane")
@js.native
class Pane protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.Pane_typekey`: Pane = js.native
  val Index: scala.Double = js.native
  val Parent: js.Any = js.native
  var ScrollColumn: scala.Double = js.native
  var ScrollRow: scala.Double = js.native
  @JSName("VisibleRange")
  val VisibleRange_Original: Range = js.native
  def Activate(): scala.Boolean = js.native
  def LargeScroll(): js.Any = js.native
  def LargeScroll(Down: scala.Double): js.Any = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double): js.Any = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double): js.Any = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double, ToLeft: scala.Double): js.Any = js.native
  def PointsToScreenPixelsX(Points: scala.Double): scala.Double = js.native
  def PointsToScreenPixelsY(Points: scala.Double): scala.Double = js.native
  def ScrollIntoView(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def ScrollIntoView(
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Start: scala.Boolean
  ): scala.Unit = js.native
  def SmallScroll(): js.Any = js.native
  def SmallScroll(Down: scala.Double): js.Any = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double): js.Any = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double): js.Any = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double, ToLeft: scala.Double): js.Any = js.native
  def VisibleRange(Address: java.lang.String): Range = js.native
  def VisibleRange(RowIndex: scala.Double): Range = js.native
  def VisibleRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

