package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroup extends js.Object {
  /**
    * Name of a server group.
    */
  var name: js.UndefOr[ServerGroupName] = js.undefined
  /**
    * Identifier of a server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  /**
    * List of servers belonging to a server group.
    */
  var serverList: js.UndefOr[ServerList] = js.undefined
}

object ServerGroup {
  @scala.inline
  def apply(name: ServerGroupName = null, serverGroupId: ServerGroupId = null, serverList: ServerList = null): ServerGroup = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (serverGroupId != null) __obj.updateDynamic("serverGroupId")(serverGroupId)
    if (serverList != null) __obj.updateDynamic("serverList")(serverList)
    __obj.asInstanceOf[ServerGroup]
  }
}

