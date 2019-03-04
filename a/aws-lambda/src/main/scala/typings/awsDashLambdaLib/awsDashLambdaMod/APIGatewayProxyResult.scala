package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyResult extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String]
  ] = js.undefined
  var isBase64Encoded: js.UndefOr[scala.Boolean] = js.undefined
  var multiValueHeaders: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean | scala.Double | java.lang.String]]
  ] = js.undefined
  var statusCode: scala.Double
}

object APIGatewayProxyResult {
  @scala.inline
  def apply(
    body: java.lang.String,
    statusCode: scala.Double,
    headers: org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String] = null,
    isBase64Encoded: js.UndefOr[scala.Boolean] = js.undefined,
    multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean | scala.Double | java.lang.String]] = null
  ): APIGatewayProxyResult = {
    val __obj = js.Dynamic.literal(body = body, statusCode = statusCode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(isBase64Encoded)) __obj.updateDynamic("isBase64Encoded")(isBase64Encoded)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    __obj.asInstanceOf[APIGatewayProxyResult]
  }
}

