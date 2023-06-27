package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#apiKey)
  		 */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
  		 * The [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) associated with the DirectionsViewModel.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#layer)
  		 */
  var layer: js.UndefOr[RouteLayerProperties] = js.undefined
  
  /**
  		 * The maximum number of stops allowed for routing.
  		 *
  		 * @default 50
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
  		 */
  var maxStops: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Route Parameters object used to call the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
  		 */
  var routeParameters: js.UndefOr[RouteParametersProperties] = js.undefined
  
  /**
  		 * The travel mode that will be used by [getDirections()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getDirections) when requesting the route and directions.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
  		 */
  var selectedTravelMode: js.UndefOr[TravelModeProperties] = js.undefined
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object DirectionsViewModelProperties {
  
  inline def apply(): DirectionsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setLayer(value: RouteLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setMaxStops(value: Double): Self = StObject.set(x, "maxStops", value.asInstanceOf[js.Any])
    
    inline def setMaxStopsUndefined: Self = StObject.set(x, "maxStops", js.undefined)
    
    inline def setRouteParameters(value: RouteParametersProperties): Self = StObject.set(x, "routeParameters", value.asInstanceOf[js.Any])
    
    inline def setRouteParametersUndefined: Self = StObject.set(x, "routeParameters", js.undefined)
    
    inline def setSelectedTravelMode(value: TravelModeProperties): Self = StObject.set(x, "selectedTravelMode", value.asInstanceOf[js.Any])
    
    inline def setSelectedTravelModeUndefined: Self = StObject.set(x, "selectedTravelMode", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
