package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesNetworkConfigRequest extends StObject {
  
  /**
    * Specify which IP family is used to assign Kubernetes pod and service IP addresses. If you don't specify a value, ipv4 is used by default. You can only specify an IP family when you create a cluster and can't change this value once the cluster is created. If you specify ipv6, the VPC and subnets that you specify for cluster creation must have both IPv4 and IPv6 CIDR blocks assigned to them. You can't specify ipv6 for clusters in China Regions. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on. If you specify ipv6, then ensure that your VPC meets the requirements listed in the considerations listed in Assigning IPv6 addresses to pods and services in the Amazon EKS User Guide. Kubernetes assigns services IPv6 addresses from the unique local address range (fc00::/7). You can't specify a custom IPv6 CIDR block. Pod addresses are assigned from the subnet's IPv6 CIDR.
    */
  var ipFamily: js.UndefOr[IpFamily] = js.undefined
  
  /**
    * Don't specify a value if you select ipv6 for ipFamily. The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet the following requirements:   Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0/12, or 192.168.0.0/16.   Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.   Between /24 and /12.    You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster is created. 
    */
  var serviceIpv4Cidr: js.UndefOr[String] = js.undefined
}
object KubernetesNetworkConfigRequest {
  
  inline def apply(): KubernetesNetworkConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesNetworkConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KubernetesNetworkConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setIpFamily(value: IpFamily): Self = StObject.set(x, "ipFamily", value.asInstanceOf[js.Any])
    
    inline def setIpFamilyUndefined: Self = StObject.set(x, "ipFamily", js.undefined)
    
    inline def setServiceIpv4Cidr(value: String): Self = StObject.set(x, "serviceIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServiceIpv4CidrUndefined: Self = StObject.set(x, "serviceIpv4Cidr", js.undefined)
  }
}
