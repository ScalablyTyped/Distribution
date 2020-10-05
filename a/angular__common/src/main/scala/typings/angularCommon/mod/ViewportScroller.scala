package typings.angularCommon.mod

import typings.angularCommon.angularCommonStrings.auto
import typings.angularCommon.angularCommonStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "ViewportScroller")
@js.native
abstract class ViewportScroller () extends js.Object {
  /**
    * Retrieves the current scroll position.
    * @returns A position in screen coordinates (a tuple with x and y values).
    */
  def getScrollPosition(): js.Tuple2[Double, Double] = js.native
  /**
    * Scrolls to an anchor element.
    * @param anchor The ID of the anchor element.
    */
  def scrollToAnchor(anchor: String): Unit = js.native
  /**
    * Scrolls to a specified position.
    * @param position A position in screen coordinates (a tuple with x and y values).
    */
  def scrollToPosition(position: js.Tuple2[Double, Double]): Unit = js.native
  /**
    * Disables automatic scroll restoration provided by the browser.
    * See also [window.history.scrollRestoration
    * info](https://developers.google.com/web/updates/2015/09/history-api-scroll-restoration).
    */
  @JSName("setHistoryScrollRestoration")
  def setHistoryScrollRestoration_auto(scrollRestoration: auto): Unit = js.native
  @JSName("setHistoryScrollRestoration")
  def setHistoryScrollRestoration_manual(scrollRestoration: manual): Unit = js.native
  def setOffset(offset: js.Function0[js.Tuple2[Double, Double]]): Unit = js.native
  /**
    * Configures the top offset used when scrolling to an anchor.
    * @param offset A position in screen coordinates (a tuple with x and y values)
    * or a function that returns the top offset position.
    *
    */
  def setOffset(offset: js.Tuple2[Double, Double]): Unit = js.native
}

