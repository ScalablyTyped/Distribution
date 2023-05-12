package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaveAggregatedStatus extends StObject {
  
  /**
    * Wave aggregated status health status.
    */
  var healthStatus: js.UndefOr[WaveHealthStatus] = js.undefined
  
  /**
    * Wave aggregated status last update dateTime.
    */
  var lastUpdateDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Wave aggregated status progress status.
    */
  var progressStatus: js.UndefOr[WaveProgressStatus] = js.undefined
  
  /**
    * DateTime marking when the first source server in the wave started replication.
    */
  var replicationStartedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Wave aggregated status total applications amount.
    */
  var totalApplications: js.UndefOr[PositiveInteger] = js.undefined
}
object WaveAggregatedStatus {
  
  inline def apply(): WaveAggregatedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveAggregatedStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaveAggregatedStatus] (val x: Self) extends AnyVal {
    
    inline def setHealthStatus(value: WaveHealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setLastUpdateDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    inline def setProgressStatus(value: WaveProgressStatus): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
    
    inline def setProgressStatusUndefined: Self = StObject.set(x, "progressStatus", js.undefined)
    
    inline def setReplicationStartedDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "replicationStartedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReplicationStartedDateTimeUndefined: Self = StObject.set(x, "replicationStartedDateTime", js.undefined)
    
    inline def setTotalApplications(value: PositiveInteger): Self = StObject.set(x, "totalApplications", value.asInstanceOf[js.Any])
    
    inline def setTotalApplicationsUndefined: Self = StObject.set(x, "totalApplications", js.undefined)
  }
}
