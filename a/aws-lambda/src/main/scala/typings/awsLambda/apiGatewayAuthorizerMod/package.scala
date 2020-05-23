package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayAuthorizerMod {
  type APIGatewayAuthorizerCallback = typings.awsLambda.handlerMod.Callback[typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult]
  type APIGatewayAuthorizerHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayAuthorizerWithContextCallback[TAuthorizerContext /* <: typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typings.awsLambda.handlerMod.Callback[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayAuthorizerWithContextHandler[TAuthorizerContext /* <: typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayRequestAuthorizerHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext /* <: typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayTokenAuthorizerHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext /* <: typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type AuthResponse = typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  type AuthResponseContext = typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
  type Condition = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ConditionBlock = org.scalablytyped.runtime.StringDictionary[
    typings.awsLambda.apiGatewayAuthorizerMod.Condition | js.Array[typings.awsLambda.apiGatewayAuthorizerMod.Condition]
  ]
  type CustomAuthorizerCallback = typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerCallback
  type CustomAuthorizerHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type CustomAuthorizerResult = typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  type PrincipalValue = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) | java.lang.String | js.Array[java.lang.String]
  type Statement = typings.awsLambda.apiGatewayAuthorizerMod.BaseStatement with typings.awsLambda.apiGatewayAuthorizerMod.StatementAction with (typings.awsLambda.apiGatewayAuthorizerMod.StatementResource | typings.awsLambda.apiGatewayAuthorizerMod.StatementPrincipal)
  type StatementPrincipal = typings.awsLambda.apiGatewayAuthorizerMod.MaybeStatementResource with (typings.awsLambda.anon.Principal | typings.awsLambda.anon.NotPrincipal)
  type StatementResource = typings.awsLambda.apiGatewayAuthorizerMod.MaybeStatementPrincipal with (typings.awsLambda.anon.Resource | typings.awsLambda.anon.NotResource)
}
