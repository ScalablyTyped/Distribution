package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.mod.LocationStrategy
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterLinkWithHref")
@js.native
class RouterLinkWithHref protected ()
  extends OnChanges
     with OnDestroy {
  def this(router: Router, route: ActivatedRoute, locationStrategy: LocationStrategy) = this()
  var commands: js.Any = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the `NavigationExtras`.
    * @see {@link NavigationExtras#fragment NavigationExtras#fragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var fragment: String = js.native
  var href: String = js.native
  var locationStrategy: js.Any = js.native
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
  var subscription: js.Any = js.native
  var target: String = js.native
  var updateTargetUrlAndHref: js.Any = js.native
  def ngOnChanges(changes: js.Object): js.Any = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  def onClick(button: Double, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): Boolean = js.native
  /**
    * @deprecated As of Angular v4.0 use `queryParamsHandling` instead.
    */
  def preserveQueryParams(value: Boolean): js.Any = js.native
  /**
    * @param commands An array of commands to pass to {@link Router#createUrlTree
    *     Router#createUrlTree}.
    *   - **array**: commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **string**: shorthand for array of commands with just the string, i.e. `['/route']`
    *   - **null|undefined**: shorthand for an empty array of commands, i.e. `[]`
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def routerLink(): js.Any = js.native
  def routerLink(commands: String): js.Any = js.native
  def routerLink(commands: js.Array[_]): js.Any = js.native
  def urlTree: UrlTree = js.native
}

