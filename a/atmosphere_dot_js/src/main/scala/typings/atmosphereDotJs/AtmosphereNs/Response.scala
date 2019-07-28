package typings.atmosphereDotJs.AtmosphereNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var closedByClientTimeout: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var errorHandled: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  var messages: js.UndefOr[js.Array[String]] = js.undefined
  var partialMessage: js.UndefOr[String] = js.undefined
  var reasonPhrase: js.UndefOr[String] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var responseBody: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[String] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    closedByClientTimeout: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    errorHandled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    messages: js.Array[String] = null,
    partialMessage: String = null,
    reasonPhrase: String = null,
    request: Request = null,
    responseBody: String = null,
    state: String = null,
    status: Int | Double = null,
    transport: String = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closedByClientTimeout)) __obj.updateDynamic("closedByClientTimeout")(closedByClientTimeout)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(errorHandled)) __obj.updateDynamic("errorHandled")(errorHandled)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (partialMessage != null) __obj.updateDynamic("partialMessage")(partialMessage)
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase)
    if (request != null) __obj.updateDynamic("request")(request)
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody)
    if (state != null) __obj.updateDynamic("state")(state)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[Response]
  }
}

