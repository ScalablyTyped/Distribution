package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of running the operation twice. CreatorRequestId can be any unique string (for example, a date/timestamp).
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to create when you register an instance. 
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.DnsConfig] = js.undefined
  
  /**
    *  Public DNS and HTTP namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see Cloud Map Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.HealthCheckConfig] = js.undefined
  
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  You can't add, update, or delete a HealthCheckCustomConfig configuration from an existing service.
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.HealthCheckCustomConfig] = js.undefined
  
  /**
    * The name that you want to assign to the service.  Do not include sensitive information in the name if the namespace is discoverable by public DNS queries.  If you want Cloud Map to create an SRV record when you register an instance and you're using a system that requires a specific SRV format, such as HAProxy, specify the following for Name:   Start the name with an underscore (_), such as _exampleservice.   End the name with ._protocol, such as ._tcp.   When you register an instance, Cloud Map creates an SRV record and assigns a name to the record by concatenating the service name and the namespace name (for example,  _exampleservice._tcp.example.com).  For services that are accessible by DNS queries, you can't create multiple services with names that differ only by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be distinguished. However, if you use a namespace that's only accessible by API calls, then you can create services that with names that differ only by case. 
    */
  var Name: ServiceName
  
  /**
    * The ID of the namespace that you want to use to create the service. The namespace ID must be specified, but it can be specified either here or in the DnsConfig object.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * If present, specifies that the service instances are only discoverable using the DiscoverInstances API operation. No DNS records is registered for the service instances. The only valid value is HTTP.
    */
  var Type: js.UndefOr[ServiceTypeOption] = js.undefined
}
object CreateServiceRequest {
  
  inline def apply(Name: ServiceName): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  
  extension [Self <: CreateServiceRequest](x: Self) {
    
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
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespaceId(value: ResourceId): Self = StObject.set(x, "NamespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "NamespaceId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ServiceTypeOption): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
