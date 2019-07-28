package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyResult extends js.Object {
  var body: String
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
  var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.undefined
  var statusCode: Double
}

object APIGatewayProxyResult {
  @scala.inline
  def apply(
    body: String,
    statusCode: Double,
    headers: StringDictionary[Boolean | Double | String] = null,
    isBase64Encoded: js.UndefOr[Boolean] = js.undefined,
    multiValueHeaders: StringDictionary[js.Array[Boolean | Double | String]] = null
  ): APIGatewayProxyResult = {
    val __obj = js.Dynamic.literal(body = body, statusCode = statusCode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(isBase64Encoded)) __obj.updateDynamic("isBase64Encoded")(isBase64Encoded)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    __obj.asInstanceOf[APIGatewayProxyResult]
  }
}

