package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPivotFilterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotFilter")
@js.native
/* private */ open class PivotFilter ()
  extends StObject
     with typings.activexExcel.Excel.PivotFilter {
  
  /* CompleteClass */
  override val Active: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override val DataCubeField: typings.activexExcel.Excel.CubeField = js.native
  
  /* CompleteClass */
  override val DataField: typings.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Description: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PivotFilter_typekey")
  var ExcelDotPivotFilter_typekey: typings.activexExcel.Excel.PivotFilter = js.native
  
  /* CompleteClass */
  override val FilterType: XlPivotFilterType = js.native
  
  /* CompleteClass */
  override val IsMemberPropertyFilter: Boolean = js.native
  
  /* CompleteClass */
  override val MemberPropertyField: typings.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  var Order: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PivotField: typings.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val Value1: Any = js.native
  
  /* CompleteClass */
  override val Value2: Any = js.native
}
