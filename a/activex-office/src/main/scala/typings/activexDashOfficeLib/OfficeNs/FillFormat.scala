package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.FillFormat")
@js.native
class FillFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  val Creator: scala.Double = js.native
  var ForeColor: ColorFormat = js.native
  var GradientAngle: scala.Double = js.native
  val GradientColorType: MsoGradientColorType = js.native
  val GradientDegree: scala.Double = js.native
  @JSName("GradientStops")
  val GradientStops_Original: GradientStops = js.native
  val GradientStyle: MsoGradientStyle = js.native
  val GradientVariant: scala.Double = js.native
  var `Office.FillFormat_typekey`: FillFormat = js.native
  val Parent: js.Any = js.native
  val Pattern: MsoPatternType = js.native
  @JSName("PictureEffects")
  val PictureEffects_Original: PictureEffects = js.native
  val PresetGradientType: MsoPresetGradientType = js.native
  val PresetTexture: MsoPresetTexture = js.native
  var RotateWithObject: MsoTriState = js.native
  var TextureAlignment: MsoTextureAlignment = js.native
  var TextureHorizontalScale: scala.Double = js.native
  val TextureName: java.lang.String = js.native
  var TextureOffsetX: scala.Double = js.native
  var TextureOffsetY: scala.Double = js.native
  var TextureTile: MsoTriState = js.native
  val TextureType: MsoTextureType = js.native
  var TextureVerticalScale: scala.Double = js.native
  var Transparency: scala.Double = js.native
  val Type: MsoFillType = js.native
  var Visible: MsoTriState = js.native
  def Background(): scala.Unit = js.native
  def GradientStops(Index: scala.Double): GradientStop = js.native
  def OneColorGradient(Style: MsoGradientStyle, Variant: scala.Double, Degree: scala.Double): scala.Unit = js.native
  def Patterned(Pattern: MsoPatternType): scala.Unit = js.native
  def PictureEffects(Index: scala.Double): PictureEffect = js.native
  def PresetGradient(Style: MsoGradientStyle, Variant: scala.Double, PresetGradientType: MsoPresetGradientType): scala.Unit = js.native
  def PresetTextured(PresetTexture: MsoPresetTexture): scala.Unit = js.native
  def Solid(): scala.Unit = js.native
  def TwoColorGradient(Style: MsoGradientStyle, Variant: scala.Double): scala.Unit = js.native
  def UserPicture(PictureFile: java.lang.String): scala.Unit = js.native
  def UserTextured(TextureFile: java.lang.String): scala.Unit = js.native
}

