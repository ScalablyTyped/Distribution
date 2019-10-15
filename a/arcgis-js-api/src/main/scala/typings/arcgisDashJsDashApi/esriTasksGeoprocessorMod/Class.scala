package typings.arcgisDashJsDashApi.esriTasksGeoprocessorMod

import typings.arcgisDashJsDashApi.__esri.Geoprocessor
import typings.arcgisDashJsDashApi.__esri.GeoprocessorProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/Geoprocessor", JSImport.Namespace)
@js.native
/**
  * Represents a GP Task resource exposed by the ArcGIS REST API. A GP Task resource represents a single task in a GP service published using the ArcGIS Server and it supports one of the following operations dependent on how the service was set up:
  *   * [execute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#execute) - for when the execution type is synchronous.
  *   * [submitJob](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#submitJob) - for when the execution type is asynchronous.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html)
  */
class Class () extends Geoprocessor {
  def this(properties: GeoprocessorProperties) = this()
}

