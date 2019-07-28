package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRiskConfigurationResponse extends js.Object {
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType
}

object DescribeRiskConfigurationResponse {
  @scala.inline
  def apply(RiskConfiguration: RiskConfigurationType): DescribeRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration)
  
    __obj.asInstanceOf[DescribeRiskConfigurationResponse]
  }
}

