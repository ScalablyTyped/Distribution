package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBar extends js.Object {
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): Double
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: js.Any): Unit
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  def setHeight(height: Double): Unit
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  def setInnerHeight(height: Double): Unit
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  def setScrollTop(scrollTop: Double): Unit
}

object ScrollBar {
  @scala.inline
  def apply(
    getWidth: () => Double,
    onScroll: js.Any => Unit,
    setHeight: Double => Unit,
    setInnerHeight: Double => Unit,
    setScrollTop: Double => Unit
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(getWidth = js.Any.fromFunction0(getWidth), onScroll = js.Any.fromFunction1(onScroll), setHeight = js.Any.fromFunction1(setHeight), setInnerHeight = js.Any.fromFunction1(setInnerHeight), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[ScrollBar]
  }
}

