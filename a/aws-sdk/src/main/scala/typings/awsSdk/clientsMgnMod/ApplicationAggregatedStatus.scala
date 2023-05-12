package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationAggregatedStatus extends StObject {
  
  /**
    * Application aggregated status health status.
    */
  var healthStatus: js.UndefOr[ApplicationHealthStatus] = js.undefined
  
  /**
    * Application aggregated status last update dateTime.
    */
  var lastUpdateDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Application aggregated status progress status.
    */
  var progressStatus: js.UndefOr[ApplicationProgressStatus] = js.undefined
  
  /**
    * Application aggregated status total source servers amount.
    */
  var totalSourceServers: js.UndefOr[PositiveInteger] = js.undefined
}
object ApplicationAggregatedStatus {
  
  inline def apply(): ApplicationAggregatedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationAggregatedStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationAggregatedStatus] (val x: Self) extends AnyVal {
    
    inline def setHealthStatus(value: ApplicationHealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setLastUpdateDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    inline def setProgressStatus(value: ApplicationProgressStatus): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
    
    inline def setProgressStatusUndefined: Self = StObject.set(x, "progressStatus", js.undefined)
    
    inline def setTotalSourceServers(value: PositiveInteger): Self = StObject.set(x, "totalSourceServers", value.asInstanceOf[js.Any])
    
    inline def setTotalSourceServersUndefined: Self = StObject.set(x, "totalSourceServers", js.undefined)
  }
}
