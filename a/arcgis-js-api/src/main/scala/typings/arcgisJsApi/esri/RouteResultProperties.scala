package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResultProperties extends js.Object {
  /**
    * Route directions are returned if `RouteParameters.returnDirections = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#directions)
    */
  var directions: js.UndefOr[DirectionsFeatureSetProperties] = js.undefined
  /**
    * The Route graphic that is returned if `RouteParameters.returnRoutes = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#route)
    */
  var route: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * The name of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.undefined
  /**
    * Array of stops. Returned only if `RouteParameters.returnStops = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#stops)
    */
  var stops: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
}

object RouteResultProperties {
  @scala.inline
  def apply(
    directions: DirectionsFeatureSetProperties = null,
    route: GraphicProperties = null,
    routeName: String = null,
    stops: js.Array[GraphicProperties] = null
  ): RouteResultProperties = {
    val __obj = js.Dynamic.literal()
    if (directions != null) __obj.updateDynamic("directions")(directions.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (routeName != null) __obj.updateDynamic("routeName")(routeName.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResultProperties]
  }
}

