package typings.antdMobile.anon

import typings.antdMobile.useTouchMod.Direction
import typings.react.mod.MutableRefObject
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaX extends StObject {
  
  var deltaX: MutableRefObject[Double]
  
  var deltaY: MutableRefObject[Double]
  
  var direction: MutableRefObject[Direction]
  
  def isHorizontal(): Boolean
  
  def isVertical(): Boolean
  
  var move: EventListener
  
  var offsetX: MutableRefObject[Double]
  
  var offsetY: MutableRefObject[Double]
  
  def reset(): Unit
  
  var start: EventListener
  
  var startX: MutableRefObject[Double]
  
  var startY: MutableRefObject[Double]
}
object DeltaX {
  
  inline def apply(
    deltaX: MutableRefObject[Double],
    deltaY: MutableRefObject[Double],
    direction: MutableRefObject[Direction],
    isHorizontal: () => Boolean,
    isVertical: () => Boolean,
    move: /* evt */ Event => Unit,
    offsetX: MutableRefObject[Double],
    offsetY: MutableRefObject[Double],
    reset: () => Unit,
    start: /* evt */ Event => Unit,
    startX: MutableRefObject[Double],
    startY: MutableRefObject[Double]
  ): DeltaX = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], isHorizontal = js.Any.fromFunction0(isHorizontal), isVertical = js.Any.fromFunction0(isVertical), move = js.Any.fromFunction1(move), offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction1(start), startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaX]
  }
  
  extension [Self <: DeltaX](x: Self) {
    
    inline def setDeltaX(value: MutableRefObject[Double]): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: MutableRefObject[Double]): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: MutableRefObject[Direction]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setIsHorizontal(value: () => Boolean): Self = StObject.set(x, "isHorizontal", js.Any.fromFunction0(value))
    
    inline def setIsVertical(value: () => Boolean): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
    
    inline def setMove(value: /* evt */ Event => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    inline def setOffsetX(value: MutableRefObject[Double]): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: MutableRefObject[Double]): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setStart(value: /* evt */ Event => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartX(value: MutableRefObject[Double]): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartY(value: MutableRefObject[Double]): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
  }
}
