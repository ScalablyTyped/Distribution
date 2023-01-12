package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizerDescription extends StObject {
  
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
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When true, the result from the authorizer’s Lambda function is cached for the time specified in refreshAfterInSeconds. The cached result is used while the device reuses the same HTTP connection.
    */
  var enableCachingForHttp: js.UndefOr[EnableCachingForHttp] = js.undefined
  
  /**
    * The UNIX timestamp of when the authorizer was last updated.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.undefined
  
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
  
  inline def apply(): AuthorizerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizerDescription] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerArn(value: AuthorizerArn): Self = StObject.set(x, "authorizerArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerArnUndefined: Self = StObject.set(x, "authorizerArn", js.undefined)
    
    inline def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = StObject.set(x, "authorizerFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerFunctionArnUndefined: Self = StObject.set(x, "authorizerFunctionArn", js.undefined)
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerNameUndefined: Self = StObject.set(x, "authorizerName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setEnableCachingForHttp(value: EnableCachingForHttp): Self = StObject.set(x, "enableCachingForHttp", value.asInstanceOf[js.Any])
    
    inline def setEnableCachingForHttpUndefined: Self = StObject.set(x, "enableCachingForHttp", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setSigningDisabled(value: BooleanKey): Self = StObject.set(x, "signingDisabled", value.asInstanceOf[js.Any])
    
    inline def setSigningDisabledUndefined: Self = StObject.set(x, "signingDisabled", js.undefined)
    
    inline def setStatus(value: AuthorizerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTokenKeyName(value: TokenKeyName): Self = StObject.set(x, "tokenKeyName", value.asInstanceOf[js.Any])
    
    inline def setTokenKeyNameUndefined: Self = StObject.set(x, "tokenKeyName", js.undefined)
    
    inline def setTokenSigningPublicKeys(value: PublicKeyMap): Self = StObject.set(x, "tokenSigningPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setTokenSigningPublicKeysUndefined: Self = StObject.set(x, "tokenSigningPublicKeys", js.undefined)
  }
}
