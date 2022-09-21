package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthResourceConfig extends StObject {
  
  /**
    * Defines whether you want to configure only authentication or both authentication and authorization settings.
    */
  var AuthResources: typings.awsSdk.amplifybackendMod.AuthResources
  
  /**
    * Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of your auth resource in the Amplify project.
    */
  var IdentityPoolConfigs: js.UndefOr[CreateBackendAuthIdentityPoolConfig] = js.undefined
  
  /**
    * Defines the service name to use when configuring an authentication resource in your Amplify project.
    */
  var Service: typings.awsSdk.amplifybackendMod.Service
  
  /**
    * Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your auth resource in the Amplify project.
    */
  var UserPoolConfigs: CreateBackendAuthUserPoolConfig
}
object CreateBackendAuthResourceConfig {
  
  inline def apply(AuthResources: AuthResources, Service: Service, UserPoolConfigs: CreateBackendAuthUserPoolConfig): CreateBackendAuthResourceConfig = {
    val __obj = js.Dynamic.literal(AuthResources = AuthResources.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any], UserPoolConfigs = UserPoolConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthResourceConfig]
  }
  
  extension [Self <: CreateBackendAuthResourceConfig](x: Self) {
    
    inline def setAuthResources(value: AuthResources): Self = StObject.set(x, "AuthResources", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolConfigs(value: CreateBackendAuthIdentityPoolConfig): Self = StObject.set(x, "IdentityPoolConfigs", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolConfigsUndefined: Self = StObject.set(x, "IdentityPoolConfigs", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setUserPoolConfigs(value: CreateBackendAuthUserPoolConfig): Self = StObject.set(x, "UserPoolConfigs", value.asInstanceOf[js.Any])
  }
}
