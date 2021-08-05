package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.NotPrincipal
import typings.awsLambda.anon.NotResource
import typings.awsLambda.anon.Principal
import typings.awsLambda.anon.Resource
import typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.awsLambdaStrings.REQUEST
import typings.awsLambda.awsLambdaStrings.TOKEN
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayAuthorizerMod {
  
  type APIGatewayAuthorizerCallback = Callback[APIGatewayAuthorizerResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
    - typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
  */
  trait APIGatewayAuthorizerEvent extends StObject
  object APIGatewayAuthorizerEvent {
    
    inline def APIGatewayRequestAuthorizerEvent(
      httpMethod: String,
      methodArn: String,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit],
      resource: String
    ): typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], headers = null, multiValueHeaders = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
      __obj.updateDynamic("type")("REQUEST")
      __obj.asInstanceOf[typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent]
    }
    
    inline def APIGatewayTokenAuthorizerEvent(authorizationToken: String, methodArn: String): typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TOKEN")
      __obj.asInstanceOf[typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent]
    }
  }
  
  type APIGatewayAuthorizerHandler = Handler[APIGatewayAuthorizerEvent, APIGatewayAuthorizerResult]
  
  trait APIGatewayAuthorizerResult extends StObject {
    
    var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.undefined
    
    var policyDocument: PolicyDocument
    
    var principalId: String
    
    var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
  }
  object APIGatewayAuthorizerResult {
    
    inline def apply(policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerResult = {
      val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayAuthorizerResult]
    }
    
    extension [Self <: APIGatewayAuthorizerResult](x: Self) {
      
      inline def setContext(value: APIGatewayAuthorizerResultContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
      
      inline def setUsageIdentifierKey(value: String): Self = StObject.set(x, "usageIdentifierKey", value.asInstanceOf[js.Any])
      
      inline def setUsageIdentifierKeyNull: Self = StObject.set(x, "usageIdentifierKey", null)
      
      inline def setUsageIdentifierKeyUndefined: Self = StObject.set(x, "usageIdentifierKey", js.undefined)
    }
  }
  
  type APIGatewayAuthorizerWithContextCallback[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Callback[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  
  type APIGatewayAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
    APIGatewayAuthorizerEvent, 
    APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  
  trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] extends StObject {
    
    var context: TAuthorizerContext
    
    var policyDocument: PolicyDocument
    
    var principalId: String
    
    var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
  }
  object APIGatewayAuthorizerWithContextResult {
    
    inline def apply[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */](context: TAuthorizerContext, policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
    }
    
    extension [Self <: APIGatewayAuthorizerWithContextResult[?], TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */](x: Self & APIGatewayAuthorizerWithContextResult[TAuthorizerContext]) {
      
      inline def setContext(value: TAuthorizerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
      
      inline def setUsageIdentifierKey(value: String): Self = StObject.set(x, "usageIdentifierKey", value.asInstanceOf[js.Any])
      
      inline def setUsageIdentifierKeyNull: Self = StObject.set(x, "usageIdentifierKey", null)
      
      inline def setUsageIdentifierKeyUndefined: Self = StObject.set(x, "usageIdentifierKey", js.undefined)
    }
  }
  
  trait APIGatewayRequestAuthorizerEvent
    extends StObject
       with APIGatewayAuthorizerEvent {
    
    var headers: StringDictionary[String] | Null
    
    var httpMethod: String
    
    var methodArn: String
    
    var multiValueHeaders: StringDictionary[js.Array[String]] | Null
    
    var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null
    
    var path: String
    
    var pathParameters: StringDictionary[String] | Null
    
    var queryStringParameters: StringDictionary[String] | Null
    
    var requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit]
    
    var resource: String
    
    var stageVariables: StringDictionary[String] | Null
    
    var `type`: REQUEST
  }
  object APIGatewayRequestAuthorizerEvent {
    
    inline def apply(
      httpMethod: String,
      methodArn: String,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit],
      resource: String
    ): APIGatewayRequestAuthorizerEvent = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], headers = null, multiValueHeaders = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
      __obj.updateDynamic("type")("REQUEST")
      __obj.asInstanceOf[APIGatewayRequestAuthorizerEvent]
    }
    
    extension [Self <: APIGatewayRequestAuthorizerEvent](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeadersNull: Self = StObject.set(x, "multiValueHeaders", null)
      
      inline def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      inline def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      inline def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[Unit]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      inline def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
      
      inline def setType(value: REQUEST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayRequestAuthorizerHandler = Handler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerResult]
  
  type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
    APIGatewayRequestAuthorizerEvent, 
    APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  
  trait APIGatewayTokenAuthorizerEvent
    extends StObject
       with APIGatewayAuthorizerEvent {
    
    var authorizationToken: String
    
    var methodArn: String
    
    var `type`: TOKEN
  }
  object APIGatewayTokenAuthorizerEvent {
    
    inline def apply(authorizationToken: String, methodArn: String): APIGatewayTokenAuthorizerEvent = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("TOKEN")
      __obj.asInstanceOf[APIGatewayTokenAuthorizerEvent]
    }
    
    extension [Self <: APIGatewayTokenAuthorizerEvent](x: Self) {
      
      inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      inline def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
      
      inline def setType(value: TOKEN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayTokenAuthorizerHandler = Handler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerResult]
  
  type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
    APIGatewayTokenAuthorizerEvent, 
    APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  
  type AuthResponse = APIGatewayAuthorizerResult
  
  type AuthResponseContext = APIGatewayAuthorizerResultContext
  
  trait BaseStatement extends StObject {
    
    var Condition: js.UndefOr[ConditionBlock] = js.undefined
    
    var Effect: String
    
    var Sid: js.UndefOr[String] = js.undefined
  }
  object BaseStatement {
    
    inline def apply(Effect: String): BaseStatement = {
      val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseStatement]
    }
    
    extension [Self <: BaseStatement](x: Self) {
      
      inline def setCondition(value: ConditionBlock): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      inline def setEffect(value: String): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
    }
  }
  
  type Condition = StringDictionary[String | js.Array[String]]
  
  type ConditionBlock = StringDictionary[Condition | js.Array[Condition]]
  
  type CustomAuthorizerCallback = APIGatewayAuthorizerCallback
  
  trait CustomAuthorizerEvent extends StObject {
    
    var apiId: js.UndefOr[String] = js.undefined
    
    var authorizationToken: js.UndefOr[String] = js.undefined
    
    var domainName: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var httpMethod: js.UndefOr[String] = js.undefined
    
    var methodArn: String
    
    var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
    
    var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
    
    var requestContext: js.UndefOr[
        APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
      ] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var stageVariables: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: String
  }
  object CustomAuthorizerEvent {
    
    inline def apply(methodArn: String, `type`: String): CustomAuthorizerEvent = {
      val __obj = js.Dynamic.literal(methodArn = methodArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAuthorizerEvent]
    }
    
    extension [Self <: CustomAuthorizerEvent](x: Self) {
      
      inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      inline def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      inline def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      inline def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      inline def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setRequestContextUndefined: Self = StObject.set(x, "requestContext", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomAuthorizerHandler = Handler[CustomAuthorizerEvent, APIGatewayAuthorizerResult]
  
  type CustomAuthorizerResult = APIGatewayAuthorizerResult
  
  trait MaybeStatementPrincipal extends StObject {
    
    var NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
    
    var Principal: js.UndefOr[PrincipalValue] = js.undefined
  }
  object MaybeStatementPrincipal {
    
    inline def apply(): MaybeStatementPrincipal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaybeStatementPrincipal]
    }
    
    extension [Self <: MaybeStatementPrincipal](x: Self) {
      
      inline def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
      
      inline def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
      
      inline def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value :_*))
      
      inline def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
      
      inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
      
      inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value :_*))
    }
  }
  
  trait MaybeStatementResource extends StObject {
    
    var NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var Resource: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object MaybeStatementResource {
    
    inline def apply(): MaybeStatementResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaybeStatementResource]
    }
    
    extension [Self <: MaybeStatementResource](x: Self) {
      
      inline def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
      
      inline def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
      
      inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
      
      inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
      
      inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value :_*))
    }
  }
  
  trait PolicyDocument extends StObject {
    
    var Id: js.UndefOr[String] = js.undefined
    
    var Statement: js.Array[typings.awsLambda.apiGatewayAuthorizerMod.Statement]
    
    var Version: String
  }
  object PolicyDocument {
    
    inline def apply(Statement: js.Array[Statement], Version: String): PolicyDocument = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyDocument]
    }
    
    extension [Self <: PolicyDocument](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setStatement(value: js.Array[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      inline def setStatementVarargs(value: Statement*): Self = StObject.set(x, "Statement", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  type PrincipalValue = (StringDictionary[String | js.Array[String]]) | String | js.Array[String]
  
  type Statement = BaseStatement & StatementAction & (StatementResource | StatementPrincipal)
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.anon.`0`
    - typings.awsLambda.anon.NotAction
  */
  trait StatementAction extends StObject
  object StatementAction {
    
    inline def `0`(Action: String | js.Array[String]): typings.awsLambda.anon.`0` = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.`0`]
    }
    
    inline def NotAction(NotAction: String | js.Array[String]): typings.awsLambda.anon.NotAction = {
      val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.NotAction]
    }
  }
  
  type StatementPrincipal = MaybeStatementResource & (Principal | NotPrincipal)
  
  type StatementResource = MaybeStatementPrincipal & (Resource | NotResource)
}
