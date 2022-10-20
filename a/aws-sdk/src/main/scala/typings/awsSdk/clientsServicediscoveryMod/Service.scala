package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Arn] = js.undefined
  
  /**
    * The date and time that the service was created, in Unix format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of running the operation twice. CreatorRequestId can be any unique string (for example, a date/timestamp).
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The description of the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * A complex type that contains information about the Route 53 DNS records that you want Cloud Map to create when you register an instance.  The record types of a service can only be changed by deleting the service and recreating it with a new Dnsconfig. 
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.DnsConfig] = js.undefined
  
  /**
    *  Public DNS and HTTP namespaces only. A complex type that contains settings for an optional health check. If you specify settings for a health check, Cloud Map associates the health check with the records that you specify in DnsConfig. For information about the charges for health checks, see Amazon Route 53 Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.HealthCheckConfig] = js.undefined
  
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
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
    * The ID of the namespace that was used to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Describes the systems that can be used to discover the service instances.  DNS_HTTP  The service instances can be discovered using either DNS queries or the DiscoverInstances API operation.  HTTP  The service instances can only be discovered using the DiscoverInstances API operation.  DNS  Reserved.  
    */
  var Type: js.UndefOr[ServiceType] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatorRequestId(value: ResourceId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
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
    
    inline def setNamespaceId(value: ResourceId): Self = StObject.set(x, "NamespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "NamespaceId", js.undefined)
    
    inline def setType(value: ServiceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
