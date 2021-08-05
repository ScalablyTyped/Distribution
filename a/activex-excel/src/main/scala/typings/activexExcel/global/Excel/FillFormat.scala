package typings.activexExcel.global.Excel

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.FillFormat")
@js.native
/* private */ class FillFormat ()
  extends StObject
     with typings.activexExcel.Excel.FillFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var BackColor: typings.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  override def Background(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.FillFormat_typekey")
  var ExcelDotFillFormat_typekey: typings.activexExcel.Excel.FillFormat = js.native
  
  /* CompleteClass */
  var ForeColor: typings.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  var GradientAngle: Double = js.native
  
  /* CompleteClass */
  override val GradientColorType: MsoGradientColorType = js.native
  
  /* CompleteClass */
  override val GradientDegree: Double = js.native
  
  /* CompleteClass */
  override def GradientStops(Index: Double): GradientStop = js.native
  /* CompleteClass */
  @JSName("GradientStops")
  override val GradientStops_Original: GradientStops = js.native
  
  /* CompleteClass */
  override val GradientStyle: MsoGradientStyle = js.native
  
  /* CompleteClass */
  override val GradientVariant: Double = js.native
  
  /* CompleteClass */
  override def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Pattern: MsoPatternType = js.native
  
  /* CompleteClass */
  override def Patterned(Pattern: MsoPatternType): Unit = js.native
  
  /* CompleteClass */
  override def PictureEffects(Index: Double): PictureEffect = js.native
  /* CompleteClass */
  @JSName("PictureEffects")
  override val PictureEffects_Original: PictureEffects = js.native
  
  /* CompleteClass */
  override def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  
  /* CompleteClass */
  override val PresetGradientType: MsoPresetGradientType = js.native
  
  /* CompleteClass */
  override val PresetTexture: MsoPresetTexture = js.native
  
  /* CompleteClass */
  override def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  
  /* CompleteClass */
  var RotateWithObject: MsoTriState = js.native
  
  /* CompleteClass */
  override def Solid(): Unit = js.native
  
  /* CompleteClass */
  var TextureAlignment: MsoTextureAlignment = js.native
  
  /* CompleteClass */
  var TextureHorizontalScale: Double = js.native
  
  /* CompleteClass */
  override val TextureName: String = js.native
  
  /* CompleteClass */
  var TextureOffsetX: Double = js.native
  
  /* CompleteClass */
  var TextureOffsetY: Double = js.native
  
  /* CompleteClass */
  var TextureTile: MsoTriState = js.native
  
  /* CompleteClass */
  override val TextureType: MsoTextureType = js.native
  
  /* CompleteClass */
  var TextureVerticalScale: Double = js.native
  
  /* CompleteClass */
  var Transparency: Double = js.native
  
  /* CompleteClass */
  override def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  
  /* CompleteClass */
  override val Type: MsoFillType = js.native
  
  /* CompleteClass */
  override def UserPicture(PictureFile: String): Unit = js.native
  
  /* CompleteClass */
  override def UserTextured(TextureFile: String): Unit = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
