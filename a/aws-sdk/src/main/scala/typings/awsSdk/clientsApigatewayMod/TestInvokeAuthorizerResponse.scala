package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestInvokeAuthorizerResponse extends StObject {
  
  /**
    * The authorization response.
    */
  var authorization: js.UndefOr[MapOfStringToList] = js.undefined
  
  /**
    * The open identity claims, with any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
    */
  var claims: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
    */
  var clientStatus: js.UndefOr[Integer] = js.undefined
  
  /**
    * The execution latency of the test authorizer request.
    */
  var latency: js.UndefOr[Long] = js.undefined
  
  /**
    * The API Gateway execution log for the test authorizer request.
    */
  var log: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON policy document returned by the Authorizer
    */
  var policy: js.UndefOr[String] = js.undefined
  
  /**
    * The principal identity returned by the Authorizer
    */
  var principalId: js.UndefOr[String] = js.undefined
}
object TestInvokeAuthorizerResponse {
  
  inline def apply(): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestInvokeAuthorizerResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorization(value: MapOfStringToList): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setClaims(value: MapOfStringToString): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClientStatus(value: Integer): Self = StObject.set(x, "clientStatus", value.asInstanceOf[js.Any])
    
    inline def setClientStatusUndefined: Self = StObject.set(x, "clientStatus", js.undefined)
    
    inline def setLatency(value: Long): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
  }
}
