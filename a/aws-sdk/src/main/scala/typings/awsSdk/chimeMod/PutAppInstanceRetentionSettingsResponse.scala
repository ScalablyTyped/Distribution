package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppInstanceRetentionSettingsResponse extends js.Object {
  
  /**
    * The time in days to retain data. Data type: number.
    */
  var AppInstanceRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceRetentionSettings] = js.native
  
  /**
    * The time at which the API deletes data.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.native
}
object PutAppInstanceRetentionSettingsResponse {
  
  @scala.inline
  def apply(): PutAppInstanceRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceRetentionSettingsResponse]
  }
  
  @scala.inline
  implicit class PutAppInstanceRetentionSettingsResponseOps[Self <: PutAppInstanceRetentionSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = this.set("AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceRetentionSettings: Self = this.set("AppInstanceRetentionSettings", js.undefined)
    
    @scala.inline
    def setInitiateDeletionTimestamp(value: Timestamp): Self = this.set("InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiateDeletionTimestamp: Self = this.set("InitiateDeletionTimestamp", js.undefined)
  }
}
