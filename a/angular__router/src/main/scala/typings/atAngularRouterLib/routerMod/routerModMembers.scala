package typings
package atAngularRouterLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", JSImport.Namespace)
@js.native
object routerModMembers extends js.Object {
  val PRIMARY_OUTLET: /* primary */ java.lang.String = js.native
  val ROUTER_CONFIGURATION: atAngularCoreLib.coreMod.InjectionToken[atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.coreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.coreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTES: atAngularCoreLib.coreMod.InjectionToken[js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]] = js.native
  val VERSION: atAngularCoreLib.coreMod.Version = js.native
  val ɵROUTER_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  val ɵangular_packages_router_router_a: atAngularCoreLib.coreMod.InjectionToken[scala.Unit] = js.native
  def convertToParamMap(params: atAngularRouterLib.srcSharedMod.Params): atAngularRouterLib.srcSharedMod.ParamMap = js.native
  def provideRoutes(routes: atAngularRouterLib.srcConfigMod.Routes): js.Any = js.native
  def ɵangular_packages_router_router_b(): atAngularCoreLib.coreMod.NgProbeToken = js.native
  def ɵangular_packages_router_router_c(
    router: atAngularRouterLib.srcRouterMod.Router,
    viewportScroller: atAngularCommonLib.commonMod.ViewportScroller,
    config: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularRouterLib.srcRouterUnderscoreScrollerMod.RouterScroller = js.native
  def ɵangular_packages_router_router_d(
    platformLocationStrategy: atAngularCommonLib.commonMod.PlatformLocation,
    baseHref: java.lang.String
  ): atAngularCommonLib.commonMod.HashLocationStrategy | atAngularCommonLib.commonMod.PathLocationStrategy = js.native
  def ɵangular_packages_router_router_d(
    platformLocationStrategy: atAngularCommonLib.commonMod.PlatformLocation,
    baseHref: java.lang.String,
    options: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularCommonLib.commonMod.HashLocationStrategy | atAngularCommonLib.commonMod.PathLocationStrategy = js.native
  def ɵangular_packages_router_router_e(router: atAngularRouterLib.srcRouterMod.Router): js.Any = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def ɵangular_packages_router_router_f(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
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
      /* injector */ atAngularCoreLib.coreMod.Injector, 
      atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer
    ]) | atAngularRouterLib.Anon_Deps | atAngularRouterLib.Anon_CompRef | atAngularRouterLib.Anon_CompRefDeps
  ] = js.native
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
}

