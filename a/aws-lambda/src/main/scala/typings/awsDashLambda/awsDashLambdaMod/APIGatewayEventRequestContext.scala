package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_AccessKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayEventRequestContext extends js.Object {
  var accountId: String
  var apiId: String
  var authorizer: js.UndefOr[AuthResponseContext | Null] = js.undefined
  var connectedAt: js.UndefOr[Double] = js.undefined
  var connectionId: js.UndefOr[String] = js.undefined
  var domainName: js.UndefOr[String] = js.undefined
  var domainPrefix: js.UndefOr[String] = js.undefined
  var eventType: js.UndefOr[String] = js.undefined
  var extendedRequestId: js.UndefOr[String] = js.undefined
  var httpMethod: String
  var identity: Anon_AccessKey
  var messageDirection: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[String | Null] = js.undefined
  var path: String
  var requestId: String
  var requestTime: js.UndefOr[String] = js.undefined
  var requestTimeEpoch: Double
  var resourceId: String
  var resourcePath: String
  var routeKey: js.UndefOr[String] = js.undefined
  var stage: String
}

object APIGatewayEventRequestContext {
  @scala.inline
  def apply(
    accountId: String,
    apiId: String,
    httpMethod: String,
    identity: Anon_AccessKey,
    path: String,
    requestId: String,
    requestTimeEpoch: Double,
    resourceId: String,
    resourcePath: String,
    stage: String,
    authorizer: AuthResponseContext = null,
    connectedAt: Int | Double = null,
    connectionId: String = null,
    domainName: String = null,
    domainPrefix: String = null,
    eventType: String = null,
    extendedRequestId: String = null,
    messageDirection: String = null,
    messageId: String = null,
    requestTime: String = null,
    routeKey: String = null
  ): APIGatewayEventRequestContext = {
    val __obj = js.Dynamic.literal(accountId = accountId, apiId = apiId, httpMethod = httpMethod, identity = identity, path = path, requestId = requestId, requestTimeEpoch = requestTimeEpoch, resourceId = resourceId, resourcePath = resourcePath, stage = stage)
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer)
    if (connectedAt != null) __obj.updateDynamic("connectedAt")(connectedAt.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (domainPrefix != null) __obj.updateDynamic("domainPrefix")(domainPrefix)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    if (extendedRequestId != null) __obj.updateDynamic("extendedRequestId")(extendedRequestId)
    if (messageDirection != null) __obj.updateDynamic("messageDirection")(messageDirection)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime)
    if (routeKey != null) __obj.updateDynamic("routeKey")(routeKey)
    __obj.asInstanceOf[APIGatewayEventRequestContext]
  }
}

