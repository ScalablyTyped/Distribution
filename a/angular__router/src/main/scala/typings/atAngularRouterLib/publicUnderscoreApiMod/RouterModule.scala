package typings
package atAngularRouterLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/public_api", "RouterModule")
@js.native
class RouterModule protected ()
  extends atAngularRouterLib.srcMod.RouterModule {
  def this(guard: js.Any, router: atAngularRouterLib.srcRouterMod.Router) = this()
}

@JSImport("@angular/router/public_api", "RouterModule")
@js.native
object RouterModule extends js.Object {
  /**
    * Creates a module with all the router directives and a provider registering routes.
    */
  def forChild(routes: atAngularRouterLib.srcConfigMod.Routes): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterModule] = js.native
  /**
    * Creates a module with all the router providers and directives. It also optionally sets up an
    * application listener to perform an initial navigation.
    *
    * Options (see `ExtraOptions`):
    * * `enableTracing` makes the router log all its internal events to the console.
    * * `useHash` enables the location strategy that uses the URL fragment instead of the history
    * API.
    * * `initialNavigation` disables the initial navigation.
    * * `errorHandler` provides a custom error handler.
    * * `preloadingStrategy` configures a preloading strategy (see `PreloadAllModules`).
    * * `onSameUrlNavigation` configures how the router handles navigation to the current URL. See
    * `ExtraOptions` for more details.
    * * `paramsInheritanceStrategy` defines how the router merges params, data and resolved data
    * from parent to child routes.
    */
  def forRoot(routes: atAngularRouterLib.srcConfigMod.Routes): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterModule] = js.native
  def forRoot(
    routes: atAngularRouterLib.srcConfigMod.Routes,
    config: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterModule] = js.native
}

