package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSecurityGroup extends js.Object {
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.undefined
}

object SourceSecurityGroup {
  @scala.inline
  def apply(GroupName: SecurityGroupName = null, OwnerAlias: SecurityGroupOwnerAlias = null): SourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (OwnerAlias != null) __obj.updateDynamic("OwnerAlias")(OwnerAlias)
    __obj.asInstanceOf[SourceSecurityGroup]
  }
}

