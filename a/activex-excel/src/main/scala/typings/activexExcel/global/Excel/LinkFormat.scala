package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.LinkFormat")
@js.native
class LinkFormat protected ()
  extends typings.activexExcel.Excel.LinkFormat {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var AutoUpdate: Boolean = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.LinkFormat_typekey")
  override var ExcelDotLinkFormat_typekey: typings.activexExcel.Excel.LinkFormat = js.native
  /* CompleteClass */
  override var Locked: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override def Update(): Unit = js.native
}

