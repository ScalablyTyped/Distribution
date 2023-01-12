package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColor extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  /* private */ @JSName("Office.ThemeColor_typekey")
  var OfficeDotThemeColor_typekey: ThemeColor
  
  val Parent: Any
  
  var RGB: Double
  
  val ThemeColorSchemeIndex: MsoThemeColorSchemeIndex
}
object ThemeColor {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    OfficeDotThemeColor_typekey: ThemeColor,
    Parent: Any,
    RGB: Double,
    ThemeColorSchemeIndex: MsoThemeColorSchemeIndex
  ): ThemeColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], ThemeColorSchemeIndex = ThemeColorSchemeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeColor_typekey")(OfficeDotThemeColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeColor] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotThemeColor_typekey(value: ThemeColor): Self = StObject.set(x, "Office.ThemeColor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRGB(value: Double): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    inline def setThemeColorSchemeIndex(value: MsoThemeColorSchemeIndex): Self = StObject.set(x, "ThemeColorSchemeIndex", value.asInstanceOf[js.Any])
  }
}
