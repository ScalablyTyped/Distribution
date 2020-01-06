package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHealthServiceStatusForOrganizationResponse extends js.Object {
  /**
    * Information about the status of enabling or disabling AWS Health Organizational View in your organization. Valid values are ENABLED | DISABLED | PENDING. 
    */
  var healthServiceAccessStatusForOrganization: js.UndefOr[typings.awsDashSdk.clientsHealthMod.healthServiceAccessStatusForOrganization] = js.native
}

object DescribeHealthServiceStatusForOrganizationResponse {
  @scala.inline
  def apply(healthServiceAccessStatusForOrganization: healthServiceAccessStatusForOrganization = null): DescribeHealthServiceStatusForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (healthServiceAccessStatusForOrganization != null) __obj.updateDynamic("healthServiceAccessStatusForOrganization")(healthServiceAccessStatusForOrganization.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHealthServiceStatusForOrganizationResponse]
  }
}

