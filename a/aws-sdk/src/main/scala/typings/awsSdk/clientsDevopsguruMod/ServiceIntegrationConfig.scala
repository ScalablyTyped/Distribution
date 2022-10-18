package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceIntegrationConfig extends StObject {
  
  /**
    *  Information about whether DevOps Guru is configured to perform log anomaly detection on Amazon CloudWatch log groups. 
    */
  var LogsAnomalyDetection: js.UndefOr[LogsAnomalyDetectionIntegration] = js.undefined
  
  /**
    *  Information about whether DevOps Guru is configured to create an OpsItem in Amazon Web Services Systems Manager OpsCenter for each created insight. 
    */
  var OpsCenter: js.UndefOr[OpsCenterIntegration] = js.undefined
}
object ServiceIntegrationConfig {
  
  inline def apply(): ServiceIntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceIntegrationConfig]
  }
  
  extension [Self <: ServiceIntegrationConfig](x: Self) {
    
    inline def setLogsAnomalyDetection(value: LogsAnomalyDetectionIntegration): Self = StObject.set(x, "LogsAnomalyDetection", value.asInstanceOf[js.Any])
    
    inline def setLogsAnomalyDetectionUndefined: Self = StObject.set(x, "LogsAnomalyDetection", js.undefined)
    
    inline def setOpsCenter(value: OpsCenterIntegration): Self = StObject.set(x, "OpsCenter", value.asInstanceOf[js.Any])
    
    inline def setOpsCenterUndefined: Self = StObject.set(x, "OpsCenter", js.undefined)
  }
}
