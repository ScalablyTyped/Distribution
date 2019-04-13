package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroup extends js.Object {
  /**
    * EC2 instance's security group ID.
    */
  var GroupId: js.UndefOr[__string] = js.undefined
  /**
    * EC2 instance's security group name.
    */
  var GroupName: js.UndefOr[__string] = js.undefined
}

object SecurityGroup {
  @scala.inline
  def apply(GroupId: __string = null, GroupName: __string = null): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[SecurityGroup]
  }
}

