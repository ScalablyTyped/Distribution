package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Arn] = js.undefined
  
  /**
    * The date and time that the service was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description that you specify when you create the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Information about the Route 53 DNS records that you want Cloud Map to create when you register an instance.
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.DnsConfig] = js.undefined
  
  /**
    *  Public DNS and HTTP namespaces only. Settings for an optional health check. If you specify settings for a health check, Cloud Map associates the health check with the records that you specify in DnsConfig.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.HealthCheckConfig] = js.undefined
  
  /**
    * Information about an optional custom health check. A custom health check, which requires that you use a third-party health checker to evaluate the health of your resources, is useful in the following circumstances:   You can't use a health check that's defined by HealthCheckConfig because the resource isn't available over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC. (To check the health of resources in a VPC, the health checker must also be in the VPC.)   You want to use a third-party health checker regardless of where your resources are located.    If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.HealthCheckCustomConfig] = js.undefined
  
  /**
    * The ID that Cloud Map assigned to the service when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that are deleted aren't included in the count. The count might not reflect pending registrations and deregistrations.
    */
  var InstanceCount: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * Describes the systems that can be used to discover the service instances.  DNS_HTTP  The service instances can be discovered using either DNS queries or the DiscoverInstances API operation.  HTTP  The service instances can only be discovered using the DiscoverInstances API operation.  DNS  Reserved.  
    */
  var Type: js.UndefOr[ServiceType] = js.undefined
}
object ServiceSummary {
  
  inline def apply(): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSummary]
  }
  
  extension [Self <: ServiceSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsConfig(value: DnsConfig): Self = StObject.set(x, "DnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsConfigUndefined: Self = StObject.set(x, "DnsConfig", js.undefined)
    
    inline def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckConfigUndefined: Self = StObject.set(x, "HealthCheckConfig", js.undefined)
    
    inline def setHealthCheckCustomConfig(value: HealthCheckCustomConfig): Self = StObject.set(x, "HealthCheckCustomConfig", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckCustomConfigUndefined: Self = StObject.set(x, "HealthCheckCustomConfig", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceCount(value: ResourceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ServiceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
