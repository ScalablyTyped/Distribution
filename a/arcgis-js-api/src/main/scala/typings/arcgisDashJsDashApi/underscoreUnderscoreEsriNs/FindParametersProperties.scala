package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindParametersProperties extends js.Object {
  /**
    * Determines whether to look for an exact match of the search text or not. If `true`, searches for a value that contains the provided [searchText](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText). This is a case-insensitive search. If `false`, searches for an exact match of the [searchText](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText) string. The exact match is case-sensitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#contains)
    *
    * @default true
    */
  var contains: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  /**
    * The layers to perform the find operation on. The layers are specified as a comma-separated list of layer ids. The list of ids is returned in [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) layerInfos.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The maximum allowable offset used for generalizing geometries returned by the find operation. The offset is in the units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference). If [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference) is not defined, the spatial reference of the map is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  /**
    * The spatial reference of the output geometries. If this is not specified, the output geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * If `true`, the output will include the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  /**
    * The names of the fields of a layer to search. The fields are specified as a comma-separated list of field names. If this parameter is not specified, all fields are searched by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchFields)
    */
  var searchFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The text that is searched across the layers and the fields as specified in the `layers` and [searchFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchFields) properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText)
    */
  var searchText: js.UndefOr[String] = js.undefined
}

object FindParametersProperties {
  @scala.inline
  def apply(
    contains: js.UndefOr[Boolean] = js.undefined,
    geometryPrecision: Int | Double = null,
    layerIds: js.Array[Double] = null,
    maxAllowableOffset: Int | Double = null,
    outSpatialReference: SpatialReferenceProperties = null,
    returnGeometry: js.UndefOr[Boolean] = js.undefined,
    searchFields: js.Array[String] = null,
    searchText: String = null
  ): FindParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains)
    if (geometryPrecision != null) __obj.updateDynamic("geometryPrecision")(geometryPrecision.asInstanceOf[js.Any])
    if (layerIds != null) __obj.updateDynamic("layerIds")(layerIds)
    if (maxAllowableOffset != null) __obj.updateDynamic("maxAllowableOffset")(maxAllowableOffset.asInstanceOf[js.Any])
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (!js.isUndefined(returnGeometry)) __obj.updateDynamic("returnGeometry")(returnGeometry)
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields)
    if (searchText != null) __obj.updateDynamic("searchText")(searchText)
    __obj.asInstanceOf[FindParametersProperties]
  }
}

