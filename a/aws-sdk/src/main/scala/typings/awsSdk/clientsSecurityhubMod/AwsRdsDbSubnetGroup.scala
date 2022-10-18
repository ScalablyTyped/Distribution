package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSubnetGroup extends StObject {
  
  /**
    * The ARN of the subnet group.
    */
  var DbSubnetGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description of the subnet group.
    */
  var DbSubnetGroupDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the subnet group.
    */
  var DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of subnets in the subnet group.
    */
  var Subnets: js.UndefOr[AwsRdsDbSubnetGroupSubnets] = js.undefined
  
  /**
    * The VPC ID of the subnet group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSubnetGroup {
  
  inline def apply(): AwsRdsDbSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroup]
  }
  
  extension [Self <: AwsRdsDbSubnetGroup](x: Self) {
    
    inline def setDbSubnetGroupArn(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDbSubnetGroupArnUndefined: Self = StObject.set(x, "DbSubnetGroupArn", js.undefined)
    
    inline def setDbSubnetGroupDescription(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setDbSubnetGroupDescriptionUndefined: Self = StObject.set(x, "DbSubnetGroupDescription", js.undefined)
    
    inline def setDbSubnetGroupName(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "DbSubnetGroupName", js.undefined)
    
    inline def setSubnetGroupStatus(value: NonEmptyString): Self = StObject.set(x, "SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupStatusUndefined: Self = StObject.set(x, "SubnetGroupStatus", js.undefined)
    
    inline def setSubnets(value: AwsRdsDbSubnetGroupSubnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: AwsRdsDbSubnetGroupSubnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
