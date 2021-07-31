package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlDataBarAxisPosition
import typings.activexExcel.Excel.XlDataBarFillType
import typings.activexExcel.Excel.XlPivotConditionScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Databar")
@js.native
class Databar protected ()
  extends StObject
     with typings.activexExcel.Excel.Databar {
  
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
  override val AxisColor: typings.activexExcel.Excel.FormatColor = js.native
  
  /* CompleteClass */
  var AxisPosition: XlDataBarAxisPosition = js.native
  
  /* CompleteClass */
  override val BarBorder: typings.activexExcel.Excel.DataBarBorder = js.native
  
  /* CompleteClass */
  override val BarColor: typings.activexExcel.Excel.FormatColor = js.native
  
  /* CompleteClass */
  var BarFillType: XlDataBarFillType = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Direction: Double = js.native
  
  /* CompleteClass */
  @JSName("Excel.Databar_typekey")
  var ExcelDotDatabar_typekey: typings.activexExcel.Excel.Databar = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override val MaxPoint: typings.activexExcel.Excel.ConditionValue = js.native
  
  /* CompleteClass */
  override val MinPoint: typings.activexExcel.Excel.ConditionValue = js.native
  
  /* CompleteClass */
  override def ModifyAppliesToRange(Range: Range): Unit = js.native
  
  /* CompleteClass */
  override val NegativeBarFormat: typings.activexExcel.Excel.NegativeBarFormat = js.native
  
  /* CompleteClass */
  override val PTCondition: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var PercentMax: Double = js.native
  
  /* CompleteClass */
  var PercentMin: Double = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  var ScopeType: XlPivotConditionScope = js.native
  
  /* CompleteClass */
  override def SetFirstPriority(): Unit = js.native
  
  /* CompleteClass */
  override def SetLastPriority(): Unit = js.native
  
  /* CompleteClass */
  var ShowValue: Boolean = js.native
  
  /* CompleteClass */
  override val StopIfTrue: Boolean = js.native
  
  /* CompleteClass */
  override val Type: Double = js.native
}
