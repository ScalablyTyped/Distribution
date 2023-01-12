package typings.awsLambda.triggerApiGatewayAuthorizerMod

import typings.awsLambda.awsLambdaStrings.REQUEST
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewayRequestAuthorizerEvent
  extends StObject
     with APIGatewayAuthorizerEvent {
  
  var headers: APIGatewayRequestAuthorizerEventHeaders | Null
  
  var httpMethod: String
  
  var methodArn: String
  
  var multiValueHeaders: APIGatewayRequestAuthorizerEventMultiValueHeaders | Null
  
  var multiValueQueryStringParameters: APIGatewayRequestAuthorizerEventMultiValueQueryStringParameters | Null
  
  var path: String
  
  var pathParameters: APIGatewayRequestAuthorizerEventPathParameters | Null
  
  var queryStringParameters: APIGatewayRequestAuthorizerEventQueryStringParameters | Null
  
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit]
  
  var resource: String
  
  var stageVariables: APIGatewayRequestAuthorizerEventStageVariables | Null
  
  var `type`: REQUEST
}
object APIGatewayRequestAuthorizerEvent {
  
  inline def apply(
    httpMethod: String,
    methodArn: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit],
    resource: String
  ): APIGatewayRequestAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], headers = null, multiValueHeaders = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
    __obj.updateDynamic("type")("REQUEST")
    __obj.asInstanceOf[APIGatewayRequestAuthorizerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIGatewayRequestAuthorizerEvent] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: APIGatewayRequestAuthorizerEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeaders(value: APIGatewayRequestAuthorizerEventMultiValueHeaders): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeadersNull: Self = StObject.set(x, "multiValueHeaders", null)
    
    inline def setMultiValueQueryStringParameters(value: APIGatewayRequestAuthorizerEventMultiValueQueryStringParameters): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathParameters(value: APIGatewayRequestAuthorizerEventPathParameters): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
    
    inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
    
    inline def setQueryStringParameters(value: APIGatewayRequestAuthorizerEventQueryStringParameters): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
    
    inline def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[Unit]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setStageVariables(value: APIGatewayRequestAuthorizerEventStageVariables): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    inline def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
    
    inline def setType(value: REQUEST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
