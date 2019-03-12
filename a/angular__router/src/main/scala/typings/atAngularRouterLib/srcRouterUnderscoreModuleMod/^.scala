package typings
package atAngularRouterLib.srcRouterUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ROUTER_CONFIGURATION: atAngularCoreLib.atAngularCoreMod.InjectionToken[ExtraOptions] = js.native
  val ROUTER_FORROOT_GUARD: atAngularCoreLib.atAngularCoreMod.InjectionToken[scala.Unit] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.atAngularCoreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTER_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  def createRouterScroller(
    router: atAngularRouterLib.srcRouterMod.Router,
    viewportScroller: atAngularCommonLib.atAngularCommonMod.ViewportScroller,
    config: ExtraOptions
  ): atAngularRouterLib.srcRouterUnderscoreScrollerMod.RouterScroller = js.native
  def getAppInitializer(r: RouterInitializer): js.Any = js.native
  def getBootstrapListener(r: RouterInitializer): js.Any = js.native
  def provideForRootGuard(router: atAngularRouterLib.srcRouterMod.Router): js.Any = js.native
  def provideLocationStrategy(
    platformLocationStrategy: atAngularCommonLib.atAngularCommonMod.PlatformLocation,
    baseHref: java.lang.String
  ): atAngularCommonLib.atAngularCommonMod.HashLocationStrategy | atAngularCommonLib.atAngularCommonMod.PathLocationStrategy = js.native
  def provideLocationStrategy(
    platformLocationStrategy: atAngularCommonLib.atAngularCommonMod.PlatformLocation,
    baseHref: java.lang.String,
    options: ExtraOptions
  ): atAngularCommonLib.atAngularCommonMod.HashLocationStrategy | atAngularCommonLib.atAngularCommonMod.PathLocationStrategy = js.native
  def provideRouterInitializer(): js.Array[
    (org.scalablytyped.runtime.Instantiable1[/* injector */ atAngularCoreLib.atAngularCoreMod.Injector, RouterInitializer]) | atAngularRouterLib.Anon_Deps | atAngularRouterLib.Anon_CompRef | atAngularRouterLib.Anon_CompRefDeps
  ] = js.native
  def provideRoutes(routes: atAngularRouterLib.srcConfigMod.Routes): js.Any = js.native
  def rootRoute(router: atAngularRouterLib.srcRouterMod.Router): atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRoute = js.native
  def routerNgProbeToken(): atAngularCoreLib.atAngularCoreMod.NgProbeToken = js.native
  def setupRouter(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def setupRouter(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: ExtraOptions
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def setupRouter(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def setupRouter(
    ref: atAngularCoreLib.atAngularCoreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.atAngularCommonMod.Location,
    injector: atAngularCoreLib.atAngularCoreMod.Injector,
    loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.atAngularCoreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy,
    routeReuseStrategy: atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod.RouteReuseStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
}

