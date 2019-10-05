package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAreaSolveResultProperties extends js.Object {
  /**
    * Array of points only returned if `ServiceAreaParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.undefined
  /**
    * Message received when solve is completed. If a service area cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.undefined
  /**
    * The point barriers are returned only if `ServiceAreaParameters.returnPointBarriers = true` (which is not the default). If you send in the point barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.undefined
  /**
    * The polygon barriers are returned only if `ServiceAreaParameters.returnPolygonBarriers = true` (which is not the default). If you send in the polygon barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
  /**
    * The polyline barriers are returned only if `ServiceAreaParameters.returnPolylineBarriers = true` (which is not the default). If you send in the polyline barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  /**
    * An array of service area polygon graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolygons)
    */
  var serviceAreaPolygons: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  /**
    * An array of service area polyline graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolylines)
    */
  var serviceAreaPolylines: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
}

object ServiceAreaSolveResultProperties {
  @scala.inline
  def apply(
    facilities: js.Array[PointProperties] = null,
    messages: js.Array[NAMessageProperties] = null,
    pointBarriers: js.Array[PointProperties] = null,
    polygonBarriers: js.Array[PolygonProperties] = null,
    polylineBarriers: js.Array[PolylineProperties] = null,
    serviceAreaPolygons: js.Array[GraphicProperties] = null,
    serviceAreaPolylines: js.Array[GraphicProperties] = null
  ): ServiceAreaSolveResultProperties = {
    val __obj = js.Dynamic.literal()
    if (facilities != null) __obj.updateDynamic("facilities")(facilities)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (pointBarriers != null) __obj.updateDynamic("pointBarriers")(pointBarriers)
    if (polygonBarriers != null) __obj.updateDynamic("polygonBarriers")(polygonBarriers)
    if (polylineBarriers != null) __obj.updateDynamic("polylineBarriers")(polylineBarriers)
    if (serviceAreaPolygons != null) __obj.updateDynamic("serviceAreaPolygons")(serviceAreaPolygons)
    if (serviceAreaPolylines != null) __obj.updateDynamic("serviceAreaPolylines")(serviceAreaPolylines)
    __obj.asInstanceOf[ServiceAreaSolveResultProperties]
  }
}

