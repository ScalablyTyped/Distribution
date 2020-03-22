package typings.angularRouter

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class RouterTestingModule () extends js.Object
  
  @js.native
  class SpyNgModuleFactoryLoader protected () extends NgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
    /**
      * @docsNotRequired
      */
    var _stubbedModules: js.Any = js.native
    var compiler: js.Any = js.native
    /**
      * @docsNotRequired
      */
    def stubbedModules(): StringDictionary[js.Any] = js.native
    /**
      * @docsNotRequired
      */
    def stubbedModules(modules: StringDictionary[js.Any]): js.Any = js.native
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
    def withRoutes(routes: Routes): ModuleWithProviders[RouterTestingModule] = js.native
    def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterTestingModule] = js.native
  }
  
}

