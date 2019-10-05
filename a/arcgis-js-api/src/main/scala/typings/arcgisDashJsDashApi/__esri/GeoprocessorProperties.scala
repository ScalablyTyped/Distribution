package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoprocessorProperties extends TaskProperties {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries will be in the spatial reference of the input geometries. If [processSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference) is specified and `outSpatialReference` is not specified, the output geometries will be in the spatial reference of the process spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The spatial reference that the model will use to perform geometry operations. If `processSpatialReference` is specified and [outputSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outputSpatialReference) is not specified, the output geometries will be in the spatial reference of the process spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference)
    */
  var processSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#updateDelay)
    *
    * @default 1000
    */
  var updateDelay: js.UndefOr[Double] = js.undefined
}

object GeoprocessorProperties {
  @scala.inline
  def apply(
    outSpatialReference: SpatialReferenceProperties = null,
    processSpatialReference: SpatialReferenceProperties = null,
    requestOptions: js.Any = null,
    updateDelay: Int | Double = null,
    url: String = null
  ): GeoprocessorProperties = {
    val __obj = js.Dynamic.literal()
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (processSpatialReference != null) __obj.updateDynamic("processSpatialReference")(processSpatialReference)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GeoprocessorProperties]
  }
}

