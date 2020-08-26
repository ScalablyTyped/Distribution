package typings.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexbinHoverHandler_ extends js.Object {
  def mouseout(hexLayer: HexbinLayer_, data: js.Any): Unit = js.native
  def mouseover(hexLayer: HexbinLayer_, data: js.Any): Unit = js.native
}

object HexbinHoverHandler_ {
  @scala.inline
  def apply(mouseout: (HexbinLayer_, js.Any) => Unit, mouseover: (HexbinLayer_, js.Any) => Unit): HexbinHoverHandler_ = {
    val __obj = js.Dynamic.literal(mouseout = js.Any.fromFunction2(mouseout), mouseover = js.Any.fromFunction2(mouseover))
    __obj.asInstanceOf[HexbinHoverHandler_]
  }
  @scala.inline
  implicit class HexbinHoverHandler_Ops[Self <: HexbinHoverHandler_] (val x: Self) extends AnyVal {
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
    def setMouseout(value: (HexbinLayer_, js.Any) => Unit): Self = this.set("mouseout", js.Any.fromFunction2(value))
    @scala.inline
    def setMouseover(value: (HexbinLayer_, js.Any) => Unit): Self = this.set("mouseover", js.Any.fromFunction2(value))
  }
  
}

