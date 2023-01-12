package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesConfiguration extends StObject {
  
  /**
    * The status of Kubernetes audit logs as a data source.
    */
  var AuditLogs: KubernetesAuditLogsConfiguration
}
object KubernetesConfiguration {
  
  inline def apply(AuditLogs: KubernetesAuditLogsConfiguration): KubernetesConfiguration = {
    val __obj = js.Dynamic.literal(AuditLogs = AuditLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KubernetesConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KubernetesConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAuditLogs(value: KubernetesAuditLogsConfiguration): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
  }
}
