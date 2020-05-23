package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ToolbarButton")
@js.native
class ToolbarButton protected ()
  extends typings.activexExcel.Excel.ToolbarButton {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  /* CompleteClass */
  override var BuiltInFace: Boolean = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Excel.ToolbarButton_typekey")
  override var ExcelDotToolbarButton_typekey: typings.activexExcel.Excel.ToolbarButton = js.native
  /* CompleteClass */
  override var HelpContextID: Double = js.native
  /* CompleteClass */
  override var HelpFile: String = js.native
  /* CompleteClass */
  override val ID: Double = js.native
  /* CompleteClass */
  override val IsGap: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var OnAction: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Pushed: Boolean = js.native
  /* CompleteClass */
  override var StatusBar: String = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override def Copy(Toolbar: typings.activexExcel.Excel.Toolbar, Before: Double): Unit = js.native
  /* CompleteClass */
  override def CopyFace(): Unit = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Edit(): Unit = js.native
  /* CompleteClass */
  override def Move(Toolbar: typings.activexExcel.Excel.Toolbar, Before: Double): Unit = js.native
  /* CompleteClass */
  override def PasteFace(): Unit = js.native
  /* CompleteClass */
  override def Reset(): Unit = js.native
}

