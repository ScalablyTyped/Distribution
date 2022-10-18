package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentTypeRequest extends StObject {
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: ComponentTypeId
  
  /**
    * The ID of the workspace that contains the component type.
    */
  var workspaceId: Id
}
object GetComponentTypeRequest {
  
  inline def apply(componentTypeId: ComponentTypeId, workspaceId: Id): GetComponentTypeRequest = {
    val __obj = js.Dynamic.literal(componentTypeId = componentTypeId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentTypeRequest]
  }
  
  extension [Self <: GetComponentTypeRequest](x: Self) {
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
