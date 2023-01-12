package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSubnetGroup extends StObject {
  
  /**
    * The name of the cluster subnet group.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cluster subnet group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the cluster subnet group. Possible values are Complete, Incomplete and Invalid. 
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the VPC Subnet elements. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * The list of tags for the cluster subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The VPC ID of the cluster subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object ClusterSubnetGroup {
  
  inline def apply(): ClusterSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSubnetGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterSubnetGroup] (val x: Self) extends AnyVal {
    
    inline def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupNameUndefined: Self = StObject.set(x, "ClusterSubnetGroupName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSubnetGroupStatus(value: String): Self = StObject.set(x, "SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupStatusUndefined: Self = StObject.set(x, "SubnetGroupStatus", js.undefined)
    
    inline def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
