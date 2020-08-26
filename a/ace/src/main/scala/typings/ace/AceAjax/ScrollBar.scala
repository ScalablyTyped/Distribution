package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBar extends js.Object {
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): Double = js.native
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: js.Any): Unit = js.native
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  def setHeight(height: Double): Unit = js.native
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  def setInnerHeight(height: Double): Unit = js.native
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  def setScrollTop(scrollTop: Double): Unit = js.native
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
  @scala.inline
  implicit class ScrollBarOps[Self <: ScrollBar] (val x: Self) extends AnyVal {
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
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScroll(value: js.Any => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInnerHeight(value: Double => Unit): Self = this.set("setInnerHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScrollTop(value: Double => Unit): Self = this.set("setScrollTop", js.Any.fromFunction1(value))
  }
  
}

