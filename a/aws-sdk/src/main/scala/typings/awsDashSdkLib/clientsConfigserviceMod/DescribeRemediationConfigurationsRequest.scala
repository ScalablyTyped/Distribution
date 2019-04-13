package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRemediationConfigurationsRequest extends js.Object {
  /**
    * A list of AWS Config rule names of remediation configurations for which you want details. 
    */
  var ConfigRuleNames: awsDashSdkLib.clientsConfigserviceMod.ConfigRuleNames
}

object DescribeRemediationConfigurationsRequest {
  @scala.inline
  def apply(ConfigRuleNames: ConfigRuleNames): DescribeRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleNames = ConfigRuleNames)
  
    __obj.asInstanceOf[DescribeRemediationConfigurationsRequest]
  }
}

