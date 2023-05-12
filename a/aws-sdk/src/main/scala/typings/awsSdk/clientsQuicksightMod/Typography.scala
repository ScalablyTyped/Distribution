package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography extends StObject {
  
  /**
    * Determines the list of font families.
    */
  var FontFamilies: js.UndefOr[FontList] = js.undefined
}
object Typography {
  
  inline def apply(): Typography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    inline def setFontFamilies(value: FontList): Self = StObject.set(x, "FontFamilies", value.asInstanceOf[js.Any])
    
    inline def setFontFamiliesUndefined: Self = StObject.set(x, "FontFamilies", js.undefined)
    
    inline def setFontFamiliesVarargs(value: Font*): Self = StObject.set(x, "FontFamilies", js.Array(value*))
  }
}
