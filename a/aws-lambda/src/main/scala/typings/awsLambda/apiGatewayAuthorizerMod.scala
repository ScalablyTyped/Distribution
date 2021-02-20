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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayAuthorizerMod {
  
  type APIGatewayAuthorizerCallback = Callback[APIGatewayAuthorizerResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
    - typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
  */
  trait APIGatewayAuthorizerEvent extends StObject
  object APIGatewayAuthorizerEvent {
    
    @scala.inline
    def APIGatewayRequestAuthorizerEvent(
      httpMethod: String,
      methodArn: String,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
      resource: String,
      `type`: REQUEST
    ): typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent]
    }
    
    @scala.inline
    def APIGatewayTokenAuthorizerEvent(authorizationToken: String, methodArn: String, `type`: TOKEN): typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent]
    }
  }
  
  type APIGatewayAuthorizerHandler = Handler[APIGatewayAuthorizerEvent, APIGatewayAuthorizerResult]
  
  @js.native
  trait APIGatewayAuthorizerResult extends StObject {
    
    var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.native
    
    var policyDocument: PolicyDocument = js.native
    
    var principalId: String = js.native
    
    var usageIdentifierKey: js.UndefOr[String | Null] = js.native
  }
  object APIGatewayAuthorizerResult {
    
    @scala.inline
    def apply(policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerResult = {
      val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayAuthorizerResult]
    }
    
    @scala.inline
    implicit class APIGatewayAuthorizerResultMutableBuilder[Self <: APIGatewayAuthorizerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: APIGatewayAuthorizerResultContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextNull: Self = StObject.set(x, "context", null)
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageIdentifierKey(value: String): Self = StObject.set(x, "usageIdentifierKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageIdentifierKeyNull: Self = StObject.set(x, "usageIdentifierKey", null)
      
      @scala.inline
      def setUsageIdentifierKeyUndefined: Self = StObject.set(x, "usageIdentifierKey", js.undefined)
    }
  }
  
  type APIGatewayAuthorizerWithContextCallback[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Callback[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  
  type APIGatewayAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
    APIGatewayAuthorizerEvent, 
    APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  
  @js.native
  trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] extends StObject {
    
    var context: TAuthorizerContext = js.native
    
    var policyDocument: PolicyDocument = js.native
    
    var principalId: String = js.native
    
    var usageIdentifierKey: js.UndefOr[String | Null] = js.native
  }
  object APIGatewayAuthorizerWithContextResult {
    
    @scala.inline
    def apply[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */](context: TAuthorizerContext, policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
    }
    
    @scala.inline
    implicit class APIGatewayAuthorizerWithContextResultMutableBuilder[Self <: APIGatewayAuthorizerWithContextResult[_], TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] (val x: Self with APIGatewayAuthorizerWithContextResult[TAuthorizerContext]) extends AnyVal {
      
      @scala.inline
      def setContext(value: TAuthorizerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageIdentifierKey(value: String): Self = StObject.set(x, "usageIdentifierKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageIdentifierKeyNull: Self = StObject.set(x, "usageIdentifierKey", null)
      
      @scala.inline
      def setUsageIdentifierKeyUndefined: Self = StObject.set(x, "usageIdentifierKey", js.undefined)
    }
  }
  
  @js.native
  trait APIGatewayRequestAuthorizerEvent extends APIGatewayAuthorizerEvent {
    
    var headers: StringDictionary[String] | Null = js.native
    
    var httpMethod: String = js.native
    
    var methodArn: String = js.native
    
    var multiValueHeaders: StringDictionary[js.Array[String]] | Null = js.native
    
    var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null = js.native
    
    var path: String = js.native
    
    var pathParameters: StringDictionary[String] | Null = js.native
    
    var queryStringParameters: StringDictionary[String] | Null = js.native
    
    var requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]] = js.native
    
    var resource: String = js.native
    
    var stageVariables: StringDictionary[String] | Null = js.native
    
    var `type`: REQUEST = js.native
  }
  object APIGatewayRequestAuthorizerEvent {
    
    @scala.inline
    def apply(
      httpMethod: String,
      methodArn: String,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
      resource: String,
      `type`: REQUEST
    ): APIGatewayRequestAuthorizerEvent = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayRequestAuthorizerEvent]
    }
    
    @scala.inline
    implicit class APIGatewayRequestAuthorizerEventMutableBuilder[Self <: APIGatewayRequestAuthorizerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeadersNull: Self = StObject.set(x, "multiValueHeaders", null)
      
      @scala.inline
      def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      @scala.inline
      def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
      
      @scala.inline
      def setType(value: REQUEST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayRequestAuthorizerHandler = Handler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerResult]
  
  type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
    APIGatewayRequestAuthorizerEvent, 
    APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  
  @js.native
  trait APIGatewayTokenAuthorizerEvent extends APIGatewayAuthorizerEvent {
    
    var authorizationToken: String = js.native
    
    var methodArn: String = js.native
    
    var `type`: TOKEN = js.native
  }
  object APIGatewayTokenAuthorizerEvent {
    
    @scala.inline
    def apply(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayTokenAuthorizerEvent = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayTokenAuthorizerEvent]
    }
    
    @scala.inline
    implicit class APIGatewayTokenAuthorizerEventMutableBuilder[Self <: APIGatewayTokenAuthorizerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TOKEN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayTokenAuthorizerHandler = Handler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerResult]
  
  type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] = Handler[
    APIGatewayTokenAuthorizerEvent, 
    APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  
  type AuthResponse = APIGatewayAuthorizerResult
  
  type AuthResponseContext = APIGatewayAuthorizerResultContext
  
  @js.native
  trait BaseStatement extends StObject {
    
    var Condition: js.UndefOr[ConditionBlock] = js.native
    
    var Effect: String = js.native
    
    var Sid: js.UndefOr[String] = js.native
  }
  object BaseStatement {
    
    @scala.inline
    def apply(Effect: String): BaseStatement = {
      val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseStatement]
    }
    
    @scala.inline
    implicit class BaseStatementMutableBuilder[Self <: BaseStatement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: ConditionBlock): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      @scala.inline
      def setEffect(value: String): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
    }
  }
  
  type Condition = StringDictionary[String | js.Array[String]]
  
  type ConditionBlock = StringDictionary[Condition | js.Array[Condition]]
  
  type CustomAuthorizerCallback = APIGatewayAuthorizerCallback
  
  @js.native
  trait CustomAuthorizerEvent extends StObject {
    
    var apiId: js.UndefOr[String] = js.native
    
    var authorizationToken: js.UndefOr[String] = js.native
    
    var domainName: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var httpMethod: js.UndefOr[String] = js.native
    
    var methodArn: String = js.native
    
    var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var requestContext: js.UndefOr[
        APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
      ] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var stageVariables: js.UndefOr[StringDictionary[String]] = js.native
    
    var `type`: String = js.native
  }
  object CustomAuthorizerEvent {
    
    @scala.inline
    def apply(methodArn: String, `type`: String): CustomAuthorizerEvent = {
      val __obj = js.Dynamic.literal(methodArn = methodArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAuthorizerEvent]
    }
    
    @scala.inline
    implicit class CustomAuthorizerEventMutableBuilder[Self <: CustomAuthorizerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      @scala.inline
      def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      @scala.inline
      def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      @scala.inline
      def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      @scala.inline
      def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      @scala.inline
      def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestContextUndefined: Self = StObject.set(x, "requestContext", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomAuthorizerHandler = Handler[CustomAuthorizerEvent, APIGatewayAuthorizerResult]
  
  type CustomAuthorizerResult = APIGatewayAuthorizerResult
  
  @js.native
  trait MaybeStatementPrincipal extends StObject {
    
    var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
    
    var Principal: js.UndefOr[PrincipalValue] = js.native
  }
  object MaybeStatementPrincipal {
    
    @scala.inline
    def apply(): MaybeStatementPrincipal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaybeStatementPrincipal]
    }
    
    @scala.inline
    implicit class MaybeStatementPrincipalMutableBuilder[Self <: MaybeStatementPrincipal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
      
      @scala.inline
      def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value :_*))
      
      @scala.inline
      def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
      
      @scala.inline
      def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MaybeStatementResource extends StObject {
    
    var NotResource: js.UndefOr[String | js.Array[String]] = js.native
    
    var Resource: js.UndefOr[String | js.Array[String]] = js.native
  }
  object MaybeStatementResource {
    
    @scala.inline
    def apply(): MaybeStatementResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaybeStatementResource]
    }
    
    @scala.inline
    implicit class MaybeStatementResourceMutableBuilder[Self <: MaybeStatementResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
      
      @scala.inline
      def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
      
      @scala.inline
      def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
      
      @scala.inline
      def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PolicyDocument extends StObject {
    
    var Id: js.UndefOr[String] = js.native
    
    var Statement: js.Array[typings.awsLambda.apiGatewayAuthorizerMod.Statement] = js.native
    
    var Version: String = js.native
  }
  object PolicyDocument {
    
    @scala.inline
    def apply(Statement: js.Array[Statement], Version: String): PolicyDocument = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyDocument]
    }
    
    @scala.inline
    implicit class PolicyDocumentMutableBuilder[Self <: PolicyDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setStatement(value: js.Array[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementVarargs(value: Statement*): Self = StObject.set(x, "Statement", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  type PrincipalValue = (StringDictionary[String | js.Array[String]]) | String | js.Array[String]
  
  type Statement = BaseStatement with StatementAction with (StatementResource | StatementPrincipal)
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.anon.`0`
    - typings.awsLambda.anon.NotAction
  */
  trait StatementAction extends StObject
  object StatementAction {
    
    @scala.inline
    def `0`(Action: String | js.Array[String]): typings.awsLambda.anon.`0` = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.`0`]
    }
    
    @scala.inline
    def NotAction(NotAction: String | js.Array[String]): typings.awsLambda.anon.NotAction = {
      val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.NotAction]
    }
  }
  
  type StatementPrincipal = MaybeStatementResource with (Principal | NotPrincipal)
  
  type StatementResource = MaybeStatementPrincipal with (Resource | NotResource)
}
