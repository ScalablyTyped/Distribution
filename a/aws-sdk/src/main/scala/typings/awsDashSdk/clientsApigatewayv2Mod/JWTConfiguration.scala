package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWTConfiguration extends js.Object {
  /**
    * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list. See RFC 7519. Supported only for HTTP APIs.
    */
  var Audience: js.UndefOr[__listOf__string] = js.native
  /**
    * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool has the following format: https://cognito-idp.{region}.amazonaws.com/{userPoolId}
    . Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var Issuer: js.UndefOr[UriWithLengthBetween1And2048] = js.native
}

object JWTConfiguration {
  @scala.inline
  def apply(Audience: __listOf__string = null, Issuer: UriWithLengthBetween1And2048 = null): JWTConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Audience != null) __obj.updateDynamic("Audience")(Audience.asInstanceOf[js.Any])
    if (Issuer != null) __obj.updateDynamic("Issuer")(Issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTConfiguration]
  }
}

