package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRemediationConfigurationsResponse extends js.Object {
  /**
    * Returns a remediation configuration object.
    */
  var RemediationConfigurations: js.UndefOr[RemediationConfigurations] = js.undefined
}

object DescribeRemediationConfigurationsResponse {
  @scala.inline
  def apply(RemediationConfigurations: RemediationConfigurations = null): DescribeRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (RemediationConfigurations != null) __obj.updateDynamic("RemediationConfigurations")(RemediationConfigurations)
    __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
  }
}

