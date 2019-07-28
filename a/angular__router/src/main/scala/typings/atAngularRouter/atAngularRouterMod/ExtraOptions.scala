package typings.atAngularRouter.atAngularRouterMod

import typings.atAngularRouter.atAngularRouterStrings.always
import typings.atAngularRouter.atAngularRouterStrings.corrected
import typings.atAngularRouter.atAngularRouterStrings.deferred
import typings.atAngularRouter.atAngularRouterStrings.disabled
import typings.atAngularRouter.atAngularRouterStrings.eager
import typings.atAngularRouter.atAngularRouterStrings.emptyOnly
import typings.atAngularRouter.atAngularRouterStrings.enabled
import typings.atAngularRouter.atAngularRouterStrings.ignore
import typings.atAngularRouter.atAngularRouterStrings.legacy
import typings.atAngularRouter.atAngularRouterStrings.reload
import typings.atAngularRouter.atAngularRouterStrings.top
import typings.std.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraOptions extends js.Object {
  /**
    * When set to 'enabled', scrolls to the anchor element when the URL has a fragment.
    * Anchor scrolling is disabled by default.
    *
    * Anchor scrolling does not happen on 'popstate'. Instead, we restore the position
    * that we stored or scroll to the top.
    */
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.undefined
  /**
    * When true, log all internal navigation events to the console.
    * Use for debugging.
    */
  var enableTracing: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom error handler for failed navigations.
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  /**
    * One of `enabled` (the default) or `disabled`.
    * By default, the initial navigation starts before the root component is created.
    * The bootstrap is blocked until the initial navigation is complete.
    * When set to `disabled`, the initial navigation is not performed.
    * The location listener is set up before the root component gets created.
    */
  var initialNavigation: js.UndefOr[InitialNavigation] = js.undefined
  /**
    * A custom handler for malformed URI errors. The handler is invoked when `encodedURI` contains
    * invalid character sequences.
    * The default implementation is to redirect to the root URL, dropping
    * any path or parameter information. The function takes three parameters:
    *
    * - `'URIError'` - Error thrown when parsing a bad URL.
    * - `'UrlSerializer'` - UrlSerializer that’s configured with the router.
    * - `'url'` -  The malformed URL that caused the URIError
    * */
  var malformedUriErrorHandler: js.UndefOr[
    js.Function3[/* error */ URIError, /* urlSerializer */ UrlSerializer, /* url */ String, UrlTree]
  ] = js.undefined
  /**
    * Define what the router should do if it receives a navigation request to the current URL.
    * Default is `ignore`, which causes the router ignores the navigation.
    * This can disable features such as a "refresh" button.
    * Use this option to configure the behavior when navigating to the
    * current URL. Default is 'ignore'.
    */
  var onSameUrlNavigation: js.UndefOr[reload | ignore] = js.undefined
  /**
    * Defines how the router merges parameters, data, and resolved data from parent to child
    * routes. By default ('emptyOnly'), inherits parent parameters only for
    * path-less or component-less routes.
    * Set to 'always' to enable unconditional inheritance of parent parameters.
    */
  var paramsInheritanceStrategy: js.UndefOr[emptyOnly | always] = js.undefined
  /**
    * Configures a preloading strategy.
    * One of `PreloadAllModules` or `NoPreloading` (the default).
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
  var relativeLinkResolution: js.UndefOr[legacy | corrected] = js.undefined
  /**
    * Configures the scroll offset the router will use when scrolling to an element.
    *
    * When given a tuple with x and y position value,
    * the router uses that offset each time it scrolls.
    * When given a function, the router invokes the function every time
    * it restores scroll position.
    */
  var scrollOffset: js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])] = js.undefined
  /**
    * Configures if the scroll position needs to be restored when navigating back.
    *
    * * 'disabled'- (Default) Does nothing. Scroll position is maintained on navigation.
    * * 'top'- Sets the scroll position to x = 0, y = 0 on all navigation.
    * * 'enabled'- Restores the previous scroll position on backward navigation, else sets the
    * position to the anchor if one is provided, or sets the scroll position to [0, 0] (forward
    * navigation). This option will be the default in the future.
    *
    * You can implement custom scroll restoration behavior by adapting the enabled behavior as
    * in the following example.
    *
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
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.undefined
  /**
    * Defines when the router updates the browser URL. By default ('deferred'),
    * update after successful navigation.
    * Set to 'eager' if prefer to update the URL at the beginning of navigation.
    * Updating the URL early allows you to handle a failure of navigation by
    * showing an error message with the URL that failed.
    */
  var urlUpdateStrategy: js.UndefOr[deferred | eager] = js.undefined
  /**
    * When true, enable the location strategy that uses the URL fragment
    * instead of the history API.
    */
  var useHash: js.UndefOr[Boolean] = js.undefined
}

object ExtraOptions {
  @scala.inline
  def apply(
    anchorScrolling: disabled | enabled = null,
    enableTracing: js.UndefOr[Boolean] = js.undefined,
    errorHandler: ErrorHandler = null,
    initialNavigation: InitialNavigation = null,
    malformedUriErrorHandler: (/* error */ URIError, /* urlSerializer */ UrlSerializer, /* url */ String) => UrlTree = null,
    onSameUrlNavigation: reload | ignore = null,
    paramsInheritanceStrategy: emptyOnly | always = null,
    preloadingStrategy: js.Any = null,
    relativeLinkResolution: legacy | corrected = null,
    scrollOffset: (js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]]) = null,
    scrollPositionRestoration: disabled | enabled | top = null,
    urlUpdateStrategy: deferred | eager = null,
    useHash: js.UndefOr[Boolean] = js.undefined
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

