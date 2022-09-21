package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait System[T /* <: js.Object */] extends StObject {
  
  var data: T
  
  var el: Entity[ObjectMap[Component[Any, System[Any]]]]
  
  def init(): Unit
  
  def pause(): Unit
  
  def play(): Unit
  
  var schema: Schema_[T]
  
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
}
object System {
  
  inline def apply[T /* <: js.Object */](
    data: T,
    el: Entity[ObjectMap[Component[Any, System[Any]]]],
    init: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    schema: Schema_[T]
  ): System[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[System[T]]
  }
  
  extension [Self <: System[?], T /* <: js.Object */](x: Self & System[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEl(value: Entity[ObjectMap[Component[Any, System[Any]]]]): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setSchema(value: Schema_[T]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTick(value: (/* t */ Double, /* dt */ Double) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
