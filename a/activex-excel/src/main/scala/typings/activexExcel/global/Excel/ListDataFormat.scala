package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlListDataType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListDataFormat")
@js.native
class ListDataFormat protected ()
  extends typings.activexExcel.Excel.ListDataFormat {
  /* CompleteClass */
  override val AllowFillIn: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Choices: SafeArray[String] = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override val DecimalPlaces: Double = js.native
  /* CompleteClass */
  override val DefaultValue: js.Any = js.native
  /* CompleteClass */
  @JSName("Excel.ListDataFormat_typekey")
  override var ExcelDotListDataFormat_typekey: typings.activexExcel.Excel.ListDataFormat = js.native
  /* CompleteClass */
  override val IsPercent: Boolean = js.native
  /* CompleteClass */
  override val MaxCharacters: Double = js.native
  /* CompleteClass */
  override val MaxNumber: Double | Null = js.native
  /* CompleteClass */
  override val MinNumber: Double | Null = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val ReadOnly: Boolean = js.native
  /* CompleteClass */
  override val Required: Boolean = js.native
  /* CompleteClass */
  override val Type: XlListDataType = js.native
  /* CompleteClass */
  override val _Default: XlListDataType = js.native
  /* CompleteClass */
  override val lcid: Double = js.native
}

