package typings.angularRouter.mod

import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.Type
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends js.Object {
  
  /**
    * An array of dependency-injection tokens used to look up `CanActivate()`
    * handlers, in order to determine if the current user is allowed to
    * activate the component. By default, any user can activate.
    */
  var canActivate: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An array of DI tokens used to look up `CanActivateChild()` handlers,
    * in order to determine if the current user is allowed to activate
    * a child of the component. By default, any user can activate a child.
    */
  var canActivateChild: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An array of DI tokens used to look up `CanDeactivate()`
    * handlers, in order to determine if the current user is allowed to
    * deactivate the component. By default, any user can deactivate.
    *
    */
  var canDeactivate: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An array of DI tokens used to look up `CanLoad()`
    * handlers, in order to determine if the current user is allowed to
    * load the component. By default, any user can load.
    */
  var canLoad: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An array of child `Route` objects that specifies a nested route
    * configuration.
    */
  var children: js.UndefOr[Routes] = js.native
  
  /**
    * The component to instantiate when the path matches.
    * Can be empty if child routes specify components.
    */
  var component: js.UndefOr[Type[_]] = js.native
  
  /**
    * Additional developer-defined data provided to the component via
    * `ActivatedRoute`. By default, no additional data is passed.
    */
  var data: js.UndefOr[Data] = js.native
  
  /**
    * An object specifying lazy-loaded child routes.
    */
  var loadChildren: js.UndefOr[LoadChildren] = js.native
  
  /**
    * A custom URL-matching function. Cannot be used together with `path`.
    */
  var matcher: js.UndefOr[UrlMatcher] = js.native
  
  /**
    * Name of a `RouterOutlet` object where the component can be placed
    * when the path matches.
    */
  var outlet: js.UndefOr[String] = js.native
  
  /**
    * The path to match against. Cannot be used together with a custom `matcher` function.
    * A URL string that uses router matching notation.
    * Can be a wild card (`**`) that matches any URL (see Usage Notes below).
    * Default is "/" (the root path).
    *
    */
  var path: js.UndefOr[String] = js.native
  
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
  var pathMatch: js.UndefOr[String] = js.native
  
  /**
    * A URL to redirect to when the path matches.
    * Absolute if the URL begins with a slash (/), otherwise relative to the path URL.
    * When not present, router does not redirect.
    */
  var redirectTo: js.UndefOr[String] = js.native
  
  /**
    * A map of DI tokens used to look up data resolvers. See `Resolve`.
    */
  var resolve: js.UndefOr[ResolveData] = js.native
  
  /**
    * Defines when guards and resolvers will be run. One of
    * - `paramsOrQueryParamsChange` : Run when query parameters change.
    * - `always` : Run on every execution.
    * By default, guards and resolvers run only when the matrix
    * parameters of the route change.
    */
  var runGuardsAndResolvers: js.UndefOr[RunGuardsAndResolvers] = js.native
}
object Route {
  
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanActivateVarargs(value: js.Any*): Self = this.set("canActivate", js.Array(value :_*))
    
    @scala.inline
    def setCanActivate(value: js.Array[_]): Self = this.set("canActivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanActivate: Self = this.set("canActivate", js.undefined)
    
    @scala.inline
    def setCanActivateChildVarargs(value: js.Any*): Self = this.set("canActivateChild", js.Array(value :_*))
    
    @scala.inline
    def setCanActivateChild(value: js.Array[_]): Self = this.set("canActivateChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanActivateChild: Self = this.set("canActivateChild", js.undefined)
    
    @scala.inline
    def setCanDeactivateVarargs(value: js.Any*): Self = this.set("canDeactivate", js.Array(value :_*))
    
    @scala.inline
    def setCanDeactivate(value: js.Array[_]): Self = this.set("canDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDeactivate: Self = this.set("canDeactivate", js.undefined)
    
    @scala.inline
    def setCanLoadVarargs(value: js.Any*): Self = this.set("canLoad", js.Array(value :_*))
    
    @scala.inline
    def setCanLoad(value: js.Array[_]): Self = this.set("canLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanLoad: Self = this.set("canLoad", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Route*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: Routes): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponent(value: Type[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLoadChildrenFunction0(
      value: () => Type[js.Any] | NgModuleFactory[js.Any] | Observable_[Type[js.Any]] | (js.Promise[NgModuleFactory[js.Any] | Type[js.Any] | js.Any])
    ): Self = this.set("loadChildren", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadChildren(value: LoadChildren): Self = this.set("loadChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadChildren: Self = this.set("loadChildren", js.undefined)
    
    @scala.inline
    def setMatcher(
      value: (/* segments */ js.Array[UrlSegment], /* group */ UrlSegmentGroup, /* route */ Route) => UrlMatchResult | Null
    ): Self = this.set("matcher", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    
    @scala.inline
    def setOutlet(value: String): Self = this.set("outlet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlet: Self = this.set("outlet", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathMatch(value: String): Self = this.set("pathMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathMatch: Self = this.set("pathMatch", js.undefined)
    
    @scala.inline
    def setRedirectTo(value: String): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveData): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setRunGuardsAndResolversFunction2(value: (/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot) => Boolean): Self = this.set("runGuardsAndResolvers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRunGuardsAndResolvers(value: RunGuardsAndResolvers): Self = this.set("runGuardsAndResolvers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunGuardsAndResolvers: Self = this.set("runGuardsAndResolvers", js.undefined)
  }
}
