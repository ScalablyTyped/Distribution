package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.GradientStop
import typings.activexOffice.Office.GradientStops
import typings.activexOffice.Office.MsoFillType
import typings.activexOffice.Office.MsoGradientColorType
import typings.activexOffice.Office.MsoGradientStyle
import typings.activexOffice.Office.MsoPatternType
import typings.activexOffice.Office.MsoPresetGradientType
import typings.activexOffice.Office.MsoPresetTexture
import typings.activexOffice.Office.MsoTextureAlignment
import typings.activexOffice.Office.MsoTextureType
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.PictureEffect
import typings.activexOffice.Office.PictureEffects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillFormat extends js.Object {
  
  val Application: js.Any = js.native
  
  var BackColor: ColorFormat = js.native
  
  def Background(): Unit = js.native
  
  val Creator: Double = js.native
  
  var ForeColor: ColorFormat = js.native
  
  var GradientAngle: Double = js.native
  
  val GradientColorType: MsoGradientColorType = js.native
  
  val GradientDegree: Double = js.native
  
  def GradientStops(Index: Double): GradientStop = js.native
  @JSName("GradientStops")
  val GradientStops_Original: GradientStops = js.native
  
  val GradientStyle: MsoGradientStyle = js.native
  
  val GradientVariant: Double = js.native
  
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val Pattern: MsoPatternType = js.native
  
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  
  def PictureEffects(Index: Double): PictureEffect = js.native
  @JSName("PictureEffects")
  val PictureEffects_Original: PictureEffects = js.native
  
  @JSName("PowerPoint.FillFormat_typekey")
  var PowerPointDotFillFormat_typekey: FillFormat = js.native
  
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  
  val PresetGradientType: MsoPresetGradientType = js.native
  
  val PresetTexture: MsoPresetTexture = js.native
  
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  
  var RotateWithObject: MsoTriState = js.native
  
  def Solid(): Unit = js.native
  
  var TextureAlignment: MsoTextureAlignment = js.native
  
  var TextureHorizontalScale: Double = js.native
  
  val TextureName: String = js.native
  
  var TextureOffsetX: Double = js.native
  
  var TextureOffsetY: Double = js.native
  
  var TextureTile: MsoTriState = js.native
  
  val TextureType: MsoTextureType = js.native
  
  var TextureVerticalScale: Double = js.native
  
  var Transparency: Double = js.native
  
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  
  val Type: MsoFillType = js.native
  
  def UserPicture(PictureFile: String): Unit = js.native
  
  def UserTextured(TextureFile: String): Unit = js.native
  
  var Visible: MsoTriState = js.native
}
