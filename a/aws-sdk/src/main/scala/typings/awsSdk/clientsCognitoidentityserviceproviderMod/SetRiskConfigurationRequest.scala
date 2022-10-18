package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRiskConfigurationRequest extends StObject {
  
  /**
    * The account takeover risk configuration.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
  
  /**
    * The app client ID. If ClientId is null, then the risk configuration is mapped to userPoolId. When the client ID is null, the same risk configuration is applied to all the clients in the userPool. Otherwise, ClientId is mapped to the client. When the client ID isn't null, the user pool configuration is overridden and the risk configuration for the client is used instead.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The compromised credentials risk configuration.
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
  
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
  
  /**
    * The user pool ID. 
    */
  var UserPoolId: UserPoolIdType
}
object SetRiskConfigurationRequest {
  
  inline def apply(UserPoolId: UserPoolIdType): SetRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationRequest]
  }
  
  extension [Self <: SetRiskConfigurationRequest](x: Self) {
    
    inline def setAccountTakeoverRiskConfiguration(value: AccountTakeoverRiskConfigurationType): Self = StObject.set(x, "AccountTakeoverRiskConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccountTakeoverRiskConfigurationUndefined: Self = StObject.set(x, "AccountTakeoverRiskConfiguration", js.undefined)
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setCompromisedCredentialsRiskConfiguration(value: CompromisedCredentialsRiskConfigurationType): Self = StObject.set(x, "CompromisedCredentialsRiskConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCompromisedCredentialsRiskConfigurationUndefined: Self = StObject.set(x, "CompromisedCredentialsRiskConfiguration", js.undefined)
    
    inline def setRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = StObject.set(x, "RiskExceptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRiskExceptionConfigurationUndefined: Self = StObject.set(x, "RiskExceptionConfiguration", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
