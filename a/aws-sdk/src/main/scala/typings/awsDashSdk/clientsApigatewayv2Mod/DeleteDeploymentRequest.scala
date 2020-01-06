package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The deployment ID.
    */
  var DeploymentId: __string = js.native
}

object DeleteDeploymentRequest {
  @scala.inline
  def apply(ApiId: __string, DeploymentId: __string): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
}

