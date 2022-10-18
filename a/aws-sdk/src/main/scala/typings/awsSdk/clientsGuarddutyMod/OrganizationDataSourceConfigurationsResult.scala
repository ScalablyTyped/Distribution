package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationDataSourceConfigurationsResult extends StObject {
  
  /**
    * Describes the configuration of Kubernetes data sources.
    */
  var Kubernetes: js.UndefOr[OrganizationKubernetesConfigurationResult] = js.undefined
  
  /**
    * Describes the configuration of Malware Protection data source for an organization.
    */
  var MalwareProtection: js.UndefOr[OrganizationMalwareProtectionConfigurationResult] = js.undefined
  
  /**
    * Describes whether S3 data event logs are enabled as a data source.
    */
  var S3Logs: OrganizationS3LogsConfigurationResult
}
object OrganizationDataSourceConfigurationsResult {
  
  inline def apply(S3Logs: OrganizationS3LogsConfigurationResult): OrganizationDataSourceConfigurationsResult = {
    val __obj = js.Dynamic.literal(S3Logs = S3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationDataSourceConfigurationsResult]
  }
  
  extension [Self <: OrganizationDataSourceConfigurationsResult](x: Self) {
    
    inline def setKubernetes(value: OrganizationKubernetesConfigurationResult): Self = StObject.set(x, "Kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "Kubernetes", js.undefined)
    
    inline def setMalwareProtection(value: OrganizationMalwareProtectionConfigurationResult): Self = StObject.set(x, "MalwareProtection", value.asInstanceOf[js.Any])
    
    inline def setMalwareProtectionUndefined: Self = StObject.set(x, "MalwareProtection", js.undefined)
    
    inline def setS3Logs(value: OrganizationS3LogsConfigurationResult): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
  }
}
