package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeMethodResponse extends js.Object {
  /**
    * The body of the HTTP response.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The headers of the HTTP response.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The execution latency of the test invoke request.
    */
  var latency: js.UndefOr[Long] = js.native
  /**
    * The API Gateway execution log for the test invoke request.
    */
  var log: js.UndefOr[String] = js.native
  /**
    * The headers of the HTTP response as a map from string to list of values.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  /**
    * The HTTP status code.
    */
  var status: js.UndefOr[Integer] = js.native
}

object TestInvokeMethodResponse {
  @scala.inline
  def apply(
    body: String = null,
    headers: MapOfStringToString = null,
    latency: Int | scala.Double = null,
    log: String = null,
    multiValueHeaders: MapOfStringToList = null,
    status: Int | scala.Double = null
  ): TestInvokeMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeMethodResponse]
  }
}

