package typings.angularRouter.anon

import org.scalablytyped.runtime.Instantiable1
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularRouter.mod.ExtraOptions
import typings.angularRouter.mod.RouterModule
import typings.angularRouter.mod.Routes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRouterModule
  extends StObject
     with Instantiable1[/* guard */ Any, RouterModule] {
  
  /**
    * Creates a module with all the router directives and a provider registering routes,
    * without creating a new Router service.
    * When registering for submodules and lazy-loaded submodules, create the NgModule as follows:
    *
    * ```
    * @NgModule({
    *   imports: [RouterModule.forChild(ROUTES)]
    * })
    * class MyNgModule {}
    * ```
    *
    * @param routes An array of `Route` objects that define the navigation paths for the submodule.
    * @return The new NgModule.
    *
    */
  def forChild(routes: Routes): ModuleWithProviders[RouterModule] = js.native
  
  /**
    * Creates and configures a module with all the router providers and directives.
    * Optionally sets up an application listener to perform an initial navigation.
    *
    * When registering the NgModule at the root, import as follows:
    *
    * ```
    * @NgModule({
    *   imports: [RouterModule.forRoot(ROUTES)]
    * })
    * class MyNgModule {}
    * ```
    *
    * @param routes An array of `Route` objects that define the navigation paths for the application.
    * @param config An `ExtraOptions` configuration object that controls how navigation is performed.
    * @return The new `NgModule`.
    *
    */
  def forRoot(routes: Routes): ModuleWithProviders[RouterModule] = js.native
  def forRoot(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterModule] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[RouterModule, js.Array[Optional]] = js.native
  
  var ɵinj: ɵɵInjectorDeclaration[RouterModule] = js.native
  
  var ɵmod: ɵɵNgModuleDeclaration[
    RouterModule, 
    scala.Nothing, 
    js.Tuple4[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i1.RouterOutlet */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i2.RouterLink */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i3.RouterLinkActive */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i4.ɵEmptyOutletComponent */ js.Any
    ], 
    js.Tuple4[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i1.RouterOutlet */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i2.RouterLink */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i3.RouterLinkActive */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof i4.ɵEmptyOutletComponent */ js.Any
    ]
  ] = js.native
}
