package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends Accessor {
  /**
    * The [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for data requests. These options can also be controlled through the `requestOptions` method parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Task.html#requestOptions)
    */
  var requestOptions: js.Any = js.native
  /**
    * The ArcGIS Server REST service URL (usually of a Feature Service Layer or Map Service Layer) for use in a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Task.html#url)
    */
  var url: String = js.native
}

@JSGlobal("__esri.Task")
@js.native
class TaskCls () extends Task {
  def this(properties: TaskProperties) = this()
}

