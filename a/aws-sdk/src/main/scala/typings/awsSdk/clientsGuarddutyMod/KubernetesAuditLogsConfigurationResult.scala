package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesAuditLogsConfigurationResult extends StObject {
  
  /**
    * A value that describes whether Kubernetes audit logs are enabled as a data source.
    */
  var Status: DataSourceStatus
}
object KubernetesAuditLogsConfigurationResult {
  
  inline def apply(Status: DataSourceStatus): KubernetesAuditLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KubernetesAuditLogsConfigurationResult]
  }
  
  extension [Self <: KubernetesAuditLogsConfigurationResult](x: Self) {
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
