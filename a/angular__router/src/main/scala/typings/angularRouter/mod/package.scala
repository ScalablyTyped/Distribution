package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EnvironmentProviders
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.Provider
import typings.angularCore.mod.ProviderToken
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularRouter.angularRouterInts.`0`
import typings.angularRouter.angularRouterInts.`1`
import typings.angularRouter.angularRouterInts.`2`
import typings.angularRouter.angularRouterInts.`3`
import typings.angularRouter.angularRouterInts.`4`
import typings.angularRouter.angularRouterInts.`5`
import typings.angularRouter.angularRouterInts.`6`
import typings.angularRouter.angularRouterInts.`7`
import typings.angularRouter.angularRouterInts.`8`
import typings.angularRouter.anon.Events
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

inline def mapToCanActivate(providers: js.Array[Type[typings.angularRouter.anon.CanActivate]]): js.Array[CanActivateFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToCanActivate")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[CanActivateFn]]

inline def mapToCanActivateChild(providers: js.Array[Type[typings.angularRouter.anon.CanActivateChild]]): js.Array[CanActivateChildFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToCanActivateChild")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[CanActivateChildFn]]

inline def mapToCanDeactivate[T](providers: js.Array[Type[typings.angularRouter.anon.CanDeactivate[T]]]): js.Array[CanDeactivateFn[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToCanDeactivate")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[CanDeactivateFn[T]]]

inline def mapToCanMatch(providers: js.Array[Type[typings.angularRouter.anon.CanMatch]]): js.Array[CanMatchFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToCanMatch")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[CanMatchFn]]

inline def mapToResolve[T](provider: Type[typings.angularRouter.anon.Resolve[T]]): ResolveFn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToResolve")(provider.asInstanceOf[js.Any]).asInstanceOf[ResolveFn[T]]

inline def provideRouter(routes: Routes, features: RouterFeatures*): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideRouter")(scala.List(routes.asInstanceOf[js.Any]).`++`(features.asInstanceOf[Seq[js.Any]])*).asInstanceOf[EnvironmentProviders]

inline def provideRoutes(routes: Routes): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]

inline def withComponentInputBinding(): ComponentInputBindingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponentInputBinding")().asInstanceOf[ComponentInputBindingFeature]

inline def withDebugTracing(): DebugTracingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withDebugTracing")().asInstanceOf[DebugTracingFeature]

inline def withDisabledInitialNavigation(): DisabledInitialNavigationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withDisabledInitialNavigation")().asInstanceOf[DisabledInitialNavigationFeature]

inline def withEnabledBlockingInitialNavigation(): EnabledBlockingInitialNavigationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withEnabledBlockingInitialNavigation")().asInstanceOf[EnabledBlockingInitialNavigationFeature]

inline def withHashLocation(): RouterConfigurationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withHashLocation")().asInstanceOf[RouterConfigurationFeature]

inline def withInMemoryScrolling(): InMemoryScrollingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withInMemoryScrolling")().asInstanceOf[InMemoryScrollingFeature]
inline def withInMemoryScrolling(options: InMemoryScrollingOptions): InMemoryScrollingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withInMemoryScrolling")(options.asInstanceOf[js.Any]).asInstanceOf[InMemoryScrollingFeature]

inline def withNavigationErrorHandler(fn: js.Function1[/* error */ NavigationError, Unit]): NavigationErrorHandlerFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationErrorHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[NavigationErrorHandlerFeature]

inline def withPreloading(preloadingStrategy: Type[PreloadingStrategy]): PreloadingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withPreloading")(preloadingStrategy.asInstanceOf[js.Any]).asInstanceOf[PreloadingFeature]

inline def withRouterConfig(options: RouterConfigOptions): RouterConfigurationFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouterConfig")(options.asInstanceOf[js.Any]).asInstanceOf[RouterConfigurationFeature]

inline def ɵROUTERPROVIDERS: js.Array[Provider] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ROUTER_PROVIDERS").asInstanceOf[js.Array[Provider]]

inline def ɵafterNextNavigation(router: Events, action: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275afterNextNavigation")(router.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]

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
/* nextState */ RouterStateSnapshot, 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanLoadFn = js.Function2[
/* route */ Route, 
/* segments */ js.Array[UrlSegment], 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanMatchFn = js.Function2[
/* route */ Route, 
/* segments */ js.Array[UrlSegment], 
(Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

/**
  * A type alias for providers returned by `withComponentInputBinding` for use with `provideRouter`.
  *
  * @see `withComponentInputBinding`
  * @see `provideRouter`
  *
  * @publicApi
  */
type ComponentInputBindingFeature = RouterFeature[`8`]

type Data = StringDictionary[Any]

type DebugTracingFeature = RouterFeature[`1`]

type DeprecatedGuard = ProviderToken[Any] | Any

type DetachedRouteHandle = js.Object

type DisabledInitialNavigationFeature = RouterFeature[`3`]

type EnabledBlockingInitialNavigationFeature = RouterFeature[`2`]

type InMemoryScrollingFeature = RouterFeature[`4`]

type InitialNavigationFeature = EnabledBlockingInitialNavigationFeature | DisabledInitialNavigationFeature

type LoadChildren = LoadChildrenCallback

type LoadChildrenCallback = js.Function0[
Type[Any] | NgModuleFactory[Any] | Routes | (Observable_[Type[Any] | Routes | (DefaultExport[Routes | Type[Any]])]) | (js.Promise[NgModuleFactory[Any] | Type[Any] | Routes | (DefaultExport[Routes | Type[Any]])])]

type NavigationErrorHandlerFeature = RouterFeature[`7`]

type Params = StringDictionary[Any]

type PreloadingFeature = RouterFeature[`0`]

type ResolveData = StringDictionary[ResolveFn[Any] | DeprecatedGuard]

type ResolveFn[T] = js.Function2[
/* route */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
Observable_[T] | js.Promise[T] | T]

type RouterConfigurationFeature = RouterFeature[`5`]

type RouterFeatures = PreloadingFeature | DebugTracingFeature | InitialNavigationFeature | InMemoryScrollingFeature | RouterConfigurationFeature | NavigationErrorHandlerFeature | ComponentInputBindingFeature

type RouterHashLocationFeature = RouterFeature[`6`]

type Routes = js.Array[Route]

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
type RunGuardsAndResolvers = _RunGuardsAndResolvers | (js.Function2[/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot, Boolean])

type UrlMatcher = js.Function3[
/* segments */ js.Array[UrlSegment], 
/* group */ UrlSegmentGroup, 
/* route */ Route, 
UrlMatchResult | Null]
