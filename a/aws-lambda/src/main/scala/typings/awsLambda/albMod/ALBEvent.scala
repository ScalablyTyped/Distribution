package typings.awsLambda.albMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBEvent extends js.Object {
  var body: String | Null
   // URL encoded
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpMethod: String
  var isBase64Encoded: Boolean
   // URL encoded
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var path: String
  var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var requestContext: ALBEventRequestContext
}

object ALBEvent {
  @scala.inline
  def apply(
    httpMethod: String,
    isBase64Encoded: Boolean,
    path: String,
    requestContext: ALBEventRequestContext,
    body: String = null,
    headers: StringDictionary[String] = null,
    multiValueHeaders: StringDictionary[js.Array[String]] = null,
    multiValueQueryStringParameters: StringDictionary[js.Array[String]] = null,
    queryStringParameters: StringDictionary[String] = null
  ): ALBEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders.asInstanceOf[js.Any])
    if (multiValueQueryStringParameters != null) __obj.updateDynamic("multiValueQueryStringParameters")(multiValueQueryStringParameters.asInstanceOf[js.Any])
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBEvent]
  }
}

