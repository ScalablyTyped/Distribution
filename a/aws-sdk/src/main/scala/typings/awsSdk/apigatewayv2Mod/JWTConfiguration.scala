package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTConfiguration extends StObject {
  
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
  implicit class JWTConfigurationMutableBuilder[Self <: JWTConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: listOfString): Self = StObject.set(x, "Audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "Audience", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: string*): Self = StObject.set(x, "Audience", js.Array(value :_*))
    
    @scala.inline
    def setIssuer(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
  }
}
