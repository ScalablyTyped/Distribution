package typings.angularRouter.mod

import typings.angularRouter.angularRouterStrings.hashchange
import typings.angularRouter.angularRouterStrings.imperative
import typings.angularRouter.angularRouterStrings.popstate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation extends StObject {
  
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
  implicit class NavigationMutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtractedUrl(value: UrlTree): Self = StObject.set(x, "extractedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtras(value: NavigationExtras): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUrl(value: UrlTree): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUrl(value: String | UrlTree): Self = StObject.set(x, "initialUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNavigation(value: Navigation): Self = StObject.set(x, "previousNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNavigationNull: Self = StObject.set(x, "previousNavigation", null)
    
    @scala.inline
    def setTrigger(value: imperative | popstate | hashchange): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
