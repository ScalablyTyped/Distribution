package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeAuthorizerResponse extends js.Object {
  var authorization: js.UndefOr[MapOfStringToList] = js.native
  /**
    * The open identity claims, with any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
    */
  var claims: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
    */
  var clientStatus: js.UndefOr[Integer] = js.native
  /**
    * The execution latency of the test authorizer request.
    */
  var latency: js.UndefOr[Long] = js.native
  /**
    * The API Gateway execution log for the test authorizer request.
    */
  var log: js.UndefOr[String] = js.native
  /**
    * The JSON policy document returned by the Authorizer
    */
  var policy: js.UndefOr[String] = js.native
  /**
    * The principal identity returned by the Authorizer
    */
  var principalId: js.UndefOr[String] = js.native
}

object TestInvokeAuthorizerResponse {
  @scala.inline
  def apply(
    authorization: MapOfStringToList = null,
    claims: MapOfStringToString = null,
    clientStatus: js.UndefOr[Integer] = js.undefined,
    latency: js.UndefOr[Long] = js.undefined,
    log: String = null,
    policy: String = null,
    principalId: String = null
  ): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (!js.isUndefined(clientStatus)) __obj.updateDynamic("clientStatus")(clientStatus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (principalId != null) __obj.updateDynamic("principalId")(principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
}

