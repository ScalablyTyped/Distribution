package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoprocessorProperties extends TaskProperties {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries will be in the spatial reference of the input geometries. If [processSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference) is specified and `outSpatialReference` is not specified, the output geometries will be in the spatial reference of the process spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outSpatialReference)
    *
    * @default null
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * ProcessExtent, if specified, will only process features that overlap this extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processExtent)
    *
    * @default null
    */
  var processExtent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The spatial reference that the model will use to perform geometry operations. If `processSpatialReference` is specified and [outputSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outputSpatialReference) is not specified, the output geometries will be in the spatial reference of the process spatial reference.  A possible common scenario for using `processSpatialReference` and `outputSpatialReference` is that you would like to perform spatial operations like buffer or clip on a projected coordinate system such as web mercator. And you would like to recieve the output based on a geographic coordinates such as WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference)
    *
    * @default null
    */
  var processSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * If `true`, m-values will be included in the results if the features have m-values. Otherwise, m-values are not returned. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnM)
    *
    * @default false
    */
  var returnM: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, z-values will be included in the results if the features have z-values. Otherwise, z-values are not returned. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnZ)
    *
    * @default false
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
}

object GeoprocessorProperties {
  @scala.inline
  def apply(
    outSpatialReference: SpatialReferenceProperties = null,
    processExtent: ExtentProperties = null,
    processSpatialReference: SpatialReferenceProperties = null,
    requestOptions: js.Any = null,
    returnM: js.UndefOr[Boolean] = js.undefined,
    returnZ: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): GeoprocessorProperties = {
    val __obj = js.Dynamic.literal()
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (processExtent != null) __obj.updateDynamic("processExtent")(processExtent)
    if (processSpatialReference != null) __obj.updateDynamic("processSpatialReference")(processSpatialReference)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (!js.isUndefined(returnM)) __obj.updateDynamic("returnM")(returnM)
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GeoprocessorProperties]
  }
}

