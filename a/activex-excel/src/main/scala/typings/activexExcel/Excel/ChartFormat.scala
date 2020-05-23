package typings.activexExcel.Excel

import typings.activexOffice.Office.GlowFormat
import typings.activexOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFormat extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.ChartFormat_typekey")
  var ExcelDotChartFormat_typekey: ChartFormat
  val Fill: FillFormat
  val Glow: GlowFormat
  val Line: LineFormat
  val Parent: js.Any
  val PictureFormat: typings.activexExcel.Excel.PictureFormat
  val Shadow: ShadowFormat
  val SoftEdge: SoftEdgeFormat
  val TextFrame2: typings.activexExcel.Excel.TextFrame2
  val ThreeD: ThreeDFormat
}

object ChartFormat {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotChartFormat_typekey: ChartFormat,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ChartFormat_typekey")(ExcelDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
}

