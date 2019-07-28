package typings.atAngularRouter.atAngularRouterMod

import org.scalablytyped.runtime.Instantiable1
import typings.atAngularCommon.atAngularCommonMod.HashLocationStrategy
import typings.atAngularCommon.atAngularCommonMod.Location
import typings.atAngularCommon.atAngularCommonMod.PathLocationStrategy
import typings.atAngularCommon.atAngularCommonMod.PlatformLocation
import typings.atAngularCommon.atAngularCommonMod.ViewportScroller
import typings.atAngularCore.atAngularCoreMod.ApplicationRef
import typings.atAngularCore.atAngularCoreMod.Compiler
import typings.atAngularCore.atAngularCoreMod.ComponentRef
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgModuleFactoryLoader
import typings.atAngularCore.atAngularCoreMod.NgProbeToken
import typings.atAngularCore.atAngularCoreMod.Provider
import typings.atAngularCore.atAngularCoreMod.Version
import typings.atAngularRouter.Anon_CompRef
import typings.atAngularRouter.Anon_CompRefDeps
import typings.atAngularRouter.Anon_Deps
import typings.atAngularRouter.atAngularRouterStrings.primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRIMARY_OUTLET: primary = js.native
  val ROUTER_CONFIGURATION: InjectionToken[ExtraOptions] = js.native
  val ROUTER_INITIALIZER: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]] = js.native
  val ROUTES: InjectionToken[js.Array[js.Array[Route]]] = js.native
  val VERSION: Version = js.native
  val ɵROUTER_PROVIDERS: js.Array[Provider] = js.native
  val ɵangular_packages_router_router_a: InjectionToken[Unit] = js.native
  def convertToParamMap(params: Params): ParamMap = js.native
  def provideRoutes(routes: Routes): js.Any = js.native
  def ɵangular_packages_router_router_b(): NgProbeToken = js.native
  def ɵangular_packages_router_router_c(router: Router, viewportScroller: ViewportScroller, config: ExtraOptions): ɵangular_packages_router_router_o = js.native
  def ɵangular_packages_router_router_d(platformLocationStrategy: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_router_router_d(platformLocationStrategy: PlatformLocation, baseHref: String, options: ExtraOptions): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_router_router_e(router: Router): js.Any = js.native
  def ɵangular_packages_router_router_f(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]]
  ): Router = js.native
  def ɵangular_packages_router_router_f(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def ɵangular_packages_router_router_f(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def ɵangular_packages_router_router_f(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = js.native
  def ɵangular_packages_router_router_g(router: Router): ActivatedRoute = js.native
  def ɵangular_packages_router_router_i(r: ɵangular_packages_router_router_h): js.Any = js.native
  def ɵangular_packages_router_router_j(r: ɵangular_packages_router_router_h): js.Any = js.native
  def ɵangular_packages_router_router_k(): js.Array[
    (Instantiable1[/* injector */ Injector, ɵangular_packages_router_router_h]) | Anon_Deps | Anon_CompRef | Anon_CompRefDeps
  ] = js.native
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
}

