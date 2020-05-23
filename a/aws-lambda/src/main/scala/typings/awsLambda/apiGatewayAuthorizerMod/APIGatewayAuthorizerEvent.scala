package typings.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.awsLambdaStrings.REQUEST
import typings.awsLambda.awsLambdaStrings.TOKEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
  - typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
*/
trait APIGatewayAuthorizerEvent extends js.Object

object APIGatewayAuthorizerEvent {
  @scala.inline
  def APIGatewayTokenAuthorizerEvent(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerEvent]
  }
  @scala.inline
  def APIGatewayRequestAuthorizerEvent(
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
  ): APIGatewayAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], multiValueQueryStringParameters = multiValueQueryStringParameters.asInstanceOf[js.Any], pathParameters = pathParameters.asInstanceOf[js.Any], queryStringParameters = queryStringParameters.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerEvent]
  }
}

