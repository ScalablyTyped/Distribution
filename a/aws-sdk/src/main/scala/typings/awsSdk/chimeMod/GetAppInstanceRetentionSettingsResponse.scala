package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppInstanceRetentionSettingsResponse extends StObject {
  
  /**
    * The retention settings for the app instance.
    */
  var AppInstanceRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceRetentionSettings] = js.undefined
  
  /**
    * The timestamp representing the time at which the specified items are retained, in Epoch Seconds.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.undefined
}
object GetAppInstanceRetentionSettingsResponse {
  
  @scala.inline
  def apply(): GetAppInstanceRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppInstanceRetentionSettingsResponse]
  }
  
  @scala.inline
  implicit class GetAppInstanceRetentionSettingsResponseMutableBuilder[Self <: GetAppInstanceRetentionSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = StObject.set(x, "AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceRetentionSettingsUndefined: Self = StObject.set(x, "AppInstanceRetentionSettings", js.undefined)
    
    @scala.inline
    def setInitiateDeletionTimestamp(value: Timestamp): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
  }
}
