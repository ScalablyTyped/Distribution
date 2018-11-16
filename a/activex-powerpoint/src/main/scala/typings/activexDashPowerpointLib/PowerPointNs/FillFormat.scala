package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.FillFormat")
@js.native
class FillFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  val Creator: scala.Double = js.native
  var ForeColor: ColorFormat = js.native
  var GradientAngle: scala.Double = js.native
  val GradientColorType: activexDashOfficeLib.OfficeNs.MsoGradientColorType = js.native
  val GradientDegree: scala.Double = js.native
  @JSName("GradientStops")
  val GradientStops_Original: activexDashOfficeLib.OfficeNs.GradientStops = js.native
  val GradientStyle: activexDashOfficeLib.OfficeNs.MsoGradientStyle = js.native
  val GradientVariant: scala.Double = js.native
  val Parent: js.Any = js.native
  val Pattern: activexDashOfficeLib.OfficeNs.MsoPatternType = js.native
  @JSName("PictureEffects")
  val PictureEffects_Original: activexDashOfficeLib.OfficeNs.PictureEffects = js.native
  var `PowerPoint.FillFormat_typekey`: FillFormat = js.native
  val PresetGradientType: activexDashOfficeLib.OfficeNs.MsoPresetGradientType = js.native
  val PresetTexture: activexDashOfficeLib.OfficeNs.MsoPresetTexture = js.native
  var RotateWithObject: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var TextureAlignment: activexDashOfficeLib.OfficeNs.MsoTextureAlignment = js.native
  var TextureHorizontalScale: scala.Double = js.native
  val TextureName: java.lang.String = js.native
  var TextureOffsetX: scala.Double = js.native
  var TextureOffsetY: scala.Double = js.native
  var TextureTile: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val TextureType: activexDashOfficeLib.OfficeNs.MsoTextureType = js.native
  var TextureVerticalScale: scala.Double = js.native
  var Transparency: scala.Double = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoFillType = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  def Background(): scala.Unit = js.native
  def GradientStops(Index: scala.Double): activexDashOfficeLib.OfficeNs.GradientStop = js.native
  def OneColorGradient(Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle, Variant: scala.Double, Degree: scala.Double): scala.Unit = js.native
  def Patterned(Pattern: activexDashOfficeLib.OfficeNs.MsoPatternType): scala.Unit = js.native
  def PictureEffects(Index: scala.Double): activexDashOfficeLib.OfficeNs.PictureEffect = js.native
  def PresetGradient(
    Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle,
    Variant: scala.Double,
    PresetGradientType: activexDashOfficeLib.OfficeNs.MsoPresetGradientType
  ): scala.Unit = js.native
  def PresetTextured(PresetTexture: activexDashOfficeLib.OfficeNs.MsoPresetTexture): scala.Unit = js.native
  def Solid(): scala.Unit = js.native
  def TwoColorGradient(Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle, Variant: scala.Double): scala.Unit = js.native
  def UserPicture(PictureFile: java.lang.String): scala.Unit = js.native
  def UserTextured(TextureFile: java.lang.String): scala.Unit = js.native
}

