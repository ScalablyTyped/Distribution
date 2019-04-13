package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAuthorizationRequest extends js.Object {
  /**
    * A list of authorization info objects. Simulating authorization will create a response for each authInfo object in the list.
    */
  var authInfos: AuthInfos
  /**
    * The MQTT client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
  /**
    * When testing custom authorization, the policies specified here are treated as if they are attached to the principal being authorized.
    */
  var policyNamesToAdd: js.UndefOr[PolicyNames] = js.undefined
  /**
    * When testing custom authorization, the policies specified here are treated as if they are not attached to the principal being authorized.
    */
  var policyNamesToSkip: js.UndefOr[PolicyNames] = js.undefined
  /**
    * The principal.
    */
  var principal: js.UndefOr[Principal] = js.undefined
}

object TestAuthorizationRequest {
  @scala.inline
  def apply(
    authInfos: AuthInfos,
    clientId: ClientId = null,
    cognitoIdentityPoolId: CognitoIdentityPoolId = null,
    policyNamesToAdd: PolicyNames = null,
    policyNamesToSkip: PolicyNames = null,
    principal: Principal = null
  ): TestAuthorizationRequest = {
    val __obj = js.Dynamic.literal(authInfos = authInfos)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId)
    if (policyNamesToAdd != null) __obj.updateDynamic("policyNamesToAdd")(policyNamesToAdd)
    if (policyNamesToSkip != null) __obj.updateDynamic("policyNamesToSkip")(policyNamesToSkip)
    if (principal != null) __obj.updateDynamic("principal")(principal)
    __obj.asInstanceOf[TestAuthorizationRequest]
  }
}

