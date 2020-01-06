package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRiskConfigurationResponse extends js.Object {
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType = js.native
}

object DescribeRiskConfigurationResponse {
  @scala.inline
  def apply(RiskConfiguration: RiskConfigurationType): DescribeRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRiskConfigurationResponse]
  }
}

