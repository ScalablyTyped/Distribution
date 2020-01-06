package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroup extends js.Object {
  /**
    * Name of a server group.
    */
  var name: js.UndefOr[ServerGroupName] = js.native
  /**
    * Identifier of a server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  /**
    * List of servers belonging to a server group.
    */
  var serverList: js.UndefOr[ServerList] = js.native
}

object ServerGroup {
  @scala.inline
  def apply(name: ServerGroupName = null, serverGroupId: ServerGroupId = null, serverList: ServerList = null): ServerGroup = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serverGroupId != null) __obj.updateDynamic("serverGroupId")(serverGroupId.asInstanceOf[js.Any])
    if (serverList != null) __obj.updateDynamic("serverList")(serverList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroup]
  }
}

