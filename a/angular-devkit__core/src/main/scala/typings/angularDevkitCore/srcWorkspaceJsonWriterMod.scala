package typings.angularDevkitCore

import typings.angularDevkitCore.anon.`0`
import typings.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import typings.angularDevkitCore.srcWorkspaceHostMod.WorkspaceHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceJsonWriterMod {
  
  @JSImport("@angular-devkit/core/src/workspace/json/writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeJsonWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJsonWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJsonWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String, options: `0`): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJsonWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: Unit, options: `0`): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
