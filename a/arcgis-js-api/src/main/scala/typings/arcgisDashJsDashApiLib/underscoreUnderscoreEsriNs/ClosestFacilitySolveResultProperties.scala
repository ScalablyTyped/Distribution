package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosestFacilitySolveResultProperties extends js.Object {
  /**
    * An array of directions. A direction is an instance of [DirectionsFeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html). Route directions are returned if `returnDirections = true` (default is false).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#directions)
    */
  var directions: js.UndefOr[DirectionsFeatureSetProperties] = js.undefined
  /**
    * An array of points representing facilities. Only returned when `ClosestFacilityParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.undefined
  /**
    * An array of points representing incidents. Only returned when `ClosestFacilityParameters.returnIncidents = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#incidents)
    */
  var incidents: js.UndefOr[js.Array[PointProperties]] = js.undefined
  /**
    * Message received when the solve is complete. If a closest facility cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.undefined
  /**
    * The point barriers are an array of points. They are returned only if `ClosestFacilityParameters.returnPointBarriers` was set to `true` (which is not the default). If you send in the point barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.undefined
  /**
    * The polygon barriers are an array of polygons. They are returned only if `ClosestFacilityParameters.returnPolygonBarriers` was set to `true` (which is not the default). If you send in the polygon barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
  /**
    * The polyline barriers are an array of polylines. They are returned only if `ClosestFacilityParameters.returnPolylineBarriers` was set to `true` (which is not the default). If you send in the polyline barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  /**
    * The array of routes. Route graphics are returned if `returnRoutes = true` and `outputLines` does not equal `none`. From version 2.0 to 2.5 the type is an array of Polylines. At version 2.6 the type is an array of Graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#routes)
    */
  var routes: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
}

object ClosestFacilitySolveResultProperties {
  @scala.inline
  def apply(
    directions: DirectionsFeatureSetProperties = null,
    facilities: js.Array[PointProperties] = null,
    incidents: js.Array[PointProperties] = null,
    messages: js.Array[NAMessageProperties] = null,
    pointBarriers: js.Array[PointProperties] = null,
    polygonBarriers: js.Array[PolygonProperties] = null,
    polylineBarriers: js.Array[PolylineProperties] = null,
    routes: js.Array[GraphicProperties] = null
  ): ClosestFacilitySolveResultProperties = {
    val __obj = js.Dynamic.literal()
    if (directions != null) __obj.updateDynamic("directions")(directions)
    if (facilities != null) __obj.updateDynamic("facilities")(facilities)
    if (incidents != null) __obj.updateDynamic("incidents")(incidents)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (pointBarriers != null) __obj.updateDynamic("pointBarriers")(pointBarriers)
    if (polygonBarriers != null) __obj.updateDynamic("polygonBarriers")(polygonBarriers)
    if (polylineBarriers != null) __obj.updateDynamic("polylineBarriers")(polylineBarriers)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[ClosestFacilitySolveResultProperties]
  }
}

