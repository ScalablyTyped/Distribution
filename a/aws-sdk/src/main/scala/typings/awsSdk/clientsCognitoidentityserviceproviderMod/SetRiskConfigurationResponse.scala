package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRiskConfigurationResponse extends StObject {
  
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType
}
object SetRiskConfigurationResponse {
  
  inline def apply(RiskConfiguration: RiskConfigurationType): SetRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationResponse]
  }
  
  extension [Self <: SetRiskConfigurationResponse](x: Self) {
    
    inline def setRiskConfiguration(value: RiskConfigurationType): Self = StObject.set(x, "RiskConfiguration", value.asInstanceOf[js.Any])
  }
}
