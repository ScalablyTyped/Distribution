package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Parameter")
@js.native
class Parameter protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var DataType: XlParameterDataType = js.native
  var `Excel.Parameter_typekey`: Parameter = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val PromptString: String = js.native
  var RefreshOnChange: Boolean = js.native
  @JSName("SourceRange")
  val SourceRange_Original: Range = js.native
  val Type: XlParameterType = js.native
  val Value: js.Any = js.native
  def SetParam(Type: XlParameterType, Value: js.Any): Unit = js.native
  def SourceRange(Address: String): Range = js.native
  def SourceRange(RowIndex: Double): Range = js.native
  def SourceRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

