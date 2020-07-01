package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyStructuredResultV2 extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var cookies: js.UndefOr[js.Array[String]] = js.undefined
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
  var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object APIGatewayProxyStructuredResultV2 {
  @scala.inline
  def apply(
    body: String = null,
    cookies: js.Array[String] = null,
    headers: StringDictionary[Boolean | Double | String] = null,
    isBase64Encoded: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.UndefOr[Double] = js.undefined
  ): APIGatewayProxyStructuredResultV2 = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(isBase64Encoded)) __obj.updateDynamic("isBase64Encoded")(isBase64Encoded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyStructuredResultV2]
  }
}

