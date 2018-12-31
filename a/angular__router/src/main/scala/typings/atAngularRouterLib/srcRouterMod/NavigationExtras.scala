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
}

