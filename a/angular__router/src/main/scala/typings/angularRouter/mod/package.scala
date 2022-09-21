package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularRouter.angularRouterNumbers.`0`
import typings.angularRouter.angularRouterNumbers.`1`
import typings.angularRouter.angularRouterNumbers.`2`
import typings.angularRouter.angularRouterNumbers.`3`
import typings.angularRouter.angularRouterNumbers.`4`
import typings.angularRouter.angularRouterNumbers.`5`
import typings.angularRouter.mod.^
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

inline def provideRouter(routes: Routes, features: RouterFeatures*): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideRouter")(List(routes.asInstanceOf[js.Any]).`++`(features.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Provider]]

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
  * @developerPreview
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
  * @developerPreview
  */
inline def ɵwithPreloading(preloadingStrategy: Type[PreloadingStrategy]): PreloadingFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275withPreloading")(preloadingStrategy.asInstanceOf[js.Any]).asInstanceOf[PreloadingFeature]

type CanActivateChildFn = js.Function2[
/* childRoute */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanActivateFn = js.Function2[
/* route */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanDeactivateFn[T] = js.Function4[
/* component */ T, 
/* currentRoute */ ActivatedRouteSnapshot, 
/* currentState */ RouterStateSnapshot, 
/* nextState */ js.UndefOr[RouterStateSnapshot], 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanLoadFn = js.Function2[
/* route */ Route, 
/* segments */ js.Array[UrlSegment], 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type CanMatchFn = js.Function2[
/* route */ Route, 
/* segments */ js.Array[UrlSegment], 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<boolean | UrlTree> */ Any) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree]

type Data = StringDictionary[Any]

type DebugTracingFeature = RouterFeature[`1`]

type DetachedRouteHandle = js.Object

type DisabledInitialNavigationFeature = RouterFeature[`3`]

type EnabledBlockingInitialNavigationFeature = RouterFeature[`2`]

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

type InMemoryScrollingFeature = RouterFeature[`4`]

type InitialNavigationFeature = EnabledBlockingInitialNavigationFeature | DisabledInitialNavigationFeature

type LoadChildren = LoadChildrenCallback

type LoadChildrenCallback = js.Function0[
Type[Any] | NgModuleFactory[Any] | Routes | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Type<any> | Routes> */ Any) | (js.Promise[NgModuleFactory[Any] | Type[Any] | Routes])]

type Params = StringDictionary[Any]

type PreloadingFeature = RouterFeature[`0`]

type ResolveData = StringDictionary[Any | ResolveFn[Any]]

type ResolveFn[T] = js.Function2[
/* route */ ActivatedRouteSnapshot, 
/* state */ RouterStateSnapshot, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any) | js.Promise[T] | T]

type RouterConfigurationFeature = RouterFeature[`5`]

type RouterFeatures = PreloadingFeature | DebugTracingFeature | InitialNavigationFeature | InMemoryScrollingFeature | RouterConfigurationFeature

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
