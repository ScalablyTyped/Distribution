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
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], requestTimeEpoch = requestTimeEpoch.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    if (connectedAt != null) __obj.updateDynamic("connectedAt")(connectedAt.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainPrefix != null) __obj.updateDynamic("domainPrefix")(domainPrefix.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (extendedRequestId != null) __obj.updateDynamic("extendedRequestId")(extendedRequestId.asInstanceOf[js.Any])
    if (messageDirection != null) __obj.updateDynamic("messageDirection")(messageDirection.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime.asInstanceOf[js.Any])
    if (routeKey != null) __obj.updateDynamic("routeKey")(routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEventRequestContext]
  }
}

