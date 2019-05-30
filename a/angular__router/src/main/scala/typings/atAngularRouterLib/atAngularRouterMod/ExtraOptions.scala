package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraOptions extends js.Object {
  /**
    * Configures if the router should scroll to the element when the url has a fragment.
    *
    * * 'disabled'--does nothing (default).
    * * 'enabled'--scrolls to the element. This option will be the default in the future.
    *
    * Anchor scrolling does not happen on 'popstate'. Instead, we restore the position
    * that we stored or scroll to the top.
    */
  var anchorScrolling: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled
  ] = js.undefined
  /**
    * Makes the router log all its internal events to the console.
    */
  var enableTracing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom error handler.
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  /**
    * Disables the initial navigation.
    */
  var initialNavigation: js.UndefOr[InitialNavigation] = js.undefined
  /**
    * A custom malformed uri error handler function. This handler is invoked when encodedURI contains
    * invalid character sequences. The default implementation is to redirect to the root url dropping
    * any path or param info. This function passes three parameters:
    *
    * - `'URIError'` - Error thrown when parsing a bad URL
    * - `'UrlSerializer'` - UrlSerializer that’s configured with the router.
    * - `'url'` -  The malformed URL that caused the URIError
    * */
  var malformedUriErrorHandler: js.UndefOr[
    js.Function3[
      /* error */ stdLib.URIError, 
      /* urlSerializer */ UrlSerializer, 
      /* url */ java.lang.String, 
      UrlTree
    ]
  ] = js.undefined
  /**
    * Define what the router should do if it receives a navigation request to the current URL.
    * By default, the router will ignore this navigation. However, this prevents features such
    * as a "refresh" button. Use this option to configure the behavior when navigating to the
    * current URL. Default is 'ignore'.
    */
  var onSameUrlNavigation: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.reload | atAngularRouterLib.atAngularRouterLibStrings.ignore
  ] = js.undefined
  /**
    * Defines how the router merges params, data and resolved data from parent to child
    * routes. Available options are:
    *
    * - `'emptyOnly'`, the default, only inherits parent params for path-less or component-less
    *   routes.
    * - `'always'`, enables unconditional inheritance of parent params.
    */
  var paramsInheritanceStrategy: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.emptyOnly | atAngularRouterLib.atAngularRouterLibStrings.always
  ] = js.undefined
  /**
    * Configures a preloading strategy. See `PreloadAllModules`.
    */
  var preloadingStrategy: js.UndefOr[js.Any] = js.undefined
  /**
    * Enables a bug fix that corrects relative link resolution in components with empty paths.
    * Example:
    *
    * ```
    * const routes = [
    *   {
    *     path: '',
    *     component: ContainerComponent,
    *     children: [
    *       { path: 'a', component: AComponent },
    *       { path: 'b', component: BComponent },
    *     ]
    *   }
    * ];
    * ```
    *
    * From the `ContainerComponent`, this will not work:
    *
    * `<a [routerLink]="['./a']">Link to A</a>`
    *
    * However, this will work:
    *
    * `<a [routerLink]="['../a']">Link to A</a>`
    *
    * In other words, you're required to use `../` rather than `./`. This is currently the default
    * behavior. Setting this option to `corrected` enables the fix.
    */
  var relativeLinkResolution: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.legacy | atAngularRouterLib.atAngularRouterLibStrings.corrected
  ] = js.undefined
  /**
    * Configures the scroll offset the router will use when scrolling to an element.
    *
    * When given a tuple with two numbers, the router will always use the numbers.
    * When given a function, the router will invoke the function every time it restores scroll
    * position.
    */
  var scrollOffset: js.UndefOr[
    (js.Tuple2[scala.Double, scala.Double]) | (js.Function0[js.Tuple2[scala.Double, scala.Double]])
  ] = js.undefined
  /**
    * Configures if the scroll position needs to be restored when navigating back.
    *
    * * 'disabled'--does nothing (default).  Scroll position will be maintained on navigation.
    * * 'top'--set the scroll position to x = 0, y = 0 on all navigation.
    * * 'enabled'--restores the previous scroll position on backward navigation, else sets the
    * position to the anchor if one is provided, or sets the scroll position to [0, 0] (forward
    * navigation). This option will be the default in the future.
    *
    * You can implement custom scroll restoration behavior by adapting the enabled behavior as
    * follows:
    * ```typescript
    * class AppModule {
    *   constructor(router: Router, viewportScroller: ViewportScroller) {
    *     router.events.pipe(
    *       filter((e: Event): e is Scroll => e instanceof Scroll)
    *     ).subscribe(e => {
    *       if (e.position) {
    *         // backward navigation
    *         viewportScroller.scrollToPosition(e.position);
    *       } else if (e.anchor) {
    *         // anchor navigation
    *         viewportScroller.scrollToAnchor(e.anchor);
    *       } else {
    *         // forward navigation
    *         viewportScroller.scrollToPosition([0, 0]);
    *       }
    *     });
    *   }
    * }
    * ```
    */
  var scrollPositionRestoration: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled | atAngularRouterLib.atAngularRouterLibStrings.top
  ] = js.undefined
  /**
    * Defines when the router updates the browser URL. The default behavior is to update after
    * successful navigation. However, some applications may prefer a mode where the URL gets
    * updated at the beginning of navigation. The most common use case would be updating the
    * URL early so if navigation fails, you can show an error message with the URL that failed.
    * Available options are:
    *
    * - `'deferred'`, the default, updates the browser URL after navigation has finished.
    * - `'eager'`, updates browser URL at the beginning of navigation.
    */
  var urlUpdateStrategy: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.deferred | atAngularRouterLib.atAngularRouterLibStrings.eager
  ] = js.undefined
  /**
    * Enables the location strategy that uses the URL fragment instead of the history API.
    */
  var useHash: js.UndefOr[scala.Boolean] = js.undefined
}

