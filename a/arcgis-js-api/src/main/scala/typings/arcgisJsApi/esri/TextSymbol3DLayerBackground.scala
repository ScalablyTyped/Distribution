package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSymbol3DLayerBackground
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * The color of the background.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#background)
  		 */
  var color: js.UndefOr[Color_] = js.undefined
}
object TextSymbol3DLayerBackground {
  
  inline def apply(): TextSymbol3DLayerBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSymbol3DLayerBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSymbol3DLayerBackground] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
