package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPrimary extends StObject {
  
  var colorPrimary: js.UndefOr[String] = js.undefined
  
  var colorWeak: js.UndefOr[Boolean] = js.undefined
}
object ColorPrimary {
  
  inline def apply(): ColorPrimary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPrimary]
  }
  
  extension [Self <: ColorPrimary](x: Self) {
    
    inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
    
    inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
  }
}
