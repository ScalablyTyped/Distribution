package typings.angularRouter

import typings.angularCommon.mod.Location
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularRouter.anon.TypeofRouterModule
import typings.angularRouter.mod.ChildrenOutletContexts
import typings.angularRouter.mod.ExtraOptions
import typings.angularRouter.mod.Route
import typings.angularRouter.mod.RouteReuseStrategy
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.Routes
import typings.angularRouter.mod.TitleStrategy
import typings.angularRouter.mod.UrlHandlingStrategy
import typings.angularRouter.mod.UrlSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/router/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router/testing", "RouterTestingModule")
  @js.native
  open class RouterTestingModule () extends StObject
  /* static members */
  object RouterTestingModule {
    
    @JSImport("@angular/router/testing", "RouterTestingModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def withRoutes(routes: Routes): ModuleWithProviders[RouterTestingModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[RouterTestingModule]]
    inline def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterTestingModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRoutes")(routes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ModuleWithProviders[RouterTestingModule]]
    
    @JSImport("@angular/router/testing", "RouterTestingModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[RouterTestingModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterTestingModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/testing", "RouterTestingModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[RouterTestingModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[RouterTestingModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/testing", "RouterTestingModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[RouterTestingModule, scala.Nothing, scala.Nothing, js.Array[TypeofRouterModule]] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[RouterTestingModule, scala.Nothing, scala.Nothing, js.Array[TypeofRouterModule]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]]
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Null,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: Unit,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy,
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: Unit,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: ExtraOptions
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: ExtraOptions,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: Unit,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouterInternal(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    titleStrategy: TitleStrategy,
    opts: UrlHandlingStrategy,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouterInternal")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], titleStrategy.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
}
