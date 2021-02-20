package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModelProperties extends GoToProperties {
  
  /**
    * The network attribute name to be used as the impedance attribute in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
    */
  var maxStops: js.UndefOr[Double] = js.native
  
  /**
    * Route Parameters object used to call the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
    */
  var routeParameters: js.UndefOr[RouteParametersProperties] = js.native
  
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    */
  var routeServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.native
  
  /**
    * The selected travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  var selectedTravelMode: js.UndefOr[DirectionsViewModelSelectedTravelMode] = js.native
  
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsViewModelStopSymbols] = js.native
  
  /**
    * An array of graphics that define the stop locations along the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stops)
    */
  var stops: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object DirectionsViewModelProperties {
  
  @scala.inline
  def apply(): DirectionsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsViewModelProperties]
  }
  
  @scala.inline
  implicit class DirectionsViewModelPropertiesMutableBuilder[Self <: DirectionsViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpedanceAttribute(value: String): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpedanceAttributeUndefined: Self = StObject.set(x, "impedanceAttribute", js.undefined)
    
    @scala.inline
    def setMaxStops(value: Double): Self = StObject.set(x, "maxStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStopsUndefined: Self = StObject.set(x, "maxStops", js.undefined)
    
    @scala.inline
    def setRouteParameters(value: RouteParametersProperties): Self = StObject.set(x, "routeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteParametersUndefined: Self = StObject.set(x, "routeParameters", js.undefined)
    
    @scala.inline
    def setRouteServiceUrl(value: String): Self = StObject.set(x, "routeServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteServiceUrlUndefined: Self = StObject.set(x, "routeServiceUrl", js.undefined)
    
    @scala.inline
    def setRouteSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "routeSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSymbolUndefined: Self = StObject.set(x, "routeSymbol", js.undefined)
    
    @scala.inline
    def setSelectedTravelMode(value: DirectionsViewModelSelectedTravelMode): Self = StObject.set(x, "selectedTravelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTravelModeUndefined: Self = StObject.set(x, "selectedTravelMode", js.undefined)
    
    @scala.inline
    def setStopSymbols(value: DirectionsViewModelStopSymbols): Self = StObject.set(x, "stopSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopSymbolsUndefined: Self = StObject.set(x, "stopSymbols", js.undefined)
    
    @scala.inline
    def setStops(value: CollectionProperties[GraphicProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: GraphicProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
