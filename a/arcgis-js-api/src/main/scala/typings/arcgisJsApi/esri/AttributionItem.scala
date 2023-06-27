package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributionItem extends StObject {
  
  /**
  		 * The layer that has the attribution text.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#AttributionItem)
  		 */
  var layer: Layer
  
  /**
  		 * The attribution text.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#AttributionItem)
  		 */
  var text: String
}
object AttributionItem {
  
  inline def apply(layer: Layer, text: String): AttributionItem = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributionItem] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
