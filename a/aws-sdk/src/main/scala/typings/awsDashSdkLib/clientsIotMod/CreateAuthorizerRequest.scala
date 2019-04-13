package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: AuthorizerFunctionArn
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName
  /**
    * The status of the create authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
  /**
    * The name of the token key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: TokenKeyName
  /**
    * The public keys used to verify the digital signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: PublicKeyMap
}

object CreateAuthorizerRequest {
  @scala.inline
  def apply(
    authorizerFunctionArn: AuthorizerFunctionArn,
    authorizerName: AuthorizerName,
    tokenKeyName: TokenKeyName,
    tokenSigningPublicKeys: PublicKeyMap,
    status: AuthorizerStatus = null
  ): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerFunctionArn = authorizerFunctionArn, authorizerName = authorizerName, tokenKeyName = tokenKeyName, tokenSigningPublicKeys = tokenSigningPublicKeys)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
}

