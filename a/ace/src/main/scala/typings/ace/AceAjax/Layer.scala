package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  trait Cursor extends StObject {
    
    def hideCursor(): Unit
    
    def setBlinkInterval(blinkInterval: Double): Unit
    
    def setBlinking(blinking: Boolean): Unit
    
    def showCursor(): Unit
  }
  object Cursor {
    
    inline def apply(
      hideCursor: () => Unit,
      setBlinkInterval: Double => Unit,
      setBlinking: Boolean => Unit,
      showCursor: () => Unit
    ): Cursor = {
      val __obj = js.Dynamic.literal(hideCursor = js.Any.fromFunction0(hideCursor), setBlinkInterval = js.Any.fromFunction1(setBlinkInterval), setBlinking = js.Any.fromFunction1(setBlinking), showCursor = js.Any.fromFunction0(showCursor))
      __obj.asInstanceOf[Cursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
      
      inline def setHideCursor(value: () => Unit): Self = StObject.set(x, "hideCursor", js.Any.fromFunction0(value))
      
      inline def setSetBlinkInterval(value: Double => Unit): Self = StObject.set(x, "setBlinkInterval", js.Any.fromFunction1(value))
      
      inline def setSetBlinking(value: Boolean => Unit): Self = StObject.set(x, "setBlinking", js.Any.fromFunction1(value))
      
      inline def setShowCursor(value: () => Unit): Self = StObject.set(x, "showCursor", js.Any.fromFunction0(value))
    }
  }
}
