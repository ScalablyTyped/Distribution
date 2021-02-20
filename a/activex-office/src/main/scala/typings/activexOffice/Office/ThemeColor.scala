package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColor extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.ThemeColor_typekey")
  var OfficeDotThemeColor_typekey: ThemeColor = js.native
  
  val Parent: js.Any = js.native
  
  var RGB: Double = js.native
  
  val ThemeColorSchemeIndex: MsoThemeColorSchemeIndex = js.native
}
object ThemeColor {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotThemeColor_typekey: ThemeColor,
    Parent: js.Any,
    RGB: Double,
    ThemeColorSchemeIndex: MsoThemeColorSchemeIndex
  ): ThemeColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], ThemeColorSchemeIndex = ThemeColorSchemeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeColor_typekey")(OfficeDotThemeColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColor]
  }
  
  @scala.inline
  implicit class ThemeColorMutableBuilder[Self <: ThemeColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotThemeColor_typekey(value: ThemeColor): Self = StObject.set(x, "Office.ThemeColor_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB(value: Double): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorSchemeIndex(value: MsoThemeColorSchemeIndex): Self = StObject.set(x, "ThemeColorSchemeIndex", value.asInstanceOf[js.Any])
  }
}
