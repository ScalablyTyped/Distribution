package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestInvokeAuthorizerRequest extends StObject {
  
  /**
    * The custom authorizer name.
    */
  var authorizerName: AuthorizerName
  
  /**
    * Specifies a test HTTP authorization request.
    */
  var httpContext: js.UndefOr[HttpContext] = js.undefined
  
  /**
    * Specifies a test MQTT authorization request.
    */
  var mqttContext: js.UndefOr[MqttContext] = js.undefined
  
  /**
    * Specifies a test TLS authorization request.
    */
  var tlsContext: js.UndefOr[TlsContext] = js.undefined
  
  /**
    * The token returned by your custom authentication service.
    */
  var token: js.UndefOr[Token] = js.undefined
  
  /**
    * The signature made with the token and your custom authentication service's private key. This value must be Base-64-encoded.
    */
  var tokenSignature: js.UndefOr[TokenSignature] = js.undefined
}
object TestInvokeAuthorizerRequest {
  
  inline def apply(authorizerName: AuthorizerName): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestInvokeAuthorizerRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    inline def setHttpContext(value: HttpContext): Self = StObject.set(x, "httpContext", value.asInstanceOf[js.Any])
    
    inline def setHttpContextUndefined: Self = StObject.set(x, "httpContext", js.undefined)
    
    inline def setMqttContext(value: MqttContext): Self = StObject.set(x, "mqttContext", value.asInstanceOf[js.Any])
    
    inline def setMqttContextUndefined: Self = StObject.set(x, "mqttContext", js.undefined)
    
    inline def setTlsContext(value: TlsContext): Self = StObject.set(x, "tlsContext", value.asInstanceOf[js.Any])
    
    inline def setTlsContextUndefined: Self = StObject.set(x, "tlsContext", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenSignature(value: TokenSignature): Self = StObject.set(x, "tokenSignature", value.asInstanceOf[js.Any])
    
    inline def setTokenSignatureUndefined: Self = StObject.set(x, "tokenSignature", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
