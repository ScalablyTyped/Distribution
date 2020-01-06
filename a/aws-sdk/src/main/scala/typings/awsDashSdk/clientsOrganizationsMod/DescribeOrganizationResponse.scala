package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationResponse extends js.Object {
  /**
    * A structure that contains information about the organization.
    */
  var Organization: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Organization] = js.native
}

object DescribeOrganizationResponse {
  @scala.inline
  def apply(Organization: Organization = null): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Organization != null) __obj.updateDynamic("Organization")(Organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
}

