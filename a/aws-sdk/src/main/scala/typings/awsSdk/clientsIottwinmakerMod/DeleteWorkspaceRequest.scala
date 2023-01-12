package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceRequest extends StObject {
  
  /**
    * The ID of the workspace to delete.
    */
  var workspaceId: Id
}
object DeleteWorkspaceRequest {
  
  inline def apply(workspaceId: Id): DeleteWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkspaceRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
