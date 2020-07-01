package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyEventV2 extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var cookies: js.UndefOr[js.Array[String]] = js.undefined
  var headers: StringDictionary[String]
  var isBase64Encoded: Boolean
  var pathParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var rawPath: String
  var rawQueryString: String
  var requestContext: AccountId
  var routeKey: String
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.undefined
  var version: String
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
    version: String,
    body: String = null,
    cookies: js.Array[String] = null,
    pathParameters: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null,
    stageVariables: StringDictionary[String] = null
  ): APIGatewayProxyEventV2 = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], rawPath = rawPath.asInstanceOf[js.Any], rawQueryString = rawQueryString.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters.asInstanceOf[js.Any])
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters.asInstanceOf[js.Any])
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyEventV2]
  }
}

