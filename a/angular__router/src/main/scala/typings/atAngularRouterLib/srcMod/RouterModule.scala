package typings
package atAngularRouterLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src", "RouterModule")
@js.native
class RouterModule protected ()
  extends atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterModule {
  def this(guard: js.Any, router: atAngularRouterLib.srcRouterMod.Router) = this()
}

/* static members */
@JSImport("@angular/router/src", "RouterModule")
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
    * Configuration Options:
    *
    * * `enableTracing` Toggles whether the router should log all navigation events to the console.
    * * `useHash` Enables the location strategy that uses the URL fragment instead of the history
    * API.
    * * `initialNavigation` Disables the initial navigation.
    * * `errorHandler` Defines a custom error handler for failed navigations.
    * * `preloadingStrategy` Configures a preloading strategy. See `PreloadAllModules`.
    * * `onSameUrlNavigation` Define what the router should do if it receives a navigation request to
    * the current URL.
    * * `scrollPositionRestoration` Configures if the scroll position needs to be restored when
    * navigating back.
    * * `anchorScrolling` Configures if the router should scroll to the element when the url has a
    * fragment.
    * * `scrollOffset` Configures the scroll offset the router will use when scrolling to an element.
    * * `paramsInheritanceStrategy` Defines how the router merges params, data and resolved data from
    * parent to child routes.
    * * `malformedUriErrorHandler` Defines a custom malformed uri error handler function. This
    * handler is invoked when encodedURI contains invalid character sequences.
    * * `urlUpdateStrategy` Defines when the router updates the browser URL. The default behavior is
    * to update after successful navigation.
    * * `relativeLinkResolution` Enables the correct relative link resolution in components with
    * empty paths.
    *
    * See `ExtraOptions` for more details about the above options.
    */
  def forRoot(routes: atAngularRouterLib.srcConfigMod.Routes): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterModule] = js.native
  def forRoot(
    routes: atAngularRouterLib.srcConfigMod.Routes,
    config: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterModule] = js.native
}

