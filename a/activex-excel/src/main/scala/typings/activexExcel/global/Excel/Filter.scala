package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlAutoFilterOperator
import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Filter")
@js.native
class Filter protected ()
  extends typings.activexExcel.Excel.Filter {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override val Criteria1: js.Any = js.native
  /* CompleteClass */
  override val Criteria2: js.Any = js.native
  /* CompleteClass */
  @JSName("Excel.Filter_typekey")
  override var ExcelDotFilter_typekey: typings.activexExcel.Excel.Filter = js.native
  /* CompleteClass */
  override val On: Boolean = js.native
  /* CompleteClass */
  override var Operator: XlAutoFilterOperator = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val _Operator: XlAutoFilterOperator = js.native
}

