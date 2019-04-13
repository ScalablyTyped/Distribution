package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupNameAndArn extends js.Object {
  /**
    * The group ARN.
    */
  var groupArn: js.UndefOr[ThingGroupArn] = js.undefined
  /**
    * The group name.
    */
  var groupName: js.UndefOr[ThingGroupName] = js.undefined
}

object GroupNameAndArn {
  @scala.inline
  def apply(groupArn: ThingGroupArn = null, groupName: ThingGroupName = null): GroupNameAndArn = {
    val __obj = js.Dynamic.literal()
    if (groupArn != null) __obj.updateDynamic("groupArn")(groupArn)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    __obj.asInstanceOf[GroupNameAndArn]
  }
}

