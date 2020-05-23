package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
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
  var fragment: js.UndefOr[String] = js.undefined
  /**
    * When true, preserves the URL fragment for the next navigation
    *
    * ```
    * // Preserve fragment from /results#top to /view#top
    * this.router.navigate(['/view'], { preserveFragment: true });
    * ```
    */
  var preserveFragment: js.UndefOr[Boolean] = js.undefined
  /**
    * **DEPRECATED**: Use `queryParamsHandling: "preserve"` instead to preserve
    * query parameters for the next navigation.
    *
    * @deprecated since v4
    */
  var preserveQueryParams: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets query parameters to the URL.
    *
    * ```
    * // Navigate to /results?page=1
    * this.router.navigate(['/results'], { queryParams: { page: 1 } });
    * ```
    */
  var queryParams: js.UndefOr[Params | Null] = js.undefined
  /**
    * How to handle query parameters in the router link for the next navigation.
    * One of:
    * * `merge` : Merge new with current parameters.
    * * `preserve` : Preserve current parameters.
    *
    * ```
    * // from /results?page=1 to /view?page=1&page=2
    * this.router.navigate(['/view'], { queryParams: { page: 2 },  queryParamsHandling: "merge" });
    * ```
    */
  var queryParamsHandling: js.UndefOr[QueryParamsHandling | Null] = js.undefined
  /**
    * Specifies a root URI to use for relative navigation.
    *
    * For example, consider the following route configuration where the parent route
    * has two children.
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
    * The following `go()` function navigates to the `list` route by
    * interpreting the destination URI as relative to the activated `child`  route
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
  var relativeTo: js.UndefOr[ActivatedRoute | Null] = js.undefined
  /**
    * When true, navigates while replacing the current state in history.
    *
    * ```
    * // Navigate to /view
    * this.router.navigate(['/view'], { replaceUrl: true });
    * ```
    */
  var replaceUrl: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, navigates without pushing a new state into history.
    *
    * ```
    * // Navigate silently to /view
    * this.router.navigate(['/view'], { skipLocationChange: true });
    * ```
    */
  var skipLocationChange: js.UndefOr[Boolean] = js.undefined
  /**
    * Developer-defined state that can be passed to any navigation.
    * Access this value through the `Navigation.extras` object
    * returned from `router.getCurrentNavigation()` while a navigation is executing.
    *
    * After a navigation completes, the router writes an object containing this
    * value together with a `navigationId` to `history.state`.
    * The value is written when `location.go()` or `location.replaceState()`
    * is called before activating this route.
    *
    * Note that `history.state` does not pass an object equality test because
    * the router adds the `navigationId` on each navigation.
    */
  var state: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object NavigationExtras {
  @scala.inline
  def apply(
    fragment: String = null,
    preserveFragment: js.UndefOr[Boolean] = js.undefined,
    preserveQueryParams: js.UndefOr[Boolean] = js.undefined,
    queryParams: js.UndefOr[Null | Params] = js.undefined,
    queryParamsHandling: js.UndefOr[Null | QueryParamsHandling] = js.undefined,
    relativeTo: js.UndefOr[Null | ActivatedRoute] = js.undefined,
    replaceUrl: js.UndefOr[Boolean] = js.undefined,
    skipLocationChange: js.UndefOr[Boolean] = js.undefined,
    state: StringDictionary[js.Any] = null
  ): NavigationExtras = {
    val __obj = js.Dynamic.literal()
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFragment)) __obj.updateDynamic("preserveFragment")(preserveFragment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveQueryParams)) __obj.updateDynamic("preserveQueryParams")(preserveQueryParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queryParams)) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(queryParamsHandling)) __obj.updateDynamic("queryParamsHandling")(queryParamsHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeTo)) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceUrl)) __obj.updateDynamic("replaceUrl")(replaceUrl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLocationChange)) __obj.updateDynamic("skipLocationChange")(skipLocationChange.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationExtras]
  }
}