object ExtraOptions {
  @scala.inline
  def apply(
    anchorScrolling: atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled = null,
    enableTracing: js.UndefOr[scala.Boolean] = js.undefined,
    errorHandler: ErrorHandler = null,
    initialNavigation: InitialNavigation = null,
    malformedUriErrorHandler: (/* error */ stdLib.URIError, /* urlSerializer */ UrlSerializer, /* url */ java.lang.String) => UrlTree = null,
    onSameUrlNavigation: atAngularRouterLib.atAngularRouterLibStrings.reload | atAngularRouterLib.atAngularRouterLibStrings.ignore = null,
    paramsInheritanceStrategy: atAngularRouterLib.atAngularRouterLibStrings.emptyOnly | atAngularRouterLib.atAngularRouterLibStrings.always = null,
    preloadingStrategy: js.Any = null,
    relativeLinkResolution: atAngularRouterLib.atAngularRouterLibStrings.legacy | atAngularRouterLib.atAngularRouterLibStrings.corrected = null,
    scrollOffset: (js.Tuple2[scala.Double, scala.Double]) | (js.Function0[js.Tuple2[scala.Double, scala.Double]]) = null,
    scrollPositionRestoration: atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled | atAngularRouterLib.atAngularRouterLibStrings.top = null,
    urlUpdateStrategy: atAngularRouterLib.atAngularRouterLibStrings.deferred | atAngularRouterLib.atAngularRouterLibStrings.eager = null,
    useHash: js.UndefOr[scala.Boolean] = js.undefined
  ): ExtraOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorScrolling != null) __obj.updateDynamic("anchorScrolling")(anchorScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTracing)) __obj.updateDynamic("enableTracing")(enableTracing)
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler)
    if (initialNavigation != null) __obj.updateDynamic("initialNavigation")(initialNavigation)
    if (malformedUriErrorHandler != null) __obj.updateDynamic("malformedUriErrorHandler")(js.Any.fromFunction3(malformedUriErrorHandler))
    if (onSameUrlNavigation != null) __obj.updateDynamic("onSameUrlNavigation")(onSameUrlNavigation.asInstanceOf[js.Any])
    if (paramsInheritanceStrategy != null) __obj.updateDynamic("paramsInheritanceStrategy")(paramsInheritanceStrategy.asInstanceOf[js.Any])
    if (preloadingStrategy != null) __obj.updateDynamic("preloadingStrategy")(preloadingStrategy)
    if (relativeLinkResolution != null) __obj.updateDynamic("relativeLinkResolution")(relativeLinkResolution.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (scrollPositionRestoration != null) __obj.updateDynamic("scrollPositionRestoration")(scrollPositionRestoration.asInstanceOf[js.Any])
    if (urlUpdateStrategy != null) __obj.updateDynamic("urlUpdateStrategy")(urlUpdateStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash)
    __obj.asInstanceOf[ExtraOptions]
  }
}

