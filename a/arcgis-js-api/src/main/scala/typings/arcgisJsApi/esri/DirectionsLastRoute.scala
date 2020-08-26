package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsLastRoute extends Object {
  /**
    * Array of graphics representing the point barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var barriers: js.Array[Graphic] = js.native
  /**
    * An array of messages serialized to JSON.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var messages: js.Array[DirectionsLastRouteMessages] = js.native
  /**
    * Array of graphics representing the polygon barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var polygonBarriers: js.Array[Graphic] = js.native
  /**
    * Array of graphics representing the polygon barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var polylineBarriers: js.Array[Graphic] = js.native
  /**
    * An array of [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var routeResults: RouteResult = js.native
}

object DirectionsLastRoute {
  @scala.inline
  def apply(
    barriers: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    messages: js.Array[DirectionsLastRouteMessages],
    polygonBarriers: js.Array[Graphic],
    polylineBarriers: js.Array[Graphic],
    propertyIsEnumerable: PropertyKey => Boolean,
    routeResults: RouteResult
  ): DirectionsLastRoute = {
    val __obj = js.Dynamic.literal(barriers = barriers.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), messages = messages.asInstanceOf[js.Any], polygonBarriers = polygonBarriers.asInstanceOf[js.Any], polylineBarriers = polylineBarriers.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), routeResults = routeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsLastRoute]
  }
  @scala.inline
  implicit class DirectionsLastRouteOps[Self <: DirectionsLastRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBarriersVarargs(value: Graphic*): Self = this.set("barriers", js.Array(value :_*))
    @scala.inline
    def setBarriers(value: js.Array[Graphic]): Self = this.set("barriers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: DirectionsLastRouteMessages*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[DirectionsLastRouteMessages]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonBarriersVarargs(value: Graphic*): Self = this.set("polygonBarriers", js.Array(value :_*))
    @scala.inline
    def setPolygonBarriers(value: js.Array[Graphic]): Self = this.set("polygonBarriers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolylineBarriersVarargs(value: Graphic*): Self = this.set("polylineBarriers", js.Array(value :_*))
    @scala.inline
    def setPolylineBarriers(value: js.Array[Graphic]): Self = this.set("polylineBarriers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteResults(value: RouteResult): Self = this.set("routeResults", value.asInstanceOf[js.Any])
  }
  
}

