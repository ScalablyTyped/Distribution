package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationSubnetGroup extends StObject {
  
  /**
    * A description for the replication subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The subnets that are in the subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * The IP addressing protocol supported by the subnet group. This is used by a replication instance with values such as IPv4 only or Dual-stack that supports both IPv4 and IPv6 addressing. IPv6 only is not yet supported.
    */
  var SupportedNetworkTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object ReplicationSubnetGroup {
  
  inline def apply(): ReplicationSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationSubnetGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationSubnetGroup] (val x: Self) extends AnyVal {
    
    inline def setReplicationSubnetGroupDescription(value: String): Self = StObject.set(x, "ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setReplicationSubnetGroupDescriptionUndefined: Self = StObject.set(x, "ReplicationSubnetGroupDescription", js.undefined)
    
    inline def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationSubnetGroupIdentifierUndefined: Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", js.undefined)
    
    inline def setSubnetGroupStatus(value: String): Self = StObject.set(x, "SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupStatusUndefined: Self = StObject.set(x, "SubnetGroupStatus", js.undefined)
    
    inline def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setSupportedNetworkTypes(value: StringList): Self = StObject.set(x, "SupportedNetworkTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworkTypesUndefined: Self = StObject.set(x, "SupportedNetworkTypes", js.undefined)
    
    inline def setSupportedNetworkTypesVarargs(value: String*): Self = StObject.set(x, "SupportedNetworkTypes", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
