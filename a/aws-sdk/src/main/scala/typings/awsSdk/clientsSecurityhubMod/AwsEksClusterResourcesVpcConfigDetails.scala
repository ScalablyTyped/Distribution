package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEksClusterResourcesVpcConfigDetails extends StObject {
  
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
  
  extension [Self <: AwsEksClusterResourcesVpcConfigDetails](x: Self) {
    
    inline def setSecurityGroupIds(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: NonEmptyStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
