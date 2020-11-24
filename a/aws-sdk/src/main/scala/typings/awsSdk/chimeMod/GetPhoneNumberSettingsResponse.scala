package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetPhoneNumberSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
  }
  
  @scala.inline
  implicit class GetPhoneNumberSettingsResponseOps[Self <: GetPhoneNumberSettingsResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteCallingName: Self = this.set("CallingName", js.undefined)
    
    @scala.inline
    def setCallingNameUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("CallingNameUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallingNameUpdatedTimestamp: Self = this.set("CallingNameUpdatedTimestamp", js.undefined)
  }
}
