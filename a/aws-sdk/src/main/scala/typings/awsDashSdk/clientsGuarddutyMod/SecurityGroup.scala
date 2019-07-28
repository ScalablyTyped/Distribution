package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroup extends js.Object {
  /**
    * EC2 instance's security group ID.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * EC2 instance's security group name.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}

object SecurityGroup {
  @scala.inline
  def apply(GroupId: String = null, GroupName: String = null): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[SecurityGroup]
  }
}

