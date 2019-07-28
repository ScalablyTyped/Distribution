package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends js.Object {
  /**
    * The unique identifier (ID) of the parent entity. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var Id: js.UndefOr[ParentId] = js.undefined
  /**
    * The type of the parent entity.
    */
  var Type: js.UndefOr[ParentType] = js.undefined
}

object Parent {
  @scala.inline
  def apply(Id: ParentId = null, Type: ParentType = null): Parent = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

