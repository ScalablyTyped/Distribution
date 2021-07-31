package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRetentionSettingsResponse extends StObject {
  
  /**
    * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The retention settings.
    */
  var RetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.RetentionSettings] = js.undefined
}
object GetRetentionSettingsResponse {
  
  @scala.inline
  def apply(): GetRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRetentionSettingsResponse]
  }
  
  @scala.inline
  implicit class GetRetentionSettingsResponseMutableBuilder[Self <: GetRetentionSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiateDeletionTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
    
    @scala.inline
    def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "RetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionSettingsUndefined: Self = StObject.set(x, "RetentionSettings", js.undefined)
  }
}
