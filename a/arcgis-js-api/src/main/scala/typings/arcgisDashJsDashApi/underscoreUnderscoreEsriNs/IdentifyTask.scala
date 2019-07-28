package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifyTask extends Task {
  /**
    * Specifies the geodatabase version to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  /**
    * Sends a request to the ArcGIS REST map service resource to identify features based on the [IdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html) specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#execute)
    *
    * @param params Specifies the criteria used to identify the features.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(params: IdentifyParameters): IPromise[_] = js.native
  def execute(params: IdentifyParameters, requestOptions: js.Any): IPromise[_] = js.native
}

@JSGlobal("__esri.IdentifyTask")
@js.native
/**
  * Performs an identify operation on the layers of a map service exposed by the ArcGIS Server REST API. Use [IdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html) to set the parameters for the identify operation and [IdentifyResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html) to work with the results.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html)
  */
class IdentifyTaskCls () extends IdentifyTask {
  def this(properties: IdentifyTaskProperties) = this()
}

