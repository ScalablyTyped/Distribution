package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeFont extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  var Name: String
  
  /* private */ @JSName("Office.ThemeFont_typekey")
  var OfficeDotThemeFont_typekey: ThemeFont
  
  val Parent: Any
}
object ThemeFont {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Name: String,
    OfficeDotThemeFont_typekey: ThemeFont,
    Parent: Any
  ): ThemeFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeFont_typekey")(OfficeDotThemeFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeFont]
  }
  
  extension [Self <: ThemeFont](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotThemeFont_typekey(value: ThemeFont): Self = StObject.set(x, "Office.ThemeFont_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
