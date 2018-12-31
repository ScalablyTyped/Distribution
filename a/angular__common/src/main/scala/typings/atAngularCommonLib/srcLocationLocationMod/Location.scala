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
    * Changes the browsers URL to the normalized version of the given URL, and pushes a
    * new item onto the platform's history.
    */
  def go(path: java.lang.String): scala.Unit = js.native
  def go(path: java.lang.String, query: java.lang.String): scala.Unit = js.native
  def go(path: java.lang.String, query: java.lang.String, state: js.Any): scala.Unit = js.native
  /**
    * Normalizes the given path and compares to the current normalized path.
    */
  def isCurrentPathEqualTo(path: java.lang.String): scala.Boolean = js.native
  def isCurrentPathEqualTo(path: java.lang.String, query: java.lang.String): scala.Boolean = js.native
  /**
    * Given a string representing a URL, returns the normalized URL path without leading or
    * trailing slashes.
    */
  def normalize(url: java.lang.String): java.lang.String = js.native
  /**
    * Returns the normalized URL path.
    */
  def path(): java.lang.String = js.native
  def path(includeHash: scala.Boolean): java.lang.String = js.native
  /**
    * Given a string representing a URL, returns the platform-specific external URL path.
    * If the given URL doesn't begin with a leading slash (`'/'`), this method adds one
    * before normalizing. This method will also add a hash if `HashLocationStrategy` is
    * used, or the `APP_BASE_HREF` if the `PathLocationStrategy` is in use.
    */
  def prepareExternalUrl(url: java.lang.String): java.lang.String = js.native
  /**
    * Changes the browsers URL to the normalized version of the given URL, and replaces
    * the top item on the platform's history stack.
    */
  def replaceState(path: java.lang.String): scala.Unit = js.native
  def replaceState(path: java.lang.String, query: java.lang.String): scala.Unit = js.native
  def replaceState(path: java.lang.String, query: java.lang.String, state: js.Any): scala.Unit = js.native
  /**
    * Subscribe to the platform's `popState` events.
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

@JSImport("@angular/common/src/location/location", "Location")
@js.native
object Location extends js.Object {
  /**
    * Given 2 parts of a url, join them with a slash if needed.
    */
  def joinWithSlash(start: java.lang.String, end: java.lang.String): java.lang.String = js.native
  /**
    * Given a string of url parameters, prepend with '?' if needed, otherwise return parameters as
    * is.
    */
  def normalizeQueryParams(params: java.lang.String): java.lang.String = js.native
  /**
    * If url has a trailing slash, remove it, otherwise return url as is. This
    * method looks for the first occurrence of either #, ?, or the end of the
    * line as `/` characters after any of these should not be replaced.
    */
  def stripTrailingSlash(url: java.lang.String): java.lang.String = js.native
}

