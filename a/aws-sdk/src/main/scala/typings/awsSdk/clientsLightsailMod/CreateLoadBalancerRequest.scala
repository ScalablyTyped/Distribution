package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoadBalancerRequest extends StObject {
  
  /**
    * The optional alternative domains and subdomains to use with your SSL/TLS certificate (e.g., www.example.com, example.com, m.example.com, blog.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined
  
  /**
    * The domain name with which your certificate is associated (e.g., example.com). If you specify certificateDomainName, then certificateName is required (and vice-versa).
    */
  var certificateDomainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The name of the SSL/TLS certificate. If you specify certificateName, then certificateDomainName is required (and vice-versa).
    */
  var certificateName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/"). You may want to specify a custom health check path other than the root of your application if your home page loads slowly or has a lot of media or scripting on it.
    */
  var healthCheckPath: js.UndefOr[String] = js.undefined
  
  /**
    * The instance port where you're creating your load balancer.
    */
  var instancePort: Port
  
  /**
    * The IP address type for the load balancer. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6. The default value is dualstack.
    */
  var ipAddressType: js.UndefOr[IpAddressType] = js.undefined
  
  /**
    * The name of your load balancer.
    */
  var loadBalancerName: ResourceName
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the TLS policy to apply to the load balancer. Use the GetLoadBalancerTlsPolicies action to get a list of TLS policy names that you can specify. For more information about load balancer TLS policies, see Configuring TLS security policies on your Amazon Lightsail load balancers in the Amazon Lightsail Developer Guide.
    */
  var tlsPolicyName: js.UndefOr[String] = js.undefined
}
object CreateLoadBalancerRequest {
  
  inline def apply(instancePort: Port, loadBalancerName: ResourceName): CreateLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateAlternativeNames(value: DomainNameList): Self = StObject.set(x, "certificateAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setCertificateAlternativeNamesUndefined: Self = StObject.set(x, "certificateAlternativeNames", js.undefined)
    
    inline def setCertificateAlternativeNamesVarargs(value: DomainName*): Self = StObject.set(x, "certificateAlternativeNames", js.Array(value*))
    
    inline def setCertificateDomainName(value: DomainName): Self = StObject.set(x, "certificateDomainName", value.asInstanceOf[js.Any])
    
    inline def setCertificateDomainNameUndefined: Self = StObject.set(x, "certificateDomainName", js.undefined)
    
    inline def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    inline def setHealthCheckPath(value: String): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
    
    inline def setInstancePort(value: Port): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTlsPolicyName(value: String): Self = StObject.set(x, "tlsPolicyName", value.asInstanceOf[js.Any])
    
    inline def setTlsPolicyNameUndefined: Self = StObject.set(x, "tlsPolicyName", js.undefined)
  }
}
