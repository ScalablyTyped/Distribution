package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlThreadMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.MultiThreadedCalculation")
@js.native
class MultiThreadedCalculation protected ()
  extends typings.activexExcel.Excel.MultiThreadedCalculation {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Excel.MultiThreadedCalculation_typekey")
  override var ExcelDotMultiThreadedCalculation_typekey: typings.activexExcel.Excel.MultiThreadedCalculation = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var ThreadCount: Double = js.native
  /* CompleteClass */
  override var ThreadMode: XlThreadMode = js.native
}

