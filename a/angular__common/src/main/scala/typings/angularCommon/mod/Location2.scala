package typings.angularCommon.mod

import typings.angularCore.mod.OnDestroy
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  *
  * A service that applications can use to interact with a browser's URL.
  *
  * Depending on the `LocationStrategy` used, `Location` persists
  * to the URL's path or the URL's hash segment.
  *
  * @usageNotes
  *
  * It's better to use the `Router.navigate()` service to trigger route changes. Use
  * `Location` only if you need to interact with or create normalized URLs outside of
  * routing.
  *
  * `Location` is responsible for normalizing the URL against the application's base href.
  * A normalized URL is absolute from the URL host, includes the application's base href, and has no
  * trailing slash:
  * - `/my/app/user/123` is normalized
  * - `my/app/user/123` **is not** normalized
  * - `/my/app/user/123/` **is not** normalized
  *
  * ### Example
  *
  * <code-example path='common/location/ts/path_location_component.ts'
  * region='LocationComponent'></code-example>
  *
  * @publicApi
  */
@js.native
trait Location2
  extends StObject
     with OnDestroy {
  
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
  def getState(): Any = js.native
  
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
  def go(path: String, query: String): Unit = js.native
  def go(path: String, query: String, state: Any): Unit = js.native
  def go(path: String, query: Unit, state: Any): Unit = js.native
  
  /**
    * Navigate to a specific page from session history, identified by its relative position to the
    * current page.
    *
    * @param relativePosition  Position of the target page in the history relative to the current
    *     page.
    * A negative value moves backwards, a positive value moves forwards, e.g. `location.historyGo(2)`
    * moves forward two pages and `location.historyGo(-2)` moves back two pages. When we try to go
    * beyond what's stored in the history session, we stay in the current page. Same behaviour occurs
    * when `relativePosition` equals 0.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/History_API#Moving_to_a_specific_point_in_history
    */
  def historyGo(): Unit = js.native
  def historyGo(relativePosition: Double): Unit = js.native
  
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
    * @returns A function that, when executed, unregisters a URL change listener.
    */
  def onUrlChange(fn: js.Function2[/* url */ String, /* state */ Any, Unit]): VoidFunction = js.native
  
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
  def replaceState(path: String, query: String): Unit = js.native
  def replaceState(path: String, query: String, state: Any): Unit = js.native
  def replaceState(path: String, query: Unit, state: Any): Unit = js.native
  
  /**
    * Subscribes to the platform's `popState` events.
    *
    * Note: `Location.go()` does not trigger the `popState` event in the browser. Use
    * `Location.onUrlChange()` to subscribe to URL changes instead.
    *
    * @param value Event that is triggered when the state history changes.
    * @param exception The exception to throw.
    *
    * @see [onpopstate](https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onpopstate)
    *
    * @returns Subscribed events.
    */
  def subscribe(onNext: js.Function1[/* value */ PopStateEvent2, Unit]): Any = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent2, Unit],
    onThrow: js.Function1[/* exception */ Any, Unit]
  ): Any = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent2, Unit],
    onThrow: js.Function1[/* exception */ Any, Unit],
    onReturn: js.Function0[Unit]
  ): Any = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent2, Unit],
    onThrow: Null,
    onReturn: js.Function0[Unit]
  ): Any = js.native
  def subscribe(
    onNext: js.Function1[/* value */ PopStateEvent2, Unit],
    onThrow: Unit,
    onReturn: js.Function0[Unit]
  ): Any = js.native
}
