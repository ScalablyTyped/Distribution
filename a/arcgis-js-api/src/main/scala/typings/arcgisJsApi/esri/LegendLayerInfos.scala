package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendLayerInfos
  extends StObject
     with Object {
  
  /**
    * List of sublayer ids that will not be displayed in the legend even if they are visible in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var hideLayers: js.Array[Double]
  
  /**
    * A layer to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layer: Layer
  
  /**
    * Specifies a title for the layer to display above its symbols and descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var title: js.UndefOr[String] = js.undefined
}
object LegendLayerInfos {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    hideLayers: js.Array[Double],
    layer: Layer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LegendLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hideLayers = hideLayers.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LegendLayerInfos]
  }
  
  extension [Self <: LegendLayerInfos](x: Self) {
    
    inline def setHideLayers(value: js.Array[Double]): Self = StObject.set(x, "hideLayers", value.asInstanceOf[js.Any])
    
    inline def setHideLayersVarargs(value: Double*): Self = StObject.set(x, "hideLayers", js.Array(value :_*))
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
