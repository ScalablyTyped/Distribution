package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSecurityGroup extends StObject {
  
  /**
    * The name of the cluster security group to which the operation was applied.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
  
  /**
    * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.undefined
  
  /**
    * The list of tags for the cluster security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ClusterSecurityGroup {
  
  inline def apply(): ClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroup]
  }
  
  extension [Self <: ClusterSecurityGroup](x: Self) {
    
    inline def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupNameUndefined: Self = StObject.set(x, "ClusterSecurityGroupName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = StObject.set(x, "EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupsUndefined: Self = StObject.set(x, "EC2SecurityGroups", js.undefined)
    
    inline def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = StObject.set(x, "EC2SecurityGroups", js.Array(value*))
    
    inline def setIPRanges(value: IPRangeList): Self = StObject.set(x, "IPRanges", value.asInstanceOf[js.Any])
    
    inline def setIPRangesUndefined: Self = StObject.set(x, "IPRanges", js.undefined)
    
    inline def setIPRangesVarargs(value: IPRange*): Self = StObject.set(x, "IPRanges", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
