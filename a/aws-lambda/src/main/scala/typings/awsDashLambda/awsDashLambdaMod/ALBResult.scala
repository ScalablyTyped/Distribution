package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBResult extends js.Object {
  var body: String
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
  var isBase64Encoded: Boolean
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.undefined
  var statusCode: Double
  var statusDescription: String
}

object ALBResult {
  @scala.inline
  def apply(
    body: String,
    isBase64Encoded: Boolean,
    statusCode: Double,
    statusDescription: String,
    headers: StringDictionary[Boolean | Double | String] = null,
    multiValueHeaders: StringDictionary[js.Array[Boolean | Double | String]] = null
  ): ALBResult = {
    val __obj = js.Dynamic.literal(body = body, isBase64Encoded = isBase64Encoded, statusCode = statusCode, statusDescription = statusDescription)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    __obj.asInstanceOf[ALBResult]
  }
}

