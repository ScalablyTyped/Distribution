package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The deployment ID.
    */
  var DeploymentId: __string
}

object GetDeploymentRequest {
  @scala.inline
  def apply(ApiId: __string, DeploymentId: __string): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, DeploymentId = DeploymentId)
  
    __obj.asInstanceOf[GetDeploymentRequest]
  }
}

