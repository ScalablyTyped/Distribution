package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLink")
@js.native
class RouterLink protected () extends js.Object {
  def this(router: Router, route: ActivatedRoute, tabIndex: String, renderer: Renderer2, el: ElementRef[_]) = this()
  var commands: js.Any = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#fragment NavigationExtras#fragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var fragment: String = js.native
  var preserve: js.Any = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#preserveFragment NavigationExtras#preserveFragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var preserveFragment: Boolean = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#queryParams NavigationExtras#queryParams}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var queryParams: StringDictionary[js.Any] = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#queryParamsHandling NavigationExtras#queryParamsHandling}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var queryParamsHandling: QueryParamsHandling = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#replaceUrl NavigationExtras#replaceUrl}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var replaceUrl: Boolean = js.native
  var route: js.Any = js.native
  var router: js.Any = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#skipLocationChange NavigationExtras#skipLocationChange}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var skipLocationChange: Boolean = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#state NavigationExtras#state}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var state: js.UndefOr[StringDictionary[js.Any]] = js.native
  def onClick(): Boolean = js.native
  /**
    * @deprecated As of Angular v4.0 use `queryParamsHandling` instead.
    */
  def preserveQueryParams_=(value: Boolean): Unit = js.native
  /**
    * Commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **array**: commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **string**: shorthand for array of commands with just the string, i.e. `['/route']`
    *   - **null|undefined**: shorthand for an empty array of commands, i.e. `[]`
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def routerLink_=(commands: js.UndefOr[js.Array[_] | String | Null]): Unit = js.native
  def urlTree: UrlTree = js.native
}

