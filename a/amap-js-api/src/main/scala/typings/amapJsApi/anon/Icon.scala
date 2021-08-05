package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LabelMarker.IconOptions
import typings.amapJsApi.AMap.LabelMarker.TextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: IconOptions
  
  var opacity: Double
  
  var text: TextOptions
  
  var zIndex: Double
}
object Icon {
  
  inline def apply(icon: IconOptions, opacity: Double, text: TextOptions, zIndex: Double): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: IconOptions): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
