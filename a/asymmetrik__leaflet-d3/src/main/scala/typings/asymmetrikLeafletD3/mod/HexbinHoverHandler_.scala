package typings.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexbinHoverHandler_ extends js.Object {
  def mouseout(hexLayer: HexbinLayer_, data: js.Any): Unit
  def mouseover(hexLayer: HexbinLayer_, data: js.Any): Unit
}

object HexbinHoverHandler_ {
  @scala.inline
  def apply(mouseout: (HexbinLayer_, js.Any) => Unit, mouseover: (HexbinLayer_, js.Any) => Unit): HexbinHoverHandler_ = {
    val __obj = js.Dynamic.literal(mouseout = js.Any.fromFunction2(mouseout), mouseover = js.Any.fromFunction2(mouseover))
  
    __obj.asInstanceOf[HexbinHoverHandler_]
  }
}

