package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigResponse extends StObject {
  
  /**
    * The cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
    */
  var clusterSecurityGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC use the private VPC endpoint instead of traversing the internet. If this value is disabled and you have nodes or Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods. For more information, see Amazon EKS cluster endpoint access control in the  Amazon EKS User Guide .
    */
  var endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate from within the cluster VPC.
    */
  var endpointPublicAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the listed CIDR blocks is denied. The default value is 0.0.0.0/0. If you've disabled private endpoint access and you have nodes or Fargate pods in the cluster, then ensure that the necessary CIDR blocks are listed. For more information, see Amazon EKS cluster endpoint access control in the  Amazon EKS User Guide .
    */
  var publicAccessCidrs: js.UndefOr[StringList] = js.undefined
  
  /**
    * The security groups associated with the cross-account elastic network interfaces that are used to allow communication between your nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The subnets associated with your cluster.
    */
  var subnetIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: js.UndefOr[String] = js.undefined
}
object VpcConfigResponse {
  
  inline def apply(): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigResponse]
  }
  
  extension [Self <: VpcConfigResponse](x: Self) {
    
    inline def setClusterSecurityGroupId(value: String): Self = StObject.set(x, "clusterSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupIdUndefined: Self = StObject.set(x, "clusterSecurityGroupId", js.undefined)
    
    inline def setEndpointPrivateAccess(value: Boolean): Self = StObject.set(x, "endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPrivateAccessUndefined: Self = StObject.set(x, "endpointPrivateAccess", js.undefined)
    
    inline def setEndpointPublicAccess(value: Boolean): Self = StObject.set(x, "endpointPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPublicAccessUndefined: Self = StObject.set(x, "endpointPublicAccess", js.undefined)
    
    inline def setPublicAccessCidrs(value: StringList): Self = StObject.set(x, "publicAccessCidrs", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessCidrsUndefined: Self = StObject.set(x, "publicAccessCidrs", js.undefined)
    
    inline def setPublicAccessCidrsVarargs(value: String*): Self = StObject.set(x, "publicAccessCidrs", js.Array(value*))
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
