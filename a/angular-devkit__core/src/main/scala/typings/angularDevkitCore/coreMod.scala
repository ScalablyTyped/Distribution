package typings.angularDevkitCore

import typings.angularDevkitCore.anon.Workspace
import typings.angularDevkitCore.definitionsMod.WorkspaceDefinition
import typings.angularDevkitCore.workspaceHostMod.WorkspaceHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("@angular-devkit/core/src/workspace/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait WorkspaceFormat extends StObject
  @JSImport("@angular-devkit/core/src/workspace/core", "WorkspaceFormat")
  @js.native
  object WorkspaceFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WorkspaceFormat & Double] = js.native
    
    @js.native
    sealed trait JSON
      extends StObject
         with WorkspaceFormat
    /* 0 */ val JSON: typings.angularDevkitCore.coreMod.WorkspaceFormat.JSON & Double = js.native
  }
  
  inline def readWorkspace(path: String, host: WorkspaceHost): js.Promise[Workspace] = (^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(path.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Workspace]]
  inline def readWorkspace(path: String, host: WorkspaceHost, format: WorkspaceFormat): js.Promise[Workspace] = (^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(path.asInstanceOf[js.Any], host.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Workspace]]
  
  inline def testAddWorkspaceFile(name: String, format: WorkspaceFormat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_test_addWorkspaceFile")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testRemoveWorkspaceFile(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_test_removeWorkspaceFile")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: String, format: WorkspaceFormat): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(workspace: WorkspaceDefinition, host: WorkspaceHost, path: Unit, format: WorkspaceFormat): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(workspace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
