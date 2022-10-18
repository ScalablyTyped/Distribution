package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEntityRequest extends StObject {
  
  /**
    * The ID of the entity.
    */
  var entityId: EntityId
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object GetEntityRequest {
  
  inline def apply(entityId: EntityId, workspaceId: Id): GetEntityRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntityRequest]
  }
  
  extension [Self <: GetEntityRequest](x: Self) {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
