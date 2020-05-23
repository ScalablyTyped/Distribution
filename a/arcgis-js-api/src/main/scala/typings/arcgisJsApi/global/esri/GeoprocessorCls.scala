package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeoprocessorProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Geoprocessor")
@js.native
/**
  * Represents a GP Task resource exposed by the ArcGIS REST API. A GP Task resource represents a single task in a GP service published using the ArcGIS Server and it supports one of the following operations dependent on how the service was set up:
  *   * [execute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#execute) - for when the execution type is synchronous.
  *   * [submitJob](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#submitJob) - for when the execution type is asynchronous.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html)
  */
class GeoprocessorCls ()
  extends typings.arcgisJsApi.esri.Geoprocessor {
  def this(properties: GeoprocessorProperties) = this()
}

