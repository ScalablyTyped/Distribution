package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  /**
    * The status of the update authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * The key used to extract the token from the HTTP headers. 
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to verify the token signature.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
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
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    if (authorizerFunctionArn != null) __obj.updateDynamic("authorizerFunctionArn")(authorizerFunctionArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tokenKeyName != null) __obj.updateDynamic("tokenKeyName")(tokenKeyName.asInstanceOf[js.Any])
    if (tokenSigningPublicKeys != null) __obj.updateDynamic("tokenSigningPublicKeys")(tokenSigningPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
}

