package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorWeak extends StObject {
  
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  
  var primaryColor: js.UndefOr[String] = js.undefined
}
object ColorWeak {
  
  inline def apply(): ColorWeak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorWeak]
  }
  
  extension [Self <: ColorWeak](x: Self) {
    
    inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
    
    inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
    
    inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
  }
}
