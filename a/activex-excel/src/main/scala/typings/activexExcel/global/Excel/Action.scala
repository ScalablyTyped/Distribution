package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlActionType
import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Action")
@js.native
class Action protected ()
  extends typings.activexExcel.Excel.Action {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Caption: String = js.native
  /* CompleteClass */
  override val Content: String = js.native
  /* CompleteClass */
  override val Coordinate: String = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.Action_typekey")
  override var ExcelDotAction_typekey: typings.activexExcel.Excel.Action = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Type: XlActionType = js.native
  /* CompleteClass */
  override def Execute(): Unit = js.native
}

