package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStagesRequest extends js.Object {
  /**
    * The stages' deployment identifiers.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetStagesRequest {
  @scala.inline
  def apply(restApiId: String, deploymentId: String = null): GetStagesRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStagesRequest]
  }
}

