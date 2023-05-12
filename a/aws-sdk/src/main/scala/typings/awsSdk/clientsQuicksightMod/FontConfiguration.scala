package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontConfiguration extends StObject {
  
  /**
    * Determines the color of the text.
    */
  var FontColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * Determines the appearance of decorative lines on the text.
    */
  var FontDecoration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontDecoration] = js.undefined
  
  /**
    * The option that determines the text display size.
    */
  var FontSize: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontSize] = js.undefined
  
  /**
    * Determines the text display face that is inherited by the given font family.
    */
  var FontStyle: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontStyle] = js.undefined
  
  /**
    * The option that determines the text display weight, or boldness.
    */
  var FontWeight: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontWeight] = js.undefined
}
object FontConfiguration {
  
  inline def apply(): FontConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFontColor(value: HexColor): Self = StObject.set(x, "FontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "FontColor", js.undefined)
    
    inline def setFontDecoration(value: FontDecoration): Self = StObject.set(x, "FontDecoration", value.asInstanceOf[js.Any])
    
    inline def setFontDecorationUndefined: Self = StObject.set(x, "FontDecoration", js.undefined)
    
    inline def setFontSize(value: FontSize): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "FontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "FontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "FontStyle", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "FontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "FontWeight", js.undefined)
  }
}
