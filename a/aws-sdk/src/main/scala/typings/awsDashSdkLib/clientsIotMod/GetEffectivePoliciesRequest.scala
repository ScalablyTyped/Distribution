package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectivePoliciesRequest extends js.Object {
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
  /**
    * The principal.
    */
  var principal: js.UndefOr[Principal] = js.undefined
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object GetEffectivePoliciesRequest {
  @scala.inline
  def apply(
    cognitoIdentityPoolId: CognitoIdentityPoolId = null,
    principal: Principal = null,
    thingName: ThingName = null
  ): GetEffectivePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId)
    if (principal != null) __obj.updateDynamic("principal")(principal)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[GetEffectivePoliciesRequest]
  }
}

