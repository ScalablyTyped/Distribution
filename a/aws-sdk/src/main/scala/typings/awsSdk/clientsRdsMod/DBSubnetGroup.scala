package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSubnetGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the DB subnet group.
    */
  var DBSubnetGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the description of the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB subnet group.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the status of the DB subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a list of Subnet elements.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * The network type of the DB subnet group. Valid values:    IPV4     DUAL    A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon RDS User Guide. 
    */
  var SupportedNetworkTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * Provides the VpcId of the DB subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DBSubnetGroup {
  
  inline def apply(): DBSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBSubnetGroup] (val x: Self) extends AnyVal {
    
    inline def setDBSubnetGroupArn(value: String): Self = StObject.set(x, "DBSubnetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupArnUndefined: Self = StObject.set(x, "DBSubnetGroupArn", js.undefined)
    
    inline def setDBSubnetGroupDescription(value: String): Self = StObject.set(x, "DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupDescriptionUndefined: Self = StObject.set(x, "DBSubnetGroupDescription", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
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
