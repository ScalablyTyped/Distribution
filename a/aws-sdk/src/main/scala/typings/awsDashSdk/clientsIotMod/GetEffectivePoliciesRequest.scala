package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEffectivePoliciesRequest extends js.Object {
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  /**
    * The principal.
    */
  var principal: js.UndefOr[Principal] = js.native
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object GetEffectivePoliciesRequest {
  @scala.inline
  def apply(
    cognitoIdentityPoolId: CognitoIdentityPoolId = null,
    principal: Principal = null,
    thingName: ThingName = null
  ): GetEffectivePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEffectivePoliciesRequest]
  }
}

