package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayEventRequestContext extends js.Object {
  var accountId: java.lang.String
  var apiId: java.lang.String
  var authorizer: js.UndefOr[AuthResponseContext | scala.Null] = js.undefined
  var connectedAt: scala.Double
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

