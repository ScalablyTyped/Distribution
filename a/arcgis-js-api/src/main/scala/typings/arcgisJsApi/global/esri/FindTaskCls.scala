package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FindTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.FindTask")
@js.native
/**
  * Search a map service exposed by the ArcGIS Server REST API based on a string value. The search can be conducted on a single field of a single layer, on many fields of a layer, or on many fields of many layers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html)
  */
class FindTaskCls ()
  extends typings.arcgisJsApi.esri.FindTask {
  def this(properties: FindTaskProperties) = this()
}

