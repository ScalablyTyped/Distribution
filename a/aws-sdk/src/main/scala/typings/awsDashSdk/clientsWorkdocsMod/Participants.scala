package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participants extends js.Object {
  /**
    * The list of user groups.
    */
  var Groups: js.UndefOr[GroupMetadataList] = js.undefined
  /**
    * The list of users.
    */
  var Users: js.UndefOr[UserMetadataList] = js.undefined
}

object Participants {
  @scala.inline
  def apply(Groups: GroupMetadataList = null, Users: UserMetadataList = null): Participants = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[Participants]
  }
}

