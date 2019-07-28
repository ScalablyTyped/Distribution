package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationData extends js.Object {
  /**
    * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string is decoded, it is presented in the format user:password for private registry authentication using docker login.
    */
  var authorizationToken: js.UndefOr[Base64] = js.undefined
  /**
    * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
    */
  var expiresAt: js.UndefOr[ExpirationTimestamp] = js.undefined
  /**
    * The registry URL to use for this authorization token in a docker login command. The Amazon ECR registry URL format is https://aws_account_id.dkr.ecr.region.amazonaws.com. For example, https://012345678910.dkr.ecr.us-east-1.amazonaws.com.. 
    */
  var proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.undefined
}

object AuthorizationData {
  @scala.inline
  def apply(
    authorizationToken: Base64 = null,
    expiresAt: ExpirationTimestamp = null,
    proxyEndpoint: ProxyEndpoint = null
  ): AuthorizationData = {
    val __obj = js.Dynamic.literal()
    if (authorizationToken != null) __obj.updateDynamic("authorizationToken")(authorizationToken)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (proxyEndpoint != null) __obj.updateDynamic("proxyEndpoint")(proxyEndpoint)
    __obj.asInstanceOf[AuthorizationData]
  }
}

