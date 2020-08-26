package typings.animejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeCallBack extends js.Object {
  var begin: js.UndefOr[AnimeCallbackFunction] = js.native
  var change: js.UndefOr[AnimeCallbackFunction] = js.native
  var changeBegin: js.UndefOr[AnimeCallbackFunction] = js.native
  var changeComplete: js.UndefOr[AnimeCallbackFunction] = js.native
  var complete: js.UndefOr[AnimeCallbackFunction] = js.native
  var loopBegin: js.UndefOr[AnimeCallbackFunction] = js.native
  var loopComplete: js.UndefOr[AnimeCallbackFunction] = js.native
  var update: js.UndefOr[AnimeCallbackFunction] = js.native
}

object AnimeCallBack {
  @scala.inline
  def apply(): AnimeCallBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimeCallBack]
  }
  @scala.inline
  implicit class AnimeCallBackOps[Self <: AnimeCallBack] (val x: Self) extends AnyVal {
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
    def setBegin(value: /* anim */ AnimeInstance => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    @scala.inline
    def setChange(value: /* anim */ AnimeInstance => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setChangeBegin(value: /* anim */ AnimeInstance => Unit): Self = this.set("changeBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChangeBegin: Self = this.set("changeBegin", js.undefined)
    @scala.inline
    def setChangeComplete(value: /* anim */ AnimeInstance => Unit): Self = this.set("changeComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChangeComplete: Self = this.set("changeComplete", js.undefined)
    @scala.inline
    def setComplete(value: /* anim */ AnimeInstance => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setLoopBegin(value: /* anim */ AnimeInstance => Unit): Self = this.set("loopBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoopBegin: Self = this.set("loopBegin", js.undefined)
    @scala.inline
    def setLoopComplete(value: /* anim */ AnimeInstance => Unit): Self = this.set("loopComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoopComplete: Self = this.set("loopComplete", js.undefined)
    @scala.inline
    def setUpdate(value: /* anim */ AnimeInstance => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

