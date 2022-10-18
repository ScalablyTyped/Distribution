package typings.awsLambda.triggerApiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAuthorizerEvent extends StObject {
  
  var apiId: js.UndefOr[String] = js.undefined
  
  var authorizationToken: js.UndefOr[String] = js.undefined
  
  var domainName: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var httpMethod: js.UndefOr[String] = js.undefined
  
  var methodArn: String
  
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var requestContext: js.UndefOr[
    APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
  ] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var `type`: String
}
object CustomAuthorizerEvent {
  
  inline def apply(methodArn: String, `type`: String): CustomAuthorizerEvent = {
    val __obj = js.Dynamic.literal(methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthorizerEvent]
  }
  
  extension [Self <: CustomAuthorizerEvent](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
    
    inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    inline def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
    
    inline def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
    
    inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
    
    inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
    
    inline def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
    
    inline def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    
    inline def setRequestContextUndefined: Self = StObject.set(x, "requestContext", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
