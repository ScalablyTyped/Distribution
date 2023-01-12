package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTConfiguration extends StObject {
  
  /**
    * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list. See RFC 7519. Supported only for HTTP APIs.
    */
  var Audience: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool has the following format: https://cognito-idp.{region}.amazonaws.com/{userPoolId}
    . Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var Issuer: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
}
object JWTConfiguration {
  
  inline def apply(): JWTConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JWTConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAudience(value: listOfString): Self = StObject.set(x, "Audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "Audience", js.undefined)
    
    inline def setAudienceVarargs(value: string*): Self = StObject.set(x, "Audience", js.Array(value*))
    
    inline def setIssuer(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
  }
}
