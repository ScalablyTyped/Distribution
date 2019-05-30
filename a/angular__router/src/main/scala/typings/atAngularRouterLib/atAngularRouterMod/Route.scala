package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  /**
    * An array of dependency-injection tokens used to look up `CanActivate()`
    * handlers, in order to determine if the current user is allowed to
    * activate the component. By default, any user can activate.
    */
  var canActivate: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of DI tokens used to look up `CanActivateChild()` handlers,
    * in order to determine if the current user is allowed to activate
    * a child of the component. By default, any user can activate a child.
    */
  var canActivateChild: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of DI tokens used to look up `CanDeactivate()`
    * handlers, in order to determine if the current user is allowed to
    * deactivate the component. By default, any user can deactivate.
    *
    */
  var canDeactivate: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of DI tokens used to look up `CanLoad()`
    * handlers, in order to determine if the current user is allowed to
    * load the component. By default, any user can load.
    */
  var canLoad: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of child `Route` objects that specifies a nested route
    * configuration.
    */
  var children: js.UndefOr[Routes] = js.undefined
  /**
    * The component to instantiate when the path matches.
    * Can be empty if child routes specify components.
    */
  var component: js.UndefOr[atAngularCoreLib.atAngularCoreMod.Type[_]] = js.undefined
  /**
    * Additional developer-defined data provided to the component via
    * `ActivatedRoute`. By default, no additional data is passed.
    */
  var data: js.UndefOr[Data] = js.undefined
  /**
    * A `LoadChildren` object specifying lazy-loaded child routes.
    */
  var loadChildren: js.UndefOr[LoadChildren] = js.undefined
  /**
    * A URL-matching function to use as a custom strategy for path matching.
    * If present, supersedes `path` and `pathMatch`.
    */
  var matcher: js.UndefOr[UrlMatcher] = js.undefined
  /**
    * Name of a `RouterOutlet` object where the component can be placed
    * when the path matches.
    */
  var outlet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to match against, a URL string that uses router matching notation.
    * Can be a wild card (`**`) that matches any URL (see Usage Notes below).
    * Default is "/" (the root path).
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
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
  var pathMatch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL to which to redirect when a the path matches.
    * Absolute if the URL begins with a slash (/), otherwise relative to the path URL.
    * When not present, router does not redirect.
    */
  var redirectTo: js.UndefOr[java.lang.String] = js.undefined
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
  def apply(
    canActivate: js.Array[_] = null,
    canActivateChild: js.Array[_] = null,
    canDeactivate: js.Array[_] = null,
    canLoad: js.Array[_] = null,
    children: Routes = null,
    component: atAngularCoreLib.atAngularCoreMod.Type[_] = null,
    data: Data = null,
    loadChildren: LoadChildren = null,
    matcher: UrlMatcher = null,
    outlet: java.lang.String = null,
    path: java.lang.String = null,
    pathMatch: java.lang.String = null,
    redirectTo: java.lang.String = null,
    resolve: ResolveData = null,
    runGuardsAndResolvers: RunGuardsAndResolvers = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    if (canActivate != null) __obj.updateDynamic("canActivate")(canActivate)
    if (canActivateChild != null) __obj.updateDynamic("canActivateChild")(canActivateChild)
    if (canDeactivate != null) __obj.updateDynamic("canDeactivate")(canDeactivate)
    if (canLoad != null) __obj.updateDynamic("canLoad")(canLoad)
    if (children != null) __obj.updateDynamic("children")(children)
    if (component != null) __obj.updateDynamic("component")(component)
    if (data != null) __obj.updateDynamic("data")(data)
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(loadChildren.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher)
    if (outlet != null) __obj.updateDynamic("outlet")(outlet)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathMatch != null) __obj.updateDynamic("pathMatch")(pathMatch)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (runGuardsAndResolvers != null) __obj.updateDynamic("runGuardsAndResolvers")(runGuardsAndResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

