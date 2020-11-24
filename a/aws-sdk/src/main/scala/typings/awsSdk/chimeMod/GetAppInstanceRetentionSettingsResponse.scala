package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppInstanceRetentionSettingsResponse extends js.Object {
  
  /**
    * The retention settings for the app instance.
    */
  var AppInstanceRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceRetentionSettings] = js.native
  
  /**
    * The timestamp representing the time at which the specified items are retained, in Epoch Seconds.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.native
}
object GetAppInstanceRetentionSettingsResponse {
  
  @scala.inline
  def apply(): GetAppInstanceRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppInstanceRetentionSettingsResponse]
  }
  
  @scala.inline
  implicit class GetAppInstanceRetentionSettingsResponseOps[Self <: GetAppInstanceRetentionSettingsResponse] (val x: Self) extends AnyVal {
    
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
