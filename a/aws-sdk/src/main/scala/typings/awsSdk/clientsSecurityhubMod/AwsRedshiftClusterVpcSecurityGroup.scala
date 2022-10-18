package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterVpcSecurityGroup extends StObject {
  
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterVpcSecurityGroup {
  
  inline def apply(): AwsRedshiftClusterVpcSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterVpcSecurityGroup]
  }
  
  extension [Self <: AwsRedshiftClusterVpcSecurityGroup](x: Self) {
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcSecurityGroupId(value: NonEmptyString): Self = StObject.set(x, "VpcSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdUndefined: Self = StObject.set(x, "VpcSecurityGroupId", js.undefined)
  }
}
