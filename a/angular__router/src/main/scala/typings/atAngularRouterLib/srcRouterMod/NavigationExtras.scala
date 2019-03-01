package typings
package atAngularRouterLib.srcRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationExtras extends js.Object {
  /**
    * Sets the hash fragment for the URL.
    *
    * ```
    * // Navigate to /results#top
    * this.router.navigate(['/results'], { fragment: 'top' });
    * ```
    */
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Preserves the fragment for the next navigation
    *
    * ```
    * // Preserve fragment from /results#top to /view#top
    * this.router.navigate(['/view'], { preserveFragment: true });
    * ```
    */
  var preserveFragment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Preserves the query parameters for the next navigation.
    *
    * deprecated, use `queryParamsHandling` instead
    *
    * ```
    * // Preserve query params from /results?page=1 to /view?page=1
    * this.router.navigate(['/view'], { preserveQueryParams: true });
    * ```
    *
    * @deprecated since v4
    */
  var preserveQueryParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets query parameters to the URL.
    *
    * ```
    * // Navigate to /results?page=1
    * this.router.navigate(['/results'], { queryParams: { page: 1 } });
    * ```
    */
  var queryParams: js.UndefOr[atAngularRouterLib.srcSharedMod.Params | scala.Null] = js.undefined
  /**
    *  config strategy to handle the query parameters for the next navigation.
    *
    * ```
    * // from /results?page=1 to /view?page=1&page=2
    * this.router.navigate(['/view'], { queryParams: { page: 2 },  queryParamsHandling: "merge" });
    * ```
    */
  var queryParamsHandling: js.UndefOr[atAngularRouterLib.srcConfigMod.QueryParamsHandling | scala.Null] = js.undefined
  /**
    * Enables relative navigation from the current ActivatedRoute.
    *
    * Configuration:
    *
    * ```
    * [{
    *   path: 'parent',
    *   component: ParentComponent,
    *   children: [{
    *     path: 'list',
    *     component: ListComponent
    *   },{
    *     path: 'child',
    *     component: ChildComponent
    *   }]
    * }]
    * ```
    *
    * Navigate to list route from child route:
    *
    * ```
    *  @Component({...})
    *  class ChildComponent {
    *    constructor(private router: Router, private route: ActivatedRoute) {}
    *
    *    go() {
    *      this.router.navigate(['../list'], { relativeTo: this.route });
    *    }
    *  }
    * ```
    */
  var relativeTo: js.UndefOr[atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRoute | scala.Null] = js.undefined
  /**
    * Navigates while replacing the current state in history.
    *
    * ```
    * // Navigate to /view
    * this.router.navigate(['/view'], { replaceUrl: true });
    * ```
    */
  var replaceUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Navigates without pushing a new state into history.
    *
    * ```
    * // Navigate silently to /view
    * this.router.navigate(['/view'], { skipLocationChange: true });
    * ```
    */
  var skipLocationChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * State passed to any navigation. This value will be accessible through the `extras` object
    * returned from `router.getCurrentNavigation()` while a navigation is executing. Once a
    * navigation completes, this value will be written to `history.state` when the `location.go`
    * or `location.replaceState` method is called before activating of this route. Note that
    * `history.state` will not pass an object equality test because the `navigationId` will be
    * added to the state before being written.
    *
    * While `history.state` can accept any type of value, because the router adds the `navigationId`
    * on each navigation, the `state` must always be an object.
    */
  var state: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object NavigationExtras {
  @scala.inline
  def apply(
    fragment: java.lang.String = null,
    preserveFragment: js.UndefOr[scala.Boolean] = js.undefined,
    preserveQueryParams: js.UndefOr[scala.Boolean] = js.undefined,
    queryParams: atAngularRouterLib.srcSharedMod.Params = null,
    queryParamsHandling: atAngularRouterLib.srcConfigMod.QueryParamsHandling = null,
    relativeTo: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRoute = null,
    replaceUrl: js.UndefOr[scala.Boolean] = js.undefined,
    skipLocationChange: js.UndefOr[scala.Boolean] = js.undefined,
    state: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NavigationExtras = {
    val __obj = js.Dynamic.literal()
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (!js.isUndefined(preserveFragment)) __obj.updateDynamic("preserveFragment")(preserveFragment)
    if (!js.isUndefined(preserveQueryParams)) __obj.updateDynamic("preserveQueryParams")(preserveQueryParams)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (queryParamsHandling != null) __obj.updateDynamic("queryParamsHandling")(queryParamsHandling)
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo)
    if (!js.isUndefined(replaceUrl)) __obj.updateDynamic("replaceUrl")(replaceUrl)
    if (!js.isUndefined(skipLocationChange)) __obj.updateDynamic("skipLocationChange")(skipLocationChange)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[NavigationExtras]
  }
}

