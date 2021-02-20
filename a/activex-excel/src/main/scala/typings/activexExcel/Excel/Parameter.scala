package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var DataType: XlParameterDataType = js.native
  
  @JSName("Excel.Parameter_typekey")
  var ExcelDotParameter_typekey: Parameter = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val PromptString: String = js.native
  
  var RefreshOnChange: Boolean = js.native
  
  def SetParam(Type: XlParameterType, Value: js.Any): Unit = js.native
  
  def SourceRange(Address: String): Range = js.native
  def SourceRange(RowIndex: Double): Range = js.native
  def SourceRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("SourceRange")
  val SourceRange_Original: Range = js.native
  
  val Type: XlParameterType = js.native
  
  val Value: js.Any = js.native
}
