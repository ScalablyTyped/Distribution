package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The description for the deployment resource.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * The name of the Stage resource for the Deployment resource to create.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    Description: StringWithLengthBetween0And1024 = null,
    StageName: StringWithLengthBetween1And128 = null
  ): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (StageName != null) __obj.updateDynamic("StageName")(StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

