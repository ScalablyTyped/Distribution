package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CustomView")
@js.native
class CustomView protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.CustomView_typekey")
  var ExcelDotCustomView_typekey: CustomView = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val PrintSettings: Boolean = js.native
  val RowColSettings: Boolean = js.native
  def Delete(): Unit = js.native
  def Show(): Unit = js.native
}

