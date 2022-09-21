package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollBar extends StObject {
  
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): Double
  
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: Any): Unit
  
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
  
  inline def apply(
    getWidth: () => Double,
    onScroll: Any => Unit,
    setHeight: Double => Unit,
    setInnerHeight: Double => Unit,
    setScrollTop: Double => Unit
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(getWidth = js.Any.fromFunction0(getWidth), onScroll = js.Any.fromFunction1(onScroll), setHeight = js.Any.fromFunction1(setHeight), setInnerHeight = js.Any.fromFunction1(setInnerHeight), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[ScrollBar]
  }
  
  extension [Self <: ScrollBar](x: Self) {
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setOnScroll(value: Any => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetInnerHeight(value: Double => Unit): Self = StObject.set(x, "setInnerHeight", js.Any.fromFunction1(value))
    
    inline def setSetScrollTop(value: Double => Unit): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1(value))
  }
}
