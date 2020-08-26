package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Schema_
import typings.aframe.mod.System
import typings.three.mod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.Component<any, aframe.aframe.System<any>>> */
@js.native
trait PartialComponentanySystem extends js.Object {
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
  implicit class PartialComponentanySystemOps[Self <: PartialComponentanySystem] (val x: Self) extends AnyVal {
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
    def setAttrName(value: String): Self = this.set("attrName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrName: Self = this.set("attrName", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setEl(value: Entity[ObjectMap[Component[_, System[_]]]]): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setExtendSchema(value: /* update */ Schema_[js.Object] => Unit): Self = this.set("extendSchema", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExtendSchema: Self = this.set("extendSchema", js.undefined)
    @scala.inline
    def setFlushToDOM(value: () => Unit): Self = this.set("flushToDOM", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFlushToDOM: Self = this.set("flushToDOM", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInit(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialized: Self = this.set("initialized", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSchema(value: Schema_[_]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSystem(value: System[_]): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setTick(value: (/* time */ Double, /* timeDelta */ Double) => Unit): Self = this.set("tick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setTock(value: (/* time */ Double, /* timeDelta */ Double, /* camera */ Camera) => Unit): Self = this.set("tock", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTock: Self = this.set("tock", js.undefined)
    @scala.inline
    def setUpdate(value: /* oldData */ js.Any => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateSchema(value: () => Unit): Self = this.set("updateSchema", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdateSchema: Self = this.set("updateSchema", js.undefined)
  }
  
}

