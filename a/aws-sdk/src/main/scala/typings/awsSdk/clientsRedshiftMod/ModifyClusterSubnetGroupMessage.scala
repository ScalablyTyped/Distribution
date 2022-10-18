package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterSubnetGroupMessage extends StObject {
  
  /**
    * The name of the subnet group to be modified.
    */
  var ClusterSubnetGroupName: String
  
  /**
    * A text description of the subnet group to be modified.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
    */
  var SubnetIds: SubnetIdentifierList
}
object ModifyClusterSubnetGroupMessage {
  
  inline def apply(ClusterSubnetGroupName: String, SubnetIds: SubnetIdentifierList): ModifyClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSubnetGroupMessage]
  }
  
  extension [Self <: ModifyClusterSubnetGroupMessage](x: Self) {
    
    inline def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
