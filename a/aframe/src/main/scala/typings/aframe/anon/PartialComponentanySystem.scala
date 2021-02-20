package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Schema_
import typings.aframe.mod.System
import typings.three.mod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<aframe.aframe.Component<any, aframe.aframe.System<any>>> */
@js.native
trait PartialComponentanySystem extends StObject {
  
  var attrName: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  var el: js.UndefOr[Entity[ObjectMap[Component[_, System[_]]]]] = js.native
  
  var events: js.UndefOr[js.Any] = js.native
  
  var extendSchema: js.UndefOr[js.Function1[/* update */ Schema_[js.Object], Unit]] = js.native
  
  var flushToDOM: js.UndefOr[js.Function0[Unit]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var init: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  var initialized: js.UndefOr[Boolean] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var play: js.UndefOr[js.Function0[Unit]] = js.native
  
  var remove: js.UndefOr[js.Function0[Unit]] = js.native
  
  var schema: js.UndefOr[Schema_[_]] = js.native
  
  var system: js.UndefOr[System[_]] = js.native
  
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.native
  
  var tock: js.UndefOr[
    js.Function3[/* time */ Double, /* timeDelta */ Double, /* camera */ Camera, Unit]
  ] = js.native
  
  var update: js.UndefOr[js.Function1[/* oldData */ js.Any, Unit]] = js.native
  
  var updateSchema: js.UndefOr[js.Function0[Unit]] = js.native
}
object PartialComponentanySystem {
  
  @scala.inline
  def apply(): PartialComponentanySystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComponentanySystem]
  }
  
  @scala.inline
  implicit class PartialComponentanySystemMutableBuilder[Self <: PartialComponentanySystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrName(value: String): Self = StObject.set(x, "attrName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrNameUndefined: Self = StObject.set(x, "attrName", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setEl(value: Entity[ObjectMap[Component[_, System[_]]]]): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setExtendSchema(value: /* update */ Schema_[js.Object] => Unit): Self = StObject.set(x, "extendSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendSchemaUndefined: Self = StObject.set(x, "extendSchema", js.undefined)
    
    @scala.inline
    def setFlushToDOM(value: () => Unit): Self = StObject.set(x, "flushToDOM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushToDOMUndefined: Self = StObject.set(x, "flushToDOM", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInit(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setSchema(value: Schema_[_]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSystem(value: System[_]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setTick(value: (/* time */ Double, /* timeDelta */ Double) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setTock(value: (/* time */ Double, /* timeDelta */ Double, /* camera */ Camera) => Unit): Self = StObject.set(x, "tock", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTockUndefined: Self = StObject.set(x, "tock", js.undefined)
    
    @scala.inline
    def setUpdate(value: /* oldData */ js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateSchema(value: () => Unit): Self = StObject.set(x, "updateSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateSchemaUndefined: Self = StObject.set(x, "updateSchema", js.undefined)
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
