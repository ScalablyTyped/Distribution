package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEntityRequest extends StObject {
  
  /**
    * The ID of the entity to delete.
    */
  var entityId: EntityId
  
  /**
    * A Boolean value that specifies whether the operation deletes child entities.
    */
  var isRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the workspace that contains the entity to delete.
    */
  var workspaceId: Id
}
object DeleteEntityRequest {
  
  inline def apply(entityId: EntityId, workspaceId: Id): DeleteEntityRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEntityRequest] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setIsRecursive(value: Boolean): Self = StObject.set(x, "isRecursive", value.asInstanceOf[js.Any])
    
    inline def setIsRecursiveUndefined: Self = StObject.set(x, "isRecursive", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
