package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeFont extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  var Name: String
  
  @JSName("Office.ThemeFont_typekey")
  var OfficeDotThemeFont_typekey: ThemeFont
  
  val Parent: js.Any
}
object ThemeFont {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    OfficeDotThemeFont_typekey: ThemeFont,
    Parent: js.Any
  ): ThemeFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeFont_typekey")(OfficeDotThemeFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeFont]
  }
  
  @scala.inline
  implicit class ThemeFontMutableBuilder[Self <: ThemeFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotThemeFont_typekey(value: ThemeFont): Self = StObject.set(x, "Office.ThemeFont_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
