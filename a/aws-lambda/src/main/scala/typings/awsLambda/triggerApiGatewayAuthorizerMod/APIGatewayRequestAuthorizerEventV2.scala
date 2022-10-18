package typings.awsLambda.triggerApiGatewayAuthorizerMod

import typings.awsLambda.awsLambdaStrings.REQUEST
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayEventRequestContextV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewayRequestAuthorizerEventV2 extends StObject {
  
  var cookies: js.Array[String]
  
  var headers: js.UndefOr[APIGatewayRequestAuthorizerEventHeaders] = js.undefined
  
  var identitySource: js.Array[String]
  
  var pathParameters: js.UndefOr[APIGatewayRequestAuthorizerEventPathParameters] = js.undefined
  
  var queryStringParameters: js.UndefOr[APIGatewayRequestAuthorizerEventQueryStringParameters] = js.undefined
  
  var rawPath: String
  
  var rawQueryString: String
  
  var requestContext: APIGatewayEventRequestContextV2
  
  var routeArn: String
  
  var routeKey: String
  
  var stageVariables: js.UndefOr[APIGatewayRequestAuthorizerEventStageVariables] = js.undefined
  
  var `type`: REQUEST
  
  var version: String
}
object APIGatewayRequestAuthorizerEventV2 {
  
  inline def apply(
    cookies: js.Array[String],
    identitySource: js.Array[String],
    rawPath: String,
    rawQueryString: String,
    requestContext: APIGatewayEventRequestContextV2,
    routeArn: String,
    routeKey: String,
    version: String
  ): APIGatewayRequestAuthorizerEventV2 = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], identitySource = identitySource.asInstanceOf[js.Any], rawPath = rawPath.asInstanceOf[js.Any], rawQueryString = rawQueryString.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], routeArn = routeArn.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REQUEST")
    __obj.asInstanceOf[APIGatewayRequestAuthorizerEventV2]
  }
  
  extension [Self <: APIGatewayRequestAuthorizerEventV2](x: Self) {
    
    inline def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setHeaders(value: APIGatewayRequestAuthorizerEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIdentitySource(value: js.Array[String]): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
    
    inline def setIdentitySourceVarargs(value: String*): Self = StObject.set(x, "identitySource", js.Array(value*))
    
    inline def setPathParameters(value: APIGatewayRequestAuthorizerEventPathParameters): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
    
    inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
    
    inline def setQueryStringParameters(value: APIGatewayRequestAuthorizerEventQueryStringParameters): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
    
    inline def setRawPath(value: String): Self = StObject.set(x, "rawPath", value.asInstanceOf[js.Any])
    
    inline def setRawQueryString(value: String): Self = StObject.set(x, "rawQueryString", value.asInstanceOf[js.Any])
    
    inline def setRequestContext(value: APIGatewayEventRequestContextV2): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    
    inline def setRouteArn(value: String): Self = StObject.set(x, "routeArn", value.asInstanceOf[js.Any])
    
    inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
    
    inline def setStageVariables(value: APIGatewayRequestAuthorizerEventStageVariables): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
    
    inline def setType(value: REQUEST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
