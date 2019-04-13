package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInputSecurityGroupResponse extends js.Object {
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
}

object CreateInputSecurityGroupResponse {
  @scala.inline
  def apply(SecurityGroup: InputSecurityGroup = null): CreateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroup != null) __obj.updateDynamic("SecurityGroup")(SecurityGroup)
    __obj.asInstanceOf[CreateInputSecurityGroupResponse]
  }
}

