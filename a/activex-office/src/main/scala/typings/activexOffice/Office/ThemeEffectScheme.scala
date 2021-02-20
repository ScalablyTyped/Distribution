package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeEffectScheme extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  def Load(FileName: String): Unit = js.native
  
  @JSName("Office.ThemeEffectScheme_typekey")
  var OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme = js.native
  
  val Parent: js.Any = js.native
}
object ThemeEffectScheme {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Load: String => Unit,
    OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme,
    Parent: js.Any
  ): ThemeEffectScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeEffectScheme_typekey")(OfficeDotThemeEffectScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeEffectScheme]
  }
  
  @scala.inline
  implicit class ThemeEffectSchemeMutableBuilder[Self <: ThemeEffectScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: String => Unit): Self = StObject.set(x, "Load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOfficeDotThemeEffectScheme_typekey(value: ThemeEffectScheme): Self = StObject.set(x, "Office.ThemeEffectScheme_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
