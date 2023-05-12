package typings.angularRouter

import typings.angularCommon.mod.Location
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.DebugElement
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.Type
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
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/router/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router/testing", "RouterTestingHarness")
  @js.native
  open class RouterTestingHarness () extends StObject {
    
    /** Instructs the root fixture to run change detection. */
    def detectChanges(): Unit = js.native
    
    /* private */ val fixture: Any = js.native
    
    /**
      * Triggers a `Router` navigation and waits for it to complete.
      *
      * The root component with a `RouterOutlet` created for the harness is used to render `Route`
      * components. The root component is reused within the same test in subsequent calls to
      * `navigateForTest`.
      *
      * When testing `Routes` with a guards that reject the navigation, the `RouterOutlet` might not be
      * activated and the `activatedComponent` may be `null`.
      *
      * {@example router/testing/test/router_testing_harness_examples.spec.ts region='Guard'}
      *
      * @param url The target of the navigation. Passed to `Router.navigateByUrl`.
      * @returns The activated component instance of the `RouterOutlet` after navigation completes
      *     (`null` if the outlet does not get activated).
      */
    def navigateByUrl(url: String): js.Promise[Null | js.Object] = js.native
    /**
      * Triggers a router navigation and waits for it to complete.
      *
      * The root component with a `RouterOutlet` created for the harness is used to render `Route`
      * components.
      *
      * {@example router/testing/test/router_testing_harness_examples.spec.ts region='RoutedComponent'}
      *
      * The root component is reused within the same test in subsequent calls to `navigateByUrl`.
      *
      * This function also makes it easier to test components that depend on `ActivatedRoute` data.
      *
      * {@example router/testing/test/router_testing_harness_examples.spec.ts region='ActivatedRoute'}
      *
      * @param url The target of the navigation. Passed to `Router.navigateByUrl`.
      * @param requiredRoutedComponentType After navigation completes, the required type for the
      *     activated component of the `RouterOutlet`. If the outlet is not activated or a different
      *     component is activated, this function will throw an error.
      * @returns The activated component instance of the `RouterOutlet` after navigation completes.
      */
    def navigateByUrl[T](url: String, requiredRoutedComponentType: Type[T]): js.Promise[T] = js.native
    
    /** The `DebugElement` of the `RouterOutlet` component. `null` if the outlet is not activated. */
    def routeDebugElement: DebugElement | Null = js.native
    
    /** The native element of the `RouterOutlet` component. `null` if the outlet is not activated. */
    def routeNativeElement: HTMLElement | Null = js.native
  }
  /* static members */
  object RouterTestingHarness {
    
    @JSImport("@angular/router/testing", "RouterTestingHarness")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `RouterTestingHarness` instance.
      *
      * The `RouterTestingHarness` also creates its own root component with a `RouterOutlet` for the
      * purposes of rendering route components.
      *
      * Throws an error if an instance has already been created.
      * Use of this harness also requires `destroyAfterEach: true` in the `ModuleTeardownOptions`
      *
      * @param initialUrl The target of navigation to trigger before returning the harness.
      */
    inline def create(): js.Promise[RouterTestingHarness] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[RouterTestingHarness]]
    inline def create(initialUrl: String): js.Promise[RouterTestingHarness] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RouterTestingHarness]]
  }
  
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
}
