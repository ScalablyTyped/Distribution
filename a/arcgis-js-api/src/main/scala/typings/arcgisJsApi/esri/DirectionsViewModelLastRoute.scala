package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModelLastRoute extends Object {
  
  /**
    * Array of graphics representing the point barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var barriers: js.Array[Graphic] = js.native
  
  /**
    * An array of messages serialized to JSON.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var messages: js.Array[DirectionsViewModelLastRouteMessages] = js.native
  
  /**
    * Array of graphics representing the polygon barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var polygonBarriers: js.Array[Graphic] = js.native
  
  /**
    * Array of graphics representing the polygon barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var polylineBarriers: js.Array[Graphic] = js.native
  
  /**
    * An array of [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var routeResults: RouteResult = js.native
}
object DirectionsViewModelLastRoute {
  
  @scala.inline
  def apply(
    barriers: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    messages: js.Array[DirectionsViewModelLastRouteMessages],
    polygonBarriers: js.Array[Graphic],
    polylineBarriers: js.Array[Graphic],
    propertyIsEnumerable: PropertyKey => Boolean,
    routeResults: RouteResult
  ): DirectionsViewModelLastRoute = {
    val __obj = js.Dynamic.literal(barriers = barriers.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), messages = messages.asInstanceOf[js.Any], polygonBarriers = polygonBarriers.asInstanceOf[js.Any], polylineBarriers = polylineBarriers.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), routeResults = routeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelLastRoute]
  }
  
  @scala.inline
  implicit class DirectionsViewModelLastRouteMutableBuilder[Self <: DirectionsViewModelLastRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarriers(value: js.Array[Graphic]): Self = StObject.set(x, "barriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarriersVarargs(value: Graphic*): Self = StObject.set(x, "barriers", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[DirectionsViewModelLastRouteMessages]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: DirectionsViewModelLastRouteMessages*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setPolygonBarriers(value: js.Array[Graphic]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonBarriersVarargs(value: Graphic*): Self = StObject.set(x, "polygonBarriers", js.Array(value :_*))
    
    @scala.inline
    def setPolylineBarriers(value: js.Array[Graphic]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineBarriersVarargs(value: Graphic*): Self = StObject.set(x, "polylineBarriers", js.Array(value :_*))
    
    @scala.inline
    def setRouteResults(value: RouteResult): Self = StObject.set(x, "routeResults", value.asInstanceOf[js.Any])
  }
}
