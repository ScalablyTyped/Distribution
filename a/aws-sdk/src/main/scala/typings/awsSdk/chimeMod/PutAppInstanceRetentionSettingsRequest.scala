package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppInstanceRetentionSettingsRequest extends js.Object {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The time in days to retain data. Data type: number.
    */
  var AppInstanceRetentionSettings: typings.awsSdk.chimeMod.AppInstanceRetentionSettings = js.native
}
object PutAppInstanceRetentionSettingsRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn, AppInstanceRetentionSettings: AppInstanceRetentionSettings): PutAppInstanceRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceRetentionSettings = AppInstanceRetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppInstanceRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit class PutAppInstanceRetentionSettingsRequestOps[Self <: PutAppInstanceRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = this.set("AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
  }
}
