package typings.angularRouter.mod

import typings.angularCore.mod.ImportedNgModuleProviders
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Type
import typings.angularRouter.angularRouterStrings.full
import typings.angularRouter.angularRouterStrings.prefix
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  /**
    * An array of `CanActivateFn` or DI tokens used to look up `CanActivate()`
    * handlers, in order to determine if the current user is allowed to
    * activate the component. By default, any user can activate.
    *
    * When using a function rather than DI tokens, the function can call `inject` to get any required
    * dependencies. This `inject` call must be done in a synchronous context.
    */
  var canActivate: js.UndefOr[js.Array[CanActivateFn | Any]] = js.undefined
  
  /**
    * An array of `CanActivateChildFn` or DI tokens used to look up `CanActivateChild()` handlers,
    * in order to determine if the current user is allowed to activate
    * a child of the component. By default, any user can activate a child.
    *
    * When using a function rather than DI tokens, the function can call `inject` to get any required
    * dependencies. This `inject` call must be done in a synchronous context.
    */
  var canActivateChild: js.UndefOr[js.Array[CanActivateChildFn | Any]] = js.undefined
  
  /**
    * An array of `CanDeactivateFn` or DI tokens used to look up `CanDeactivate()`
    * handlers, in order to determine if the current user is allowed to
    * deactivate the component. By default, any user can deactivate.
    *
    * When using a function rather than DI tokens, the function can call `inject` to get any required
    * dependencies. This `inject` call must be done in a synchronous context.
    */
  var canDeactivate: js.UndefOr[js.Array[CanDeactivateFn[Any] | Any]] = js.undefined
  
  /**
    * An array of `CanLoadFn` or DI tokens used to look up `CanLoad()`
    * handlers, in order to determine if the current user is allowed to
    * load the component. By default, any user can load.
    *
    * When using a function rather than DI tokens, the function can call `inject` to get any required
    * dependencies. This `inject` call must be done in a synchronous context.
    */
  var canLoad: js.UndefOr[js.Array[CanLoadFn | Any]] = js.undefined
  
  /**
    * An array of `CanMatchFn` or DI tokens used to look up `CanMatch()`
    * handlers, in order to determine if the current user is allowed to
    * match the `Route`. By default, any route can match.
    *
    * When using a function rather than DI tokens, the function can call `inject` to get any required
    * dependencies. This `inject` call must be done in a synchronous context.
    */
  var canMatch: js.UndefOr[js.Array[Type[CanMatch] | InjectionToken[CanMatchFn] | CanMatchFn]] = js.undefined
  
  /**
    * An array of child `Route` objects that specifies a nested route
    * configuration.
    */
  var children: js.UndefOr[Routes] = js.undefined
  
  /**
    * The component to instantiate when the path matches.
    * Can be empty if child routes specify components.
    */
  var component: js.UndefOr[Type[Any]] = js.undefined
  
  /**
    * Additional developer-defined data provided to the component via
    * `ActivatedRoute`. By default, no additional data is passed.
    */
  var data: js.UndefOr[Data] = js.undefined
  
  /**
    * An object specifying lazy-loaded child routes.
    */
  var loadChildren: js.UndefOr[LoadChildren] = js.undefined
  
  /**
    * An object specifying a lazy-loaded component.
    */
  var loadComponent: js.UndefOr[js.Function0[Type[Any] | Observable_[Type[Any]] | js.Promise[Type[Any]]]] = js.undefined
  
  /**
    * A custom URL-matching function. Cannot be used together with `path`.
    */
  var matcher: js.UndefOr[UrlMatcher] = js.undefined
  
  /**
    * Name of a `RouterOutlet` object where the component can be placed
    * when the path matches.
    */
  var outlet: js.UndefOr[String] = js.undefined
  
  /**
    * The path to match against. Cannot be used together with a custom `matcher` function.
    * A URL string that uses router matching notation.
    * Can be a wild card (`**`) that matches any URL (see Usage Notes below).
    * Default is "/" (the root path).
    *
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The path-matching strategy, one of 'prefix' or 'full'.
    * Default is 'prefix'.
    *
    * By default, the router checks URL elements from the left to see if the URL
    * matches a given path and stops when there is a config match. Importantly there must still be a
    * config match for each segment of the URL. For example, '/team/11/user' matches the prefix
    * 'team/:id' if one of the route's children matches the segment 'user'. That is, the URL
    * '/team/11/user' matches the config
    * `{path: 'team/:id', children: [{path: ':user', component: User}]}`
    * but does not match when there are no children as in `{path: 'team/:id', component: Team}`.
    *
    * The path-match strategy 'full' matches against the entire URL.
    * It is important to do this when redirecting empty-path routes.
    * Otherwise, because an empty path is a prefix of any URL,
    * the router would apply the redirect even when navigating
    * to the redirect destination, creating an endless loop.
    *
    */
  var pathMatch: js.UndefOr[prefix | full] = js.undefined
  
  /**
    * A `Provider` array to use for this `Route` and its `children`.
    *
    * The `Router` will create a new `EnvironmentInjector` for this
    * `Route` and use it for this `Route` and its `children`. If this
    * route also has a `loadChildren` function which returns an `NgModuleRef`, this injector will be
    * used as the parent of the lazy loaded module.
    */
  var providers: js.UndefOr[js.Array[Provider | ImportedNgModuleProviders]] = js.undefined
  
  /**
    * A URL to redirect to when the path matches.
    *
    * Absolute if the URL begins with a slash (/), otherwise relative to the path URL.
    * Note that no further redirects are evaluated after an absolute redirect.
    *
    * When not present, router does not redirect.
    */
  var redirectTo: js.UndefOr[String] = js.undefined
  
  /**
    * A map of DI tokens used to look up data resolvers. See `Resolve`.
    */
  var resolve: js.UndefOr[ResolveData] = js.undefined
  
  /**
    * Defines when guards and resolvers will be run. One of
    * - `paramsOrQueryParamsChange` : Run when query parameters change.
    * - `always` : Run on every execution.
    * By default, guards and resolvers run only when the matrix
    * parameters of the route change.
    *
    * @see RunGuardsAndResolvers
    */
  var runGuardsAndResolvers: js.UndefOr[RunGuardsAndResolvers] = js.undefined
  
  /**
    * Used to define a page title for the route. This can be a static string or an `Injectable` that
    * implements `Resolve`.
    *
    * @see `PageTitleStrategy`
    */
  var title: js.UndefOr[String | Type[Resolve[String]] | ResolveFn[String]] = js.undefined
}
object Route {
  
