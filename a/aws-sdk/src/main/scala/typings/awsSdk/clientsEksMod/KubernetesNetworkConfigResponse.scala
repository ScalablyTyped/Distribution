package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesNetworkConfigResponse extends StObject {
  
  /**
    * The IP family used to assign Kubernetes pod and service IP addresses. The IP family is always ipv4, unless you have a 1.21 or later cluster running version 1.10.1 or later of the Amazon VPC CNI add-on and specified ipv6 when you created the cluster. 
    */
  var ipFamily: js.UndefOr[IpFamily] = js.undefined
  
  /**
    * The CIDR block that Kubernetes pod and service IP addresses are assigned from. Kubernetes assigns addresses from an IPv4 CIDR block assigned to a subnet that the node is in. If you didn't specify a CIDR block when you created the cluster, then Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. If this was specified, then it was specified when the cluster was created and it can't be changed.
    */
  var serviceIpv4Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The CIDR block that Kubernetes pod and service IP addresses are assigned from if you created a 1.21 or later cluster with version 1.10.1 or later of the Amazon VPC CNI add-on and specified ipv6 for ipFamily when you created the cluster. Kubernetes assigns service addresses from the unique local address range (fc00::/7) because you can't specify a custom IPv6 CIDR block when you create the cluster.
    */
  var serviceIpv6Cidr: js.UndefOr[String] = js.undefined
}
object KubernetesNetworkConfigResponse {
  
  inline def apply(): KubernetesNetworkConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesNetworkConfigResponse]
  }
  
  extension [Self <: KubernetesNetworkConfigResponse](x: Self) {
    
    inline def setIpFamily(value: IpFamily): Self = StObject.set(x, "ipFamily", value.asInstanceOf[js.Any])
    
    inline def setIpFamilyUndefined: Self = StObject.set(x, "ipFamily", js.undefined)
    
    inline def setServiceIpv4Cidr(value: String): Self = StObject.set(x, "serviceIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServiceIpv4CidrUndefined: Self = StObject.set(x, "serviceIpv4Cidr", js.undefined)
    
    inline def setServiceIpv6Cidr(value: String): Self = StObject.set(x, "serviceIpv6Cidr", value.asInstanceOf[js.Any])
    
    inline def setServiceIpv6CidrUndefined: Self = StObject.set(x, "serviceIpv6Cidr", js.undefined)
  }
}
