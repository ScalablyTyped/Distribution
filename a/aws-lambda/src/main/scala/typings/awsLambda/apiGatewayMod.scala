package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayMod {
  
  type APIGatewayAuthorizerResultContext = StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
  
  type APIGatewayEventDefaultAuthorizerContext = js.UndefOr[Null | StringDictionary[js.Any]]
  
  trait APIGatewayEventIdentity extends StObject {
    
    var accessKey: String | Null
    
    var accountId: String | Null
    
    var apiKey: String | Null
    
    var apiKeyId: String | Null
    
    var caller: String | Null
    
    var cognitoAuthenticationProvider: String | Null
    
    var cognitoAuthenticationType: String | Null
    
    var cognitoIdentityId: String | Null
    
    var cognitoIdentityPoolId: String | Null
    
    var principalOrgId: String | Null
    
    var sourceIp: String
    
    var user: String | Null
    
    var userAgent: String | Null
    
    var userArn: String | Null
  }
  object APIGatewayEventIdentity {
    
    inline def apply(sourceIp: String): APIGatewayEventIdentity = {
      val __obj = js.Dynamic.literal(sourceIp = sourceIp.asInstanceOf[js.Any], accessKey = null, accountId = null, apiKey = null, apiKeyId = null, caller = null, cognitoAuthenticationProvider = null, cognitoAuthenticationType = null, cognitoIdentityId = null, cognitoIdentityPoolId = null, principalOrgId = null, user = null, userAgent = null, userArn = null)
      __obj.asInstanceOf[APIGatewayEventIdentity]
    }
    
    extension [Self <: APIGatewayEventIdentity](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyNull: Self = StObject.set(x, "accessKey", null)
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyId(value: String): Self = StObject.set(x, "apiKeyId", value.asInstanceOf[js.Any])
      
      inline def setApiKeyIdNull: Self = StObject.set(x, "apiKeyId", null)
      
      inline def setApiKeyNull: Self = StObject.set(x, "apiKey", null)
      
      inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerNull: Self = StObject.set(x, "caller", null)
      
      inline def setCognitoAuthenticationProvider(value: String): Self = StObject.set(x, "cognitoAuthenticationProvider", value.asInstanceOf[js.Any])
      
      inline def setCognitoAuthenticationProviderNull: Self = StObject.set(x, "cognitoAuthenticationProvider", null)
      
      inline def setCognitoAuthenticationType(value: String): Self = StObject.set(x, "cognitoAuthenticationType", value.asInstanceOf[js.Any])
      
      inline def setCognitoAuthenticationTypeNull: Self = StObject.set(x, "cognitoAuthenticationType", null)
      
      inline def setCognitoIdentityId(value: String): Self = StObject.set(x, "cognitoIdentityId", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityIdNull: Self = StObject.set(x, "cognitoIdentityId", null)
      
      inline def setCognitoIdentityPoolId(value: String): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityPoolIdNull: Self = StObject.set(x, "cognitoIdentityPoolId", null)
      
      inline def setPrincipalOrgId(value: String): Self = StObject.set(x, "principalOrgId", value.asInstanceOf[js.Any])
      
      inline def setPrincipalOrgIdNull: Self = StObject.set(x, "principalOrgId", null)
      
      inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
      
      inline def setUserArn(value: String): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      inline def setUserArnNull: Self = StObject.set(x, "userArn", null)
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  type APIGatewayEventRequestContext = APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
  
  trait APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] extends StObject {
    
    var accountId: String
    
    var apiId: String
    
    // This one is a bit confusing: it is not actually present in authorizer calls
    // and proxy calls without an authorizer. We model this by allowing undefined in the type,
    // since it ends up the same and avoids breaking users that are testing the property.
    // This lets us allow parameterizing the authorizer for proxy events that know what authorizer
    // context values they have.
    var authorizer: TAuthorizerContext
    
    var connectedAt: js.UndefOr[Double] = js.undefined
    
    var connectionId: js.UndefOr[String] = js.undefined
    
    var domainName: js.UndefOr[String] = js.undefined
    
    var domainPrefix: js.UndefOr[String] = js.undefined
    
    var eventType: js.UndefOr[String] = js.undefined
    
    var extendedRequestId: js.UndefOr[String] = js.undefined
    
    var httpMethod: String
    
    var identity: APIGatewayEventIdentity
    
    var messageDirection: js.UndefOr[String] = js.undefined
    
    var messageId: js.UndefOr[String | Null] = js.undefined
    
    var path: String
    
    var protocol: String
    
    var requestId: String
    
    var requestTime: js.UndefOr[String] = js.undefined
    
    var requestTimeEpoch: Double
    
    var resourceId: String
    
    var resourcePath: String
    
    var routeKey: js.UndefOr[String] = js.undefined
    
    var stage: String
  }
  object APIGatewayEventRequestContextWithAuthorizer {
    
    inline def apply[TAuthorizerContext](
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
    
    extension [Self <: APIGatewayEventRequestContextWithAuthorizer[?], TAuthorizerContext](x: Self & APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setAuthorizer(value: TAuthorizerContext): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
      
      inline def setConnectedAt(value: Double): Self = StObject.set(x, "connectedAt", value.asInstanceOf[js.Any])
      
      inline def setConnectedAtUndefined: Self = StObject.set(x, "connectedAt", js.undefined)
      
      inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setDomainPrefix(value: String): Self = StObject.set(x, "domainPrefix", value.asInstanceOf[js.Any])
      
      inline def setDomainPrefixUndefined: Self = StObject.set(x, "domainPrefix", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
      
      inline def setExtendedRequestId(value: String): Self = StObject.set(x, "extendedRequestId", value.asInstanceOf[js.Any])
      
      inline def setExtendedRequestIdUndefined: Self = StObject.set(x, "extendedRequestId", js.undefined)
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: APIGatewayEventIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setMessageDirection(value: String): Self = StObject.set(x, "messageDirection", value.asInstanceOf[js.Any])
      
      inline def setMessageDirectionUndefined: Self = StObject.set(x, "messageDirection", js.undefined)
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdNull: Self = StObject.set(x, "messageId", null)
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeEpoch(value: Double): Self = StObject.set(x, "requestTimeEpoch", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
      
      inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setRouteKeyUndefined: Self = StObject.set(x, "routeKey", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
}
