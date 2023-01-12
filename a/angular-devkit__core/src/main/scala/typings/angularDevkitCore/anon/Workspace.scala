package typings.angularDevkitCore.anon

import typings.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  var workspace: WorkspaceDefinition
}
object Workspace {
  
  inline def apply(workspace: WorkspaceDefinition): Workspace = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
    
    inline def setWorkspace(value: WorkspaceDefinition): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
