package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupIdentifier extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}

object SecurityGroupIdentifier {
  @scala.inline
  def apply(GroupId: String = null, GroupName: String = null): SecurityGroupIdentifier = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[SecurityGroupIdentifier]
  }
}

