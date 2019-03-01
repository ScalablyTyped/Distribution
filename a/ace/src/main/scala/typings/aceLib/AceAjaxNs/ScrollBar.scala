package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBar extends js.Object {
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): scala.Double
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: js.Any): scala.Unit
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  def setHeight(height: scala.Double): scala.Unit
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  def setInnerHeight(height: scala.Double): scala.Unit
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  def setScrollTop(scrollTop: scala.Double): scala.Unit
}

object ScrollBar {
  @scala.inline
  def apply(
    getWidth: js.Function0[scala.Double],
    onScroll: js.Function1[js.Any, scala.Unit],
    setHeight: js.Function1[scala.Double, scala.Unit],
    setInnerHeight: js.Function1[scala.Double, scala.Unit],
    setScrollTop: js.Function1[scala.Double, scala.Unit]
  ): ScrollBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getWidth")(getWidth)
    __obj.updateDynamic("onScroll")(onScroll)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setInnerHeight")(setInnerHeight)
    __obj.updateDynamic("setScrollTop")(setScrollTop)
    __obj.asInstanceOf[ScrollBar]
  }
}

