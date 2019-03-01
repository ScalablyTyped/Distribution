package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageServiceIdentifyTask extends Task {
  /**
    * Sends a request to the ArcGIS REST image service resource to identify content based on the [ImageServiceIdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html) specified in the `params` argument.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ImageServiceIdentifyTask.html#execute)
    *
    * @param params Specifies the criteria used to identify the features.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(params: ImageServiceIdentifyParameters): arcgisDashJsDashApiLib.IPromise[ImageServiceIdentifyResult] = js.native
  def execute(params: ImageServiceIdentifyParameters, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[ImageServiceIdentifyResult] = js.native
}

