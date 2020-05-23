package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CustomView")
@js.native
class CustomView protected ()
  extends typings.activexExcel.Excel.CustomView {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.CustomView_typekey")
  override var ExcelDotCustomView_typekey: typings.activexExcel.Excel.CustomView = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PrintSettings: Boolean = js.native
  /* CompleteClass */
  override val RowColSettings: Boolean = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Show(): Unit = js.native
}

