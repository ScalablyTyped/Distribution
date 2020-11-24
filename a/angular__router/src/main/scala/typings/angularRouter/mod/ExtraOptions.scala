package typings.angularRouter.mod

import typings.angularRouter.angularRouterStrings.always
import typings.angularRouter.angularRouterStrings.corrected
import typings.angularRouter.angularRouterStrings.deferred
import typings.angularRouter.angularRouterStrings.disabled
import typings.angularRouter.angularRouterStrings.eager
import typings.angularRouter.angularRouterStrings.emptyOnly
import typings.angularRouter.angularRouterStrings.enabled
import typings.angularRouter.angularRouterStrings.ignore
import typings.angularRouter.angularRouterStrings.legacy
import typings.angularRouter.angularRouterStrings.reload
import typings.angularRouter.angularRouterStrings.top
import typings.std.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraOptions extends js.Object {
  
  /**
    * When set to 'enabled', scrolls to the anchor element when the URL has a fragment.
    * Anchor scrolling is disabled by default.
    *
    * Anchor scrolling does not happen on 'popstate'. Instead, we restore the position
    * that we stored or scroll to the top.
    */
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.native
  
  /**
    * When true, log all internal navigation events to the console.
    * Use for debugging.
    */
  var enableTracing: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom error handler for failed navigations.
    * If the handler returns a value, the navigation Promise is resolved with this value.
    * If the handler throws an exception, the navigation Promise is rejected with the exception.
    *
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.native
  
  /**
    * One of `enabled`, `enabledBlocking`, `enabledNonBlocking` or `disabled`.
    * When set to `enabled` or `enabledBlocking`, the initial navigation starts before the root
    * component is created. The bootstrap is blocked until the initial navigation is complete. This
    * value is required for [server-side rendering](guide/universal) to work. When set to
    * `enabledNonBlocking`, the initial navigation starts after the root component has been created.
    * The bootstrap is not blocked on the completion of the initial navigation. When set to
    * `disabled`, the initial navigation is not performed. The location listener is set up before the
    * root component gets created. Use if there is a reason to have more control over when the router
    * starts its initial navigation due to some complex initialization logic.
    */
  var initialNavigation: js.UndefOr[InitialNavigation] = js.native
  
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
  ] = js.native
  
  /**
    * Define what the router should do if it receives a navigation request to the current URL.
    * Default is `ignore`, which causes the router ignores the navigation.
    * This can disable features such as a "refresh" button.
    * Use this option to configure the behavior when navigating to the
    * current URL. Default is 'ignore'.
    */
  var onSameUrlNavigation: js.UndefOr[reload | ignore] = js.native
  
  /**
    * Defines how the router merges parameters, data, and resolved data from parent to child
    * routes. By default ('emptyOnly'), inherits parent parameters only for
    * path-less or component-less routes.
    * Set to 'always' to enable unconditional inheritance of parent parameters.
    */
  var paramsInheritanceStrategy: js.UndefOr[emptyOnly | always] = js.native
  
  /**
    * Configures a preloading strategy.
    * One of `PreloadAllModules` or `NoPreloading` (the default).
    */
  var preloadingStrategy: js.UndefOr[js.Any] = js.native
  
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
    * In other words, you're required to use `../` rather than `./`.
    *
    * The default in v11 is `corrected`.
    */
  var relativeLinkResolution: js.UndefOr[legacy | corrected] = js.native
  
  /**
    * Configures the scroll offset the router will use when scrolling to an element.
    *
    * When given a tuple with x and y position value,
    * the router uses that offset each time it scrolls.
    * When given a function, the router invokes the function every time
    * it restores scroll position.
    */
  var scrollOffset: js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])] = js.native
  
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
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.native
  
  /**
    * Defines when the router updates the browser URL. By default ('deferred'),
    * update after successful navigation.
    * Set to 'eager' if prefer to update the URL at the beginning of navigation.
    * Updating the URL early allows you to handle a failure of navigation by
    * showing an error message with the URL that failed.
    */
  var urlUpdateStrategy: js.UndefOr[deferred | eager] = js.native
  
  /**
    * When true, enable the location strategy that uses the URL fragment
    * instead of the history API.
    */
  var useHash: js.UndefOr[Boolean] = js.native
}
object ExtraOptions {
  
  @scala.inline
  def apply(): ExtraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraOptions]
  }
  
  @scala.inline
  implicit class ExtraOptionsOps[Self <: ExtraOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchorScrolling(value: disabled | enabled): Self = this.set("anchorScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorScrolling: Self = this.set("anchorScrolling", js.undefined)
    
    @scala.inline
    def setEnableTracing(value: Boolean): Self = this.set("enableTracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTracing: Self = this.set("enableTracing", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* error */ js.Any => js.Any): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setInitialNavigation(value: InitialNavigation): Self = this.set("initialNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialNavigation: Self = this.set("initialNavigation", js.undefined)
    
    @scala.inline
    def setMalformedUriErrorHandler(value: (/* error */ URIError, /* urlSerializer */ UrlSerializer, /* url */ String) => UrlTree): Self = this.set("malformedUriErrorHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMalformedUriErrorHandler: Self = this.set("malformedUriErrorHandler", js.undefined)
    
    @scala.inline
    def setOnSameUrlNavigation(value: reload | ignore): Self = this.set("onSameUrlNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSameUrlNavigation: Self = this.set("onSameUrlNavigation", js.undefined)
    
    @scala.inline
    def setParamsInheritanceStrategy(value: emptyOnly | always): Self = this.set("paramsInheritanceStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamsInheritanceStrategy: Self = this.set("paramsInheritanceStrategy", js.undefined)
    
    @scala.inline
    def setPreloadingStrategy(value: js.Any): Self = this.set("preloadingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadingStrategy: Self = this.set("preloadingStrategy", js.undefined)
    
    @scala.inline
    def setRelativeLinkResolution(value: legacy | corrected): Self = this.set("relativeLinkResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeLinkResolution: Self = this.set("relativeLinkResolution", js.undefined)
    
    @scala.inline
    def setScrollOffsetFunction0(value: () => js.Tuple2[Double, Double]): Self = this.set("scrollOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollOffset(value: (js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    
    @scala.inline
    def setScrollPositionRestoration(value: disabled | enabled | top): Self = this.set("scrollPositionRestoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPositionRestoration: Self = this.set("scrollPositionRestoration", js.undefined)
    
    @scala.inline
    def setUrlUpdateStrategy(value: deferred | eager): Self = this.set("urlUpdateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlUpdateStrategy: Self = this.set("urlUpdateStrategy", js.undefined)
    
    @scala.inline
    def setUseHash(value: Boolean): Self = this.set("useHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHash: Self = this.set("useHash", js.undefined)
  }
}
