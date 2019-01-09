package typings
package atAngularRouterLib.srcRouterUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_module", JSImport.Namespace)
@js.native
object srcRouterUnderscoreModuleModMembers extends js.Object {
  val ROUTER_CONFIGURATION: atAngularCoreLib.coreMod.InjectionToken[ExtraOptions] = js.native
  val ROUTER_FORROOT_GUARD: atAngularCoreLib.coreMod.InjectionToken[scala.Unit] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.coreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.coreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTER_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  def createRouterScroller(
    router: atAngularRouterLib.srcRouterMod.Router,
    viewportScroller: atAngularCommonLib.commonMod.ViewportScroller,
    config: ExtraOptions
  ): atAngularRouterLib.srcRouterUnderscoreScrollerMod.RouterScroller = js.native
  def getAppInitializer(r: RouterInitializer): js.Any = js.native
  def getBootstrapListener(r: RouterInitializer): js.Any = js.native
  def provideForRootGuard(router: atAngularRouterLib.srcRouterMod.Router): js.Any = js.native
  def provideLocationStrategy(
    platformLocationStrategy: atAngularCommonLib.commonMod.PlatformLocation,
    baseHref: java.lang.String
  ): atAngularCommonLib.commonMod.HashLocationStrategy | atAngularCommonLib.commonMod.PathLocationStrategy = js.native
  def provideLocationStrategy(
    platformLocationStrategy: atAngularCommonLib.commonMod.PlatformLocation,
    baseHref: java.lang.String,
    options: ExtraOptions
  ): atAngularCommonLib.commonMod.HashLocationStrategy | atAngularCommonLib.commonMod.PathLocationStrategy = js.native
  def provideRouterInitializer(): js.Array[
    (org.scalablytyped.runtime.Instantiable1[/* injector */ atAngularCoreLib.coreMod.Injector, RouterInitializer]) | atAngularRouterLib.Anon_Deps | atAngularRouterLib.Anon_CompRef | atAngularRouterLib.Anon_CompRefDeps
  ] = js.native
  def provideRoutes(routes: atAngularRouterLib.srcConfigMod.Routes): js.Any = js.native
  def rootRoute(router: atAngularRouterLib.srcRouterMod.Router): atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRoute = js.native
  def routerNgProbeToken(): atAngularCoreLib.coreMod.NgProbeToken = js.native
  def setupRouter(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def setupRouter(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: ExtraOptions
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def setupRouter(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
  def setupRouter(
    ref: atAngularCoreLib.coreMod.ApplicationRef,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    contexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts,
    location: atAngularCommonLib.commonMod.Location,
    injector: atAngularCoreLib.coreMod.Injector,
    loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader,
    compiler: atAngularCoreLib.coreMod.Compiler,
    config: js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy,
    routeReuseStrategy: atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod.RouteReuseStrategy
  ): atAngularRouterLib.srcRouterMod.Router = js.native
}