  inline def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    inline def setCanActivate(value: js.Array[CanActivateFn | Any]): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
    
    inline def setCanActivateChild(value: js.Array[CanActivateChildFn | Any]): Self = StObject.set(x, "canActivateChild", value.asInstanceOf[js.Any])
    
    inline def setCanActivateChildUndefined: Self = StObject.set(x, "canActivateChild", js.undefined)
    
    inline def setCanActivateChildVarargs(value: (CanActivateChildFn | Any)*): Self = StObject.set(x, "canActivateChild", js.Array(value*))
    
    inline def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
    
    inline def setCanActivateVarargs(value: (CanActivateFn | Any)*): Self = StObject.set(x, "canActivate", js.Array(value*))
    
    inline def setCanDeactivate(value: js.Array[CanDeactivateFn[Any] | Any]): Self = StObject.set(x, "canDeactivate", value.asInstanceOf[js.Any])
    
    inline def setCanDeactivateUndefined: Self = StObject.set(x, "canDeactivate", js.undefined)
    
    inline def setCanDeactivateVarargs(value: (CanDeactivateFn[Any] | Any)*): Self = StObject.set(x, "canDeactivate", js.Array(value*))
    
    inline def setCanLoad(value: js.Array[CanLoadFn | Any]): Self = StObject.set(x, "canLoad", value.asInstanceOf[js.Any])
    
    inline def setCanLoadUndefined: Self = StObject.set(x, "canLoad", js.undefined)
    
    inline def setCanLoadVarargs(value: (CanLoadFn | Any)*): Self = StObject.set(x, "canLoad", js.Array(value*))
    
    inline def setCanMatch(value: js.Array[Type[CanMatch] | InjectionToken[CanMatchFn] | CanMatchFn]): Self = StObject.set(x, "canMatch", value.asInstanceOf[js.Any])
    
    inline def setCanMatchUndefined: Self = StObject.set(x, "canMatch", js.undefined)
    
    inline def setCanMatchVarargs(value: (Type[CanMatch] | InjectionToken[CanMatchFn] | CanMatchFn)*): Self = StObject.set(x, "canMatch", js.Array(value*))
    
    inline def setChildren(value: Routes): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Route*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComponent(value: Type[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLoadChildren(
      value: () => Type[Any] | NgModuleFactory[Any] | Routes | (Observable_[Type[Any] | Routes]) | (js.Promise[NgModuleFactory[Any] | Type[Any] | Routes])
    ): Self = StObject.set(x, "loadChildren", js.Any.fromFunction0(value))
    
    inline def setLoadChildrenUndefined: Self = StObject.set(x, "loadChildren", js.undefined)
    
    inline def setLoadComponent(value: () => Type[Any] | Observable_[Type[Any]] | js.Promise[Type[Any]]): Self = StObject.set(x, "loadComponent", js.Any.fromFunction0(value))
    
    inline def setLoadComponentUndefined: Self = StObject.set(x, "loadComponent", js.undefined)
    
    inline def setMatcher(
      value: (/* segments */ js.Array[UrlSegment], /* group */ UrlSegmentGroup, /* route */ Route) => UrlMatchResult | Null
    ): Self = StObject.set(x, "matcher", js.Any.fromFunction3(value))
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    inline def setOutlet(value: String): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
    
    inline def setOutletUndefined: Self = StObject.set(x, "outlet", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathMatch(value: prefix | full): Self = StObject.set(x, "pathMatch", value.asInstanceOf[js.Any])
    
    inline def setPathMatchUndefined: Self = StObject.set(x, "pathMatch", js.undefined)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProviders(value: js.Array[Provider | ImportedNgModuleProviders]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: (Provider | ImportedNgModuleProviders)*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    inline def setResolve(value: ResolveData): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setRunGuardsAndResolvers(value: RunGuardsAndResolvers): Self = StObject.set(x, "runGuardsAndResolvers", value.asInstanceOf[js.Any])
    
    inline def setRunGuardsAndResolversFunction2(value: (/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot) => Boolean): Self = StObject.set(x, "runGuardsAndResolvers", js.Any.fromFunction2(value))
    
    inline def setRunGuardsAndResolversUndefined: Self = StObject.set(x, "runGuardsAndResolvers", js.undefined)
    
    inline def setTitle(value: String | Type[Resolve[String]] | ResolveFn[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction2(
      value: (/* route */ ActivatedRouteSnapshot, /* state */ RouterStateSnapshot) => Observable_[String] | js.Promise[String] | String
    ): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
