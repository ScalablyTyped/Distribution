package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerRex extends StObject {
  
  def OnAsfEncoderEvent(erorCode: js.Any, bstrErrorDesc: js.Any): Unit
  
  @JSName("PowerPoint.PowerRex_typekey")
  var PowerPointDotPowerRex_typekey: PowerRex
}
object PowerRex {
  
  @scala.inline
  def apply(OnAsfEncoderEvent: (js.Any, js.Any) => Unit, PowerPointDotPowerRex_typekey: PowerRex): PowerRex = {
    val __obj = js.Dynamic.literal(OnAsfEncoderEvent = js.Any.fromFunction2(OnAsfEncoderEvent))
    __obj.updateDynamic("PowerPoint.PowerRex_typekey")(PowerPointDotPowerRex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerRex]
  }
  
  @scala.inline
  implicit class PowerRexMutableBuilder[Self <: PowerRex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAsfEncoderEvent(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "OnAsfEncoderEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPowerPointDotPowerRex_typekey(value: PowerRex): Self = StObject.set(x, "PowerPoint.PowerRex_typekey", value.asInstanceOf[js.Any])
  }
}
