package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionSettingsResponse extends StObject {
  
  /**
    * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The retention settings.
    */
  var RetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.RetentionSettings] = js.undefined
}
object PutRetentionSettingsResponse {
  
  inline def apply(): PutRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionSettingsResponse]
  }
  
  extension [Self <: PutRetentionSettingsResponse](x: Self) {
    
    inline def setInitiateDeletionTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
    
    inline def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "RetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "RetentionSettings", js.undefined)
  }
}
