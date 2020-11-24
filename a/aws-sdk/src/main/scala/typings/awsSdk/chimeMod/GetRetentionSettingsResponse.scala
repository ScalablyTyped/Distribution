package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRetentionSettingsResponse extends js.Object {
  
  /**
    * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The retention settings.
    */
  var RetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.RetentionSettings] = js.native
}
object GetRetentionSettingsResponse {
  
  @scala.inline
  def apply(): GetRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRetentionSettingsResponse]
  }
  
  @scala.inline
  implicit class GetRetentionSettingsResponseOps[Self <: GetRetentionSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setInitiateDeletionTimestamp(value: Iso8601Timestamp): Self = this.set("InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiateDeletionTimestamp: Self = this.set("InitiateDeletionTimestamp", js.undefined)
    
    @scala.inline
    def setRetentionSettings(value: RetentionSettings): Self = this.set("RetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionSettings: Self = this.set("RetentionSettings", js.undefined)
  }
}
