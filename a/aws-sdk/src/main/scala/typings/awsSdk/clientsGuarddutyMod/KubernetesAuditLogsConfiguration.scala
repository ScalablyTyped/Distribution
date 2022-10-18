package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesAuditLogsConfiguration extends StObject {
  
  /**
    * The status of Kubernetes audit logs as a data source.
    */
  var Enable: Boolean
}
object KubernetesAuditLogsConfiguration {
  
  inline def apply(Enable: Boolean): KubernetesAuditLogsConfiguration = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[KubernetesAuditLogsConfiguration]
  }
  
  extension [Self <: KubernetesAuditLogsConfiguration](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
  }
}
