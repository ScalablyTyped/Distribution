package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait System[T /* <: js.Object */] extends StObject {
  
  var data: T = js.native
  
  var el: Entity[ObjectMap[Component[_, System[_]]]] = js.native
  
  def init(): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  var schema: Schema_[T] = js.native
  
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.native
}
object System {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    data: T,
    el: Entity[ObjectMap[Component[_, System[_]]]],
    init: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    schema: Schema_[T]
  ): System[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[System[T]]
  }
  
  @scala.inline
  implicit class SystemMutableBuilder[Self <: System[_], T /* <: js.Object */] (val x: Self with System[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEl(value: Entity[ObjectMap[Component[_, System[_]]]]): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSchema(value: Schema_[T]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick(value: (/* t */ Double, /* dt */ Double) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
