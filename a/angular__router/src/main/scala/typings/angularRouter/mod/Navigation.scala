package typings.angularRouter.mod

import typings.angularRouter.angularRouterStrings.hashchange
import typings.angularRouter.angularRouterStrings.imperative
import typings.angularRouter.angularRouterStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
  /**
    * The initial target URL after being parsed with `UrlSerializer.extract()`.
    */
  var extractedUrl: UrlTree
  /**
    * Options that controlled the strategy used for this navigation.
    * See `NavigationExtras`.
    */
  var extras: NavigationExtras
  /**
    * The extracted URL after redirects have been applied.
    * This URL may not be available immediately, therefore this property can be `undefined`.
    * It is guaranteed to be set after the `RoutesRecognized` event fires.
    */
  var finalUrl: js.UndefOr[UrlTree] = js.undefined
  /**
    * The ID of the current navigation.
    */
  var id: Double
  /**
    * The target URL passed into the `Router#navigateByUrl()` call before navigation. This is
    * the value before the router has parsed or applied redirects to it.
    */
  var initialUrl: String | UrlTree
  /**
    * The previously successful `Navigation` object. Only one previous navigation
    * is available, therefore this previous `Navigation` object has a `null` value
    * for its own `previousNavigation`.
    */
  var previousNavigation: Navigation | Null
  /**
    * Identifies how this navigation was triggered.
    *
    * * 'imperative'--Triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--Triggered by a popstate event.
    * * 'hashchange'--Triggered by a hashchange event.
    */
  var trigger: imperative | popstate | hashchange
}

object Navigation {
  @scala.inline
  def apply(
    extractedUrl: UrlTree,
    extras: NavigationExtras,
    id: Double,
    initialUrl: String | UrlTree,
    trigger: imperative | popstate | hashchange,
    finalUrl: UrlTree = null,
    previousNavigation: Navigation = null
  ): Navigation = {
    val __obj = js.Dynamic.literal(extractedUrl = extractedUrl.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialUrl = initialUrl.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (finalUrl != null) __obj.updateDynamic("finalUrl")(finalUrl.asInstanceOf[js.Any])
    if (previousNavigation != null) __obj.updateDynamic("previousNavigation")(previousNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
}

