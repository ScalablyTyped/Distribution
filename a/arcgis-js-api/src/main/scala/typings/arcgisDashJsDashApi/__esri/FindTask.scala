package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindTask extends Task {
  /**
    * The geodatabase version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  /**
    * Sends a request to the ArcGIS REST map service resource to perform a search based on the input [params](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html#execute)
    *
    * @param params Specifies the layers and fields that are used for the search.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(params: FindParameters): IPromise[_] = js.native
  def execute(params: FindParameters, requestOptions: js.Any): IPromise[_] = js.native
}

@JSGlobal("__esri.FindTask")
@js.native
object FindTask extends TopLevel[FindTaskConstructor]

