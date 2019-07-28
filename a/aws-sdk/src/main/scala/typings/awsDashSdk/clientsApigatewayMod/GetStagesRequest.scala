package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStagesRequest extends js.Object {
  /**
    * The stages' deployment identifiers.
    */
  var deploymentId: js.UndefOr[String] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetStagesRequest {
  @scala.inline
  def apply(restApiId: String, deploymentId: String = null): GetStagesRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.asInstanceOf[GetStagesRequest]
  }
}

