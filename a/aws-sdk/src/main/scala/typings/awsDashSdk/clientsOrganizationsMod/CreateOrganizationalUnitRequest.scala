package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrganizationalUnitRequest extends js.Object {
  /**
    * The friendly name to assign to the new OU.
    */
  var Name: OrganizationalUnitName
  /**
    * The unique identifier (ID) of the parent root or OU that you want to create the new OU in. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var ParentId: typings.awsDashSdk.clientsOrganizationsMod.ParentId
}

object CreateOrganizationalUnitRequest {
  @scala.inline
  def apply(Name: OrganizationalUnitName, ParentId: ParentId): CreateOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(Name = Name, ParentId = ParentId)
  
    __obj.asInstanceOf[CreateOrganizationalUnitRequest]
  }
}

