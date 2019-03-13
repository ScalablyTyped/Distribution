package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBResult extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String]
  ] = js.undefined
  var isBase64Encoded: scala.Boolean
  var multiValueHeaders: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean | scala.Double | java.lang.String]]
  ] = js.undefined
  var statusCode: scala.Double
  var statusDescription: java.lang.String
}

object ALBResult {
  @scala.inline
  def apply(
    body: java.lang.String,
    isBase64Encoded: scala.Boolean,
    statusCode: scala.Double,
    statusDescription: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String] = null,
    multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean | scala.Double | java.lang.String]] = null
  ): ALBResult = {
    val __obj = js.Dynamic.literal(body = body, isBase64Encoded = isBase64Encoded, statusCode = statusCode, statusDescription = statusDescription)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    __obj.asInstanceOf[ALBResult]
  }
}

