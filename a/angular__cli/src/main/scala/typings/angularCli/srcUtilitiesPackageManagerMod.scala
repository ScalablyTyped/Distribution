package typings.angularCli

import typings.angularCli.angularCliBooleans.`true`
import typings.angularCli.angularCliStrings.dependencies
import typings.angularCli.angularCliStrings.devDependencies
import typings.angularCli.anon.Success
import typings.angularCli.libConfigWorkspaceSchemaMod.PackageManager
import typings.angularCli.srcUtilitiesConfigMod.AngularWorkspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesPackageManagerMod {
  
  @JSImport("@angular/cli/src/utilities/package-manager", "PackageManagerUtils")
  @js.native
  open class PackageManagerUtils protected () extends StObject {
    def this(context: PackageManagerUtilsContext) = this()
    
    /* private */ val context: Any = js.native
    
    /**
      * Checks if the package manager is supported. If not, display a warning.
      */
    def ensureCompatibility(): Unit = js.native
    
    /* private */ var getArguments: Any = js.native
    
    /* private */ var getConfiguredPackageManager: Any = js.native
    
    /* private */ var getName: Any = js.native
    
    /* private */ var getVersion: Any = js.native
    
    /* private */ var hasLockfile: Any = js.native
    
    /** Install a single package. */
    def install(packageName: String): js.Promise[Boolean] = js.native
    def install(packageName: String, save: dependencies | devDependencies | `true`): js.Promise[Boolean] = js.native
    def install(packageName: String, save: dependencies | devDependencies | `true`, extraArgs: js.Array[String]): js.Promise[Boolean] = js.native
    def install(
      packageName: String,
      save: dependencies | devDependencies | `true`,
      extraArgs: js.Array[String],
      cwd: String
    ): js.Promise[Boolean] = js.native
    def install(packageName: String, save: dependencies | devDependencies | `true`, extraArgs: Unit, cwd: String): js.Promise[Boolean] = js.native
    def install(packageName: String, save: Unit, extraArgs: js.Array[String]): js.Promise[Boolean] = js.native
    def install(packageName: String, save: Unit, extraArgs: js.Array[String], cwd: String): js.Promise[Boolean] = js.native
    def install(packageName: String, save: Unit, extraArgs: Unit, cwd: String): js.Promise[Boolean] = js.native
    
    /** Install all packages. */
    def installAll(): js.Promise[Boolean] = js.native
    def installAll(extraArgs: js.Array[String]): js.Promise[Boolean] = js.native
    def installAll(extraArgs: js.Array[String], cwd: String): js.Promise[Boolean] = js.native
    def installAll(extraArgs: Unit, cwd: String): js.Promise[Boolean] = js.native
    
    /** Install a single package temporary. */
    def installTemp(packageName: String): js.Promise[Success] = js.native
    def installTemp(packageName: String, extraArgs: js.Array[String]): js.Promise[Success] = js.native
    
    /** Get the package manager name. */
    def name: PackageManager = js.native
    
    /* private */ var run: Any = js.native
    
    /** Get the package manager version. */
    def version: js.UndefOr[String] = js.native
  }
  
  trait PackageManagerUtilsContext extends StObject {
    
    var globalConfiguration: AngularWorkspace
    
    var root: String
    
    var workspace: js.UndefOr[AngularWorkspace] = js.undefined
  }
  object PackageManagerUtilsContext {
    
    inline def apply(globalConfiguration: AngularWorkspace, root: String): PackageManagerUtilsContext = {
      val __obj = js.Dynamic.literal(globalConfiguration = globalConfiguration.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageManagerUtilsContext]
    }
    
    extension [Self <: PackageManagerUtilsContext](x: Self) {
      
      inline def setGlobalConfiguration(value: AngularWorkspace): Self = StObject.set(x, "globalConfiguration", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setWorkspace(value: AngularWorkspace): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
}
