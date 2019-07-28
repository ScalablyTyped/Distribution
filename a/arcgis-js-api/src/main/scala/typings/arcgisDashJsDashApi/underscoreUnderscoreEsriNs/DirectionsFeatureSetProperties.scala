package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsFeatureSetProperties extends FeatureSetProperties {
  /**
    * The extent of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * A single polyline representing the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#mergedGeometry)
    */
  var mergedGeometry: js.UndefOr[PolylineProperties] = js.undefined
  /**
    * The ID of the route returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeId)
    */
  var routeId: js.UndefOr[String] = js.undefined
  /**
    * Name specified in [RouteParameters.stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.undefined
  /**
    * Lists additional information about the directions depending on the value of [RouteParameters.directionsOutputType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#strings)
    */
  var strings: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Actual drive time calculated for the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalDriveTime)
    */
  var totalDriveTime: js.UndefOr[Double] = js.undefined
  /**
    * The length of the route as specified in the units set in [RouteParameters.directionsLengthUnits](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalLength)
    */
  var totalLength: js.UndefOr[Double] = js.undefined
  /**
    * The total time calculated for the route as specified in the units set in [RouteParameters.directionsTimeAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalTime)
    */
  var totalTime: js.UndefOr[Double] = js.undefined
}

object DirectionsFeatureSetProperties {
  @scala.inline
  def apply(
    displayFieldName: String = null,
    exceededTransferLimit: js.UndefOr[Boolean] = js.undefined,
    extent: ExtentProperties = null,
    features: js.Array[GraphicProperties] = null,
    fields: js.Array[FieldProperties] = null,
    geometryType: String = null,
    mergedGeometry: PolylineProperties = null,
    queryGeometry: GeometryProperties = null,
    routeId: String = null,
    routeName: String = null,
    spatialReference: SpatialReferenceProperties = null,
    strings: js.Array[_] = null,
    totalDriveTime: Int | Double = null,
    totalLength: Int | Double = null,
    totalTime: Int | Double = null
  ): DirectionsFeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName)
    if (!js.isUndefined(exceededTransferLimit)) __obj.updateDynamic("exceededTransferLimit")(exceededTransferLimit)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (features != null) __obj.updateDynamic("features")(features)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType)
    if (mergedGeometry != null) __obj.updateDynamic("mergedGeometry")(mergedGeometry)
    if (queryGeometry != null) __obj.updateDynamic("queryGeometry")(queryGeometry)
    if (routeId != null) __obj.updateDynamic("routeId")(routeId)
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (totalDriveTime != null) __obj.updateDynamic("totalDriveTime")(totalDriveTime.asInstanceOf[js.Any])
    if (totalLength != null) __obj.updateDynamic("totalLength")(totalLength.asInstanceOf[js.Any])
    if (totalTime != null) __obj.updateDynamic("totalTime")(totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsFeatureSetProperties]
  }
}

