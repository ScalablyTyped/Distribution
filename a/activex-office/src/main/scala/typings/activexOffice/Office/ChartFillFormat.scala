package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ChartFillFormat")
@js.native
class ChartFillFormat protected () extends js.Object {
  val Application: js.Any = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: Double = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: Double = js.native
  val GradientDegree: Double = js.native
  val GradientStyle: Double = js.native
  val GradientVariant: Double = js.native
  @JSName("Office.ChartFillFormat_typekey")
  var OfficeDotChartFillFormat_typekey: ChartFillFormat = js.native
  val Parent: js.Any = js.native
  val Pattern: Double = js.native
  val PresetGradientType: Double = js.native
  val PresetTexture: Double = js.native
  val TextureName: String = js.native
  val TextureType: Double = js.native
  val Type: Double = js.native
  var Visible: Double = js.native
  def OneColorGradient(Style: Double, Variant: Double, Degree: Double): Unit = js.native
  def Patterned(Pattern: Double): Unit = js.native
  def PresetGradient(Style: Double, Variant: Double, PresetGradientType: Double): Unit = js.native
  def PresetTextured(PresetTexture: Double): Unit = js.native
  def Solid(): Unit = js.native
  def TwoColorGradient(Style: Double, Variant: Double): Unit = js.native
  def UserPicture(PictureFile: String, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  def UserTextured(TextureFile: String): Unit = js.native
}

