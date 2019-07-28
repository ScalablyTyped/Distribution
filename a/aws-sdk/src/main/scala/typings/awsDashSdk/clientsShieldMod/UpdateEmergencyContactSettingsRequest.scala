package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmergencyContactSettingsRequest extends js.Object {
  /**
    * A list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  var EmergencyContactList: js.UndefOr[typings.awsDashSdk.clientsShieldMod.EmergencyContactList] = js.undefined
}

object UpdateEmergencyContactSettingsRequest {
  @scala.inline
  def apply(EmergencyContactList: EmergencyContactList = null): UpdateEmergencyContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (EmergencyContactList != null) __obj.updateDynamic("EmergencyContactList")(EmergencyContactList)
    __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
  }
}

