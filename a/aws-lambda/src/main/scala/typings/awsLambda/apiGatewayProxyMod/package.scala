package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayProxyMod {
  type APIGatewayEvent = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
  type APIGatewayProxyCallback = typings.awsLambda.handlerMod.Callback[typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult]
  type APIGatewayProxyEvent = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext]
  type APIGatewayProxyHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent, 
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type APIGatewayProxyWithCognitoAuthorizerEvent = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyCognitoAuthorizer]
  type APIGatewayProxyWithCognitoAuthorizerHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyWithCognitoAuthorizerEvent, 
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext] = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]
  ]
  type APIGatewayProxyWithLambdaAuthorizerEventRequestContext[TAuthorizerContext] = typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]
  ]
  type APIGatewayProxyWithLambdaAuthorizerHandler[TAuthorizerContext] = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext], 
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type ProxyCallback = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyCallback
  type ProxyHandler = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyHandler
  type ProxyResult = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
}
