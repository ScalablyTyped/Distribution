package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEmergencyContactSettingsResponse extends js.Object {
  /**
    * A list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  var EmergencyContactList: js.UndefOr[typings.awsDashSdk.clientsShieldMod.EmergencyContactList] = js.undefined
}

object DescribeEmergencyContactSettingsResponse {
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList = null): DescribeEmergencyContactSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (EmergencyContactList != null) __obj.updateDynamic("EmergencyContactList")(EmergencyContactList)
    __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
  }
}

