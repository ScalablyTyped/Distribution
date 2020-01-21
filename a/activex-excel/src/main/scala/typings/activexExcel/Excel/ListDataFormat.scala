package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListDataFormat")
@js.native
class ListDataFormat protected () extends js.Object {
  val AllowFillIn: Boolean = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val Choices: SafeArray[String] = js.native
  val Creator: XlCreator = js.native
  val DecimalPlaces: Double = js.native
  val DefaultValue: js.Any = js.native
  @JSName("Excel.ListDataFormat_typekey")
  var ExcelDotListDataFormat_typekey: ListDataFormat = js.native
  val IsPercent: Boolean = js.native
  val MaxCharacters: Double = js.native
  val MaxNumber: Double | Null = js.native
  val MinNumber: Double | Null = js.native
  val Parent: js.Any = js.native
  val ReadOnly: Boolean = js.native
  val Required: Boolean = js.native
  val Type: XlListDataType = js.native
  val _Default: XlListDataType = js.native
  val lcid: Double = js.native
}

