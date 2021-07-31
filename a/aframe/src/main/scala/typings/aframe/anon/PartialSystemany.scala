package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Schema_
import typings.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<aframe.aframe.System<any>> */
trait PartialSystemany extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var el: js.UndefOr[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]] = js.undefined
  
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var schema: js.UndefOr[Schema_[js.Any]] = js.undefined
  
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
}
object PartialSystemany {
  
  @scala.inline
  def apply(): PartialSystemany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSystemany]
  }
  
  @scala.inline
  implicit class PartialSystemanyMutableBuilder[Self <: PartialSystemany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEl(value: Entity[ObjectMap[Component[js.Any, System[js.Any]]]]): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setSchema(value: Schema_[js.Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTick(value: (/* t */ Double, /* dt */ Double) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
