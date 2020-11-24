package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerResponse extends js.Object {
  
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
  implicit class TestInvokeAuthorizerResponseOps[Self <: TestInvokeAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorization(value: MapOfStringToList): Self = this.set("authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    
    @scala.inline
    def setClaims(value: MapOfStringToString): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
    
    @scala.inline
    def setClientStatus(value: Integer): Self = this.set("clientStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientStatus: Self = this.set("clientStatus", js.undefined)
    
    @scala.inline
    def setLatency(value: Long): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
  }
}
