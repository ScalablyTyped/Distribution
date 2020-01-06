package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationConfigurationsResponse extends js.Object {
  /**
    * Returns a remediation configuration object.
    */
  var RemediationConfigurations: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.RemediationConfigurations] = js.native
}

object DescribeRemediationConfigurationsResponse {
  @scala.inline
  def apply(RemediationConfigurations: RemediationConfigurations = null): DescribeRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (RemediationConfigurations != null) __obj.updateDynamic("RemediationConfigurations")(RemediationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
  }
}

