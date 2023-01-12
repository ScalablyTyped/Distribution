package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfficeTheme extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  /* private */ @JSName("Office.OfficeTheme_typekey")
  var OfficeDotOfficeTheme_typekey: OfficeTheme
  
  val Parent: Any
  
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme
  
  val ThemeEffectScheme: typings.activexOffice.Office.ThemeEffectScheme
  
  val ThemeFontScheme: typings.activexOffice.Office.ThemeFontScheme
}
object OfficeTheme {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    OfficeDotOfficeTheme_typekey: OfficeTheme,
    Parent: Any,
    ThemeColorScheme: ThemeColorScheme,
    ThemeEffectScheme: ThemeEffectScheme,
    ThemeFontScheme: ThemeFontScheme
  ): OfficeTheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColorScheme = ThemeColorScheme.asInstanceOf[js.Any], ThemeEffectScheme = ThemeEffectScheme.asInstanceOf[js.Any], ThemeFontScheme = ThemeFontScheme.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.OfficeTheme_typekey")(OfficeDotOfficeTheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfficeTheme] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotOfficeTheme_typekey(value: OfficeTheme): Self = StObject.set(x, "Office.OfficeTheme_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setThemeColorScheme(value: ThemeColorScheme): Self = StObject.set(x, "ThemeColorScheme", value.asInstanceOf[js.Any])
    
    inline def setThemeEffectScheme(value: ThemeEffectScheme): Self = StObject.set(x, "ThemeEffectScheme", value.asInstanceOf[js.Any])
    
    inline def setThemeFontScheme(value: ThemeFontScheme): Self = StObject.set(x, "ThemeFontScheme", value.asInstanceOf[js.Any])
  }
}
