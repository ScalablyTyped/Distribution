package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotFormula")
@js.native
class PivotFormula protected ()
  extends typings.activexExcel.Excel.PivotFormula {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.PivotFormula_typekey")
  override var ExcelDotPivotFormula_typekey: typings.activexExcel.Excel.PivotFormula = js.native
  /* CompleteClass */
  override var Formula: String = js.native
  /* CompleteClass */
  override var Index: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var StandardFormula: String = js.native
  /* CompleteClass */
  override var Value: String = js.native
  /* CompleteClass */
  override var _Default: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

