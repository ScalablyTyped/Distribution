package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizerDescription extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
  /**
    * The authorizer's Lambda function ARN.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
  /**
    * The UNIX timestamp of when the authorizer was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The UNIX timestamp of when the authorizer was last updated.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The status of the authorizer.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
  /**
    * The key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined
  /**
    * The public keys used to validate the token signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
}

object AuthorizerDescription {
  @scala.inline
  def apply(
    authorizerArn: AuthorizerArn = null,
    authorizerFunctionArn: AuthorizerFunctionArn = null,
    authorizerName: AuthorizerName = null,
    creationDate: DateType = null,
    lastModifiedDate: DateType = null,
    status: AuthorizerStatus = null,
    tokenKeyName: TokenKeyName = null,
    tokenSigningPublicKeys: PublicKeyMap = null
  ): AuthorizerDescription = {
    val __obj = js.Dynamic.literal()
    if (authorizerArn != null) __obj.updateDynamic("authorizerArn")(authorizerArn)
    if (authorizerFunctionArn != null) __obj.updateDynamic("authorizerFunctionArn")(authorizerFunctionArn)
    if (authorizerName != null) __obj.updateDynamic("authorizerName")(authorizerName)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tokenKeyName != null) __obj.updateDynamic("tokenKeyName")(tokenKeyName)
    if (tokenSigningPublicKeys != null) __obj.updateDynamic("tokenSigningPublicKeys")(tokenSigningPublicKeys)
    __obj.asInstanceOf[AuthorizerDescription]
  }
}

