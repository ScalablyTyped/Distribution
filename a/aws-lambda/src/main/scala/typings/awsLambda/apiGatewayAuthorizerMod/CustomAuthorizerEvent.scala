package typings.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAuthorizerEvent extends js.Object {
  
  var apiId: js.UndefOr[String] = js.native
  
  var authorizationToken: js.UndefOr[String] = js.native
  
  var domainName: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var httpMethod: js.UndefOr[String] = js.native
  
  var methodArn: String = js.native
  
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
  
  var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
  
  var requestContext: js.UndefOr[
    APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
  ] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.native
  
  var `type`: String = js.native
}
object CustomAuthorizerEvent {
  
  @scala.inline
  def apply(methodArn: String, `type`: String): CustomAuthorizerEvent = {
    val __obj = js.Dynamic.literal(methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthorizerEvent]
  }
  
  @scala.inline
  implicit class CustomAuthorizerEventOps[Self <: CustomAuthorizerEvent] (val x: Self) extends AnyVal {
    
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
    def setMethodArn(value: String): Self = this.set("methodArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiId: Self = this.set("apiId", js.undefined)
    
    @scala.inline
    def setAuthorizationToken(value: String): Self = this.set("authorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationToken: Self = this.set("authorizationToken", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueHeaders: Self = this.set("multiValueHeaders", js.undefined)
    
    @scala.inline
    def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueQueryStringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueQueryStringParameters: Self = this.set("multiValueQueryStringParameters", js.undefined)
    
    @scala.inline
    def setMultiValueQueryStringParametersNull: Self = this.set("multiValueQueryStringParameters", null)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathParameters(value: StringDictionary[String]): Self = this.set("pathParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathParameters: Self = this.set("pathParameters", js.undefined)
    
    @scala.inline
    def setPathParametersNull: Self = this.set("pathParameters", null)
    
    @scala.inline
    def setQueryStringParameters(value: StringDictionary[String]): Self = this.set("queryStringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringParameters: Self = this.set("queryStringParameters", js.undefined)
    
    @scala.inline
    def setQueryStringParametersNull: Self = this.set("queryStringParameters", null)
    
    @scala.inline
    def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestContext: Self = this.set("requestContext", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setStageVariables(value: StringDictionary[String]): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageVariables: Self = this.set("stageVariables", js.undefined)
  }
}
