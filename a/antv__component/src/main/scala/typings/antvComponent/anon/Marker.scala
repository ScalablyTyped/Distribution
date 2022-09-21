package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marker extends StObject {
  
  var marker: StyleInactiveFill
  
  var text: StyleFontSizeNumber
}
object Marker {
  
  inline def apply(marker: StyleInactiveFill, text: StyleFontSizeNumber): Marker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  extension [Self <: Marker](x: Self) {
    
    inline def setMarker(value: StyleInactiveFill): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setText(value: StyleFontSizeNumber): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
