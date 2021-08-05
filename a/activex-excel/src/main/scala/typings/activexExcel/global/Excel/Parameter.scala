package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlParameterDataType
import typings.activexExcel.Excel.XlParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Parameter")
@js.native
/* private */ class Parameter ()
  extends StObject
     with typings.activexExcel.Excel.Parameter {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DataType: XlParameterDataType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Parameter_typekey")
  var ExcelDotParameter_typekey: typings.activexExcel.Excel.Parameter = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PromptString: String = js.native
  
  /* CompleteClass */
  var RefreshOnChange: Boolean = js.native
  
  /* CompleteClass */
  override def SetParam(Type: XlParameterType, Value: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def SourceRange(Address: String): Range = js.native
  /* CompleteClass */
  override def SourceRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def SourceRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("SourceRange")
  override val SourceRange_Original: Range = js.native
  
  /* CompleteClass */
  override val Type: XlParameterType = js.native
  
  /* CompleteClass */
  override val Value: js.Any = js.native
}
