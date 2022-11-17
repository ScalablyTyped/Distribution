package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EnvironmentProviders
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularRouter.mod.^
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def PRIMARY_OUTLET: /* "primary" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMARY_OUTLET").asInstanceOf[/* "primary" */ String]

inline def ROUTER_CONFIGURATION: InjectionToken[ExtraOptions] = ^.asInstanceOf[js.Dynamic].selectDynamic("ROUTER_CONFIGURATION").asInstanceOf[InjectionToken[ExtraOptions]]

inline def ROUTER_INITIALIZER: InjectionToken[js.Function1[/* compRef */ ComponentRef[Any], Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ROUTER_INITIALIZER").asInstanceOf[InjectionToken[js.Function1[/* compRef */ ComponentRef[Any], Unit]]]

inline def ROUTES_ : InjectionToken[js.Array[js.Array[Route]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ROUTES").asInstanceOf[InjectionToken[js.Array[js.Array[Route]]]]

inline def VERSION: Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def convertToParamMap(params: Params): ParamMap = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToParamMap")(params.asInstanceOf[js.Any]).asInstanceOf[ParamMap]

inline def createUrlTreeFromSnapshot(relativeTo: ActivatedRouteSnapshot, commands: js.Array[Any]): UrlTree = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrlTreeFromSnapshot")(relativeTo.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[UrlTree]
inline def createUrlTreeFromSnapshot(relativeTo: ActivatedRouteSnapshot, commands: js.Array[Any], queryParams: Null, fragment: String): UrlTree = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrlTreeFromSnapshot")(relativeTo.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any])).asInstanceOf[UrlTree]
inline def createUrlTreeFromSnapshot(relativeTo: ActivatedRouteSnapshot, commands: js.Array[Any], queryParams: Unit, fragment: String): UrlTree = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrlTreeFromSnapshot")(relativeTo.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any])).asInstanceOf[UrlTree]
inline def createUrlTreeFromSnapshot(relativeTo: ActivatedRouteSnapshot, commands: js.Array[Any], queryParams: Params): UrlTree = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrlTreeFromSnapshot")(relativeTo.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[UrlTree]
inline def createUrlTreeFromSnapshot(relativeTo: ActivatedRouteSnapshot, commands: js.Array[Any], queryParams: Params, fragment: String): UrlTree = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrlTreeFromSnapshot")(relativeTo.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], fragment.asInstanceOf[js.Any])).asInstanceOf[UrlTree]

inline def defaultUrlMatcher(segments: js.Array[UrlSegment], segmentGroup: UrlSegmentGroup, route: Route): UrlMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrlMatcher")(segments.asInstanceOf[js.Any], segmentGroup.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[UrlMatchResult | Null]

inline def provideRouter(routes: Routes, features: RouterFeatures*): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideRouter")(scala.List(routes.asInstanceOf[js.Any]).`++`(features.asInstanceOf[Seq[js.Any]])*).asInstanceOf[EnvironmentProviders]

inline def provideRoutes(routes: Routes): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]

inline def withDebugTracing(): DebugTracingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withDebugTracing")().asInstanceOf[DebugTracingFeature]

inline def withDisabledInitialNavigation(): DisabledInitialNavigationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withDisabledInitialNavigation")().asInstanceOf[DisabledInitialNavigationFeature]

inline def withEnabledBlockingInitialNavigation(): EnabledBlockingInitialNavigationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withEnabledBlockingInitialNavigation")().asInstanceOf[EnabledBlockingInitialNavigationFeature]

inline def withInMemoryScrolling(): InMemoryScrollingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withInMemoryScrolling")().asInstanceOf[InMemoryScrollingFeature]
inline def withInMemoryScrolling(options: InMemoryScrollingOptions): InMemoryScrollingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withInMemoryScrolling")(options.asInstanceOf[js.Any]).asInstanceOf[InMemoryScrollingFeature]

/**
  * Allows to configure a preloading strategy to use. The strategy is configured by providing a
  * reference to a class that implements a `PreloadingStrategy`.
  *
  * @usageNotes
  *
  * Basic example of how you can configure preloading:
  * ```
  * const appRoutes: Routes = [];
  * bootstrapApplication(AppComponent,
  *   {
  *     providers: [
  *       provideRouter(appRoutes, withPreloading(PreloadAllModules))
  *     ]
  *   }
  * );
  * ```
  *
  * @see `provideRouter`
  *
  * @param preloadingStrategy A reference to a class that implements a `PreloadingStrategy` that
  *     should be used.
  * @returns A set of providers for use with `provideRouter`.
  *
  * @publicApi
  */
inline def withPreloading(preloadingStrategy: Type[PreloadingStrategy]): PreloadingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withPreloading")(preloadingStrategy.asInstanceOf[js.Any]).asInstanceOf[PreloadingFeature]

inline def withRouterConfig(options: RouterConfigOptions): RouterConfigurationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouterConfig")(options.asInstanceOf[js.Any]).asInstanceOf[RouterConfigurationFeature]

inline def ɵROUTERPROVIDERS: js.Array[Provider] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ROUTER_PROVIDERS").asInstanceOf[js.Array[Provider]]

inline def ɵassignExtraOptionsToRouter(opts: ExtraOptions, router: Router): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275assignExtraOptionsToRouter")(opts.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]

/**
  * Allows to configure a preloading strategy to use. The strategy is configured by providing a
  * reference to a class that implements a `PreloadingStrategy`.
  *
  * @usageNotes
  *
  * Basic example of how you can configure preloading:
  * ```
  * const appRoutes: Routes = [];
  * bootstrapApplication(AppComponent,
  *   {
  *     providers: [
  *       provideRouter(appRoutes, withPreloading(PreloadAllModules))
  *     ]
  *   }
  * );
  * ```
  *
  * @see `provideRouter`
  *
  * @param preloadingStrategy A reference to a class that implements a `PreloadingStrategy` that
  *     should be used.
  * @returns A set of providers for use with `provideRouter`.
  *
  * @publicApi
  */
inline def ɵwithPreloading(preloadingStrategy: Type[PreloadingStrategy]): PreloadingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275withPreloading")(preloadingStrategy.asInstanceOf[js.Any]).asInstanceOf[PreloadingFeature]

type CanActivateChildFn = js.Function2[
/* childRoute */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanActivateFn = js.Function2[
/* route */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanDeactivateFn[T] = js.Function4[
/* component */ T, 
/* currentRoute */ ActivatedRouteSnapshot, 
/* currentState */ RouterStateSnapshot, 
/* nextState */ js.UndefOr[RouterStateSnapshot], 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanLoadFn = js.Function2[
/* route */ Route, 
/* segments */ js.Array[UrlSegment], 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanMatchFn = js.Function2[
/* route */ Route, 
/* segments */ js.Array[UrlSegment], 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type Data = StringDictionary[Any]

type DebugTracingFeature = RouterFeature[1]

type DetachedRouteHandle = js.Object

type DisabledInitialNavigationFeature = RouterFeature[3]

type EnabledBlockingInitialNavigationFeature = RouterFeature[2]

/**
  * Error handler that is invoked when a navigation error occurs.
  *
  * If the handler returns a value, the navigation Promise is resolved with this value.
  * If the handler throws an exception, the navigation Promise is rejected with
  * the exception.
  *
  * @publicApi
  */
type ErrorHandler = js.Function1[/* error */ Any, Any]

/**
  * Router events that allow you to track the lifecycle of the router.
  *
  * The events occur in the following sequence:
  *
  * * [NavigationStart](api/router/NavigationStart): Navigation starts.
  * * [RouteConfigLoadStart](api/router/RouteConfigLoadStart): Before
  * the router [lazy loads](/guide/router#lazy-loading) a route configuration.
  * * [RouteConfigLoadEnd](api/router/RouteConfigLoadEnd): After a route has been lazy loaded.
  * * [RoutesRecognized](api/router/RoutesRecognized): When the router parses the URL
  * and the routes are recognized.
  * * [GuardsCheckStart](api/router/GuardsCheckStart): When the router begins the *guards*
  * phase of routing.
  * * [ChildActivationStart](api/router/ChildActivationStart): When the router
  * begins activating a route's children.
  * * [ActivationStart](api/router/ActivationStart): When the router begins activating a route.
  * * [GuardsCheckEnd](api/router/GuardsCheckEnd): When the router finishes the *guards*
  * phase of routing successfully.
  * * [ResolveStart](api/router/ResolveStart): When the router begins the *resolve*
  * phase of routing.
  * * [ResolveEnd](api/router/ResolveEnd): When the router finishes the *resolve*
  * phase of routing successfully.
  * * [ChildActivationEnd](api/router/ChildActivationEnd): When the router finishes
  * activating a route's children.
  * * [ActivationEnd](api/router/ActivationEnd): When the router finishes activating a route.
  * * [NavigationEnd](api/router/NavigationEnd): When navigation ends successfully.
  * * [NavigationCancel](api/router/NavigationCancel): When navigation is canceled.
  * * [NavigationError](api/router/NavigationError): When navigation fails
  * due to an unexpected error.
  * * [Scroll](api/router/Scroll): When the user scrolls.
  *
  * @publicApi
  */
type Event2 = RouterEvent | NavigationStart | NavigationEnd | NavigationCancel | NavigationError | RoutesRecognized | GuardsCheckStart | GuardsCheckEnd | RouteConfigLoadStart | RouteConfigLoadEnd | ChildActivationStart | ChildActivationEnd | ActivationStart | ActivationEnd | Scroll | ResolveStart | ResolveEnd

type EventType = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15

type InMemoryScrollingFeature = RouterFeature[4]

type InitialNavigation = "disabled" | "enabledBlocking" | "enabledNonBlocking"

type InitialNavigationFeature = EnabledBlockingInitialNavigationFeature | DisabledInitialNavigationFeature

type LoadChildren = LoadChildrenCallback | ɵDeprecatedLoadChildren

type LoadChildrenCallback = js.Function0[
Type[Any] | NgModuleFactory[Any] | Routes | (Observable_[Type[Any] | Routes | (DefaultExport[Routes | Type[Any]])]) | (js.Promise[NgModuleFactory[Any] | Type[Any] | Routes | (DefaultExport[Routes | Type[Any]])])]

type NavigationCancellationCode = 0 | 1 | 2 | 3

/**
  * Identifies the call or event that triggered a navigation.
  *
  * * 'imperative': Triggered by `router.navigateByUrl()` or `router.navigate()`.
  * * 'popstate' : Triggered by a `popstate` event.
  * * 'hashchange'-: Triggered by a `hashchange` event.
  *
  * @publicApi
  */
type NavigationTrigger = "imperative" | "popstate" | "hashchange"

type Params = StringDictionary[Any]

type PreloadingFeature = RouterFeature[0]

type QueryParamsHandling = "merge" | "preserve" | ""

type ResolveData = StringDictionary[Any | ResolveFn[Any]]

type ResolveFn[T] = js.Function2[
/* route */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
Observable_[T] | js.Promise[T] | T]

type RouterConfigurationFeature = RouterFeature[5]

/**
  * The list of features as an enum to uniquely type each feature.
  */
type RouterFeatureKind = 0 | 1 | 2 | 3 | 4 | 5

type RouterFeatures = PreloadingFeature | DebugTracingFeature | InitialNavigationFeature | InMemoryScrollingFeature | RouterConfigurationFeature

type Routes = js.Array[Route]

type RunGuardsAndResolvers = "pathParamsChange" | "pathParamsOrQueryParamsChange" | "paramsChange" | "paramsOrQueryParamsChange" | "always" | (js.Function2[/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot, Boolean])

type UrlMatcher = js.Function3[
/* segments */ js.Array[UrlSegment], 
/* group */ UrlSegmentGroup, 
/* route */ Route, 
UrlMatchResult | Null]

type ɵDeprecatedLoadChildren = scala.Nothing
