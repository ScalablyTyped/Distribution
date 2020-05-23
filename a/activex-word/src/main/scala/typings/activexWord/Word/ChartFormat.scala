package typings.activexWord.Word

import typings.activexOffice.Office.TextFrame2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFormat extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Fill: FillFormat
  val Glow: GlowFormat
  val Line: LineFormat
  val Parent: js.Any
  val PictureFormat: typings.activexWord.Word.PictureFormat
  val Shadow: ShadowFormat
  val SoftEdge: SoftEdgeFormat
  val TextFrame2: typings.activexOffice.Office.TextFrame2
  val ThreeD: ThreeDFormat
  @JSName("Word.ChartFormat_typekey")
  var WordDotChartFormat_typekey: ChartFormat
}

object ChartFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat,
    WordDotChartFormat_typekey: ChartFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartFormat_typekey")(WordDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
}

