package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationSubnetGroupMessage extends StObject {
  
  /**
    * A description for the replication instance subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: String
  
  /**
    * A list of subnet IDs.
    */
  var SubnetIds: SubnetIdentifierList
}
object ModifyReplicationSubnetGroupMessage {
  
  inline def apply(ReplicationSubnetGroupIdentifier: String, SubnetIds: SubnetIdentifierList): ModifyReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
  }
  
  extension [Self <: ModifyReplicationSubnetGroupMessage](x: Self) {
    
    inline def setReplicationSubnetGroupDescription(value: String): Self = StObject.set(x, "ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setReplicationSubnetGroupDescriptionUndefined: Self = StObject.set(x, "ReplicationSubnetGroupDescription", js.undefined)
    
    inline def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
