package typings.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.awsLambdaStrings.REQUEST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayRequestAuthorizerEvent extends APIGatewayAuthorizerEvent {
  var headers: StringDictionary[String] | Null
  var httpMethod: String
  var methodArn: String
  var multiValueHeaders: StringDictionary[js.Array[String]] | Null
  var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null
  var path: String
  var pathParameters: StringDictionary[String] | Null
  var queryStringParameters: StringDictionary[String] | Null
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]]
  var resource: String
  var stageVariables: StringDictionary[String] | Null
  var `type`: REQUEST
}

object APIGatewayRequestAuthorizerEvent {
  @scala.inline
  def apply(
    httpMethod: String,
    methodArn: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
    resource: String,
    `type`: REQUEST,
    headers: StringDictionary[String] = null,
    multiValueHeaders: StringDictionary[js.Array[String]] = null,
    multiValueQueryStringParameters: StringDictionary[js.Array[String]] = null,
    pathParameters: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null,
    stageVariables: StringDictionary[String] = null
  ): APIGatewayRequestAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], multiValueQueryStringParameters = multiValueQueryStringParameters.asInstanceOf[js.Any], pathParameters = pathParameters.asInstanceOf[js.Any], queryStringParameters = queryStringParameters.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayRequestAuthorizerEvent]
  }
}

