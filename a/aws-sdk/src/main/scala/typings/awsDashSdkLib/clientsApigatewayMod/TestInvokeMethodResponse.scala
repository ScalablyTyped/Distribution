package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestInvokeMethodResponse extends js.Object {
  /**
    * The body of the HTTP response.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The headers of the HTTP response.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * The execution latency of the test invoke request.
    */
  var latency: js.UndefOr[Long] = js.undefined
  /**
    * The API Gateway execution log for the test invoke request.
    */
  var log: js.UndefOr[String] = js.undefined
  /**
    * The headers of the HTTP response as a map from string to list of values.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined
  /**
    * The HTTP status code.
    */
  var status: js.UndefOr[Integer] = js.undefined
}

object TestInvokeMethodResponse {
  @scala.inline
  def apply(
    body: String = null,
    headers: MapOfStringToString = null,
    latency: js.UndefOr[Long] = js.undefined,
    log: String = null,
    multiValueHeaders: MapOfStringToList = null,
    status: js.UndefOr[Integer] = js.undefined
  ): TestInvokeMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency)
    if (log != null) __obj.updateDynamic("log")(log)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[TestInvokeMethodResponse]
  }
}

