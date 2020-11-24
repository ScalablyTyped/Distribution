package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiGatewayProxyMod {
  
  type APIGatewayEvent = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
  
  type APIGatewayProxyCallback = typings.awsLambda.handlerMod.Callback[typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult]
  
  type APIGatewayProxyCallbackV2 = typings.awsLambda.handlerMod.Callback[typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResultV2[scala.Nothing]]
  
  type APIGatewayProxyEvent = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext]
  
  type APIGatewayProxyHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent, 
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  
  type APIGatewayProxyHandlerV2[T] = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventV2, 
    typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResultV2[T]
  ]
  
  type APIGatewayProxyResultV2[T] = typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyStructuredResultV2 | java.lang.String | T
  
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
