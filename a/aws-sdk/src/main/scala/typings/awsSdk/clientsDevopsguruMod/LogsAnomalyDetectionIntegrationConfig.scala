package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsAnomalyDetectionIntegrationConfig extends StObject {
  
  /**
    * Specifies if DevOps Guru is configured to perform log anomaly detection on CloudWatch log groups.
    */
  var OptInStatus: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.OptInStatus] = js.undefined
}
object LogsAnomalyDetectionIntegrationConfig {
  
  inline def apply(): LogsAnomalyDetectionIntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsAnomalyDetectionIntegrationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogsAnomalyDetectionIntegrationConfig] (val x: Self) extends AnyVal {
    
    inline def setOptInStatus(value: OptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    inline def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}
