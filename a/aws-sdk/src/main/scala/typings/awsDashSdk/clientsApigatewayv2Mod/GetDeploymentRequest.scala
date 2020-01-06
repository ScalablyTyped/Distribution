package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The deployment ID.
    */
  var DeploymentId: __string = js.native
}

object GetDeploymentRequest {
  @scala.inline
  def apply(ApiId: __string, DeploymentId: __string): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeploymentRequest]
  }
}

