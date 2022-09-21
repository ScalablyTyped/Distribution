package typings.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type APIGatewayAuthorizerCallback = Callback[APIGatewayAuthorizerResult]

type APIGatewayAuthorizerHandler = Handler[APIGatewayAuthorizerEvent, APIGatewayAuthorizerResult]

type APIGatewayAuthorizerWithContextCallback[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Callback[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]

type APIGatewayAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
APIGatewayAuthorizerEvent, 
APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]

type APIGatewayRequestAuthorizerEventHeaders = StringDictionary[js.UndefOr[String]]

type APIGatewayRequestAuthorizerEventMultiValueHeaders = StringDictionary[js.UndefOr[js.Array[String]]]

type APIGatewayRequestAuthorizerEventMultiValueQueryStringParameters = StringDictionary[js.UndefOr[js.Array[String]]]

type APIGatewayRequestAuthorizerEventPathParameters = StringDictionary[js.UndefOr[String]]

type APIGatewayRequestAuthorizerEventQueryStringParameters = StringDictionary[js.UndefOr[String]]

type APIGatewayRequestAuthorizerEventStageVariables = StringDictionary[js.UndefOr[String]]

type APIGatewayRequestAuthorizerHandler = Handler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerResult]

type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
APIGatewayRequestAuthorizerEvent, 
APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]

type APIGatewayRequestIAMAuthorizerHandlerV2 = Handler[APIGatewayRequestAuthorizerEventV2, APIGatewayIAMAuthorizerResult]

type APIGatewayRequestIAMAuthorizerV2WithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
APIGatewayRequestAuthorizerEventV2, 
APIGatewayIAMAuthorizerWithContextResult[TAuthorizerContext]]

type APIGatewayRequestSimpleAuthorizerHandlerV2 = Handler[APIGatewayRequestAuthorizerEventV2, APIGatewaySimpleAuthorizerResult]

type APIGatewayRequestSimpleAuthorizerHandlerV2WithContext[TAuthorizerContext] = Handler[
APIGatewayRequestAuthorizerEventV2, 
APIGatewaySimpleAuthorizerWithContextResult[TAuthorizerContext]]

type APIGatewayTokenAuthorizerHandler = Handler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerResult]

type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
APIGatewayTokenAuthorizerEvent, 
APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]

type AuthResponse = APIGatewayAuthorizerResult

type AuthResponseContext = APIGatewayAuthorizerResultContext

type Condition = StringDictionary[String | js.Array[String]]

type ConditionBlock = StringDictionary[Condition | js.Array[Condition]]

type CustomAuthorizerCallback = APIGatewayAuthorizerCallback

type CustomAuthorizerHandler = Handler[CustomAuthorizerEvent, APIGatewayAuthorizerResult]

type CustomAuthorizerResult = APIGatewayAuthorizerResult

type PrincipalValue = (StringDictionary[String | js.Array[String]]) | String | js.Array[String]

type Statement = (StatementResource & BaseStatement & StatementAction) | (StatementPrincipal & BaseStatement & StatementAction)
