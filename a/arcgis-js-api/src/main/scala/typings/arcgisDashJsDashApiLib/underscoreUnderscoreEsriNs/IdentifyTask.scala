package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var gdbVersion: java.lang.String = js.native
  /**
    * Sends a request to the ArcGIS REST map service resource to identify features based on the [IdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html) specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#execute)
    *
    * @param params Specifies the criteria used to identify the features.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(params: IdentifyParameters): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def execute(params: IdentifyParameters, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

