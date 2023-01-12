package typings.angularDevkitCore

import typings.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import typings.angularDevkitCore.srcWorkspaceHostMod.WorkspaceHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceJsonReaderMod {
  
  @JSImport("@angular-devkit/core/src/workspace/json/reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readJsonWorkspace(path: String, host: WorkspaceHost): js.Promise[WorkspaceDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonWorkspace")(path.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorkspaceDefinition]]
  inline def readJsonWorkspace(path: String, host: WorkspaceHost, options: JsonWorkspaceOptions): js.Promise[WorkspaceDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonWorkspace")(path.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorkspaceDefinition]]
  
  trait JsonWorkspaceOptions extends StObject {
    
    var allowedProjectExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowedWorkspaceExtensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object JsonWorkspaceOptions {
    
    inline def apply(): JsonWorkspaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonWorkspaceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonWorkspaceOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowedProjectExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedProjectExtensions", value.asInstanceOf[js.Any])
      
      inline def setAllowedProjectExtensionsUndefined: Self = StObject.set(x, "allowedProjectExtensions", js.undefined)
      
      inline def setAllowedProjectExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedProjectExtensions", js.Array(value*))
      
      inline def setAllowedWorkspaceExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedWorkspaceExtensions", value.asInstanceOf[js.Any])
      
      inline def setAllowedWorkspaceExtensionsUndefined: Self = StObject.set(x, "allowedWorkspaceExtensions", js.undefined)
      
      inline def setAllowedWorkspaceExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedWorkspaceExtensions", js.Array(value*))
    }
  }
}
