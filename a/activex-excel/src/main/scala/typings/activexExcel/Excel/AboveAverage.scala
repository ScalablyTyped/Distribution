package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboveAverage extends StObject {
  
  var AboveBelow: XlAboveBelow = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  var CalcFor: XlCalcFor = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.AboveAverage_typekey")
  var ExcelDotAboveAverage_typekey: AboveAverage = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  
  var NumStdDev: Double = js.native
  
  var NumberFormat: String = js.native
  
  val PTCondition: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var Priority: Double = js.native
  
  var ScopeType: XlPivotConditionScope = js.native
  
  def SetFirstPriority(): Unit = js.native
  
  def SetLastPriority(): Unit = js.native
  
  var StopIfTrue: Boolean = js.native
  
  val Type: Double = js.native
}
