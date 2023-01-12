package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerRex extends StObject {
  
  def OnAsfEncoderEvent(erorCode: Any, bstrErrorDesc: Any): Unit
  
  /* private */ @JSName("PowerPoint.PowerRex_typekey")
  var PowerPointDotPowerRex_typekey: PowerRex
}
object PowerRex {
  
  inline def apply(OnAsfEncoderEvent: (Any, Any) => Unit, PowerPointDotPowerRex_typekey: PowerRex): PowerRex = {
    val __obj = js.Dynamic.literal(OnAsfEncoderEvent = js.Any.fromFunction2(OnAsfEncoderEvent))
    __obj.updateDynamic("PowerPoint.PowerRex_typekey")(PowerPointDotPowerRex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerRex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PowerRex] (val x: Self) extends AnyVal {
    
    inline def setOnAsfEncoderEvent(value: (Any, Any) => Unit): Self = StObject.set(x, "OnAsfEncoderEvent", js.Any.fromFunction2(value))
    
    inline def setPowerPointDotPowerRex_typekey(value: PowerRex): Self = StObject.set(x, "PowerPoint.PowerRex_typekey", value.asInstanceOf[js.Any])
  }
}
