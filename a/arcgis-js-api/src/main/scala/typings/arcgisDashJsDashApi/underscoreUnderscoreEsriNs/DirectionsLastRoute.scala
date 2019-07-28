package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsLastRoute extends Object {
  /**
    * Array of graphics representing the point barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var barriers: js.Array[Graphic]
  /**
    * An array of messages serialized to JSON.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var messages: js.Array[DirectionsLastRouteMessages]
  /**
    * Array of graphics representing the polygon barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var polygonBarriers: js.Array[Graphic]
  /**
    * Array of graphics representing the polygon barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var polylineBarriers: js.Array[Graphic]
  /**
    * An array of [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    */
  var routeResults: RouteResult
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
    val __obj = js.Dynamic.literal(barriers = barriers, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), messages = messages, polygonBarriers = polygonBarriers, polylineBarriers = polylineBarriers, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), routeResults = routeResults)
  
    __obj.asInstanceOf[DirectionsLastRoute]
  }
}

