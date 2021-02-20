package typings.angularRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type DeprecatedLoadChildren = java.lang.String
  
  type DetachedRouteHandle = js.Object
  
  /**
    * Error handler that is invoked when a navigation error occurs.
    *
    * If the handler returns a value, the navigation Promise is resolved with this value.
    * If the handler throws an exception, the navigation Promise is rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  
  type LoadChildren = typings.angularRouter.mod.LoadChildrenCallback | typings.angularRouter.mod.DeprecatedLoadChildren
  
  type LoadChildrenCallback = js.Function0[
    typings.angularCore.mod.Type[js.Any] | typings.angularCore.mod.NgModuleFactory[js.Any] | typings.rxjs.mod.Observable_[typings.angularCore.mod.Type[js.Any]] | (js.Promise[
      typings.angularCore.mod.NgModuleFactory[js.Any] | typings.angularCore.mod.Type[js.Any] | js.Any
    ])
  ]
  
  @scala.inline
  def PRIMARY_OUTLET: /* "primary" */ java.lang.String = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PRIMARY_OUTLET").asInstanceOf[/* "primary" */ java.lang.String]
  
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def ROUTER_CONFIGURATION: typings.angularCore.mod.InjectionToken[typings.angularRouter.mod.ExtraOptions] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROUTER_CONFIGURATION").asInstanceOf[typings.angularCore.mod.InjectionToken[typings.angularRouter.mod.ExtraOptions]]
  
  @scala.inline
  def ROUTER_INITIALIZER: typings.angularCore.mod.InjectionToken[
    js.Function1[/* compRef */ typings.angularCore.mod.ComponentRef[js.Any], scala.Unit]
  ] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROUTER_INITIALIZER").asInstanceOf[typings.angularCore.mod.InjectionToken[
    js.Function1[/* compRef */ typings.angularCore.mod.ComponentRef[js.Any], scala.Unit]
  ]]
  
  @scala.inline
  def ROUTES_ : typings.angularCore.mod.InjectionToken[js.Array[js.Array[typings.angularRouter.mod.Route]]] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROUTES").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Array[js.Array[typings.angularRouter.mod.Route]]]]
  
  type ResolveData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Routes = js.Array[typings.angularRouter.mod.Route]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularRouter.angularRouterStrings.pathParamsChange
    - typings.angularRouter.angularRouterStrings.pathParamsOrQueryParamsChange
    - typings.angularRouter.angularRouterStrings.paramsChange
    - typings.angularRouter.angularRouterStrings.paramsOrQueryParamsChange
    - typings.angularRouter.angularRouterStrings.always
    - js.Function2[
  / * from * / typings.angularRouter.mod.ActivatedRouteSnapshot, 
  / * to * / typings.angularRouter.mod.ActivatedRouteSnapshot, 
  scala.Boolean]
  */
  type RunGuardsAndResolvers = typings.angularRouter.mod._RunGuardsAndResolvers | (js.Function2[
    /* from */ typings.angularRouter.mod.ActivatedRouteSnapshot, 
    /* to */ typings.angularRouter.mod.ActivatedRouteSnapshot, 
    scala.Boolean
  ])
  
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[typings.angularRouter.mod.UrlSegment], 
    /* group */ typings.angularRouter.mod.UrlSegmentGroup, 
    /* route */ typings.angularRouter.mod.Route, 
    typings.angularRouter.mod.UrlMatchResult | scala.Null
  ]
  
  @scala.inline
  def VERSION: typings.angularCore.mod.Version = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typings.angularCore.mod.Version]
  
  @scala.inline
  def convertToParamMap(params: typings.angularRouter.mod.Params): typings.angularRouter.mod.ParamMap = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertToParamMap")(params.asInstanceOf[js.Any]).asInstanceOf[typings.angularRouter.mod.ParamMap]
  
  @scala.inline
  def provideRoutes(routes: typings.angularRouter.mod.Routes): js.Any = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵROUTERPROVIDERS: js.Array[typings.angularCore.mod.Provider] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ROUTER_PROVIDERS").asInstanceOf[js.Array[typings.angularCore.mod.Provider]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterA: typings.angularCore.mod.InjectionToken[scala.Unit] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_router_router_a").asInstanceOf[typings.angularCore.mod.InjectionToken[scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterB(): typings.angularCore.mod.NgProbeToken = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_b")().asInstanceOf[typings.angularCore.mod.NgProbeToken]
  
  @scala.inline
  def ɵangularPackagesRouterRouterC(
    router: typings.angularRouter.mod.Router,
    viewportScroller: typings.angularCommon.mod.ViewportScroller,
    config: typings.angularRouter.mod.ExtraOptions
  ): typings.angularRouter.mod.ɵangularPackagesRouterRouterO = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_c")(router.asInstanceOf[js.Any], viewportScroller.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.ɵangularPackagesRouterRouterO]
  
  @scala.inline
  def ɵangularPackagesRouterRouterD(platformLocationStrategy: typings.angularCommon.mod.PlatformLocation, baseHref: java.lang.String): typings.angularCommon.mod.HashLocationStrategy | typings.angularCommon.mod.PathLocationStrategy = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_d")(platformLocationStrategy.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any])).asInstanceOf[typings.angularCommon.mod.HashLocationStrategy | typings.angularCommon.mod.PathLocationStrategy]
  @scala.inline
  def ɵangularPackagesRouterRouterD(
    platformLocationStrategy: typings.angularCommon.mod.PlatformLocation,
    baseHref: java.lang.String,
    options: typings.angularRouter.mod.ExtraOptions
  ): typings.angularCommon.mod.HashLocationStrategy | typings.angularCommon.mod.PathLocationStrategy = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_d")(platformLocationStrategy.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularCommon.mod.HashLocationStrategy | typings.angularCommon.mod.PathLocationStrategy]
  
  @scala.inline
  def ɵangularPackagesRouterRouterE(router: typings.angularRouter.mod.Router): js.Any = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_e")(router.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]]
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: js.UndefOr[scala.Nothing],
    routeReuseStrategy: typings.angularRouter.mod.RouteReuseStrategy
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: typings.angularRouter.mod.UrlHandlingStrategy
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: typings.angularRouter.mod.UrlHandlingStrategy,
    routeReuseStrategy: typings.angularRouter.mod.RouteReuseStrategy
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: typings.angularRouter.mod.ExtraOptions
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: typings.angularRouter.mod.ExtraOptions,
    urlHandlingStrategy: js.UndefOr[scala.Nothing],
    routeReuseStrategy: typings.angularRouter.mod.RouteReuseStrategy
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: typings.angularRouter.mod.ExtraOptions,
    urlHandlingStrategy: typings.angularRouter.mod.UrlHandlingStrategy
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  @scala.inline
  def ɵangularPackagesRouterRouterF(
    urlSerializer: typings.angularRouter.mod.UrlSerializer,
    contexts: typings.angularRouter.mod.ChildrenOutletContexts,
    location: typings.angularCommon.mod.Location,
    injector: typings.angularCore.mod.Injector,
    loader: typings.angularCore.mod.NgModuleFactoryLoader,
    compiler: typings.angularCore.mod.Compiler,
    config: js.Array[js.Array[typings.angularRouter.mod.Route]],
    opts: typings.angularRouter.mod.ExtraOptions,
    urlHandlingStrategy: typings.angularRouter.mod.UrlHandlingStrategy,
    routeReuseStrategy: typings.angularRouter.mod.RouteReuseStrategy
  ): typings.angularRouter.mod.Router = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_f")(urlSerializer.asInstanceOf[js.Any], contexts.asInstanceOf[js.Any], location.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], urlHandlingStrategy.asInstanceOf[js.Any], routeReuseStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularRouter.mod.Router]
  
  @scala.inline
  def ɵangularPackagesRouterRouterG(router: typings.angularRouter.mod.Router): typings.angularRouter.mod.ActivatedRoute = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_g")(router.asInstanceOf[js.Any]).asInstanceOf[typings.angularRouter.mod.ActivatedRoute]
  
  @scala.inline
  def ɵangularPackagesRouterRouterI(r: typings.angularRouter.mod.ɵangularPackagesRouterRouterH): js.Function0[js.Promise[_]] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_i")(r.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[_]]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterJ(r: typings.angularRouter.mod.ɵangularPackagesRouterRouterH): js.Function1[/* bootstrappedComponentRef */ typings.angularCore.mod.ComponentRef[_], scala.Unit] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_j")(r.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bootstrappedComponentRef */ typings.angularCore.mod.ComponentRef[_], scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesRouterRouterK(): js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      /* injector */ typings.angularCore.mod.Injector, 
      typings.angularRouter.mod.ɵangularPackagesRouterRouterH
    ]) | typings.angularRouter.anon.Deps | typings.angularRouter.anon.Multi | typings.angularRouter.anon.Provide
  ] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_router_router_k")().asInstanceOf[js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      /* injector */ typings.angularCore.mod.Injector, 
      typings.angularRouter.mod.ɵangularPackagesRouterRouterH
    ]) | typings.angularRouter.anon.Deps | typings.angularRouter.anon.Multi | typings.angularRouter.anon.Provide
  ]]
  
  @scala.inline
  def ɵassignExtraOptionsToRouter(opts: typings.angularRouter.mod.ExtraOptions, router: typings.angularRouter.mod.Router): scala.Unit = (typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275assignExtraOptionsToRouter")(opts.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = typings.angularRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
