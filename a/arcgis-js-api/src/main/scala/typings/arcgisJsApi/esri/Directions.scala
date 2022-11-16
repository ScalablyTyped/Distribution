package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directions
  extends StObject
     with Widget_
     with GoTo {
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#apiKey)
    */
  var apiKey: String = js.native
  
  /**
    * Computes a route and directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#getDirections)
    */
  def getDirections(): js.Promise[RouteLayerSolveResult] = js.native
  
  /**
    * Indicates the heading level to use for the origin and destination addresses (i.e.
    *
    * @default 2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#headingLevel)
    */
  var headingLevel: Double = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * The most recent route result.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  val lastRoute: DirectionsLastRoute = js.native
  
  /**
    * The [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) associated with the Directions widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#layer)
    */
  var layer: RouteLayer = js.native
  
  /**
    * The maximum number of stops allowed for routing.
    *
    * @default 50
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#maxStops)
    */
  var maxStops: Double = js.native
  
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/RouteLayer#url url} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeServiceUrl)
    */
  var routeServiceUrl: String = js.native
  
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/support/RouteSymbols#directionLines directionLines} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeSymbol)
    */
  var routeSymbol: SimpleLineSymbol = js.native
  
  /**
    * Saves the RouteLayer associated with the view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#save)
    */
  def save(): js.Promise[PortalItem] = js.native
  
  /**
    * Saves the RouteLayer associated with the view model as a new portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#saveAs)
    */
  def saveAs(portalItem: js.Promise[PortalItem]): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: js.Promise[PortalItem], options: DirectionsSaveAsOptions): js.Promise[PortalItem] = js.native
  
  /**
    * Controls the default properties used when [searching](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#searchProperties)
    */
  var searchProperties: DirectionsSearchProperties = js.native
  
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/support/RouteStopSymbols} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var stopSymbols: DirectionsStopSymbols = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#unit)
    */
  var unit: imperial | metric | centimeters | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | yards = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#viewModel)
    */
  var viewModel: DirectionsViewModel = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#visibleElements)
    */
  var visibleElements: DirectionsVisibleElements = js.native
  
  /**
    * Zoom so that the full route is displayed within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#zoomToRoute)
    */
  def zoomToRoute(): scala.Unit = js.native
}
