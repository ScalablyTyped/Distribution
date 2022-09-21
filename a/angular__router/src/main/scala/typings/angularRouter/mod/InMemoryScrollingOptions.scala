package typings.angularRouter.mod

import typings.angularRouter.angularRouterStrings.disabled
import typings.angularRouter.angularRouterStrings.enabled
import typings.angularRouter.angularRouterStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InMemoryScrollingOptions extends StObject {
  
  /**
    * When set to 'enabled', scrolls to the anchor element when the URL has a fragment.
    * Anchor scrolling is disabled by default.
    *
    * Anchor scrolling does not happen on 'popstate'. Instead, we restore the position
    * that we stored or scroll to the top.
    */
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.undefined
  
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
    * class AppComponent {
    *   movieData: any;
    *
    *   constructor(private router: Router, private viewportScroller: ViewportScroller,
    * changeDetectorRef: ChangeDetectorRef) {
    *   router.events.pipe(filter((event: Event): event is Scroll => event instanceof Scroll)
    *     ).subscribe(e => {
    *       fetch('http://example.com/movies.json').then(response => {
    *         this.movieData = response.json();
    *         // update the template with the data before restoring scroll
    *         changeDetectorRef.detectChanges();
    *
    *         if (e.position) {
    *           viewportScroller.scrollToPosition(e.position);
    *         }
    *       });
    *     });
    *   }
    * }
    * ```
    */
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.undefined
}
object InMemoryScrollingOptions {
  
  inline def apply(): InMemoryScrollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InMemoryScrollingOptions]
  }
  
  extension [Self <: InMemoryScrollingOptions](x: Self) {
    
    inline def setAnchorScrolling(value: disabled | enabled): Self = StObject.set(x, "anchorScrolling", value.asInstanceOf[js.Any])
    
    inline def setAnchorScrollingUndefined: Self = StObject.set(x, "anchorScrolling", js.undefined)
    
    inline def setScrollPositionRestoration(value: disabled | enabled | top): Self = StObject.set(x, "scrollPositionRestoration", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionRestorationUndefined: Self = StObject.set(x, "scrollPositionRestoration", js.undefined)
  }
}
