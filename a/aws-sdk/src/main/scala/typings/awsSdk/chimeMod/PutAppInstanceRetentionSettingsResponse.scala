package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceRetentionSettingsResponse extends StObject {
  
  /**
    * The time in days to retain data. Data type: number.
    */
  var AppInstanceRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceRetentionSettings] = js.undefined
  
  /**
    * The time at which the API deletes data.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.undefined
}
object PutAppInstanceRetentionSettingsResponse {
  
  inline def apply(): PutAppInstanceRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceRetentionSettingsResponse]
  }
  
  extension [Self <: PutAppInstanceRetentionSettingsResponse](x: Self) {
    
    inline def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = StObject.set(x, "AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceRetentionSettingsUndefined: Self = StObject.set(x, "AppInstanceRetentionSettings", js.undefined)
    
    inline def setInitiateDeletionTimestamp(value: Timestamp): Self = StObject.set(x, "InitiateDeletionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInitiateDeletionTimestampUndefined: Self = StObject.set(x, "InitiateDeletionTimestamp", js.undefined)
  }
}
