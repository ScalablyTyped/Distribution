package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskConfigurationType extends StObject {
  
  /**
    * The account takeover risk configuration object, including the NotifyConfiguration object and Actions to take if there is an account takeover.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
  
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The compromised credentials risk configuration object, including the EventFilter and the EventAction.
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
  
  /**
    * The last modified date.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object RiskConfigurationType {
  
  inline def apply(): RiskConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskConfigurationType]
  }
  
  extension [Self <: RiskConfigurationType](x: Self) {
    
    inline def setAccountTakeoverRiskConfiguration(value: AccountTakeoverRiskConfigurationType): Self = StObject.set(x, "AccountTakeoverRiskConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccountTakeoverRiskConfigurationUndefined: Self = StObject.set(x, "AccountTakeoverRiskConfiguration", js.undefined)
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setCompromisedCredentialsRiskConfiguration(value: CompromisedCredentialsRiskConfigurationType): Self = StObject.set(x, "CompromisedCredentialsRiskConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCompromisedCredentialsRiskConfigurationUndefined: Self = StObject.set(x, "CompromisedCredentialsRiskConfiguration", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = StObject.set(x, "RiskExceptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRiskExceptionConfigurationUndefined: Self = StObject.set(x, "RiskExceptionConfiguration", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
