package typings.atAngularRouter

import typings.atAngularCommon.atAngularCommonMod.Location
import typings.atAngularCore.atAngularCoreMod.Compiler
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typings.atAngularCore.atAngularCoreMod.NgModuleFactoryLoader
import typings.atAngularRouter.atAngularRouterMod.ChildrenOutletContexts
import typings.atAngularRouter.atAngularRouterMod.ExtraOptions
import typings.atAngularRouter.atAngularRouterMod.Route
import typings.atAngularRouter.atAngularRouterMod.Router
import typings.atAngularRouter.atAngularRouterMod.Routes
import typings.atAngularRouter.atAngularRouterMod.UrlHandlingStrategy
import typings.atAngularRouter.atAngularRouterMod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class RouterTestingModule ()
    extends typings.atAngularRouter.testingTestingMod.RouterTestingModule
  
  @js.native
  class SpyNgModuleFactoryLoader protected ()
    extends typings.atAngularRouter.testingTestingMod.SpyNgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
  }
  
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]]
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  /* static members */
  @js.native
  object RouterTestingModule extends js.Object {
    def withRoutes(routes: Routes): ModuleWithProviders[typings.atAngularRouter.testingTestingMod.RouterTestingModule] = js.native
    def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[typings.atAngularRouter.testingTestingMod.RouterTestingModule] = js.native
  }
  
}

