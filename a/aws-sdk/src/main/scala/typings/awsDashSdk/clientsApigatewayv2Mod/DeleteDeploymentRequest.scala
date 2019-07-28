package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The deployment ID.
    */
  var DeploymentId: __string
}

object DeleteDeploymentRequest {
  @scala.inline
  def apply(ApiId: __string, DeploymentId: __string): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, DeploymentId = DeploymentId)
  
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
}

