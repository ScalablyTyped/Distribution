package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlTrendlineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Trendline")
@js.native
class Trendline protected ()
  extends typings.activexExcel.Excel.Trendline {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var Backward: Double = js.native
  /* CompleteClass */
  override var Backward2: Double = js.native
  /* CompleteClass */
  override val Border: typings.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override val DataLabel: typings.activexExcel.Excel.DataLabel = js.native
  /* CompleteClass */
  override var DisplayEquation: Boolean = js.native
  /* CompleteClass */
  override var DisplayRSquared: Boolean = js.native
  /* CompleteClass */
  @JSName("Excel.Trendline_typekey")
  override var ExcelDotTrendline_typekey: typings.activexExcel.Excel.Trendline = js.native
  /* CompleteClass */
  override val Format: typings.activexExcel.Excel.ChartFormat = js.native
  /* CompleteClass */
  override var Forward: Double = js.native
  /* CompleteClass */
  override var Forward2: Double = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override var Intercept: Double = js.native
  /* CompleteClass */
  override var InterceptIsAuto: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var NameIsAuto: Boolean = js.native
  /* CompleteClass */
  override var Order: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Period: Double = js.native
  /* CompleteClass */
  override var Type: XlTrendlineType = js.native
  /* CompleteClass */
  override def ClearFormats(): js.Any = js.native
  /* CompleteClass */
  override def Delete(): js.Any = js.native
  /* CompleteClass */
  override def Select(): js.Any = js.native
}

