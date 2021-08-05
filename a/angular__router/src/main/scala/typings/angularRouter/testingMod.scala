package typings.angularRouter

import typings.angularCommon.mod.Location
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.NgModuleFactoryLoader
import typings.angularRouter.mod.ChildrenOutletContexts
import typings.angularRouter.mod.ExtraOptions
import typings.angularRouter.mod.Route
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.Routes
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
  class RouterTestingModule ()
    extends typings.angularRouter.testingTestingMod.RouterTestingModule
  /* static members */
  object RouterTestingModule {
    
    @JSImport("@angular/router/testing", "RouterTestingModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def withRoutes(routes: Routes): ModuleWithProviders[typings.angularRouter.testingTestingMod.RouterTestingModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[typings.angularRouter.testingTestingMod.RouterTestingModule]]
    inline def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[typings.angularRouter.testingTestingMod.RouterTestingModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRoutes")(routes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ModuleWithProviders[typings.angularRouter.testingTestingMod.RouterTestingModule]]
  }
  
  @JSImport("@angular/router/testing", "SpyNgModuleFactoryLoader")
  @js.native
  class SpyNgModuleFactoryLoader protected ()
    extends typings.angularRouter.testingTestingMod.SpyNgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
  }
  
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]]
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: Unit,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("setupTestingRouter")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[Router]
}
