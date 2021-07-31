package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.async
import typings.arcgisJsApi.arcgisJsApiStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTask
  extends StObject
     with Task {
  
  /**
    * Sends a request to the print service to create a printable static image of the map using the options specified in the [PrintParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#execute)
    */
  def execute(params: PrintParameters): js.Promise[PrintResponse] = js.native
  def execute(params: PrintParameters, requestOptions: js.Any): js.Promise[PrintResponse] = js.native
  
  /**
    * The mode for the print task execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#mode)
    */
  val mode: async | sync = js.native
  
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#updateDelay)
    */
  var updateDelay: Double = js.native
}
