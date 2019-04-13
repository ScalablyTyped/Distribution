package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentRequest extends js.Object {
  /**
    * [Required] The identifier of the Deployment resource to get information about.
    */
  var deploymentId: String
  /**
    * A query parameter to retrieve the specified embedded resources of the returned Deployment resource in the response. In a REST API call, this embed parameter value is a list of comma-separated strings, as in GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2. The SDK and other platform-dependent libraries might use a different format for the list. Currently, this request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list containing only the "apisummary" string. For example, GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary.
    */
  var embed: js.UndefOr[ListOfString] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetDeploymentRequest {
  @scala.inline
  def apply(deploymentId: String, restApiId: String, embed: ListOfString = null): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId, restApiId = restApiId)
    if (embed != null) __obj.updateDynamic("embed")(embed)
    __obj.asInstanceOf[GetDeploymentRequest]
  }
}

