package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDefineThemeOptions extends StObject {
  
  var accent: js.UndefOr[String] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var dark: js.UndefOr[Boolean] = js.undefined
  
  var primary: js.UndefOr[String] = js.undefined
  
  var warn: js.UndefOr[String] = js.undefined
}
object IDefineThemeOptions {
  
  inline def apply(): IDefineThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefineThemeOptions]
  }
  
  extension [Self <: IDefineThemeOptions](x: Self) {
    
    inline def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
