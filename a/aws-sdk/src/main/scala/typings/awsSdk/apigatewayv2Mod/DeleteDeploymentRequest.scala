package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The deployment ID.
    */
  var DeploymentId: string = js.native
}

object DeleteDeploymentRequest {
  @scala.inline
  def apply(ApiId: string, DeploymentId: string): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
}

