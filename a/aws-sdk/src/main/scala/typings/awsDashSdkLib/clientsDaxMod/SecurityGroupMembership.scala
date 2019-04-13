package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupMembership extends js.Object {
  /**
    * The unique ID for this security group.
    */
  var SecurityGroupIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The status of this security group.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object SecurityGroupMembership {
  @scala.inline
  def apply(SecurityGroupIdentifier: String = null, Status: String = null): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIdentifier != null) __obj.updateDynamic("SecurityGroupIdentifier")(SecurityGroupIdentifier)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[SecurityGroupMembership]
  }
}

