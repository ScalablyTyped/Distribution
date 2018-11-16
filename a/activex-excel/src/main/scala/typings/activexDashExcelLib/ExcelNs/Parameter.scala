package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Parameter")
@js.native
class Parameter protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var DataType: XlParameterDataType = js.native
  var `Excel.Parameter_typekey`: Parameter = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PromptString: java.lang.String = js.native
  var RefreshOnChange: scala.Boolean = js.native
  @JSName("SourceRange")
  val SourceRange_Original: Range = js.native
  val Type: XlParameterType = js.native
  val Value: js.Any = js.native
  def SetParam(Type: XlParameterType, Value: js.Any): scala.Unit = js.native
  def SourceRange(Address: java.lang.String): Range = js.native
  def SourceRange(RowIndex: scala.Double): Range = js.native
  def SourceRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

