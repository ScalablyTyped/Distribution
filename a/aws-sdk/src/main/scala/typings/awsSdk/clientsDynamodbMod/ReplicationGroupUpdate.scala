package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationGroupUpdate extends StObject {
  
  /**
    * The parameters required for creating a replica for the table.
    */
  var Create: js.UndefOr[CreateReplicationGroupMemberAction] = js.undefined
  
  /**
    * The parameters required for deleting a replica for the table.
    */
  var Delete: js.UndefOr[DeleteReplicationGroupMemberAction] = js.undefined
  
  /**
    * The parameters required for updating a replica for the table.
    */
  var Update: js.UndefOr[UpdateReplicationGroupMemberAction] = js.undefined
}
object ReplicationGroupUpdate {
  
  inline def apply(): ReplicationGroupUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationGroupUpdate] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: CreateReplicationGroupMemberAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
    
    inline def setDelete(value: DeleteReplicationGroupMemberAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    
    inline def setUpdate(value: UpdateReplicationGroupMemberAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
  }
}
