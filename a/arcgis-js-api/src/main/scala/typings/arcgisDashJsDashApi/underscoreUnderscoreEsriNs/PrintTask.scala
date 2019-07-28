package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTask extends Task {
  /**
    * The mode for the print task execution.  **Possible Values:** async | sync
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#mode)
    *
    * @default sync
    */
  val mode: String = js.native
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#updateDelay)
    *
    * @default 1000
    */
  var updateDelay: Double = js.native
  /**
    * Sends a request to the print service to create a printable static image of the map using the options specified in the [PrintParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#execute)
    *
    * @param params Defines the printing options.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(params: PrintParameters): IPromise[PrintResponse] = js.native
  def execute(params: PrintParameters, requestOptions: js.Any): IPromise[PrintResponse] = js.native
}

@JSGlobal("__esri.PrintTask")
@js.native
/**
  * The PrintTask generates a printer-ready version of the map using an [Export Web Map Task](https://developers.arcgis.com/rest/services-reference/export-web-map-task.htm) available with ArGIS Server 10.1 and later. This class is used when you want to have more granular control over the user interface, for example, if you want to provide users the ability to define what appears on the printed page.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html)
  */
class PrintTaskCls () extends PrintTask {
  def this(properties: PrintTaskProperties) = this()
}

