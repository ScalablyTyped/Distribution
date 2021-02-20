package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerResponse extends StObject {
  
  var authorization: js.UndefOr[MapOfStringToList] = js.native
  
  /**
    * The open identity claims, with any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
    */
  var claims: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
    */
  var clientStatus: js.UndefOr[Integer] = js.native
  
  /**
    * The execution latency of the test authorizer request.
    */
  var latency: js.UndefOr[Long] = js.native
  
  /**
    * The API Gateway execution log for the test authorizer request.
    */
  var log: js.UndefOr[String] = js.native
  
  /**
    * The JSON policy document returned by the Authorizer
    */
  var policy: js.UndefOr[String] = js.native
  
  /**
    * The principal identity returned by the Authorizer
    */
  var principalId: js.UndefOr[String] = js.native
}
object TestInvokeAuthorizerResponse {
  
  @scala.inline
  def apply(): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
  
  @scala.inline
  implicit class TestInvokeAuthorizerResponseMutableBuilder[Self <: TestInvokeAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: MapOfStringToList): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClaims(value: MapOfStringToString): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    @scala.inline
    def setClientStatus(value: Integer): Self = StObject.set(x, "clientStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientStatusUndefined: Self = StObject.set(x, "clientStatus", js.undefined)
    
    @scala.inline
    def setLatency(value: Long): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
  }
}
