package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Child extends js.Object {
  /**
    * The unique identifier (ID) of this child entity. The regex pattern for a child ID string requires one of the following:   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var Id: js.UndefOr[ChildId] = js.undefined
  /**
    * The type of this child entity.
    */
  var Type: js.UndefOr[ChildType] = js.undefined
}

object Child {
  @scala.inline
  def apply(Id: ChildId = null, Type: ChildType = null): Child = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Child]
  }
}

