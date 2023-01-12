package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationKubernetesConfigurationResult extends StObject {
  
  /**
    * The current configuration of Kubernetes audit logs as a data source for the organization.
    */
  var AuditLogs: OrganizationKubernetesAuditLogsConfigurationResult
}
object OrganizationKubernetesConfigurationResult {
  
  inline def apply(AuditLogs: OrganizationKubernetesAuditLogsConfigurationResult): OrganizationKubernetesConfigurationResult = {
    val __obj = js.Dynamic.literal(AuditLogs = AuditLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationKubernetesConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationKubernetesConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setAuditLogs(value: OrganizationKubernetesAuditLogsConfigurationResult): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
  }
}
