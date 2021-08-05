package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.FieldName
import typings.awsLambda.anon.Headers
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsyncResolverMod {
  
  trait AppSyncIdentityCognito extends StObject {
    
    var claims: js.Any
    
    var defaultAuthStrategy: String
    
    var issuer: String
    
    var sourceIp: js.Array[String]
    
    var sub: String
    
    var username: String
  }
  object AppSyncIdentityCognito {
    
    inline def apply(
      claims: js.Any,
      defaultAuthStrategy: String,
      issuer: String,
      sourceIp: js.Array[String],
      sub: String,
      username: String
    ): AppSyncIdentityCognito = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], defaultAuthStrategy = defaultAuthStrategy.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncIdentityCognito]
    }
    
    extension [Self <: AppSyncIdentityCognito](x: Self) {
      
      inline def setClaims(value: js.Any): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setDefaultAuthStrategy(value: String): Self = StObject.set(x, "defaultAuthStrategy", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setSourceIp(value: js.Array[String]): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setSourceIpVarargs(value: String*): Self = StObject.set(x, "sourceIp", js.Array(value :_*))
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSyncIdentityIAM extends StObject {
    
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
      
      inline def setSourceIpVarargs(value: String*): Self = StObject.set(x, "sourceIp", js.Array(value :_*))
      
      inline def setUserArn(value: String): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSyncResolverEvent[T] extends StObject {
    
    var arguments: T
    
    var identity: js.UndefOr[AppSyncIdentityIAM | AppSyncIdentityCognito] = js.undefined
    
    var info: FieldName
    
    var request: Headers
    
    var source: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object AppSyncResolverEvent {
    
    inline def apply[T](arguments: T, info: FieldName, request: Headers): AppSyncResolverEvent[T] = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncResolverEvent[T]]
    }
    
    extension [Self <: AppSyncResolverEvent[?], T](x: Self & AppSyncResolverEvent[T]) {
      
      inline def setArguments(value: T): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: AppSyncIdentityIAM | AppSyncIdentityCognito): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInfo(value: FieldName): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Headers): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSource(value: StringDictionary[js.Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type AppSyncResolverHandler[T, V] = Handler[AppSyncResolverEvent[T], V | js.Array[V]]
}
