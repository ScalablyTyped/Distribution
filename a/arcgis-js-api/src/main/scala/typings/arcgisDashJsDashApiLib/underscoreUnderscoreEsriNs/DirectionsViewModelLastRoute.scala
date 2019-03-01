package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsViewModelLastRoute
  extends stdLib.Object {
  /**
    * Array of graphics representing the point barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var barriers: js.Array[Graphic]
  /**
    * An array of messages serialized to JSON.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var messages: js.Array[DirectionsViewModelLastRouteMessages]
  /**
    * Array of graphics representing the polygon barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var polygonBarriers: js.Array[Graphic]
  /**
    * Array of graphics representing the polygon barriers. For a list of properties returned for each barrier, see the [barriers](https://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/barriers.htm) help documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var polylineBarriers: js.Array[Graphic]
  /**
    * An array of [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var routeResults: RouteResult
}

object DirectionsViewModelLastRoute {
  @scala.inline
  def apply(
    barriers: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    messages: js.Array[DirectionsViewModelLastRouteMessages],
    polygonBarriers: js.Array[Graphic],
    polylineBarriers: js.Array[Graphic],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    routeResults: RouteResult
  ): DirectionsViewModelLastRoute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("barriers")(barriers)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("polygonBarriers")(polygonBarriers)
    __obj.updateDynamic("polylineBarriers")(polylineBarriers)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("routeResults")(routeResults)
    __obj.asInstanceOf[DirectionsViewModelLastRoute]
  }
}

