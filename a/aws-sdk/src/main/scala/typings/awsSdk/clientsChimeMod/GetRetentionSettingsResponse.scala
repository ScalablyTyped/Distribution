package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRetentionSettingsResponse extends StObject {
  
  /**
    * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
    */
  var InitiateDeletionTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The retention settings.
    */
  var RetentionSettings: js.UndefOr[typings.awsSdk.clientsChimeMod.RetentionSettings] = js.undefined
}
object GetRetentionSettingsResponse {
  
  inline def apply(): GetRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRetentionSettingsResponse]
  }
  
  extension [Self <: GetRetentionSettingsResponse](x: Self) {
    
    inline def setInitiateDeletionTimestamp(value: js.Date): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
    
    inline def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "RetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "RetentionSettings", js.undefined)
  }
}
