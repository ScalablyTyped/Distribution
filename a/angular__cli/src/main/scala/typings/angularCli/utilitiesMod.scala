package typings.angularCli

import typings.angularCli.angularCliStrings.enabled
import typings.angularCli.angularCliStrings.environment
import typings.angularCli.angularCliStrings.path
import typings.angularCli.anon.RequiredCache
import typings.angularCli.configMod.AngularWorkspace
import typings.angularCli.workspaceSchemaMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("@angular/cli/src/commands/cache/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheConfig(): RequiredCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheConfig")().asInstanceOf[RequiredCache]
  inline def getCacheConfig(workspace: AngularWorkspace): RequiredCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheConfig")(workspace.asInstanceOf[js.Any]).asInstanceOf[RequiredCache]
  
  inline def updateCacheConfig_enabled(workspace: AngularWorkspace, key: enabled): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCacheConfig")(workspace.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def updateCacheConfig_enabled(workspace: AngularWorkspace, key: enabled, value: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCacheConfig")(workspace.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateCacheConfig_environment(workspace: AngularWorkspace, key: environment): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCacheConfig")(workspace.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def updateCacheConfig_environment(workspace: AngularWorkspace, key: environment, value: Environment): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCacheConfig")(workspace.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateCacheConfig_path(workspace: AngularWorkspace, key: path): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCacheConfig")(workspace.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def updateCacheConfig_path(workspace: AngularWorkspace, key: path, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCacheConfig")(workspace.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
