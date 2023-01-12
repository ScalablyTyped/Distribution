package typings.awsLambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[js.Error | String | Null], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  
  trait ClientContext extends StObject {
    
    var Custom: js.UndefOr[Any] = js.undefined
    
    var client: ClientContextClient
    
    var env: ClientContextEnv
  }
  object ClientContext {
    
    inline def apply(client: ClientContextClient, env: ClientContextEnv): ClientContext = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientContext] (val x: Self) extends AnyVal {
      
      inline def setClient(value: ClientContextClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setCustom(value: Any): Self = StObject.set(x, "Custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "Custom", js.undefined)
      
      inline def setEnv(value: ClientContextEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientContextClient extends StObject {
    
    var appPackageName: String
    
    var appTitle: String
    
    var appVersionCode: String
    
    var appVersionName: String
    
    var installationId: String
  }
  object ClientContextClient {
    
    inline def apply(
      appPackageName: String,
      appTitle: String,
      appVersionCode: String,
      appVersionName: String,
      installationId: String
    ): ClientContextClient = {
      val __obj = js.Dynamic.literal(appPackageName = appPackageName.asInstanceOf[js.Any], appTitle = appTitle.asInstanceOf[js.Any], appVersionCode = appVersionCode.asInstanceOf[js.Any], appVersionName = appVersionName.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientContextClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientContextClient] (val x: Self) extends AnyVal {
      
      inline def setAppPackageName(value: String): Self = StObject.set(x, "appPackageName", value.asInstanceOf[js.Any])
      
      inline def setAppTitle(value: String): Self = StObject.set(x, "appTitle", value.asInstanceOf[js.Any])
      
      inline def setAppVersionCode(value: String): Self = StObject.set(x, "appVersionCode", value.asInstanceOf[js.Any])
      
      inline def setAppVersionName(value: String): Self = StObject.set(x, "appVersionName", value.asInstanceOf[js.Any])
      
      inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientContextEnv extends StObject {
    
    var locale: String
    
    var make: String
    
    var model: String
    
    var platform: String
    
    var platformVersion: String
  }
  object ClientContextEnv {
    
    inline def apply(locale: String, make: String, model: String, platform: String, platformVersion: String): ClientContextEnv = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientContextEnv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientContextEnv] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMake(value: String): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait CognitoIdentity extends StObject {
    
    var cognitoIdentityId: String
    
    var cognitoIdentityPoolId: String
  }
  object CognitoIdentity {
    
    inline def apply(cognitoIdentityId: String, cognitoIdentityPoolId: String): CognitoIdentity = {
      val __obj = js.Dynamic.literal(cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoIdentity] (val x: Self) extends AnyVal {
      
      inline def setCognitoIdentityId(value: String): Self = StObject.set(x, "cognitoIdentityId", value.asInstanceOf[js.Any])
      
      inline def setCognitoIdentityPoolId(value: String): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    var awsRequestId: String = js.native
    
    var callbackWaitsForEmptyEventLoop: Boolean = js.native
    
    var clientContext: js.UndefOr[ClientContext] = js.native
    
    // Functions for compatibility with earlier Node.js Runtime v0.10.42
    // No longer documented, so they are deprecated, but they still work
    // as of the 12.x runtime, so they are not removed from the types.
    /** @deprecated Use handler callback or promise result */
    def done(): Unit = js.native
    def done(error: js.Error): Unit = js.native
    def done(error: js.Error, result: Any): Unit = js.native
    def done(error: Unit, result: Any): Unit = js.native
    
    def fail(error: String): Unit = js.native
    /** @deprecated Use handler callback with first argument or reject a promise result */
    def fail(error: js.Error): Unit = js.native
    
    var functionName: String = js.native
    
    var functionVersion: String = js.native
    
    def getRemainingTimeInMillis(): Double = js.native
    
    var identity: js.UndefOr[CognitoIdentity] = js.native
    
    var invokedFunctionArn: String = js.native
    
    var logGroupName: String = js.native
    
    var logStreamName: String = js.native
    
    var memoryLimitInMB: String = js.native
    
    /** @deprecated Use handler callback with second argument or resolve a promise result */
    def succeed(messageOrObject: Any): Unit = js.native
    // Unclear what behavior this is supposed to have, I couldn't find any still extant reference,
    // and it behaves like the above, ignoring the object parameter.
    /** @deprecated Use handler callback or promise result */
    def succeed(message: String, `object`: Any): Unit = js.native
  }
  
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | js.Promise[TResult]
  ]
}
