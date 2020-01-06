package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityGroupResult extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
}

object CreateSecurityGroupResult {
  @scala.inline
  def apply(GroupId: String = null): CreateSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityGroupResult]
  }
}

