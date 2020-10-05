package typings.angularRouter.mod

import typings.angularRouter.angularRouterStrings.hashchange
import typings.angularRouter.angularRouterStrings.imperative
import typings.angularRouter.angularRouterStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation extends js.Object {
  /**
    * The initial target URL after being parsed with `UrlSerializer.extract()`.
    */
  var extractedUrl: UrlTree = js.native
  /**
    * Options that controlled the strategy used for this navigation.
    * See `NavigationExtras`.
    */
  var extras: NavigationExtras = js.native
  /**
    * The extracted URL after redirects have been applied.
    * This URL may not be available immediately, therefore this property can be `undefined`.
    * It is guaranteed to be set after the `RoutesRecognized` event fires.
    */
  var finalUrl: js.UndefOr[UrlTree] = js.native
  /**
    * The unique identifier of the current navigation.
    */
  var id: Double = js.native
  /**
    * The target URL passed into the `Router#navigateByUrl()` call before navigation. This is
    * the value before the router has parsed or applied redirects to it.
    */
  var initialUrl: String | UrlTree = js.native
  /**
    * The previously successful `Navigation` object. Only one previous navigation
    * is available, therefore this previous `Navigation` object has a `null` value
    * for its own `previousNavigation`.
    */
  var previousNavigation: Navigation | Null = js.native
  /**
    * Identifies how this navigation was triggered.
    *
    * * 'imperative'--Triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--Triggered by a popstate event.
    * * 'hashchange'--Triggered by a hashchange event.
    */
  var trigger: imperative | popstate | hashchange = js.native
}

object Navigation {
  @scala.inline
  def apply(
    extractedUrl: UrlTree,
    extras: NavigationExtras,
    id: Double,
    initialUrl: String | UrlTree,
    trigger: imperative | popstate | hashchange
  ): Navigation = {
    val __obj = js.Dynamic.literal(extractedUrl = extractedUrl.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialUrl = initialUrl.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
  @scala.inline
  implicit class NavigationOps[Self <: Navigation] (val x: Self) extends AnyVal {
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
    def setExtractedUrl(value: UrlTree): Self = this.set("extractedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtras(value: NavigationExtras): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialUrl(value: String | UrlTree): Self = this.set("initialUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: imperative | popstate | hashchange): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalUrl(value: UrlTree): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalUrl: Self = this.set("finalUrl", js.undefined)
    @scala.inline
    def setPreviousNavigation(value: Navigation): Self = this.set("previousNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousNavigationNull: Self = this.set("previousNavigation", null)
  }
  
}

