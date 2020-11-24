package typings.angularCommon.mod

import typings.rxjs.typesMod.SubscriptionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "Location")
@js.native
class Location protected () extends js.Object {
  def this(platformStrategy: LocationStrategy, platformLocation: PlatformLocation) = this()
  
  /**
    * Navigates back in the platform's history.
    */
  def back(): Unit = js.native
  
  /**
    * Navigates forward in the platform's history.
    */
  def forward(): Unit = js.native
  
  /**
    * Reports the current state of the location history.
    * @returns The current value of the `history.state` object.
    */
  def getState(): js.Any = js.native
  
  /**
    * Changes the browser's URL to a normalized version of a given URL, and pushes a
    * new item onto the platform's history.
    *
    * @param path  URL path to normalize.
    * @param query Query parameters.
    * @param state Location history state.
    *
    */
  def go(path: String): Unit = js.native
  def go(path: String, query: js.UndefOr[scala.Nothing], state: js.Any): Unit = js.native
  def go(path: String, query: String): Unit = js.native
  def go(path: String, query: String, state: js.Any): Unit = js.native
  
  /**
    * Normalizes the given path and compares to the current normalized path.
    *
    * @param path The given URL path.
    * @param query Query parameters.
    *
    * @returns True if the given URL path is equal to the current normalized path, false
    * otherwise.
    */
  def isCurrentPathEqualTo(path: String): Boolean = js.native
  def isCurrentPathEqualTo(path: String, query: String): Boolean = js.native
  
  /**
    * Normalizes a URL path by stripping any trailing slashes.
    *
    * @param url String representing a URL.
    *
    * @returns The normalized URL string.
    */
  def normalize(url: String): String = js.native
  
  /**
    * Registers a URL change listener. Use to catch updates performed by the Angular
    * framework that are not detectible through "popstate" or "hashchange" events.
    *
    * @param fn The change handler function, which take a URL and a location history state.
    */
  def onUrlChange(fn: js.Function2[/* url */ String, /* state */ js.Any, Unit]): Unit = js.native
  
  /**
    * Normalizes the URL path for this location.
    *
    * @param includeHash True to include an anchor fragment in the path.
    *
    * @returns The normalized URL path.
    */
  def path(): String = js.native
  def path(includeHash: Boolean): String = js.native
  
  /**
    * Normalizes an external URL path.
    * If the given URL doesn't begin with a leading slash (`'/'`), adds one
    * before normalizing. Adds a hash if `HashLocationStrategy` is
    * in use, or the `APP_BASE_HREF` if the `PathLocationStrategy` is in use.
    *
    * @param url String representing a URL.
    *
    * @returns  A normalized platform-specific URL.
    */
  def prepareExternalUrl(url: String): String = js.native
  
  /**
    * Changes the browser's URL to a normalized version of the given URL, and replaces
    * the top item on the platform's history stack.
    *
    * @param path  URL path to normalize.
    * @param query Query parameters.
    * @param state Location history state.
    */
  def replaceState(path: String): Unit = js.native
  def replaceState(path: String, query: js.UndefOr[scala.Nothing], state: js.Any): Unit = js.native
  def replaceState(path: String, query: String): Unit = js.native
  def replaceState(path: String, query: String, state: js.Any): Unit = js.native
  
  /**
    * Subscribes to the platform's `popState` events.
    *
    * @param value Event that is triggered when the state history changes.
    * @param exception The exception to throw.
    *
    * @returns Subscribed events.
    */
  def subscribe(onNext: js.Function1[/* value */ PopStateEvent, Unit]): SubscriptionLike = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent, Unit],
    onThrow: js.UndefOr[scala.Nothing],
    onReturn: js.Function0[Unit]
  ): SubscriptionLike = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent, Unit],
    onThrow: js.Function1[/* exception */ js.Any, Unit]
  ): SubscriptionLike = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent, Unit],
    onThrow: js.Function1[/* exception */ js.Any, Unit],
    onReturn: js.Function0[Unit]
  ): SubscriptionLike = js.native
  def subscribe(onNext: js.Function1[/* value */ PopStateEvent, Unit], onThrow: Null, onReturn: js.Function0[Unit]): SubscriptionLike = js.native
}
/* static members */
@JSImport("@angular/common", "Location")
@js.native
object Location extends js.Object {
  
  /**
    * Joins two parts of a URL with a slash if needed.
    *
    * @param start  URL string
    * @param end    URL string
    *
    *
    * @returns The joined URL string.
    */
  def joinWithSlash(start: String, end: String): String = js.native
  
  /**
    * Normalizes URL parameters by prepending with `?` if needed.
    *
    * @param  params String of URL parameters.
    *
    * @returns The normalized URL parameters string.
    */
  def normalizeQueryParams(params: String): String = js.native
  
  /**
    * Removes a trailing slash from a URL string if needed.
    * Looks for the first occurrence of either `#`, `?`, or the end of the
    * line as `/` characters and removes the trailing slash if one exists.
    *
    * @param url URL string.
    *
    * @returns The URL string, modified if needed.
    */
  def stripTrailingSlash(url: String): String = js.native
}
