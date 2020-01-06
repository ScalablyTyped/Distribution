package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOrganizationalUnitRequest extends js.Object {
  /**
    * The unique identifier (ID) of the organizational unit that you want to delete. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
    */
  var OrganizationalUnitId: typings.awsDashSdk.clientsOrganizationsMod.OrganizationalUnitId = js.native
}

object DeleteOrganizationalUnitRequest {
  @scala.inline
  def apply(OrganizationalUnitId: OrganizationalUnitId): DeleteOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(OrganizationalUnitId = OrganizationalUnitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteOrganizationalUnitRequest]
  }
}

