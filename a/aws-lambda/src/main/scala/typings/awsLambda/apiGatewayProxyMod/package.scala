package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayProxyMod {
  type APIGatewayEvent = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
  type APIGatewayProxyCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult]
  type APIGatewayProxyHandler = typings.awsLambda.handerMod.Handler[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent, 
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type ProxyCallback = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyCallback
  type ProxyHandler = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyHandler
  type ProxyResult = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
}
