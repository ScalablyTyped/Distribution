package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polyline
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
    * The geometry type of the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#geometryType)
    */
  @JSName("geometryType")
  var geometryType_DirectionsFeatureSetProperties: js.UndefOr[polyline] = js.undefined
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
    geometryType: polyline = null,
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
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(exceededTransferLimit)) __obj.updateDynamic("exceededTransferLimit")(exceededTransferLimit.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType.asInstanceOf[js.Any])
    if (mergedGeometry != null) __obj.updateDynamic("mergedGeometry")(mergedGeometry.asInstanceOf[js.Any])
    if (queryGeometry != null) __obj.updateDynamic("queryGeometry")(queryGeometry.asInstanceOf[js.Any])
    if (routeId != null) __obj.updateDynamic("routeId")(routeId.asInstanceOf[js.Any])
    if (routeName != null) __obj.updateDynamic("routeName")(routeName.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (totalDriveTime != null) __obj.updateDynamic("totalDriveTime")(totalDriveTime.asInstanceOf[js.Any])
    if (totalLength != null) __obj.updateDynamic("totalLength")(totalLength.asInstanceOf[js.Any])
    if (totalTime != null) __obj.updateDynamic("totalTime")(totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsFeatureSetProperties]
  }
}

