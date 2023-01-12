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
    * The URL of the REST endpoint of the Route service.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/RouteLayer#url url} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    */
  var routeServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/support/RouteSymbols#directionLines directionLines} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
    * The selected travel mode.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  var selectedTravelMode: js.UndefOr[TravelModeProperties] = js.undefined
  
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/support/RouteStopSymbols} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsViewModelStopSymbols] = js.undefined
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html)s that define the stop locations along the route.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/RouteLayer#stops stops} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stops)
    */
  var stops: js.UndefOr[
    (CollectionProperties[GraphicProperties | StopProperties]) | (js.Array[GraphicProperties | StopProperties])
  ] = js.undefined
  
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
    
    inline def setRouteServiceUrl(value: String): Self = StObject.set(x, "routeServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setRouteServiceUrlUndefined: Self = StObject.set(x, "routeServiceUrl", js.undefined)
    
    inline def setRouteSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "routeSymbol", value.asInstanceOf[js.Any])
    
    inline def setRouteSymbolUndefined: Self = StObject.set(x, "routeSymbol", js.undefined)
    
    inline def setSelectedTravelMode(value: TravelModeProperties): Self = StObject.set(x, "selectedTravelMode", value.asInstanceOf[js.Any])
    
    inline def setSelectedTravelModeUndefined: Self = StObject.set(x, "selectedTravelMode", js.undefined)
    
    inline def setStopSymbols(value: DirectionsViewModelStopSymbols): Self = StObject.set(x, "stopSymbols", value.asInstanceOf[js.Any])
    
    inline def setStopSymbolsUndefined: Self = StObject.set(x, "stopSymbols", js.undefined)
    
    inline def setStops(
      value: (CollectionProperties[GraphicProperties | StopProperties]) | (js.Array[GraphicProperties | StopProperties])
    ): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: (GraphicProperties | StopProperties)*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
