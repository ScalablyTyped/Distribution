package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PowerRex extends js.Object {
  @JSName("PowerPoint.PowerRex_typekey")
  var PowerPointDotPowerRex_typekey: PowerRex
  def OnAsfEncoderEvent(erorCode: js.Any, bstrErrorDesc: js.Any): Unit
}

object PowerRex {
  @scala.inline
  def apply(OnAsfEncoderEvent: (js.Any, js.Any) => Unit, PowerPointDotPowerRex_typekey: PowerRex): PowerRex = {
    val __obj = js.Dynamic.literal(OnAsfEncoderEvent = js.Any.fromFunction2(OnAsfEncoderEvent))
    __obj.updateDynamic("PowerPoint.PowerRex_typekey")(PowerPointDotPowerRex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerRex]
  }
}

