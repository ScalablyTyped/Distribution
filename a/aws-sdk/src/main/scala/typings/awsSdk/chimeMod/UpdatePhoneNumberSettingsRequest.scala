package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhoneNumberSettingsRequest extends js.Object {
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: typings.awsSdk.chimeMod.CallingName = js.native
}

object UpdatePhoneNumberSettingsRequest {
  @scala.inline
  def apply(CallingName: CallingName): UpdatePhoneNumberSettingsRequest = {
    val __obj = js.Dynamic.literal(CallingName = CallingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
  }
  @scala.inline
  implicit class UpdatePhoneNumberSettingsRequestOps[Self <: UpdatePhoneNumberSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallingName(value: CallingName): Self = this.set("CallingName", value.asInstanceOf[js.Any])
  }
  
}

