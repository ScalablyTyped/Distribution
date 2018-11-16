package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait APIGatewayEventRequestContext extends js.Object {
  var accountId: java.lang.String
  var apiId: java.lang.String
  var authorizer: js.UndefOr[AuthResponseContext | scala.Null] = js.undefined
  var httpMethod: java.lang.String
  var identity: awsDashLambdaLib.Anon_CognitoIdentityPoolId
  var path: java.lang.String
  var requestId: java.lang.String
  var requestTimeEpoch: scala.Double
  var resourceId: java.lang.String
  var resourcePath: java.lang.String
  var stage: java.lang.String
}

