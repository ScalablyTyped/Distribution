package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputSecurityGroupResponse extends js.Object {
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.native
}

object CreateInputSecurityGroupResponse {
  @scala.inline
  def apply(SecurityGroup: InputSecurityGroup = null): CreateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroup != null) __obj.updateDynamic("SecurityGroup")(SecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputSecurityGroupResponse]
  }
}

