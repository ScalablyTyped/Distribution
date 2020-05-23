package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.MenuItem")
@js.native
class MenuItem protected ()
  extends typings.activexExcel.Excel.MenuItem {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Caption: String = js.native
  /* CompleteClass */
  override var Checked: Boolean = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Excel.MenuItem_typekey")
  override var ExcelDotMenuItem_typekey: typings.activexExcel.Excel.MenuItem = js.native
  /* CompleteClass */
  override var HelpContextID: Double = js.native
  /* CompleteClass */
  override var HelpFile: String = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override var OnAction: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var StatusBar: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

