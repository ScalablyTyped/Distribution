package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  /**
    * Determines the font family settings.
    */
  var FontFamily: js.UndefOr[String] = js.undefined
}
object Font {
  
  inline def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "FontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "FontFamily", js.undefined)
  }
}
