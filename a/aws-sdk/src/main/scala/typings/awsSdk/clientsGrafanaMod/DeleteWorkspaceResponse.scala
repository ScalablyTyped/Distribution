package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceResponse extends StObject {
  
  /**
    * A structure containing information about the workspace that was deleted.
    */
  var workspace: WorkspaceDescription
}
object DeleteWorkspaceResponse {
  
  inline def apply(workspace: WorkspaceDescription): DeleteWorkspaceResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkspaceResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
