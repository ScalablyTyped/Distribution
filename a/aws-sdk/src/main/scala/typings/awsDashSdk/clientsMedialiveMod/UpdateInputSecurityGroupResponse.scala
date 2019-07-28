package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInputSecurityGroupResponse extends js.Object {
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
}

object UpdateInputSecurityGroupResponse {
  @scala.inline
  def apply(SecurityGroup: InputSecurityGroup = null): UpdateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroup != null) __obj.updateDynamic("SecurityGroup")(SecurityGroup)
    __obj.asInstanceOf[UpdateInputSecurityGroupResponse]
  }
}

