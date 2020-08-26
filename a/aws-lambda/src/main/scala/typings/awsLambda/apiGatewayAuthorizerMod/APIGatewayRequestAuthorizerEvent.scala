package typings.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.awsLambdaStrings.REQUEST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayRequestAuthorizerEvent extends APIGatewayAuthorizerEvent {
  var headers: StringDictionary[String] | Null = js.native
  var httpMethod: String = js.native
  var methodArn: String = js.native
  var multiValueHeaders: StringDictionary[js.Array[String]] | Null = js.native
  var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null = js.native
  var path: String = js.native
  var pathParameters: StringDictionary[String] | Null = js.native
  var queryStringParameters: StringDictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]] = js.native
  var resource: String = js.native
  var stageVariables: StringDictionary[String] | Null = js.native
  var `type`: REQUEST = js.native
}

object APIGatewayRequestAuthorizerEvent {
  @scala.inline
  def apply(
    httpMethod: String,
    methodArn: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
    resource: String,
    `type`: REQUEST
  ): APIGatewayRequestAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayRequestAuthorizerEvent]
  }
  @scala.inline
  implicit class APIGatewayRequestAuthorizerEventOps[Self <: APIGatewayRequestAuthorizerEvent] (val x: Self) extends AnyVal {
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
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodArn(value: String): Self = this.set("methodArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]]): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: REQUEST): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
    @scala.inline
    def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueHeadersNull: Self = this.set("multiValueHeaders", null)
    @scala.inline
    def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueQueryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueQueryStringParametersNull: Self = this.set("multiValueQueryStringParameters", null)
    @scala.inline
    def setPathParameters(value: StringDictionary[String]): Self = this.set("pathParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathParametersNull: Self = this.set("pathParameters", null)
    @scala.inline
    def setQueryStringParameters(value: StringDictionary[String]): Self = this.set("queryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryStringParametersNull: Self = this.set("queryStringParameters", null)
    @scala.inline
    def setStageVariables(value: StringDictionary[String]): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageVariablesNull: Self = this.set("stageVariables", null)
  }
  
}

