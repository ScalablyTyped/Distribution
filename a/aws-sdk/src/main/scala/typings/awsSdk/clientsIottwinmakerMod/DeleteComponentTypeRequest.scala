package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentTypeRequest extends StObject {
  
  /**
    * The ID of the component type to delete.
    */
  var componentTypeId: ComponentTypeId
  
  /**
    * The ID of the workspace that contains the component type.
    */
  var workspaceId: Id
}
object DeleteComponentTypeRequest {
  
  inline def apply(componentTypeId: ComponentTypeId, workspaceId: Id): DeleteComponentTypeRequest = {
    val __obj = js.Dynamic.literal(componentTypeId = componentTypeId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteComponentTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
