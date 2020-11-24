package typings.awsLambda.apiGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] extends js.Object {
  
  var accountId: String = js.native
  
  var apiId: String = js.native
  
  // This one is a bit confusing: it is not actually present in authorizer calls
  // and proxy calls without an authorizer. We model this by allowing undefined in the type,
  // since it ends up the same and avoids breaking users that are testing the property.
  // This lets us allow parameterizing the authorizer for proxy events that know what authorizer
  // context values they have.
  var authorizer: TAuthorizerContext = js.native
  
  var connectedAt: js.UndefOr[Double] = js.native
  
  var connectionId: js.UndefOr[String] = js.native
  
  var domainName: js.UndefOr[String] = js.native
  
  var domainPrefix: js.UndefOr[String] = js.native
  
  var eventType: js.UndefOr[String] = js.native
  
  var extendedRequestId: js.UndefOr[String] = js.native
  
  var httpMethod: String = js.native
  
  var identity: APIGatewayEventIdentity = js.native
  
  var messageDirection: js.UndefOr[String] = js.native
  
  var messageId: js.UndefOr[String | Null] = js.native
  
  var path: String = js.native
  
  var protocol: String = js.native
  
  var requestId: String = js.native
  
  var requestTime: js.UndefOr[String] = js.native
  
  var requestTimeEpoch: Double = js.native
  
  var resourceId: String = js.native
  
  var resourcePath: String = js.native
  
  var routeKey: js.UndefOr[String] = js.native
  
  var stage: String = js.native
}
object APIGatewayEventRequestContextWithAuthorizer {
  
  @scala.inline
  def apply[TAuthorizerContext](
    accountId: String,
    apiId: String,
    authorizer: TAuthorizerContext,
    httpMethod: String,
    identity: APIGatewayEventIdentity,
    path: String,
    protocol: String,
    requestId: String,
    requestTimeEpoch: Double,
    resourceId: String,
    resourcePath: String,
    stage: String
  ): APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], authorizer = authorizer.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], requestTimeEpoch = requestTimeEpoch.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]]
  }
  
  @scala.inline
  implicit class APIGatewayEventRequestContextWithAuthorizerOps[Self <: APIGatewayEventRequestContextWithAuthorizer[_], TAuthorizerContext] (val x: Self with APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizer(value: TAuthorizerContext): Self = this.set("authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: APIGatewayEventIdentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeEpoch(value: Double): Self = this.set("requestTimeEpoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePath(value: String): Self = this.set("resourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedAt(value: Double): Self = this.set("connectedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedAt: Self = this.set("connectedAt", js.undefined)
    
    @scala.inline
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setDomainPrefix(value: String): Self = this.set("domainPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainPrefix: Self = this.set("domainPrefix", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setExtendedRequestId(value: String): Self = this.set("extendedRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedRequestId: Self = this.set("extendedRequestId", js.undefined)
    
    @scala.inline
    def setMessageDirection(value: String): Self = this.set("messageDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDirection: Self = this.set("messageDirection", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setMessageIdNull: Self = this.set("messageId", null)
    
    @scala.inline
    def setRequestTime(value: String): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTime: Self = this.set("requestTime", js.undefined)
    
    @scala.inline
    def setRouteKey(value: String): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteKey: Self = this.set("routeKey", js.undefined)
  }
}
