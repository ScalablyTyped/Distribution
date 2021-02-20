package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDefineThemeOptions extends StObject {
  
  var accent: js.UndefOr[String] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var dark: js.UndefOr[Boolean] = js.native
  
  var primary: js.UndefOr[String] = js.native
  
  var warn: js.UndefOr[String] = js.native
}
object IDefineThemeOptions {
  
  @scala.inline
  def apply(): IDefineThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefineThemeOptions]
  }
  
  @scala.inline
  implicit class IDefineThemeOptionsMutableBuilder[Self <: IDefineThemeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
