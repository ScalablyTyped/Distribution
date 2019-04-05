package typings
package atAngularCommonLib.srcLocationLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/location/location", "Location")
@js.native
class Location protected () extends js.Object {
  def this(platformStrategy: atAngularCommonLib.srcLocationLocationUnderscoreStrategyMod.LocationStrategy) = this()
  /**
    * Navigates back in the platform's history.
    */
  def back(): scala.Unit = js.native
  /**
    * Navigates forward in the platform's history.
    */
  def forward(): scala.Unit = js.native
  /**
    * Changes the browsers URL to a normalized version of the given URL, and pushes a
    * new item onto the platform's history.
    *
    * @param path  URL path to normalizze
    * @param query Query parameters
    * @param state Location history state
    *
    */
  def go(path: java.lang.String): scala.Unit = js.native
  def go(path: java.lang.String, query: java.lang.String): scala.Unit = js.native
  def go(path: java.lang.String, query: java.lang.String, state: js.Any): scala.Unit = js.native
  /**
    * Normalizes the given path and compares to the current normalized path.
    *
    * @param path The given URL path
    * @param query Query parameters
    *
    * @returns `true` if the given URL path is equal to the current normalized path, `false`
    * otherwise.
    */
  def isCurrentPathEqualTo(path: java.lang.String): scala.Boolean = js.native
  def isCurrentPathEqualTo(path: java.lang.String, query: java.lang.String): scala.Boolean = js.native
  /**
    * Given a string representing a URL, returns the URL path after stripping the
    * trailing slashes.
    *
    * @param url String representing a URL.
    *
    * @returns Normalized URL string.
    */
  def normalize(url: java.lang.String): java.lang.String = js.native
  /**
    * Returns the normalized URL path.
    *
    * @param includeHash Whether path has an anchor fragment.
    *
    * @returns The normalized URL path.
    */
  def path(): java.lang.String = js.native
  def path(includeHash: scala.Boolean): java.lang.String = js.native
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
  def prepareExternalUrl(url: java.lang.String): java.lang.String = js.native
  /**
    * Changes the browser's URL to a normalized version of the given URL, and replaces
    * the top item on the platform's history stack.
    *
    * @param path  URL path to normalizze
    * @param query Query parameters
    * @param state Location history state
    */
  def replaceState(path: java.lang.String): scala.Unit = js.native
  def replaceState(path: java.lang.String, query: java.lang.String): scala.Unit = js.native
  def replaceState(path: java.lang.String, query: java.lang.String, state: js.Any): scala.Unit = js.native
  /**
    * Subscribe to the platform's `popState` events.
    *
    * @param value Event that is triggered when the state history changes.
    * @param exception The exception to throw.
    *
    * @returns Subscribed events.
    */
  def subscribe(onNext: js.Function1[/* value */ PopStateEvent, scala.Unit]): rxjsLib.internalTypesMod.SubscriptionLike = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent, scala.Unit],
    onThrow: js.Function1[/* exception */ js.Any, scala.Unit]
  ): rxjsLib.internalTypesMod.SubscriptionLike = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent, scala.Unit],
    onThrow: js.Function1[/* exception */ js.Any, scala.Unit],
    onReturn: js.Function0[scala.Unit]
  ): rxjsLib.internalTypesMod.SubscriptionLike = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent, scala.Unit],
    onThrow: scala.Null,
    onReturn: js.Function0[scala.Unit]
  ): rxjsLib.internalTypesMod.SubscriptionLike = js.native
}

/* static members */
@JSImport("@angular/common/src/location/location", "Location")
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
  def joinWithSlash(start: java.lang.String, end: java.lang.String): java.lang.String = js.native
  /**
    * Given a string of url parameters, prepend with `?` if needed, otherwise return the
    * parameters as is.
    *
    *  @param  params String of URL parameters
    *
    *  @returns URL parameters prepended with `?` or the parameters as is.
    */
  def normalizeQueryParams(params: java.lang.String): java.lang.String = js.native
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
  def stripTrailingSlash(url: java.lang.String): java.lang.String = js.native
}

