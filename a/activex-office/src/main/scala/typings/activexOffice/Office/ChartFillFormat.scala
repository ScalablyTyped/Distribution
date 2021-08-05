package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFillFormat extends StObject {
  
  val Application: js.Any
  
  val BackColor: ChartColorFormat
  
  val Creator: Double
  
  val ForeColor: ChartColorFormat
  
  val GradientColorType: Double
  
  val GradientDegree: Double
  
  val GradientStyle: Double
  
  val GradientVariant: Double
  
  /* private */ @JSName("Office.ChartFillFormat_typekey")
  var OfficeDotChartFillFormat_typekey: ChartFillFormat
  
  def OneColorGradient(Style: Double, Variant: Double, Degree: Double): Unit
  
  val Parent: js.Any
  
  val Pattern: Double
  
  def Patterned(Pattern: Double): Unit
  
  def PresetGradient(Style: Double, Variant: Double, PresetGradientType: Double): Unit
  
  val PresetGradientType: Double
  
  val PresetTexture: Double
  
  def PresetTextured(PresetTexture: Double): Unit
  
  def Solid(): Unit
  
  val TextureName: String
  
  val TextureType: Double
  
  def TwoColorGradient(Style: Double, Variant: Double): Unit
  
  val Type: Double
  
  def UserPicture(PictureFile: String, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit
  
  def UserTextured(TextureFile: String): Unit
  
  var Visible: Double
}
object ChartFillFormat {
  
  inline def apply(
    Application: js.Any,
    BackColor: ChartColorFormat,
    Creator: Double,
    ForeColor: ChartColorFormat,
    GradientColorType: Double,
    GradientDegree: Double,
    GradientStyle: Double,
    GradientVariant: Double,
    OfficeDotChartFillFormat_typekey: ChartFillFormat,
    OneColorGradient: (Double, Double, Double) => Unit,
    Parent: js.Any,
    Pattern: Double,
    Patterned: Double => Unit,
    PresetGradient: (Double, Double, Double) => Unit,
    PresetGradientType: Double,
    PresetTexture: Double,
    PresetTextured: Double => Unit,
    Solid: () => Unit,
    TextureName: String,
    TextureType: Double,
    TwoColorGradient: (Double, Double) => Unit,
    Type: Double,
    UserPicture: (String, js.Any, js.Any, js.Any) => Unit,
    UserTextured: String => Unit,
    Visible: Double
  ): ChartFillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3(OneColorGradient), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1(Patterned), PresetGradient = js.Any.fromFunction3(PresetGradient), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1(PresetTextured), Solid = js.Any.fromFunction0(Solid), TextureName = TextureName.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2(TwoColorGradient), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction4(UserPicture), UserTextured = js.Any.fromFunction1(UserTextured), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartFillFormat_typekey")(OfficeDotChartFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFillFormat]
  }
  
  extension [Self <: ChartFillFormat](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: ChartColorFormat): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: ChartColorFormat): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setGradientColorType(value: Double): Self = StObject.set(x, "GradientColorType", value.asInstanceOf[js.Any])
    
    inline def setGradientDegree(value: Double): Self = StObject.set(x, "GradientDegree", value.asInstanceOf[js.Any])
    
    inline def setGradientStyle(value: Double): Self = StObject.set(x, "GradientStyle", value.asInstanceOf[js.Any])
    
    inline def setGradientVariant(value: Double): Self = StObject.set(x, "GradientVariant", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotChartFillFormat_typekey(value: ChartFillFormat): Self = StObject.set(x, "Office.ChartFillFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setOneColorGradient(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "OneColorGradient", js.Any.fromFunction3(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Double): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatterned(value: Double => Unit): Self = StObject.set(x, "Patterned", js.Any.fromFunction1(value))
    
    inline def setPresetGradient(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "PresetGradient", js.Any.fromFunction3(value))
    
    inline def setPresetGradientType(value: Double): Self = StObject.set(x, "PresetGradientType", value.asInstanceOf[js.Any])
    
    inline def setPresetTexture(value: Double): Self = StObject.set(x, "PresetTexture", value.asInstanceOf[js.Any])
    
    inline def setPresetTextured(value: Double => Unit): Self = StObject.set(x, "PresetTextured", js.Any.fromFunction1(value))
    
    inline def setSolid(value: () => Unit): Self = StObject.set(x, "Solid", js.Any.fromFunction0(value))
    
    inline def setTextureName(value: String): Self = StObject.set(x, "TextureName", value.asInstanceOf[js.Any])
    
    inline def setTextureType(value: Double): Self = StObject.set(x, "TextureType", value.asInstanceOf[js.Any])
    
    inline def setTwoColorGradient(value: (Double, Double) => Unit): Self = StObject.set(x, "TwoColorGradient", js.Any.fromFunction2(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUserPicture(value: (String, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "UserPicture", js.Any.fromFunction4(value))
    
    inline def setUserTextured(value: String => Unit): Self = StObject.set(x, "UserTextured", js.Any.fromFunction1(value))
    
    inline def setVisible(value: Double): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
