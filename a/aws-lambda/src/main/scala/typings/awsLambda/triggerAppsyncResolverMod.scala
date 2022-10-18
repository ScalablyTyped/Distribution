package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.AccountId
import typings.awsLambda.anon.FieldName
import typings.awsLambda.anon.HeadersAppSyncResolverEventHeaders
import typings.awsLambda.anon.Result
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerAppsyncResolverMod {
  
  trait AppSyncAuthorizerEvent extends StObject {
    
    var authorizationToken: String
    
    var requestContext: AccountId
  }
  object AppSyncAuthorizerEvent {
    
    inline def apply(authorizationToken: String, requestContext: AccountId): AppSyncAuthorizerEvent = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncAuthorizerEvent]
    }
    
    extension [Self <: AppSyncAuthorizerEvent](x: Self) {
      
      inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      inline def setRequestContext(value: AccountId): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    }
  }
  
  type AppSyncAuthorizerHander[TResolverContext] = AppSyncAuthorizerHandler[TResolverContext]
  
  type AppSyncAuthorizerHandler[TResolverContext] = Handler[AppSyncAuthorizerEvent, AppSyncAuthorizerResult[TResolverContext]]
  
  trait AppSyncAuthorizerResult[TResolverContext] extends StObject {
    
    var deniedFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var isAuthorized: Boolean
    
    var resolverContext: js.UndefOr[TResolverContext] = js.undefined
    
    var ttlOverride: js.UndefOr[Double] = js.undefined
  }
  object AppSyncAuthorizerResult {
    
    inline def apply[TResolverContext](isAuthorized: Boolean): AppSyncAuthorizerResult[TResolverContext] = {
      val __obj = js.Dynamic.literal(isAuthorized = isAuthorized.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncAuthorizerResult[TResolverContext]]
    }
    
    extension [Self <: AppSyncAuthorizerResult[?], TResolverContext](x: Self & AppSyncAuthorizerResult[TResolverContext]) {
      
      inline def setDeniedFields(value: js.Array[String]): Self = StObject.set(x, "deniedFields", value.asInstanceOf[js.Any])
      
      inline def setDeniedFieldsUndefined: Self = StObject.set(x, "deniedFields", js.undefined)
      
      inline def setDeniedFieldsVarargs(value: String*): Self = StObject.set(x, "deniedFields", js.Array(value*))
      
      inline def setIsAuthorized(value: Boolean): Self = StObject.set(x, "isAuthorized", value.asInstanceOf[js.Any])
      
      inline def setResolverContext(value: TResolverContext): Self = StObject.set(x, "resolverContext", value.asInstanceOf[js.Any])
      
      inline def setResolverContextUndefined: Self = StObject.set(x, "resolverContext", js.undefined)
      
      inline def setTtlOverride(value: Double): Self = StObject.set(x, "ttlOverride", value.asInstanceOf[js.Any])
      
      inline def setTtlOverrideUndefined: Self = StObject.set(x, "ttlOverride", js.undefined)
    }
  }
  
  type AppSyncBatchResolverHandler[TArguments, TResult, TSource] = Handler[js.Array[AppSyncResolverEvent[TArguments, TSource]], js.Array[TResult]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityIAM
    - typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityCognito
    - typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityOIDC
    - typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityLambda
    - scala.Unit
    - scala.Null
  */
  type AppSyncIdentity = js.UndefOr[_AppSyncIdentity | Null]
  
  trait AppSyncIdentityCognito
    extends StObject
       with _AppSyncIdentity {
    
    var claims: Any
    
    var defaultAuthStrategy: String
    
    var groups: js.Array[String] | Null
    
    var issuer: String
    
    var sourceIp: js.Array[String]
    
    var sub: String
    
    var username: String
  }
  object AppSyncIdentityCognito {
    
    inline def apply(
      claims: Any,
      defaultAuthStrategy: String,
      issuer: String,
      sourceIp: js.Array[String],
      sub: String,
      username: String
    ): AppSyncIdentityCognito = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], defaultAuthStrategy = defaultAuthStrategy.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], groups = null)
      __obj.asInstanceOf[AppSyncIdentityCognito]
    }
    
    extension [Self <: AppSyncIdentityCognito](x: Self) {
      
      inline def setClaims(value: Any): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setDefaultAuthStrategy(value: String): Self = StObject.set(x, "defaultAuthStrategy", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsNull: Self = StObject.set(x, "groups", null)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setSourceIp(value: js.Array[String]): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setSourceIpVarargs(value: String*): Self = StObject.set(x, "sourceIp", js.Array(value*))
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSyncIdentityIAM
    extends StObject
       with _AppSyncIdentity {
    
    var accountId: String
    
    var cognitoIdentityAuthProvider: String
    
    var cognitoIdentityAuthType: String
    
    var cognitoIdentityId: String
    
    var cognitoIdentityPoolId: String
    
    var sourceIp: js.Array[String]
    
    var userArn: String
    
    var username: String
  }
  object AppSyncIdentityIAM {
    
    inline def apply(
      accountId: String,
      cognitoIdentityAuthProvider: String,
      cognitoIdentityAuthType: String,
      cognitoIdentityId: String,
      cognitoIdentityPoolId: String,
      sourceIp: js.Array[String],
      userArn: String,
      username: String
    ): AppSyncIdentityIAM = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], cognitoIdentityAuthProvider = cognitoIdentityAuthProvider.asInstanceOf[js.Any], cognitoIdentityAuthType = cognitoIdentityAuthType.asInstanceOf[js.Any], cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncIdentityIAM]
    }
    
    extension [Self <: AppSyncIdentityIAM](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityAuthProvider(value: String): Self = StObject.set(x, "cognitoIdentityAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityAuthType(value: String): Self = StObject.set(x, "cognitoIdentityAuthType", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityId(value: String): Self = StObject.set(x, "cognitoIdentityId", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityPoolId(value: String): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
      
      inline def setSourceIp(value: js.Array[String]): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setSourceIpVarargs(value: String*): Self = StObject.set(x, "sourceIp", js.Array(value*))
      
      inline def setUserArn(value: String): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSyncIdentityLambda
    extends StObject
       with _AppSyncIdentity {
    
    var resolverContext: Any
  }
  object AppSyncIdentityLambda {
    
    inline def apply(resolverContext: Any): AppSyncIdentityLambda = {
      val __obj = js.Dynamic.literal(resolverContext = resolverContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncIdentityLambda]
    }
    
    extension [Self <: AppSyncIdentityLambda](x: Self) {
      
      inline def setResolverContext(value: Any): Self = StObject.set(x, "resolverContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSyncIdentityOIDC
    extends StObject
       with _AppSyncIdentity {
    
    var claims: Any
    
    var issuer: String
    
    var sub: String
  }
  object AppSyncIdentityOIDC {
    
    inline def apply(claims: Any, issuer: String, sub: String): AppSyncIdentityOIDC = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncIdentityOIDC]
    }
    
    extension [Self <: AppSyncIdentityOIDC](x: Self) {
      
      inline def setClaims(value: Any): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSyncResolverEvent[TArguments, TSource] extends StObject {
    
    var arguments: TArguments
    
    var identity: js.UndefOr[AppSyncIdentity] = js.undefined
    
    var info: FieldName
    
    var prev: Result | Null
    
    var request: HeadersAppSyncResolverEventHeaders
    
    var source: TSource
    
    var stash: StringDictionary[Any]
  }
  object AppSyncResolverEvent {
    
    inline def apply[TArguments, TSource](
      arguments: TArguments,
      info: FieldName,
      request: HeadersAppSyncResolverEventHeaders,
      source: TSource,
      stash: StringDictionary[Any]
    ): AppSyncResolverEvent[TArguments, TSource] = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stash = stash.asInstanceOf[js.Any], prev = null)
      __obj.asInstanceOf[AppSyncResolverEvent[TArguments, TSource]]
    }
    
    extension [Self <: AppSyncResolverEvent[?, ?], TArguments, TSource](x: Self & (AppSyncResolverEvent[TArguments, TSource])) {
      
      inline def setArguments(value: TArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: AppSyncIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityNull: Self = StObject.set(x, "identity", null)
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInfo(value: FieldName): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Result): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setRequest(value: HeadersAppSyncResolverEventHeaders): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSource(value: TSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStash(value: StringDictionary[Any]): Self = StObject.set(x, "stash", value.asInstanceOf[js.Any])
    }
  }
  
  type AppSyncResolverEventHeaders = StringDictionary[js.UndefOr[String]]
  
  type AppSyncResolverHandler[TArguments, TResult, TSource] = Handler[AppSyncResolverEvent[TArguments, TSource], TResult]
  
  trait _AppSyncIdentity extends StObject
  object _AppSyncIdentity {
    
    inline def AppSyncIdentityCognito(
      claims: Any,
      defaultAuthStrategy: String,
      issuer: String,
      sourceIp: js.Array[String],
      sub: String,
      username: String
    ): typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityCognito = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], defaultAuthStrategy = defaultAuthStrategy.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], groups = null)
      __obj.asInstanceOf[typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityCognito]
    }
    
    inline def AppSyncIdentityIAM(
      accountId: String,
      cognitoIdentityAuthProvider: String,
      cognitoIdentityAuthType: String,
      cognitoIdentityId: String,
      cognitoIdentityPoolId: String,
      sourceIp: js.Array[String],
      userArn: String,
      username: String
    ): typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityIAM = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], cognitoIdentityAuthProvider = cognitoIdentityAuthProvider.asInstanceOf[js.Any], cognitoIdentityAuthType = cognitoIdentityAuthType.asInstanceOf[js.Any], cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityIAM]
    }
    
    inline def AppSyncIdentityLambda(resolverContext: Any): typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityLambda = {
      val __obj = js.Dynamic.literal(resolverContext = resolverContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityLambda]
    }
    
    inline def AppSyncIdentityOIDC(claims: Any, issuer: String, sub: String): typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityOIDC = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.triggerAppsyncResolverMod.AppSyncIdentityOIDC]
    }
  }
}
