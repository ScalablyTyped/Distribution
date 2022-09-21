package typings.angularRouter.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularRouter.anon.Optional
import typings.angularRouter.anon.TypeofRouterLink
import typings.angularRouter.anon.TypeofRouterLinkActive
import typings.angularRouter.anon.TypeofRouterLinkWithHref
import typings.angularRouter.anon.TypeofRouterOutlet
import typings.angularRouter.anon.TypeofɵEmptyOutletCompone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterModule")
@js.native
open class RouterModule protected () extends StObject {
  def this(guard: Any) = this()
}
/* static members */
object RouterModule {
  
  @JSImport("@angular/router", "RouterModule")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def forChild(routes: Routes): ModuleWithProviders[RouterModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forChild")(routes.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[RouterModule]]
  
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
  inline def forRoot(routes: Routes): ModuleWithProviders[RouterModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")(routes.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[RouterModule]]
  inline def forRoot(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")(routes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ModuleWithProviders[RouterModule]]
  
  @JSImport("@angular/router", "RouterModule.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterModule, js.Array[Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterModule, js.Array[Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouterModule.\u0275inj")
  @js.native
  def ɵinj: ɵɵInjectorDeclaration[RouterModule] = js.native
  inline def ɵinj_=(x: ɵɵInjectorDeclaration[RouterModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouterModule.\u0275mod")
  @js.native
  def ɵmod: ɵɵNgModuleDeclaration[
    RouterModule, 
    scala.Nothing, 
    js.Tuple5[
      TypeofRouterOutlet, 
      TypeofRouterLink, 
      TypeofRouterLinkWithHref, 
      TypeofRouterLinkActive, 
      TypeofɵEmptyOutletCompone
    ], 
    js.Tuple5[
      TypeofRouterOutlet, 
      TypeofRouterLink, 
      TypeofRouterLinkWithHref, 
      TypeofRouterLinkActive, 
      TypeofɵEmptyOutletCompone
    ]
  ] = js.native
  inline def ɵmod_=(
    x: ɵɵNgModuleDeclaration[
      RouterModule, 
      scala.Nothing, 
      js.Tuple5[
        TypeofRouterOutlet, 
        TypeofRouterLink, 
        TypeofRouterLinkWithHref, 
        TypeofRouterLinkActive, 
        TypeofɵEmptyOutletCompone
      ], 
      js.Tuple5[
        TypeofRouterOutlet, 
        TypeofRouterLink, 
        TypeofRouterLinkWithHref, 
        TypeofRouterLinkActive, 
        TypeofɵEmptyOutletCompone
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
}
