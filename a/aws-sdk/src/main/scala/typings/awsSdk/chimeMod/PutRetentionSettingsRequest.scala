package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRetentionSettingsRequest extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The retention settings.
    */
  var RetentionSettings: typings.awsSdk.chimeMod.RetentionSettings = js.native
}
object PutRetentionSettingsRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, RetentionSettings: RetentionSettings): PutRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RetentionSettings = RetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit class PutRetentionSettingsRequestOps[Self <: PutRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionSettings(value: RetentionSettings): Self = this.set("RetentionSettings", value.asInstanceOf[js.Any])
  }
}
