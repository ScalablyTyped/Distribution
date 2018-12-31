package typings
package atAngularCommonLib.srcViewportUnderscoreScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/viewport_scroller", "ViewportScroller")
@js.native
abstract class ViewportScroller () extends js.Object {
  /**
    * Returns the current scroll position.
    */
  def getScrollPosition(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
    * Scrolls to the provided anchor.
    */
  def scrollToAnchor(anchor: java.lang.String): scala.Unit = js.native
  /**
    * Sets the scroll position.
    */
  def scrollToPosition(position: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  /**
    *
    * Disables automatic scroll restoration provided by the browser.
    *
    * See also [window.history.scrollRestoration
    * info](https://developers.google.com/web/updates/2015/09/history-api-scroll-restoration)
    */
  @JSName("setHistoryScrollRestoration")
  def setHistoryScrollRestoration_auto(scrollRestoration: atAngularCommonLib.atAngularCommonLibStrings.auto): scala.Unit = js.native
  @JSName("setHistoryScrollRestoration")
  def setHistoryScrollRestoration_manual(scrollRestoration: atAngularCommonLib.atAngularCommonLibStrings.manual): scala.Unit = js.native
  def setOffset(offset: js.Function0[js.Tuple2[scala.Double, scala.Double]]): scala.Unit = js.native
  /**
    * Configures the top offset used when scrolling to an anchor.
    *
    * When given a tuple with two number, the service will always use the numbers.
    * When given a function, the service will invoke the function every time it restores scroll
    * position.
    */
  def setOffset(offset: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
}

@JSImport("@angular/common/src/viewport_scroller", "ViewportScroller")
@js.native
object ViewportScroller extends js.Object {
  /** @nocollapse */
  var ngInjectableDef: scala.Nothing = js.native
}

