package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBEvent extends js.Object {
  var body: java.lang.String | scala.Null
   // URL encoded
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var httpMethod: java.lang.String
  var isBase64Encoded: scala.Boolean
   // URL encoded
  var multiValueHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var multiValueQueryStringParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var path: java.lang.String
  var queryStringParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var requestContext: ALBEventRequestContext
}

object ALBEvent {
  @scala.inline
  def apply(
    httpMethod: java.lang.String,
    isBase64Encoded: scala.Boolean,
    path: java.lang.String,
    requestContext: ALBEventRequestContext,
    body: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    multiValueQueryStringParameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ALBEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, isBase64Encoded = isBase64Encoded, path = path, requestContext = requestContext)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    if (multiValueQueryStringParameters != null) __obj.updateDynamic("multiValueQueryStringParameters")(multiValueQueryStringParameters)
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters)
    __obj.asInstanceOf[ALBEvent]
  }
}

