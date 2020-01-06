package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupNameAndArn extends js.Object {
  /**
    * The group ARN.
    */
  var groupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The group name.
    */
  var groupName: js.UndefOr[ThingGroupName] = js.native
}

object GroupNameAndArn {
  @scala.inline
  def apply(groupArn: ThingGroupArn = null, groupName: ThingGroupName = null): GroupNameAndArn = {
    val __obj = js.Dynamic.literal()
    if (groupArn != null) __obj.updateDynamic("groupArn")(groupArn.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupNameAndArn]
  }
}

