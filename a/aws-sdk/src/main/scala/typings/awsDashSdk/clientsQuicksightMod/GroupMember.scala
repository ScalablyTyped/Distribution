package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMember extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the group member (user).
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.undefined
  /**
    * The name of the group member (user).
    */
  var MemberName: js.UndefOr[GroupMemberName] = js.undefined
}

object GroupMember {
  @scala.inline
  def apply(Arn: Arn = null, MemberName: GroupMemberName = null): GroupMember = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (MemberName != null) __obj.updateDynamic("MemberName")(MemberName)
    __obj.asInstanceOf[GroupMember]
  }
}

