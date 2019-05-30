package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
  /**
    * The initial target URL after being parsed with {@link UrlSerializer.extract()}.
    */
  var extractedUrl: UrlTree
  /**
    * The NavigationExtras used in this navigation. See {@link NavigationExtras} for more info.
    */
  var extras: NavigationExtras
  /**
    * Extracted URL after redirects have been applied. This URL may not be available immediately,
    * therefore this property can be `undefined`. It is guaranteed to be set after the
    * {@link RoutesRecognized} event fires.
    */
  var finalUrl: js.UndefOr[UrlTree] = js.undefined
  /**
    * The ID of the current navigation.
    */
  var id: scala.Double
  /**
    * Target URL passed into the {@link Router#navigateByUrl} call before navigation. This is
    * the value before the router has parsed or applied redirects to it.
    */
  var initialUrl: java.lang.String | UrlTree
  /**
    * Previously successful Navigation object. Only a single previous Navigation is available,
    * therefore this previous Navigation will always have a `null` value for `previousNavigation`.
    */
  var previousNavigation: Navigation | scala.Null
  /**
    * Identifies the trigger of the navigation.
    *
    * * 'imperative'--triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--triggered by a popstate event
    * * 'hashchange'--triggered by a hashchange event
    */
  var trigger: atAngularRouterLib.atAngularRouterLibStrings.imperative | atAngularRouterLib.atAngularRouterLibStrings.popstate | atAngularRouterLib.atAngularRouterLibStrings.hashchange
}

object Navigation {
  @scala.inline
  def apply(
    extractedUrl: UrlTree,
    extras: NavigationExtras,
    id: scala.Double,
    initialUrl: java.lang.String | UrlTree,
    trigger: atAngularRouterLib.atAngularRouterLibStrings.imperative | atAngularRouterLib.atAngularRouterLibStrings.popstate | atAngularRouterLib.atAngularRouterLibStrings.hashchange,
    finalUrl: UrlTree = null,
    previousNavigation: Navigation = null
  ): Navigation = {
    val __obj = js.Dynamic.literal(extractedUrl = extractedUrl, extras = extras, id = id, initialUrl = initialUrl.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (finalUrl != null) __obj.updateDynamic("finalUrl")(finalUrl)
    if (previousNavigation != null) __obj.updateDynamic("previousNavigation")(previousNavigation)
    __obj.asInstanceOf[Navigation]
  }
}

