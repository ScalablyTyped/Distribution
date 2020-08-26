package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale
  extends EventBindable
     with MapControl {
  var offset: Pixel = js.native
  var position: String = js.native
}

object Scale {
  @scala.inline
  def apply(
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    offset: Pixel,
    on: (String, EventCallback) => Unit,
    position: String,
    show: () => Unit
  ): Scale = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), offset = offset.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), position = position.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
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
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

