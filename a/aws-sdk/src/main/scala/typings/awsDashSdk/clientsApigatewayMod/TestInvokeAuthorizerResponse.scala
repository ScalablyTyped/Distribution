package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestInvokeAuthorizerResponse extends js.Object {
  var authorization: js.UndefOr[MapOfStringToList] = js.undefined
  /**
    * The open identity claims, with any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
    */
  var claims: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
    */
  var clientStatus: js.UndefOr[Integer] = js.undefined
  /**
    * The execution latency of the test authorizer request.
    */
  var latency: js.UndefOr[Long] = js.undefined
  /**
    * The API Gateway execution log for the test authorizer request.
    */
  var log: js.UndefOr[String] = js.undefined
  /**
    * The JSON policy document returned by the Authorizer
    */
  var policy: js.UndefOr[String] = js.undefined
  /**
    * The principal identity returned by the Authorizer
    */
  var principalId: js.UndefOr[String] = js.undefined
}

object TestInvokeAuthorizerResponse {
  @scala.inline
  def apply(
    authorization: MapOfStringToList = null,
    claims: MapOfStringToString = null,
    clientStatus: Int | scala.Double = null,
    latency: Int | scala.Double = null,
    log: String = null,
    policy: String = null,
    principalId: String = null
  ): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (claims != null) __obj.updateDynamic("claims")(claims)
    if (clientStatus != null) __obj.updateDynamic("clientStatus")(clientStatus.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (principalId != null) __obj.updateDynamic("principalId")(principalId)
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
}

