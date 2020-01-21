package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhoneNumberSettingsResponse extends js.Object {
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The updated outbound calling name timestamp, in ISO 8601 format.
    */
  var CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}

object GetPhoneNumberSettingsResponse {
  @scala.inline
  def apply(CallingName: CallingName = null, CallingNameUpdatedTimestamp: Iso8601Timestamp = null): GetPhoneNumberSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (CallingName != null) __obj.updateDynamic("CallingName")(CallingName.asInstanceOf[js.Any])
    if (CallingNameUpdatedTimestamp != null) __obj.updateDynamic("CallingNameUpdatedTimestamp")(CallingNameUpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
  }
}

