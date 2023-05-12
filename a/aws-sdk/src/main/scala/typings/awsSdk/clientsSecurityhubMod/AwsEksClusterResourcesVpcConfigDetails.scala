package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEksClusterResourcesVpcConfigDetails extends StObject {
  
  /**
    *  Indicates whether the Amazon EKS public API server endpoint is turned on. If the Amazon EKS public API server endpoint is turned off, your cluster's Kubernetes API server can only receive requests that originate from within the cluster VPC. 
    */
  var EndpointPublicAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The security groups that are associated with the cross-account elastic network interfaces that are used to allow communication between your nodes and the Amazon EKS control plane.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The subnets that are associated with the cluster.
    */
  var SubnetIds: js.UndefOr[NonEmptyStringList] = js.undefined
}
object AwsEksClusterResourcesVpcConfigDetails {
  
  inline def apply(): AwsEksClusterResourcesVpcConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEksClusterResourcesVpcConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEksClusterResourcesVpcConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setEndpointPublicAccess(value: Boolean): Self = StObject.set(x, "EndpointPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPublicAccessUndefined: Self = StObject.set(x, "EndpointPublicAccess", js.undefined)
    
    inline def setSecurityGroupIds(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: NonEmptyStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
