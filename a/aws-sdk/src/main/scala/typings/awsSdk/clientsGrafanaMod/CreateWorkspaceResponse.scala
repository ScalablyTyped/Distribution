package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceResponse extends StObject {
  
  /**
    * A structure containing data about the workspace that was created.
    */
  var workspace: WorkspaceDescription
}
object CreateWorkspaceResponse {
  
  inline def apply(workspace: WorkspaceDescription): CreateWorkspaceResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceResponse]
  }
  
  extension [Self <: CreateWorkspaceResponse](x: Self) {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
