package typings.activexExcel.Excel

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

trait FillFormat extends StObject {
  
  val Application: js.Any
  
  var BackColor: ColorFormat
  
  def Background(): Unit
  
  val Creator: Double
  
  @JSName("Excel.FillFormat_typekey")
  var ExcelDotFillFormat_typekey: FillFormat
  
  var ForeColor: ColorFormat
  
  var GradientAngle: Double
  
  val GradientColorType: MsoGradientColorType
  
  val GradientDegree: Double
  
  def GradientStops(Index: Double): GradientStop
  @JSName("GradientStops")
  val GradientStops_Original: GradientStops
  
  val GradientStyle: MsoGradientStyle
  
  val GradientVariant: Double
  
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit
  
  val Parent: js.Any
  
  val Pattern: MsoPatternType
  
  def Patterned(Pattern: MsoPatternType): Unit
  
  def PictureEffects(Index: Double): PictureEffect
  @JSName("PictureEffects")
  val PictureEffects_Original: PictureEffects
  
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit
  
  val PresetGradientType: MsoPresetGradientType
  
  val PresetTexture: MsoPresetTexture
  
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit
  
  var RotateWithObject: MsoTriState
  
  def Solid(): Unit
  
  var TextureAlignment: MsoTextureAlignment
  
  var TextureHorizontalScale: Double
  
  val TextureName: String
  
  var TextureOffsetX: Double
  
  var TextureOffsetY: Double
  
  var TextureTile: MsoTriState
  
  val TextureType: MsoTextureType
  
  var TextureVerticalScale: Double
  
  var Transparency: Double
  
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit
  
  val Type: MsoFillType
  
  def UserPicture(PictureFile: String): Unit
  
  def UserTextured(TextureFile: String): Unit
  
  var Visible: MsoTriState
}
object FillFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ColorFormat,
    Background: () => Unit,
    Creator: Double,
    ExcelDotFillFormat_typekey: FillFormat,
    ForeColor: ColorFormat,
    GradientAngle: Double,
    GradientColorType: MsoGradientColorType,
    GradientDegree: Double,
    GradientStops: GradientStops,
    GradientStyle: MsoGradientStyle,
    GradientVariant: Double,
    OneColorGradient: (MsoGradientStyle, Double, Double) => Unit,
    Parent: js.Any,
    Pattern: MsoPatternType,
    Patterned: MsoPatternType => Unit,
    PictureEffects: PictureEffects,
    PresetGradient: (MsoGradientStyle, Double, MsoPresetGradientType) => Unit,
    PresetGradientType: MsoPresetGradientType,
    PresetTexture: MsoPresetTexture,
    PresetTextured: MsoPresetTexture => Unit,
    RotateWithObject: MsoTriState,
    Solid: () => Unit,
    TextureAlignment: MsoTextureAlignment,
    TextureHorizontalScale: Double,
    TextureName: String,
    TextureOffsetX: Double,
    TextureOffsetY: Double,
    TextureTile: MsoTriState,
    TextureType: MsoTextureType,
    TextureVerticalScale: Double,
    Transparency: Double,
    TwoColorGradient: (MsoGradientStyle, Double) => Unit,
    Type: MsoFillType,
    UserPicture: String => Unit,
    UserTextured: String => Unit,
    Visible: MsoTriState
  ): FillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Background = js.Any.fromFunction0(Background), Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientAngle = GradientAngle.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStops = GradientStops.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3(OneColorGradient), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1(Patterned), PictureEffects = PictureEffects.asInstanceOf[js.Any], PresetGradient = js.Any.fromFunction3(PresetGradient), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1(PresetTextured), RotateWithObject = RotateWithObject.asInstanceOf[js.Any], Solid = js.Any.fromFunction0(Solid), TextureAlignment = TextureAlignment.asInstanceOf[js.Any], TextureHorizontalScale = TextureHorizontalScale.asInstanceOf[js.Any], TextureName = TextureName.asInstanceOf[js.Any], TextureOffsetX = TextureOffsetX.asInstanceOf[js.Any], TextureOffsetY = TextureOffsetY.asInstanceOf[js.Any], TextureTile = TextureTile.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TextureVerticalScale = TextureVerticalScale.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2(TwoColorGradient), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction1(UserPicture), UserTextured = js.Any.fromFunction1(UserTextured), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FillFormat_typekey")(ExcelDotFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillFormat]
  }
  
  @scala.inline
  implicit class FillFormatMutableBuilder[Self <: FillFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: ColorFormat): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: () => Unit): Self = StObject.set(x, "Background", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotFillFormat_typekey(value: FillFormat): Self = StObject.set(x, "Excel.FillFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: ColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientAngle(value: Double): Self = StObject.set(x, "GradientAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientColorType(value: MsoGradientColorType): Self = StObject.set(x, "GradientColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientDegree(value: Double): Self = StObject.set(x, "GradientDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientStops(value: GradientStops): Self = StObject.set(x, "GradientStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientStyle(value: MsoGradientStyle): Self = StObject.set(x, "GradientStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientVariant(value: Double): Self = StObject.set(x, "GradientVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneColorGradient(value: (MsoGradientStyle, Double, Double) => Unit): Self = StObject.set(x, "OneColorGradient", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: MsoPatternType): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterned(value: MsoPatternType => Unit): Self = StObject.set(x, "Patterned", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPictureEffects(value: PictureEffects): Self = StObject.set(x, "PictureEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetGradient(value: (MsoGradientStyle, Double, MsoPresetGradientType) => Unit): Self = StObject.set(x, "PresetGradient", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPresetGradientType(value: MsoPresetGradientType): Self = StObject.set(x, "PresetGradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetTexture(value: MsoPresetTexture): Self = StObject.set(x, "PresetTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetTextured(value: MsoPresetTexture => Unit): Self = StObject.set(x, "PresetTextured", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotateWithObject(value: MsoTriState): Self = StObject.set(x, "RotateWithObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolid(value: () => Unit): Self = StObject.set(x, "Solid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextureAlignment(value: MsoTextureAlignment): Self = StObject.set(x, "TextureAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureHorizontalScale(value: Double): Self = StObject.set(x, "TextureHorizontalScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureName(value: String): Self = StObject.set(x, "TextureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureOffsetX(value: Double): Self = StObject.set(x, "TextureOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureOffsetY(value: Double): Self = StObject.set(x, "TextureOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureTile(value: MsoTriState): Self = StObject.set(x, "TextureTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureType(value: MsoTextureType): Self = StObject.set(x, "TextureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureVerticalScale(value: Double): Self = StObject.set(x, "TextureVerticalScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoColorGradient(value: (MsoGradientStyle, Double) => Unit): Self = StObject.set(x, "TwoColorGradient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: MsoFillType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPicture(value: String => Unit): Self = StObject.set(x, "UserPicture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUserTextured(value: String => Unit): Self = StObject.set(x, "UserTextured", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
