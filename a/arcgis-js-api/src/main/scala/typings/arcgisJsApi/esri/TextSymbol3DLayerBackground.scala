package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
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
  
  inline def apply(
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, TextSymbol3DLayerBackground]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], TextSymbol3DLayerBackground]])
  ): TextSymbol3DLayerBackground = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol3DLayerBackground]
  }
  
  extension [Self <: TextSymbol3DLayerBackground](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
