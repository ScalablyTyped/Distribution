package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Borders
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlAboveBelow
import typings.activexExcel.Excel.XlBordersIndex
import typings.activexExcel.Excel.XlCalcFor
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPivotConditionScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.AboveAverage")
@js.native
class AboveAverage protected ()
  extends StObject
     with typings.activexExcel.Excel.AboveAverage {
  
  /* CompleteClass */
  var AboveBelow: XlAboveBelow = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def AppliesTo(Address: String): Range = js.native
  /* CompleteClass */
  override def AppliesTo(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("AppliesTo")
  override val AppliesTo_Original: Range = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typings.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  override val Borders_Original: Borders = js.native
  
  /* CompleteClass */
  var CalcFor: XlCalcFor = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  @JSName("Excel.AboveAverage_typekey")
  var ExcelDotAboveAverage_typekey: typings.activexExcel.Excel.AboveAverage = js.native
  
  /* CompleteClass */
  override val Font: typings.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  override val Interior: typings.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  override def ModifyAppliesToRange(Range: Range): Unit = js.native
  
  /* CompleteClass */
  var NumStdDev: Double = js.native
  
  /* CompleteClass */
  var NumberFormat: String = js.native
  
  /* CompleteClass */
  override val PTCondition: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  var ScopeType: XlPivotConditionScope = js.native
  
  /* CompleteClass */
  override def SetFirstPriority(): Unit = js.native
  
  /* CompleteClass */
  override def SetLastPriority(): Unit = js.native
  
  /* CompleteClass */
  var StopIfTrue: Boolean = js.native
  
  /* CompleteClass */
  override val Type: Double = js.native
}
