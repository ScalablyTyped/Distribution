package typings.atAsymmetrikLeafletDashD3.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("HexbinHoverHandler")
trait HexbinHoverHandler_ extends js.Object {
  def mouseout(hexLayer: HexbinLayer, data: js.Any): Unit
  def mouseover(hexLayer: HexbinLayer, data: js.Any): Unit
}

object HexbinHoverHandler_ {
  @scala.inline
  def apply(mouseout: (HexbinLayer, js.Any) => Unit, mouseover: (HexbinLayer, js.Any) => Unit): HexbinHoverHandler_ = {
    val __obj = js.Dynamic.literal(mouseout = js.Any.fromFunction2(mouseout), mouseover = js.Any.fromFunction2(mouseover))
  
    __obj.asInstanceOf[HexbinHoverHandler_]
  }
}

