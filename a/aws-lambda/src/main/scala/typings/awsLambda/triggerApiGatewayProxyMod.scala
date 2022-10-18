package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.Claims
import typings.awsLambda.anon.ClientCert
import typings.awsLambda.anon.Method
import typings.awsLambda.awsLambdaStrings.CONNECT
import typings.awsLambda.awsLambdaStrings.DISCONNECT
import typings.awsLambda.awsLambdaStrings.IN
import typings.awsLambda.awsLambdaStrings.MESSAGE
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerApiGatewayProxyMod {
  
  type APIGatewayEvent = APIGatewayProxyEvent
  
  @js.native
  trait APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext] extends StObject {
    
    var integrationLatency: Double = js.native
    
    var principalId: String = js.native
  }
  
  trait APIGatewayEventRequestContextJWTAuthorizer extends StObject {
    
    var integrationLatency: Double
    
    var jwt: Claims
    
    var principalId: String
  }
  object APIGatewayEventRequestContextJWTAuthorizer {
    
    inline def apply(integrationLatency: Double, jwt: Claims, principalId: String): APIGatewayEventRequestContextJWTAuthorizer = {
      val __obj = js.Dynamic.literal(integrationLatency = integrationLatency.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEventRequestContextJWTAuthorizer]
    }
    
    extension [Self <: APIGatewayEventRequestContextJWTAuthorizer](x: Self) {
      
      inline def setIntegrationLatency(value: Double): Self = StObject.set(x, "integrationLatency", value.asInstanceOf[js.Any])
      
      inline def setJwt(value: Claims): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    }
  }
  
  trait APIGatewayEventRequestContextLambdaAuthorizer[TAuthorizerContext] extends StObject {
    
    var lambda: TAuthorizerContext
  }
  object APIGatewayEventRequestContextLambdaAuthorizer {
    
    inline def apply[TAuthorizerContext](lambda: TAuthorizerContext): APIGatewayEventRequestContextLambdaAuthorizer[TAuthorizerContext] = {
      val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEventRequestContextLambdaAuthorizer[TAuthorizerContext]]
    }
    
    extension [Self <: APIGatewayEventRequestContextLambdaAuthorizer[?], TAuthorizerContext](x: Self & APIGatewayEventRequestContextLambdaAuthorizer[TAuthorizerContext]) {
      
      inline def setLambda(value: TAuthorizerContext): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    }
  }
  
  trait APIGatewayEventRequestContextV2 extends StObject {
    
    var accountId: String
    
    var apiId: String
    
    var authentication: js.UndefOr[ClientCert] = js.undefined
    
    var domainName: String
    
    var domainPrefix: String
    
    var http: Method
    
    var requestId: String
    
    var routeKey: String
    
    var stage: String
    
    var time: String
    
    var timeEpoch: Double
  }
  object APIGatewayEventRequestContextV2 {
    
    inline def apply(
      accountId: String,
      apiId: String,
      domainName: String,
      domainPrefix: String,
      http: Method,
      requestId: String,
      routeKey: String,
      stage: String,
      time: String,
      timeEpoch: Double
    ): APIGatewayEventRequestContextV2 = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainPrefix = domainPrefix.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeEpoch = timeEpoch.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEventRequestContextV2]
    }
    
    extension [Self <: APIGatewayEventRequestContextV2](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setAuthentication(value: ClientCert): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainPrefix(value: String): Self = StObject.set(x, "domainPrefix", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: Method): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeEpoch(value: Double): Self = StObject.set(x, "timeEpoch", value.asInstanceOf[js.Any])
    }
  }
  
  trait APIGatewayEventRequestContextV2WithAuthorizer[TAuthorizer]
    extends StObject
       with APIGatewayEventRequestContextV2 {
    
    var authorizer: TAuthorizer
  }
  object APIGatewayEventRequestContextV2WithAuthorizer {
    
    inline def apply[TAuthorizer](
      accountId: String,
      apiId: String,
      authorizer: TAuthorizer,
      domainName: String,
      domainPrefix: String,
      http: Method,
      requestId: String,
      routeKey: String,
      stage: String,
      time: String,
      timeEpoch: Double
    ): APIGatewayEventRequestContextV2WithAuthorizer[TAuthorizer] = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], authorizer = authorizer.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainPrefix = domainPrefix.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeEpoch = timeEpoch.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEventRequestContextV2WithAuthorizer[TAuthorizer]]
    }
    
    extension [Self <: APIGatewayEventRequestContextV2WithAuthorizer[?], TAuthorizer](x: Self & APIGatewayEventRequestContextV2WithAuthorizer[TAuthorizer]) {
      
      inline def setAuthorizer(value: TAuthorizer): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait APIGatewayEventWebsocketRequestContextV2 extends StObject {
    
    var apiId: String
    
    var connectedAt: Double
    
    var connectionId: String
    
    var domainName: String
    
    var eventType: CONNECT | MESSAGE | DISCONNECT
    
    var extendedRequestId: String
    
    var messageDirection: IN
    
    var messageId: String
    
    var requestId: String
    
    var requestTime: String
    
    var requestTimeEpoch: Double
    
    var routeKey: String
    
    var stage: String
  }
  object APIGatewayEventWebsocketRequestContextV2 {
    
    inline def apply(
      apiId: String,
      connectedAt: Double,
      connectionId: String,
      domainName: String,
      eventType: CONNECT | MESSAGE | DISCONNECT,
      extendedRequestId: String,
      messageId: String,
      requestId: String,
      requestTime: String,
      requestTimeEpoch: Double,
      routeKey: String,
      stage: String
    ): APIGatewayEventWebsocketRequestContextV2 = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], connectedAt = connectedAt.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], extendedRequestId = extendedRequestId.asInstanceOf[js.Any], messageDirection = "IN", messageId = messageId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], requestTimeEpoch = requestTimeEpoch.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEventWebsocketRequestContextV2]
    }
    
    extension [Self <: APIGatewayEventWebsocketRequestContextV2](x: Self) {
      
      inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setConnectedAt(value: Double): Self = StObject.set(x, "connectedAt", value.asInstanceOf[js.Any])
      
      inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: CONNECT | MESSAGE | DISCONNECT): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setExtendedRequestId(value: String): Self = StObject.set(x, "extendedRequestId", value.asInstanceOf[js.Any])
      
      inline def setMessageDirection(value: IN): Self = StObject.set(x, "messageDirection", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeEpoch(value: Double): Self = StObject.set(x, "requestTimeEpoch", value.asInstanceOf[js.Any])
      
      inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyCallback = Callback[APIGatewayProxyResult]
  
  type APIGatewayProxyCallbackV2 = Callback[APIGatewayProxyResultV2[scala.Nothing]]
  
  trait APIGatewayProxyCognitoAuthorizer extends StObject {
    
    var claims: StringDictionary[String]
  }
  object APIGatewayProxyCognitoAuthorizer {
    
    inline def apply(claims: StringDictionary[String]): APIGatewayProxyCognitoAuthorizer = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyCognitoAuthorizer]
    }
    
    extension [Self <: APIGatewayProxyCognitoAuthorizer](x: Self) {
      
      inline def setClaims(value: StringDictionary[String]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyEvent = APIGatewayProxyEventBase[APIGatewayEventDefaultAuthorizerContext]
  
  trait APIGatewayProxyEventBase[TAuthorizerContext] extends StObject {
    
    var body: String | Null
    
    var headers: APIGatewayProxyEventHeaders
    
    var httpMethod: String
    
    var isBase64Encoded: Boolean
    
    var multiValueHeaders: APIGatewayProxyEventMultiValueHeaders
    
    var multiValueQueryStringParameters: APIGatewayProxyEventMultiValueQueryStringParameters | Null
    
    var path: String
    
    var pathParameters: APIGatewayProxyEventPathParameters | Null
    
    var queryStringParameters: APIGatewayProxyEventQueryStringParameters | Null
    
    var requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]
    
    var resource: String
    
    var stageVariables: APIGatewayProxyEventStageVariables | Null
  }
  object APIGatewayProxyEventBase {
    
    inline def apply[TAuthorizerContext](
      headers: APIGatewayProxyEventHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      multiValueHeaders: APIGatewayProxyEventMultiValueHeaders,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext],
      resource: String
    ): APIGatewayProxyEventBase[TAuthorizerContext] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], body = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
      __obj.asInstanceOf[APIGatewayProxyEventBase[TAuthorizerContext]]
    }
    
    extension [Self <: APIGatewayProxyEventBase[?], TAuthorizerContext](x: Self & APIGatewayProxyEventBase[TAuthorizerContext]) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setHeaders(value: APIGatewayProxyEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeaders(value: APIGatewayProxyEventMultiValueHeaders): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParameters(value: APIGatewayProxyEventMultiValueQueryStringParameters): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: APIGatewayProxyEventPathParameters): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      inline def setQueryStringParameters(value: APIGatewayProxyEventQueryStringParameters): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      inline def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: APIGatewayProxyEventStageVariables): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      inline def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
    }
  }
  
  type APIGatewayProxyEventHeaders = StringDictionary[js.UndefOr[String]]
  
  type APIGatewayProxyEventMultiValueHeaders = StringDictionary[js.UndefOr[js.Array[String]]]
  
  type APIGatewayProxyEventMultiValueQueryStringParameters = StringDictionary[js.UndefOr[js.Array[String]]]
  
  type APIGatewayProxyEventPathParameters = StringDictionary[js.UndefOr[String]]
  
  type APIGatewayProxyEventQueryStringParameters = StringDictionary[js.UndefOr[String]]
  
  type APIGatewayProxyEventStageVariables = StringDictionary[js.UndefOr[String]]
  
  type APIGatewayProxyEventV2 = APIGatewayProxyEventV2WithRequestContext[APIGatewayEventRequestContextV2]
  
  type APIGatewayProxyEventV2WithJWTAuthorizer = APIGatewayProxyEventV2WithRequestContext[
    APIGatewayEventRequestContextV2WithAuthorizer[APIGatewayEventRequestContextJWTAuthorizer]
  ]
  
  type APIGatewayProxyEventV2WithLambdaAuthorizer[TAuthorizerContext] = APIGatewayProxyEventV2WithRequestContext[
    APIGatewayEventRequestContextV2WithAuthorizer[APIGatewayEventRequestContextLambdaAuthorizer[TAuthorizerContext]]
  ]
  
  trait APIGatewayProxyEventV2WithRequestContext[TRequestContext] extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var cookies: js.UndefOr[js.Array[String]] = js.undefined
    
    var headers: APIGatewayProxyEventHeaders
    
    var isBase64Encoded: Boolean
    
    var pathParameters: js.UndefOr[APIGatewayProxyEventPathParameters] = js.undefined
    
    var queryStringParameters: js.UndefOr[APIGatewayProxyEventQueryStringParameters] = js.undefined
    
    var rawPath: String
    
    var rawQueryString: String
    
    var requestContext: TRequestContext
    
    var routeKey: String
    
    var stageVariables: js.UndefOr[APIGatewayProxyEventStageVariables] = js.undefined
    
    var version: String
  }
  object APIGatewayProxyEventV2WithRequestContext {
    
    inline def apply[TRequestContext](
      headers: APIGatewayProxyEventHeaders,
      isBase64Encoded: Boolean,
      rawPath: String,
      rawQueryString: String,
      requestContext: TRequestContext,
      routeKey: String,
      version: String
    ): APIGatewayProxyEventV2WithRequestContext[TRequestContext] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], rawPath = rawPath.asInstanceOf[js.Any], rawQueryString = rawQueryString.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyEventV2WithRequestContext[TRequestContext]]
    }
    
    extension [Self <: APIGatewayProxyEventV2WithRequestContext[?], TRequestContext](x: Self & APIGatewayProxyEventV2WithRequestContext[TRequestContext]) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: APIGatewayProxyEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: APIGatewayProxyEventPathParameters): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      inline def setQueryStringParameters(value: APIGatewayProxyEventQueryStringParameters): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      inline def setRawPath(value: String): Self = StObject.set(x, "rawPath", value.asInstanceOf[js.Any])
      
      inline def setRawQueryString(value: String): Self = StObject.set(x, "rawQueryString", value.asInstanceOf[js.Any])
      
      inline def setRequestContext(value: TRequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: APIGatewayProxyEventStageVariables): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyHandler = Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  
  type APIGatewayProxyHandlerV2[T] = Handler[APIGatewayProxyEventV2, APIGatewayProxyResultV2[T]]
  
  type APIGatewayProxyHandlerV2WithJWTAuthorizer[T] = Handler[APIGatewayProxyEventV2WithJWTAuthorizer, APIGatewayProxyResultV2[T]]
  
  type APIGatewayProxyHandlerV2WithLambdaAuthorizer[TAuthorizerContext, T] = Handler[
    APIGatewayProxyEventV2WithLambdaAuthorizer[TAuthorizerContext], 
    APIGatewayProxyResultV2[T]
  ]
  
  trait APIGatewayProxyResult extends StObject {
    
    var body: String
    
    var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
    
    var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
    
    var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.undefined
    
    var statusCode: Double
  }
  object APIGatewayProxyResult {
    
    inline def apply(body: String, statusCode: Double): APIGatewayProxyResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyResult]
    }
    
    extension [Self <: APIGatewayProxyResult](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      inline def setMultiValueHeaders(value: StringDictionary[js.Array[Boolean | Double | String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyResultV2[T] = APIGatewayProxyStructuredResultV2 | String | T
  
  trait APIGatewayProxyStructuredResultV2 extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var cookies: js.UndefOr[js.Array[String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
    
    var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object APIGatewayProxyStructuredResultV2 {
    
    inline def apply(): APIGatewayProxyStructuredResultV2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIGatewayProxyStructuredResultV2]
    }
    
    extension [Self <: APIGatewayProxyStructuredResultV2](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type APIGatewayProxyWebsocketEventV2 = APIGatewayProxyWebsocketEventV2WithRequestContext[APIGatewayEventWebsocketRequestContextV2]
  
  trait APIGatewayProxyWebsocketEventV2WithRequestContext[TRequestContext] extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var isBase64Encoded: Boolean
    
    var requestContext: TRequestContext
    
    var stageVariables: js.UndefOr[APIGatewayProxyEventStageVariables] = js.undefined
  }
  object APIGatewayProxyWebsocketEventV2WithRequestContext {
    
    inline def apply[TRequestContext](isBase64Encoded: Boolean, requestContext: TRequestContext): APIGatewayProxyWebsocketEventV2WithRequestContext[TRequestContext] = {
      val __obj = js.Dynamic.literal(isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyWebsocketEventV2WithRequestContext[TRequestContext]]
    }
    
    extension [Self <: APIGatewayProxyWebsocketEventV2WithRequestContext[?], TRequestContext](x: Self & APIGatewayProxyWebsocketEventV2WithRequestContext[TRequestContext]) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setRequestContext(value: TRequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: APIGatewayProxyEventStageVariables): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
    }
  }
  
  type APIGatewayProxyWebsocketHandlerV2[T] = Handler[APIGatewayProxyWebsocketEventV2, APIGatewayProxyResultV2[T]]
  
  type APIGatewayProxyWithCognitoAuthorizerEvent = APIGatewayProxyEventBase[APIGatewayProxyCognitoAuthorizer]
  
  type APIGatewayProxyWithCognitoAuthorizerHandler = Handler[APIGatewayProxyWithCognitoAuthorizerEvent, APIGatewayProxyResult]
  
  type APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext] = APIGatewayProxyEventBase[APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]]
  
  type APIGatewayProxyWithLambdaAuthorizerEventRequestContext[TAuthorizerContext] = APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]]
  
  type APIGatewayProxyWithLambdaAuthorizerHandler[TAuthorizerContext] = Handler[
    APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext], 
    APIGatewayProxyResult
  ]
  
  type ProxyCallback = APIGatewayProxyCallback
  
  type ProxyHandler = APIGatewayProxyHandler
  
  type ProxyResult = APIGatewayProxyResult
}
