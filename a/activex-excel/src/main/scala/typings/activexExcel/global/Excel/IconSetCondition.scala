package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.IconCriteria
import typings.activexExcel.Excel.IconSets
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPivotConditionScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.IconSetCondition")
@js.native
/* private */ open class IconSetCondition ()
  extends StObject
     with typings.activexExcel.Excel.IconSetCondition {
  
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
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.IconSetCondition_typekey")
  var ExcelDotIconSetCondition_typekey: typings.activexExcel.Excel.IconSetCondition = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override def IconCriteria(Index: Double): typings.activexExcel.Excel.IconCriterion = js.native
  /* CompleteClass */
  @JSName("IconCriteria")
  override val IconCriteria_Original: IconCriteria = js.native
  
  /* CompleteClass */
  override def IconSet(Index: Double): typings.activexExcel.Excel.IconSet = js.native
  /* CompleteClass */
  @JSName("IconSet")
  var IconSet_Original: IconSets = js.native
  
  /* CompleteClass */
  override def ModifyAppliesToRange(Range: Range): Unit = js.native
  
  /* CompleteClass */
  override val PTCondition: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PercentileValues: Boolean = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  var ReverseOrder: Boolean = js.native
  
  /* CompleteClass */
  var ScopeType: XlPivotConditionScope = js.native
  
  /* CompleteClass */
  override def SetFirstPriority(): Unit = js.native
  
  /* CompleteClass */
  override def SetLastPriority(): Unit = js.native
  
  /* CompleteClass */
  var ShowIconOnly: Boolean = js.native
  
  /* CompleteClass */
  override val StopIfTrue: Boolean = js.native
  
  /* CompleteClass */
  override val Type: Double = js.native
}
