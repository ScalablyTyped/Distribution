package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBar extends StObject {
  
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
  implicit class ScrollBarMutableBuilder[Self <: ScrollBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScroll(value: js.Any => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInnerHeight(value: Double => Unit): Self = StObject.set(x, "setInnerHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollTop(value: Double => Unit): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1(value))
  }
}
