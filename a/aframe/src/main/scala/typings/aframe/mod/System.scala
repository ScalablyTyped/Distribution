package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System[T /* <: js.Object */] extends js.Object {
  var data: T = js.native
  var el: Entity[ObjectMap[Component[_, System[_]]]] = js.native
  var schema: Schema_[T] = js.native
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.native
  def init(): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
}

object System {
  @scala.inline
  def apply[/* <: js.Object */ T](
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
  implicit class SystemOps[Self <: System[_], /* <: js.Object */ T] (val x: Self with System[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEl(value: Entity[ObjectMap[Component[_, System[_]]]]): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def setSchema(value: Schema_[T]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTick(value: (/* t */ Double, /* dt */ Double) => Unit): Self = this.set("tick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
  }
  
}

