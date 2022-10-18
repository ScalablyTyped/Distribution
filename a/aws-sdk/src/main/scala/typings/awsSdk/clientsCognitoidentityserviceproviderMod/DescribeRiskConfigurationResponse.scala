package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRiskConfigurationResponse extends StObject {
  
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType
}
object DescribeRiskConfigurationResponse {
  
  inline def apply(RiskConfiguration: RiskConfigurationType): DescribeRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRiskConfigurationResponse]
  }
  
  extension [Self <: DescribeRiskConfigurationResponse](x: Self) {
    
    inline def setRiskConfiguration(value: RiskConfigurationType): Self = StObject.set(x, "RiskConfiguration", value.asInstanceOf[js.Any])
  }
}
