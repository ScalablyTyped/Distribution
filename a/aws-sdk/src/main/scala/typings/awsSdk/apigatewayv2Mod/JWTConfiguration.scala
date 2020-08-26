package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWTConfiguration extends js.Object {
  /**
    * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list. See RFC 7519. Supported only for HTTP APIs.
    */
  var Audience: js.UndefOr[listOfString] = js.native
  /**
    * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool has the following format: https://cognito-idp.{region}.amazonaws.com/{userPoolId}
    . Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var Issuer: js.UndefOr[UriWithLengthBetween1And2048] = js.native
}

object JWTConfiguration {
  @scala.inline
  def apply(): JWTConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTConfiguration]
  }
  @scala.inline
  implicit class JWTConfigurationOps[Self <: JWTConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudienceVarargs(value: string*): Self = this.set("Audience", js.Array(value :_*))
    @scala.inline
    def setAudience(value: listOfString): Self = this.set("Audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("Audience", js.undefined)
    @scala.inline
    def setIssuer(value: UriWithLengthBetween1And2048): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
  }
  
}

