package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName
  /**
    * The status of the update authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
  /**
    * The key used to extract the token from the HTTP headers. 
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined
  /**
    * The public keys used to verify the token signature.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
}

object UpdateAuthorizerRequest {
  @scala.inline
  def apply(
    authorizerName: AuthorizerName,
    authorizerFunctionArn: AuthorizerFunctionArn = null,
    status: AuthorizerStatus = null,
    tokenKeyName: TokenKeyName = null,
    tokenSigningPublicKeys: PublicKeyMap = null
  ): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName)
    if (authorizerFunctionArn != null) __obj.updateDynamic("authorizerFunctionArn")(authorizerFunctionArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tokenKeyName != null) __obj.updateDynamic("tokenKeyName")(tokenKeyName)
    if (tokenSigningPublicKeys != null) __obj.updateDynamic("tokenSigningPublicKeys")(tokenSigningPublicKeys)
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
}

