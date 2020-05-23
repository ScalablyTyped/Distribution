package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.RecentFile")
@js.native
class RecentFile protected ()
  extends typings.activexExcel.Excel.RecentFile {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.RecentFile_typekey")
  override var ExcelDotRecentFile_typekey: typings.activexExcel.Excel.RecentFile = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Path: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Open(): typings.activexExcel.Excel.Workbook = js.native
}

