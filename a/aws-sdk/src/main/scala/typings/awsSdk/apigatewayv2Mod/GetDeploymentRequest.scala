package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The deployment ID.
    */
  var DeploymentId: string = js.native
}

object GetDeploymentRequest {
  @scala.inline
  def apply(ApiId: string, DeploymentId: string): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeploymentRequest]
  }
}

