package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationSubnetGroupResponse extends StObject {
  
  /**
    * The modified replication subnet group.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationSubnetGroup] = js.undefined
}
object ModifyReplicationSubnetGroupResponse {
  
  inline def apply(): ModifyReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationSubnetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyReplicationSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = StObject.set(x, "ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationSubnetGroupUndefined: Self = StObject.set(x, "ReplicationSubnetGroup", js.undefined)
  }
}
