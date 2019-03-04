package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayEventRequestContext extends js.Object {
  var accountId: java.lang.String
  var apiId: java.lang.String
  var authorizer: js.UndefOr[AuthResponseContext | scala.Null] = js.undefined
  var connectedAt: js.UndefOr[scala.Double] = js.undefined
  var connectionId: js.UndefOr[java.lang.String] = js.undefined
  var domainName: js.UndefOr[java.lang.String] = js.undefined
  var eventType: js.UndefOr[java.lang.String] = js.undefined
  var extendedRequestId: js.UndefOr[java.lang.String] = js.undefined
  var httpMethod: java.lang.String
  var identity: awsDashLambdaLib.Anon_AccessKey
  var messageDirection: js.UndefOr[java.lang.String] = js.undefined
  var messageId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var path: java.lang.String
  var requestId: java.lang.String
  var requestTime: js.UndefOr[java.lang.String] = js.undefined
  var requestTimeEpoch: scala.Double
  var resourceId: java.lang.String
  var resourcePath: java.lang.String
  var routeKey: js.UndefOr[java.lang.String] = js.undefined
  var stage: java.lang.String
}

object APIGatewayEventRequestContext {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    apiId: java.lang.String,
    httpMethod: java.lang.String,
    identity: awsDashLambdaLib.Anon_AccessKey,
    path: java.lang.String,
    requestId: java.lang.String,
    requestTimeEpoch: scala.Double,
    resourceId: java.lang.String,
    resourcePath: java.lang.String,
    stage: java.lang.String,
    authorizer: AuthResponseContext = null,
    connectedAt: scala.Int | scala.Double = null,
    connectionId: java.lang.String = null,
    domainName: java.lang.String = null,
    eventType: java.lang.String = null,
    extendedRequestId: java.lang.String = null,
    messageDirection: java.lang.String = null,
    messageId: java.lang.String = null,
    requestTime: java.lang.String = null,
    routeKey: java.lang.String = null
  ): APIGatewayEventRequestContext = {
    val __obj = js.Dynamic.literal(accountId = accountId, apiId = apiId, httpMethod = httpMethod, identity = identity, path = path, requestId = requestId, requestTimeEpoch = requestTimeEpoch, resourceId = resourceId, resourcePath = resourcePath, stage = stage)
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer)
    if (connectedAt != null) __obj.updateDynamic("connectedAt")(connectedAt.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (eventType != null) __obj.updateDynamic("eventType")(eventType)
    if (extendedRequestId != null) __obj.updateDynamic("extendedRequestId")(extendedRequestId)
    if (messageDirection != null) __obj.updateDynamic("messageDirection")(messageDirection)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime)
    if (routeKey != null) __obj.updateDynamic("routeKey")(routeKey)
    __obj.asInstanceOf[APIGatewayEventRequestContext]
  }
}

