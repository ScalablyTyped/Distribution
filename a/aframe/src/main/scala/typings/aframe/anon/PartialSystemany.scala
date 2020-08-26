package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Schema_
import typings.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.System<any>> */
@js.native
trait PartialSystemany extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var el: js.UndefOr[Entity[ObjectMap[Component[_, System[_]]]]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  var play: js.UndefOr[js.Function0[Unit]] = js.native
  var schema: js.UndefOr[Schema_[_]] = js.native
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.native
}

object PartialSystemany {
  @scala.inline
  def apply(): PartialSystemany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSystemany]
  }
  @scala.inline
  implicit class PartialSystemanyOps[Self <: PartialSystemany] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEl(value: Entity[ObjectMap[Component[_, System[_]]]]): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setSchema(value: Schema_[_]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setTick(value: (/* t */ Double, /* dt */ Double) => Unit): Self = this.set("tick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
  }
  
}

