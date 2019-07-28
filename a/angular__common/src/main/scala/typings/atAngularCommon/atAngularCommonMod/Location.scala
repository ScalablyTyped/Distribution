package typings.atAngularCommon.atAngularCommonMod

import typings.rxjs.internalTypesMod.SubscriptionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Returns the current value of the history.state object.
    */
  def getState(): js.Any = js.native
  /**
    * Changes the browsers URL to a normalized version of the given URL, and pushes a
    * new item onto the platform's history.
    *
    * @param path  URL path to normalizze
    * @param query Query parameters
    * @param state Location history state
    *
    */
  def go(path: String): Unit = js.native
  def go(path: String, query: String): Unit = js.native
  def go(path: String, query: String, state: js.Any): Unit = js.native
  /**
    * Normalizes the given path and compares to the current normalized path.
    *
    * @param path The given URL path
    * @param query Query parameters
    *
    * @returns `true` if the given URL path is equal to the current normalized path, `false`
    * otherwise.
    */
  def isCurrentPathEqualTo(path: String): Boolean = js.native
  def isCurrentPathEqualTo(path: String, query: String): Boolean = js.native
  /**
    * Given a string representing a URL, returns the URL path after stripping the
    * trailing slashes.
    *
    * @param url String representing a URL.
    *
    * @returns Normalized URL string.
    */
  def normalize(url: String): String = js.native
  /**
    * Register URL change listeners. This API can be used to catch updates performed by the Angular
    * framework. These are not detectible through "popstate" or "hashchange" events.
    */
  def onUrlChange(fn: js.Function2[/* url */ String, /* state */ js.Any, Unit]): Unit = js.native
  /**
    * Returns the normalized URL path.
    *
    * @param includeHash Whether path has an anchor fragment.
    *
    * @returns The normalized URL path.
    */
  def path(): String = js.native
  def path(includeHash: Boolean): String = js.native
  /**
    * Given a string representing a URL, returns the platform-specific external URL path.
    * If the given URL doesn't begin with a leading slash (`'/'`), this method adds one
    * before normalizing. This method also adds a hash if `HashLocationStrategy` is
    * used, or the `APP_BASE_HREF` if the `PathLocationStrategy` is in use.
    *
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
    * @param path  URL path to normalizze
    * @param query Query parameters
    * @param state Location history state
    */
  def replaceState(path: String): Unit = js.native
  def replaceState(path: String, query: String): Unit = js.native
  def replaceState(path: String, query: String, state: js.Any): Unit = js.native
  /**
    * Subscribe to the platform's `popState` events.
    *
    * @param value Event that is triggered when the state history changes.
    * @param exception The exception to throw.
    *
    * @returns Subscribed events.
    */
  def subscribe(onNext: js.Function1[/* value */ PopStateEvent, Unit]): SubscriptionLike = js.native
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
    * Given 2 parts of a URL, join them with a slash if needed.
    *
    * @param start  URL string
    * @param end    URL string
    *
    *
    * @returns Given URL strings joined with a slash, if needed.
    */
  def joinWithSlash(start: String, end: String): String = js.native
  /**
    * Given a string of url parameters, prepend with `?` if needed, otherwise return the
    * parameters as is.
    *
    *  @param  params String of URL parameters
    *
    *  @returns URL parameters prepended with `?` or the parameters as is.
    */
  def normalizeQueryParams(params: String): String = js.native
  /**
    * If URL has a trailing slash, remove it, otherwise return the URL as is. The
    * method looks for the first occurrence of either `#`, `?`, or the end of the
    * line as `/` characters and removes the trailing slash if one exists.
    *
    * @param url URL string
    *
    * @returns Returns a URL string after removing the trailing slash if one exists, otherwise
    * returns the string as is.
    */
  def stripTrailingSlash(url: String): String = js.native
}

