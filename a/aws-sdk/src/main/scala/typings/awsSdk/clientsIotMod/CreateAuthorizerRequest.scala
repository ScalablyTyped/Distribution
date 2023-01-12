package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAuthorizerRequest extends StObject {
  
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: AuthorizerFunctionArn
  
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName
  
  /**
    * When true, the result from the authorizer’s Lambda function is cached for clients that use persistent HTTP connections. The results are cached for the time specified by the Lambda function in refreshAfterInSeconds. This value does not affect authorization of clients that use MQTT connections. The default value is false.
    */
  var enableCachingForHttp: js.UndefOr[EnableCachingForHttp] = js.undefined
  
  /**
    * Specifies whether IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.undefined
  
  /**
    * The status of the create authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
  
  /**
    * Metadata which can be used to manage the custom authorizer.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the token key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined
  
  /**
    * The public keys used to verify the digital signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
}
object CreateAuthorizerRequest {
  
  inline def apply(authorizerFunctionArn: AuthorizerFunctionArn, authorizerName: AuthorizerName): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerFunctionArn = authorizerFunctionArn.asInstanceOf[js.Any], authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAuthorizerRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = StObject.set(x, "authorizerFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    inline def setEnableCachingForHttp(value: EnableCachingForHttp): Self = StObject.set(x, "enableCachingForHttp", value.asInstanceOf[js.Any])
    
    inline def setEnableCachingForHttpUndefined: Self = StObject.set(x, "enableCachingForHttp", js.undefined)
    
    inline def setSigningDisabled(value: BooleanKey): Self = StObject.set(x, "signingDisabled", value.asInstanceOf[js.Any])
    
    inline def setSigningDisabledUndefined: Self = StObject.set(x, "signingDisabled", js.undefined)
    
    inline def setStatus(value: AuthorizerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTokenKeyName(value: TokenKeyName): Self = StObject.set(x, "tokenKeyName", value.asInstanceOf[js.Any])
    
    inline def setTokenKeyNameUndefined: Self = StObject.set(x, "tokenKeyName", js.undefined)
    
    inline def setTokenSigningPublicKeys(value: PublicKeyMap): Self = StObject.set(x, "tokenSigningPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setTokenSigningPublicKeysUndefined: Self = StObject.set(x, "tokenSigningPublicKeys", js.undefined)
  }
}
