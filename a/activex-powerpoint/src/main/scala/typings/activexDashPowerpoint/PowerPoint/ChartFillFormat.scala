package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoFillType
import typings.activexDashOffice.Office.MsoGradientColorType
import typings.activexDashOffice.Office.MsoGradientStyle
import typings.activexDashOffice.Office.MsoPatternType
import typings.activexDashOffice.Office.MsoPresetGradientType
import typings.activexDashOffice.Office.MsoPresetTexture
import typings.activexDashOffice.Office.MsoTextureType
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ChartFillFormat")
@js.native
class ChartFillFormat protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: Double = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: MsoGradientColorType = js.native
  val GradientDegree: Double = js.native
  val GradientStyle: MsoGradientStyle = js.native
  val GradientVariant: Double = js.native
  val Parent: js.Any = js.native
  val Pattern: MsoPatternType = js.native
  @JSName("PowerPoint.ChartFillFormat_typekey")
  var PowerPointDotChartFillFormat_typekey: ChartFillFormat = js.native
  val PresetGradientType: MsoPresetGradientType = js.native
  val PresetTexture: MsoPresetTexture = js.native
  val TextureName: String = js.native
  val TextureType: MsoTextureType = js.native
  val Type: MsoFillType = js.native
  var Visible: MsoTriState = js.native
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  def Solid(): Unit = js.native
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  def UserPicture(): Unit = js.native
  def UserPicture(PictureFile: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any): Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  def UserTextured(TextureFile: String): Unit = js.native
}

