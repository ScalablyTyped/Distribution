package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRIMARY_OUTLET: atAngularRouterLib.atAngularRouterLibStrings.primary = js.native
  val ROUTER_CONFIGURATION: atAngularCoreLib.atAngularCoreMod.InjectionToken[atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.atAngularCoreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTES: atAngularCoreLib.atAngularCoreMod.InjectionToken[js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]] = js.native
  val VERSION: atAngularCoreLib.atAngularCoreMod.Version = js.native
  val ɵROUTER_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  val ɵangular_packages_router_router_a: atAngularCoreLib.atAngularCoreMod.InjectionToken[scala.Unit] = js.native
  def convertToParamMap(params: atAngularRouterLib.srcSharedMod.Params): atAngularRouterLib.srcSharedMod.ParamMap = js.native
  def provideRoutes(routes: atAngularRouterLib.srcConfigMod.Routes): js.Any = js.native
  def ɵangular_packages_router_router_b(): atAngularCoreLib.atAngularCoreMod.NgProbeToken = js.native
  def ɵangular_packages_router_router_c(
    router: atAngularRouterLib.srcRouterMod.Router,
    viewportScroller: atAngularCommonLib.atAngularCommonMod.ViewportScroller,
    config: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularRouterLib.srcRouterUnderscoreScrollerMod.RouterScroller = js.native
  def ɵangular_packages_router_router_d(
    platformLocationStrategy: atAngularCommonLib.atAngularCommonMod.PlatformLocation,
    baseHref: java.lang.String
  ): atAngularCommonLib.atAngularCommonMod.HashLocationStrategy | atAngularCommonLib.atAngularCommonMod.PathLocationStrategy = js.native
  def ɵangular_packages_router_router_d(
    platformLocationStrategy: atAngularCommonLib.atAngularCommonMod.PlatformLocation,
    baseHref: java.lang.String,
    options: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularCommonLib.atAngularCommonMod.HashLocationStrategy | atAngularCommonLib.atAngularCommonMod.PathLocationStrategy = js.native
  def ɵangular_packages_router_router_e(router: atAngularRouterLib.srcRouterMod.Router): js.Any = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy,
    routeReuseStrategy: atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod.RouteReuseStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_g(router: atAngularRouterLib.srcRouterMod.Router): atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRoute = js.native
  def ɵangular_packages_router_router_i(r: atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer): js.Any = js.native
  def ɵangular_packages_router_router_j(r: atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer): js.Any = js.native
  def ɵangular_packages_router_router_k(): js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      /* injector */ atAngularCoreLib.atAngularCoreMod.Injector, 
      atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer
    ]) | atAngularRouterLib.Anon_Deps | atAngularRouterLib.Anon_CompRef | atAngularRouterLib.Anon_CompRefDeps
  ] = js.native
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
}

