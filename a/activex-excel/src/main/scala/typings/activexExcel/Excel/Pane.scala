package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane extends StObject {
  
  def Activate(): Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.Pane_typekey")
  var ExcelDotPane_typekey: Pane = js.native
  
  val Index: Double = js.native
  
  def LargeScroll(): Any = js.native
  def LargeScroll(Down: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Unit, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Unit, ToRight: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Unit, ToRight: Double, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Double, Up: Unit, ToRight: Unit, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Double, ToRight: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Double, ToRight: Double, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Double, ToRight: Unit, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Double, ToLeft: Double): Any = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Unit, ToLeft: Double): Any = js.native
  
  val Parent: Any = js.native
  
  def PointsToScreenPixelsX(Points: Double): Double = js.native
  
  def PointsToScreenPixelsY(Points: Double): Double = js.native
  
  var ScrollColumn: Double = js.native
  
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double, Start: Boolean): Unit = js.native
  
  var ScrollRow: Double = js.native
  
  def SmallScroll(): Any = js.native
  def SmallScroll(Down: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Unit, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Unit, ToRight: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Unit, ToRight: Double, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Double, Up: Unit, ToRight: Unit, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Double, ToRight: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Double, ToRight: Double, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Double, ToRight: Unit, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Double, ToLeft: Double): Any = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Unit, ToLeft: Double): Any = js.native
  
  def VisibleRange(Address: String): Range = js.native
  def VisibleRange(RowIndex: Double): Range = js.native
  def VisibleRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("VisibleRange")
  val VisibleRange_Original: Range = js.native
}
