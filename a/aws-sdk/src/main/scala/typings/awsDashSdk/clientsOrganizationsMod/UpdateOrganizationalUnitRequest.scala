package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOrganizationalUnitRequest extends js.Object {
  /**
    * The new name that you want to assign to the OU. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[OrganizationalUnitName] = js.undefined
  /**
    * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
    */
  var OrganizationalUnitId: typings.awsDashSdk.clientsOrganizationsMod.OrganizationalUnitId
}

object UpdateOrganizationalUnitRequest {
  @scala.inline
  def apply(OrganizationalUnitId: OrganizationalUnitId, Name: OrganizationalUnitName = null): UpdateOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(OrganizationalUnitId = OrganizationalUnitId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateOrganizationalUnitRequest]
  }
}

