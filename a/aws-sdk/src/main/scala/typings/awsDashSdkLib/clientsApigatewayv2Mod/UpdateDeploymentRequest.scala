package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The deployment ID.
    */
  var DeploymentId: __string
  /**
    * The description for the deployment resource.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
}

object UpdateDeploymentRequest {
  @scala.inline
  def apply(ApiId: __string, DeploymentId: __string, Description: StringWithLengthBetween0And1024 = null): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, DeploymentId = DeploymentId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
}

