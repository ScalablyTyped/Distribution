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

@JSGlobal("AceAjax.ScrollBar")
@js.native
class ScrollBarCls protected () extends ScrollBar {
  /**
    * Creates a new `ScrollBar`. `parent` is the owner of the scroll bar.
    * @param parent A DOM element
    **/
  def this(parent: stdLib.HTMLElement) = this()
  /**
    * Returns the width of the scroll bar.
    **/
  /* CompleteClass */
  override def getWidth(): scala.Double = js.native
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  /* CompleteClass */
  override def onScroll(e: js.Any): scala.Unit = js.native
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  /* CompleteClass */
  override def setHeight(height: scala.Double): scala.Unit = js.native
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  /* CompleteClass */
  override def setInnerHeight(height: scala.Double): scala.Unit = js.native
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  /* CompleteClass */
  override def setScrollTop(scrollTop: scala.Double): scala.Unit = js.native
}

object ScrollBar {
  @scala.inline
  def apply(
    getWidth: () => scala.Double,
    onScroll: js.Any => scala.Unit,
    setHeight: scala.Double => scala.Unit,
    setInnerHeight: scala.Double => scala.Unit,
    setScrollTop: scala.Double => scala.Unit
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(getWidth = js.Any.fromFunction0(getWidth), onScroll = js.Any.fromFunction1(onScroll), setHeight = js.Any.fromFunction1(setHeight), setInnerHeight = js.Any.fromFunction1(setInnerHeight), setScrollTop = js.Any.fromFunction1(setScrollTop))
  
    __obj.asInstanceOf[ScrollBar]
  }
}

