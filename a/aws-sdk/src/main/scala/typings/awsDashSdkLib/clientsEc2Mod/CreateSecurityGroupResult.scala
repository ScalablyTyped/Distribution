package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityGroupResult extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
}

object CreateSecurityGroupResult {
  @scala.inline
  def apply(GroupId: String = null): CreateSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    __obj.asInstanceOf[CreateSecurityGroupResult]
  }
}

