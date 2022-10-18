package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationKubernetesAuditLogsConfigurationResult extends StObject {
  
  /**
    * Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
    */
  var AutoEnable: Boolean
}
object OrganizationKubernetesAuditLogsConfigurationResult {
  
  inline def apply(AutoEnable: Boolean): OrganizationKubernetesAuditLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationKubernetesAuditLogsConfigurationResult]
  }
  
  extension [Self <: OrganizationKubernetesAuditLogsConfigurationResult](x: Self) {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
  }
}
