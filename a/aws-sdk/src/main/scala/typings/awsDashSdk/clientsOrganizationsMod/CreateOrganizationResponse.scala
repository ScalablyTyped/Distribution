package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrganizationResponse extends js.Object {
  /**
    * A structure that contains details about the newly created organization.
    */
  var Organization: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Organization] = js.native
}

object CreateOrganizationResponse {
  @scala.inline
  def apply(Organization: Organization = null): CreateOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Organization != null) __obj.updateDynamic("Organization")(Organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationResponse]
  }
}

