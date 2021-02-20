package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.AccountId
import typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayProxyMod {
  
  type APIGatewayEvent = APIGatewayProxyEvent
  
  @js.native
  trait APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext] extends StObject {
    
    var integrationLatency: Double = js.native
    
    var principalId: String = js.native
  }
  
  type APIGatewayProxyCallback = Callback[APIGatewayProxyResult]
  
  type APIGatewayProxyCallbackV2 = Callback[APIGatewayProxyResultV2[scala.Nothing]]
  
  @js.native
  trait APIGatewayProxyCognitoAuthorizer extends StObject {
    
    var claims: StringDictionary[String] = js.native
  }
  object APIGatewayProxyCognitoAuthorizer {
    
    @scala.inline
    def apply(claims: StringDictionary[String]): APIGatewayProxyCognitoAuthorizer = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyCognitoAuthorizer]
    }
    
    @scala.inline
    implicit class APIGatewayProxyCognitoAuthorizerMutableBuilder[Self <: APIGatewayProxyCognitoAuthorizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClaims(value: StringDictionary[String]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyEvent = APIGatewayProxyEventBase[APIGatewayEventDefaultAuthorizerContext]
  
  @js.native
  trait APIGatewayProxyEventBase[TAuthorizerContext] extends StObject {
    
    var body: String | Null = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var httpMethod: String = js.native
    
    var isBase64Encoded: Boolean = js.native
    
    var multiValueHeaders: StringDictionary[js.Array[String]] = js.native
    
    var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null = js.native
    
    var path: String = js.native
    
    var pathParameters: StringDictionary[String] | Null = js.native
    
    var queryStringParameters: StringDictionary[String] | Null = js.native
    
    var requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] = js.native
    
    var resource: String = js.native
    
    var stageVariables: StringDictionary[String] | Null = js.native
  }
  object APIGatewayProxyEventBase {
    
    @scala.inline
    def apply[TAuthorizerContext](
      headers: StringDictionary[String],
      httpMethod: String,
      isBase64Encoded: Boolean,
      multiValueHeaders: StringDictionary[js.Array[String]],
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext],
      resource: String
    ): APIGatewayProxyEventBase[TAuthorizerContext] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyEventBase[TAuthorizerContext]]
    }
    
    @scala.inline
    implicit class APIGatewayProxyEventBaseMutableBuilder[Self <: APIGatewayProxyEventBase[_], TAuthorizerContext] (val x: Self with APIGatewayProxyEventBase[TAuthorizerContext]) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      @scala.inline
      def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
    }
  }
  
  @js.native
  trait APIGatewayProxyEventV2 extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var cookies: js.UndefOr[js.Array[String]] = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var isBase64Encoded: Boolean = js.native
    
    var pathParameters: js.UndefOr[StringDictionary[String]] = js.native
    
    var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.native
    
    var rawPath: String = js.native
    
    var rawQueryString: String = js.native
    
    var requestContext: AccountId = js.native
    
    var routeKey: String = js.native
    
    var stageVariables: js.UndefOr[StringDictionary[String]] = js.native
    
    var version: String = js.native
  }
  object APIGatewayProxyEventV2 {
    
    @scala.inline
    def apply(
      headers: StringDictionary[String],
      isBase64Encoded: Boolean,
      rawPath: String,
      rawQueryString: String,
      requestContext: AccountId,
      routeKey: String,
      version: String
    ): APIGatewayProxyEventV2 = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], rawPath = rawPath.asInstanceOf[js.Any], rawQueryString = rawQueryString.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyEventV2]
    }
    
    @scala.inline
    implicit class APIGatewayProxyEventV2MutableBuilder[Self <: APIGatewayProxyEventV2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      @scala.inline
      def setRawPath(value: String): Self = StObject.set(x, "rawPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawQueryString(value: String): Self = StObject.set(x, "rawQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestContext(value: AccountId): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyHandler = Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  
  type APIGatewayProxyHandlerV2[T] = Handler[APIGatewayProxyEventV2, APIGatewayProxyResultV2[T]]
  
  @js.native
  trait APIGatewayProxyResult extends StObject {
    
    var body: String = js.native
    
    var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.native
    
    var isBase64Encoded: js.UndefOr[Boolean] = js.native
    
    var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.native
    
    var statusCode: Double = js.native
  }
  object APIGatewayProxyResult {
    
    @scala.inline
    def apply(body: String, statusCode: Double): APIGatewayProxyResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayProxyResult]
    }
    
    @scala.inline
    implicit class APIGatewayProxyResultMutableBuilder[Self <: APIGatewayProxyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[Boolean | Double | String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayProxyResultV2[T] = APIGatewayProxyStructuredResultV2 | String | T
  
  @js.native
  trait APIGatewayProxyStructuredResultV2 extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var cookies: js.UndefOr[js.Array[String]] = js.native
    
    var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.native
    
    var isBase64Encoded: js.UndefOr[Boolean] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object APIGatewayProxyStructuredResultV2 {
    
    @scala.inline
    def apply(): APIGatewayProxyStructuredResultV2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIGatewayProxyStructuredResultV2]
    }
    
    @scala.inline
    implicit class APIGatewayProxyStructuredResultV2MutableBuilder[Self <: APIGatewayProxyStructuredResultV2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
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
