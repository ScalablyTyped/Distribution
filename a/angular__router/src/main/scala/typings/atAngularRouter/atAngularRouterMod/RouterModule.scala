package typings.atAngularRouter.atAngularRouterMod

import typings.atAngularCore.atAngularCoreMod.ModuleWithProviders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterModule")
@js.native
class RouterModule protected () extends js.Object {
  def this(guard: js.Any, router: Router) = this()
}

/* static members */
@JSImport("@angular/router", "RouterModule")
@js.native
object RouterModule extends js.Object {
  /**
    * Creates a module with all the router directives and a provider registering routes.
    */
  def forChild(routes: Routes): ModuleWithProviders[RouterModule] = js.native
  /**
    * Creates and configures a module with all the router providers and directives.
    * Optionally sets up an application listener to perform an initial navigation.
    *
    * @param routes An array of `Route` objects that define the navigation paths for the application.
    * @param config An `ExtraOptions` configuration object that controls how navigation is performed.
    * @return The new router module.
    */
  def forRoot(routes: Routes): ModuleWithProviders[RouterModule] = js.native
  def forRoot(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterModule] = js.native
}

