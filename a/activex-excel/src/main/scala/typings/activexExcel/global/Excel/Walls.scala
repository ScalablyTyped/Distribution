package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlChartPictureType
import typings.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Walls")
@js.native
class Walls protected ()
  extends typings.activexExcel.Excel.Walls {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Border: typings.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.Walls_typekey")
  override var ExcelDotWalls_typekey: typings.activexExcel.Excel.Walls = js.native
  /* CompleteClass */
  override val Fill: typings.activexExcel.Excel.ChartFillFormat = js.native
  /* CompleteClass */
  override val Format: typings.activexExcel.Excel.ChartFormat = js.native
  /* CompleteClass */
  override val Interior: typings.activexExcel.Excel.Interior = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PictureType: XlChartPictureType = js.native
  /* CompleteClass */
  override var PictureUnit: Double = js.native
  /* CompleteClass */
  override var Thickness: Double = js.native
  /* CompleteClass */
  override def ClearFormats(): js.Any = js.native
  /* CompleteClass */
  override def Paste(): Unit = js.native
  /* CompleteClass */
  override def Select(): js.Any = js.native
}

