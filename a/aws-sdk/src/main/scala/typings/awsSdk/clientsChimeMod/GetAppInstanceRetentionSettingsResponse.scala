package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppInstanceRetentionSettingsResponse extends StObject {
  
  /**
    * The retention settings for the AppInstance.
    */
  var AppInstanceRetentionSettings: js.UndefOr[typings.awsSdk.clientsChimeMod.AppInstanceRetentionSettings] = js.undefined
  
  /**
    * The timestamp representing the time at which the specified items are retained, in Epoch Seconds.
    */
  var InitiateDeletionTimestamp: js.UndefOr[js.Date] = js.undefined
}
object GetAppInstanceRetentionSettingsResponse {
  
  inline def apply(): GetAppInstanceRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppInstanceRetentionSettingsResponse]
  }
  
  extension [Self <: GetAppInstanceRetentionSettingsResponse](x: Self) {
    
    inline def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = StObject.set(x, "AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceRetentionSettingsUndefined: Self = StObject.set(x, "AppInstanceRetentionSettings", js.undefined)
    
    inline def setInitiateDeletionTimestamp(value: js.Date): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
  }
}
