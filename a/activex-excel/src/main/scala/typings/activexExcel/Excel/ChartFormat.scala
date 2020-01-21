package typings.activexExcel.Excel

import typings.activexOffice.Office.GlowFormat
import typings.activexOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ChartFormat")
@js.native
class ChartFormat protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ChartFormat_typekey")
  var ExcelDotChartFormat_typekey: ChartFormat = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val Line: LineFormat = js.native
  val Parent: js.Any = js.native
  val PictureFormat: typings.activexExcel.Excel.PictureFormat = js.native
  val Shadow: ShadowFormat = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextFrame2: typings.activexExcel.Excel.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
}

