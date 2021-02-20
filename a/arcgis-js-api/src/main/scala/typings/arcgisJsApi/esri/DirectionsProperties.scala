package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsProperties
  extends WidgetProperties
     with GoToProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#maxStops)
    */
  var maxStops: js.UndefOr[Double] = js.native
  
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeServiceUrl)
    */
  var routeServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.native
  
  /**
    * Controls the default properties used when [searching](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#searchProperties)
    */
  var searchProperties: js.UndefOr[DirectionsSearchProperties] = js.native
  
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsStopSymbols] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#viewModel)
    */
  var viewModel: js.UndefOr[DirectionsViewModelProperties] = js.native
}
object DirectionsProperties {
  
  @scala.inline
  def apply(): DirectionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsProperties]
  }
  
  @scala.inline
  implicit class DirectionsPropertiesMutableBuilder[Self <: DirectionsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setMaxStops(value: Double): Self = StObject.set(x, "maxStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStopsUndefined: Self = StObject.set(x, "maxStops", js.undefined)
    
    @scala.inline
    def setRouteServiceUrl(value: String): Self = StObject.set(x, "routeServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteServiceUrlUndefined: Self = StObject.set(x, "routeServiceUrl", js.undefined)
    
    @scala.inline
    def setRouteSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "routeSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSymbolUndefined: Self = StObject.set(x, "routeSymbol", js.undefined)
    
    @scala.inline
    def setSearchProperties(value: DirectionsSearchProperties): Self = StObject.set(x, "searchProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPropertiesUndefined: Self = StObject.set(x, "searchProperties", js.undefined)
    
    @scala.inline
    def setStopSymbols(value: DirectionsStopSymbols): Self = StObject.set(x, "stopSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopSymbolsUndefined: Self = StObject.set(x, "stopSymbols", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: DirectionsViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
