package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferParametersProperties extends js.Object {
  /**
    * The spatial reference in which the geometries are buffered.  If `bufferSpatialReference` is not specified, the geometries are buffered in the spatial reference specified by `outSpatialReference`. If `outSpatialReference` is also not specified, they are buffered in the spatial reference of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#bufferSpatialReference)
    */
  var bufferSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The distances the input features are buffered. The distance units are specified by `unit`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#distances)
    */
  var distances: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * If the input geometries are in a geographic coordinate system, set geodesic to `true` to generate a buffer polygon using a geodesic distance. The `bufferSpatialReference` property is ignored when geodesic is set to `true`. Requires ArcGIS Server 10.1 or greater geometry service. For more information, see the ArcGIS REST API documentation on the GeometryService buffer operation and the geodesic property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  /**
    * The input geometries to buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  /**
    * The spatial reference for the returned geometries.  If `outSpatialReference` is not specified, the output geometries are in the spatial reference specified by `bufferSpatialReference`. If `bufferSpatialReference` also is not specified, they are in the spatial reference of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * If `true`, all geometries buffered at a given distance are unioned into a single (possibly multipart) polygon, and the unioned geometry is placed in the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unionResults)
    */
  var unionResults: js.UndefOr[Boolean] = js.undefined
  /**
    * The units for calculating each buffer distance. If `unit` is not specified, the units are derived from `bufferSpatialReference`. If `bufferSpatialReference` is not specified, the units are derived from the features.  For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unit)
    */
  var unit: js.UndefOr[feet | kilometers | meters | miles | `nautical-miles` | yards] = js.undefined
}

object BufferParametersProperties {
  @scala.inline
  def apply(
    bufferSpatialReference: SpatialReferenceProperties = null,
    distances: js.Array[Double] = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    geometries: js.Array[GeometryProperties] = null,
    outSpatialReference: SpatialReferenceProperties = null,
    unionResults: js.UndefOr[Boolean] = js.undefined,
    unit: feet | kilometers | meters | miles | `nautical-miles` | yards = null
  ): BufferParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (bufferSpatialReference != null) __obj.updateDynamic("bufferSpatialReference")(bufferSpatialReference)
    if (distances != null) __obj.updateDynamic("distances")(distances)
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (!js.isUndefined(unionResults)) __obj.updateDynamic("unionResults")(unionResults)
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParametersProperties]
  }
}

