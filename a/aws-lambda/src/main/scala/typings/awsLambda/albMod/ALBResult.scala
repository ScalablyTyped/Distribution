package typings.awsLambda.albMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBResult extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
  var isBase64Encoded: Boolean
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.undefined
  var statusCode: Double
  var statusDescription: String
}

object ALBResult {
  @scala.inline
  def apply(
    isBase64Encoded: Boolean,
    statusCode: Double,
    statusDescription: String,
    body: String = null,
    headers: StringDictionary[Boolean | Double | String] = null,
    multiValueHeaders: StringDictionary[js.Array[Boolean | Double | String]] = null
  ): ALBResult = {
    val __obj = js.Dynamic.literal(isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBResult]
  }
}

