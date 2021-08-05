package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlAllocationMethod
import typings.activexExcel.Excel.XlAllocationValue
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ValueChange")
@js.native
/* private */ class ValueChange ()
  extends StObject
     with typings.activexExcel.Excel.ValueChange {
  
  /* CompleteClass */
  override val AllocationMethod: XlAllocationMethod = js.native
  
  /* CompleteClass */
  override val AllocationValue: XlAllocationValue = js.native
  
  /* CompleteClass */
  override val AllocationWeightExpression: String = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ValueChange_typekey")
  var ExcelDotValueChange_typekey: typings.activexExcel.Excel.ValueChange = js.native
  
  /* CompleteClass */
  override val Order: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PivotCell: typings.activexExcel.Excel.PivotCell = js.native
  
  /* CompleteClass */
  override val Tuple: String = js.native
  
  /* CompleteClass */
  override val Value: Double = js.native
  
  /* CompleteClass */
  override val VisibleInPivotTable: Boolean = js.native
}
