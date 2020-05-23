package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.GlowFormat
import typings.activexOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFormat extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Creator: Double
  val Fill: FillFormat
  val Glow: GlowFormat
  val Line: LineFormat
  val Parent: js.Any
  val PictureFormat: typings.activexPowerpoint.PowerPoint.PictureFormat
  @JSName("PowerPoint.ChartFormat_typekey")
  var PowerPointDotChartFormat_typekey: ChartFormat
  val Shadow: ShadowFormat
  val SoftEdge: SoftEdgeFormat
  val TextFrame2: typings.activexPowerpoint.PowerPoint.TextFrame2
  val ThreeD: ThreeDFormat
}

object ChartFormat {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    PowerPointDotChartFormat_typekey: ChartFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFormat_typekey")(PowerPointDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
}

