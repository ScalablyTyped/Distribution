package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorFormat extends StObject {
  
  val Application: js.Any
  
  var Brightness: Double
  
  val Creator: Double
  
  var ObjectThemeColor: MsoThemeColorIndex
  
  /* private */ @JSName("Office.ColorFormat_typekey")
  var OfficeDotColorFormat_typekey: ColorFormat
  
  val Parent: js.Any
  
  var RGB: Double
  
  var SchemeColor: Double
  
  var TintAndShade: Double
  
  val Type: MsoColorType
}
object ColorFormat {
  
  inline def apply(
    Application: js.Any,
    Brightness: Double,
    Creator: Double,
    ObjectThemeColor: MsoThemeColorIndex,
    OfficeDotColorFormat_typekey: ColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ColorFormat_typekey")(OfficeDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
  
  extension [Self <: ColorFormat](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setObjectThemeColor(value: MsoThemeColorIndex): Self = StObject.set(x, "ObjectThemeColor", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotColorFormat_typekey(value: ColorFormat): Self = StObject.set(x, "Office.ColorFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRGB(value: Double): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    inline def setSchemeColor(value: Double): Self = StObject.set(x, "SchemeColor", value.asInstanceOf[js.Any])
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoColorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
