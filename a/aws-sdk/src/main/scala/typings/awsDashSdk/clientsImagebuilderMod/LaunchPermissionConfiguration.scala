package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermissionConfiguration extends js.Object {
  /**
    *  
    */
  var userGroups: js.UndefOr[StringList] = js.native
  /**
    *  
    */
  var userIds: js.UndefOr[AccountList] = js.native
}

object LaunchPermissionConfiguration {
  @scala.inline
  def apply(userGroups: StringList = null, userIds: AccountList = null): LaunchPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (userGroups != null) __obj.updateDynamic("userGroups")(userGroups.asInstanceOf[js.Any])
    if (userIds != null) __obj.updateDynamic("userIds")(userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchPermissionConfiguration]
  }
}

