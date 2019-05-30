package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRIMARY_OUTLET: atAngularRouterLib.atAngularRouterLibStrings.primary = js.native
  val ROUTER_CONFIGURATION: atAngularCoreLib.atAngularCoreMod.InjectionToken[ExtraOptions] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.atAngularCoreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTES: atAngularCoreLib.atAngularCoreMod.InjectionToken[js.Array[js.Array[Route]]] = js.native
  val VERSION: atAngularCoreLib.atAngularCoreMod.Version = js.native
  val ɵROUTER_PROVIDERS: js.Array[atAngularCoreLib.atAngularCoreMod.Provider] = js.native
  val ɵangular_packages_router_router_a: atAngularCoreLib.atAngularCoreMod.InjectionToken[scala.Unit] = js.native
  def convertToParamMap(params: Params): ParamMap = js.native
  def provideRoutes(routes: Routes): js.Any = js.native
  def ɵangular_packages_router_router_b(): atAngularCoreLib.atAngularCoreMod.NgProbeToken = js.native
  def ɵangular_packages_router_router_c(
    router: Router,
    viewportScroller: atAngularCommonLib.atAngularCommonMod.ViewportScroller,
    config: ExtraOptions
  ): ɵangular_packages_router_router_o = js.native
  def ɵangular_packages_router_router_d(
    platformLocationStrategy: atAngularCommonLib.atAngularCommonMod.PlatformLocation,
    baseHref: java.lang.String
  ): atAngularCommonLib.atAngularCommonMod.HashLocationStrategy | atAngularCommonLib.atAngularCommonMod.PathLocationStrategy = js.native
  def ɵangular_packages_router_router_d(
    platformLocationStrategy: atAngularCommonLib.atAngularCommonMod.PlatformLocation,
    baseHref: java.lang.String,
    options: ExtraOptions
  ): atAngularCommonLib.atAngularCommonMod.HashLocationStrategy | atAngularCommonLib.atAngularCommonMod.PathLocationStrategy = js.native
  def ɵangular_packages_router_router_e(router: Router): js.Any = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[Route]]
  ): Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = js.native
  def ɵangular_packages_router_router_g(router: Router): ActivatedRoute = js.native
  def ɵangular_packages_router_router_i(r: ɵangular_packages_router_router_h): js.Any = js.native
  def ɵangular_packages_router_router_j(r: ɵangular_packages_router_router_h): js.Any = js.native
  def ɵangular_packages_router_router_k(): js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      /* injector */ atAngularCoreLib.atAngularCoreMod.Injector, 
      ɵangular_packages_router_router_h
    ]) | atAngularRouterLib.Anon_Deps | atAngularRouterLib.Anon_CompRef | atAngularRouterLib.Anon_CompRefDeps
  ] = js.native
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
}

