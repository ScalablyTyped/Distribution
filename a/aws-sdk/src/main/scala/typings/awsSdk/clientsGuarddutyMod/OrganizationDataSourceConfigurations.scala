package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationDataSourceConfigurations extends StObject {
  
  /**
    * Describes the configuration of Kubernetes data sources for new members of the organization.
    */
  var Kubernetes: js.UndefOr[OrganizationKubernetesConfiguration] = js.undefined
  
  /**
    * Describes the configuration of Malware Protection for new members of the organization.
    */
  var MalwareProtection: js.UndefOr[OrganizationMalwareProtectionConfiguration] = js.undefined
  
  /**
    * Describes whether S3 data event logs are enabled for new members of the organization.
    */
  var S3Logs: js.UndefOr[OrganizationS3LogsConfiguration] = js.undefined
}
object OrganizationDataSourceConfigurations {
  
  inline def apply(): OrganizationDataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationDataSourceConfigurations]
  }
  
  extension [Self <: OrganizationDataSourceConfigurations](x: Self) {
    
    inline def setKubernetes(value: OrganizationKubernetesConfiguration): Self = StObject.set(x, "Kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "Kubernetes", js.undefined)
    
    inline def setMalwareProtection(value: OrganizationMalwareProtectionConfiguration): Self = StObject.set(x, "MalwareProtection", value.asInstanceOf[js.Any])
    
    inline def setMalwareProtectionUndefined: Self = StObject.set(x, "MalwareProtection", js.undefined)
    
    inline def setS3Logs(value: OrganizationS3LogsConfiguration): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
