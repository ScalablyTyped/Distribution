package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOrganizationalUnitRequest extends js.Object {
  /**
    * The unique identifier (ID) of the organizational unit that you want to delete. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
    */
  var OrganizationalUnitId: awsDashSdkLib.clientsOrganizationsMod.OrganizationalUnitId
}

object DeleteOrganizationalUnitRequest {
  @scala.inline
  def apply(OrganizationalUnitId: OrganizationalUnitId): DeleteOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(OrganizationalUnitId = OrganizationalUnitId)
  
    __obj.asInstanceOf[DeleteOrganizationalUnitRequest]
  }
}

