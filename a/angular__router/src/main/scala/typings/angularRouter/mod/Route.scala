package typings.angularRouter.mod

import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.Type
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  /**
    * An array of dependency-injection tokens used to look up `CanActivate()`
    * handlers, in order to determine if the current user is allowed to
    * activate the component. By default, any user can activate.
    */
  var canActivate: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * An array of DI tokens used to look up `CanActivateChild()` handlers,
    * in order to determine if the current user is allowed to activate
    * a child of the component. By default, any user can activate a child.
    */
  var canActivateChild: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * An array of DI tokens used to look up `CanDeactivate()`
    * handlers, in order to determine if the current user is allowed to
    * deactivate the component. By default, any user can deactivate.
    *
    */
  var canDeactivate: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * An array of DI tokens used to look up `CanLoad()`
    * handlers, in order to determine if the current user is allowed to
    * load the component. By default, any user can load.
    */
  var canLoad: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * An array of child `Route` objects that specifies a nested route
    * configuration.
    */
  var children: js.UndefOr[Routes] = js.undefined
  
  /**
    * The component to instantiate when the path matches.
    * Can be empty if child routes specify components.
    */
  var component: js.UndefOr[Type[js.Any]] = js.undefined
  
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
    * matches a given  path, and stops when there is a match. For example,
    * '/team/11/user' matches 'team/:id'.
    *
    * The path-match strategy 'full' matches against the entire URL.
    * It is important to do this when redirecting empty-path routes.
    * Otherwise, because an empty path is a prefix of any URL,
    * the router would apply the redirect even when navigating
    * to the redirect destination, creating an endless loop.
    *
    */
  var pathMatch: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to redirect to when the path matches.
    * Absolute if the URL begins with a slash (/), otherwise relative to the path URL.
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
    */
  var runGuardsAndResolvers: js.UndefOr[RunGuardsAndResolvers] = js.undefined
}
object Route {
  
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanActivate(value: js.Array[js.Any]): Self = StObject.set(x, "canActivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanActivateChild(value: js.Array[js.Any]): Self = StObject.set(x, "canActivateChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanActivateChildUndefined: Self = StObject.set(x, "canActivateChild", js.undefined)
    
    @scala.inline
    def setCanActivateChildVarargs(value: js.Any*): Self = StObject.set(x, "canActivateChild", js.Array(value :_*))
    
    @scala.inline
    def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
    
    @scala.inline
    def setCanActivateVarargs(value: js.Any*): Self = StObject.set(x, "canActivate", js.Array(value :_*))
    
    @scala.inline
    def setCanDeactivate(value: js.Array[js.Any]): Self = StObject.set(x, "canDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeactivateUndefined: Self = StObject.set(x, "canDeactivate", js.undefined)
    
    @scala.inline
    def setCanDeactivateVarargs(value: js.Any*): Self = StObject.set(x, "canDeactivate", js.Array(value :_*))
    
    @scala.inline
    def setCanLoad(value: js.Array[js.Any]): Self = StObject.set(x, "canLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanLoadUndefined: Self = StObject.set(x, "canLoad", js.undefined)
    
    @scala.inline
    def setCanLoadVarargs(value: js.Any*): Self = StObject.set(x, "canLoad", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: Routes): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Route*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: Type[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLoadChildren(value: LoadChildren): Self = StObject.set(x, "loadChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadChildrenFunction0(
      value: () => Type[js.Any] | NgModuleFactory[js.Any] | Observable_[Type[js.Any]] | (js.Promise[NgModuleFactory[js.Any] | Type[js.Any] | js.Any])
    ): Self = StObject.set(x, "loadChildren", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadChildrenUndefined: Self = StObject.set(x, "loadChildren", js.undefined)
    
    @scala.inline
    def setMatcher(
      value: (/* segments */ js.Array[UrlSegment], /* group */ UrlSegmentGroup, /* route */ Route) => UrlMatchResult | Null
    ): Self = StObject.set(x, "matcher", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    @scala.inline
    def setOutlet(value: String): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutletUndefined: Self = StObject.set(x, "outlet", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathMatch(value: String): Self = StObject.set(x, "pathMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathMatchUndefined: Self = StObject.set(x, "pathMatch", js.undefined)
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveData): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setRunGuardsAndResolvers(value: RunGuardsAndResolvers): Self = StObject.set(x, "runGuardsAndResolvers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunGuardsAndResolversFunction2(value: (/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot) => Boolean): Self = StObject.set(x, "runGuardsAndResolvers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRunGuardsAndResolversUndefined: Self = StObject.set(x, "runGuardsAndResolvers", js.undefined)
  }
}
