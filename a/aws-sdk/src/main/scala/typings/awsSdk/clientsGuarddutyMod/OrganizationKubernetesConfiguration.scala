package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationKubernetesConfiguration extends StObject {
  
  /**
    * Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
    */
  var AuditLogs: OrganizationKubernetesAuditLogsConfiguration
}
object OrganizationKubernetesConfiguration {
  
  inline def apply(AuditLogs: OrganizationKubernetesAuditLogsConfiguration): OrganizationKubernetesConfiguration = {
    val __obj = js.Dynamic.literal(AuditLogs = AuditLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationKubernetesConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationKubernetesConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAuditLogs(value: OrganizationKubernetesAuditLogsConfiguration): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
  }
}
