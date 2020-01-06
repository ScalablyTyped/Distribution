package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupMembership extends js.Object {
  /**
    * The unique ID for this security group.
    */
  var SecurityGroupIdentifier: js.UndefOr[String] = js.native
  /**
    * The status of this security group.
    */
  var Status: js.UndefOr[String] = js.native
}

object SecurityGroupMembership {
  @scala.inline
  def apply(SecurityGroupIdentifier: String = null, Status: String = null): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIdentifier != null) __obj.updateDynamic("SecurityGroupIdentifier")(SecurityGroupIdentifier.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupMembership]
  }
}

