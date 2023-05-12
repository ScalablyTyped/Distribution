package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStatus extends StObject {
  
  /**
    * The details of the last UpdateDatalakeor DeleteDatalake API request which failed.
    */
  var lastUpdateFailure: js.UndefOr[LastUpdateFailure] = js.undefined
  
  /**
    * The unique ID for the UpdateDatalake or DeleteDatalake API request.
    */
  var lastUpdateRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the last UpdateDatalake or DeleteDatalake API request that was requested.
    */
  var lastUpdateStatus: js.UndefOr[settingsStatus] = js.undefined
}
object UpdateStatus {
  
  inline def apply(): UpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStatus] (val x: Self) extends AnyVal {
    
    inline def setLastUpdateFailure(value: LastUpdateFailure): Self = StObject.set(x, "lastUpdateFailure", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateFailureUndefined: Self = StObject.set(x, "lastUpdateFailure", js.undefined)
    
    inline def setLastUpdateRequestId(value: String): Self = StObject.set(x, "lastUpdateRequestId", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateRequestIdUndefined: Self = StObject.set(x, "lastUpdateRequestId", js.undefined)
    
    inline def setLastUpdateStatus(value: settingsStatus): Self = StObject.set(x, "lastUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusUndefined: Self = StObject.set(x, "lastUpdateStatus", js.undefined)
  }
}
