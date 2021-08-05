package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/input/Input.InputState> */
trait PartialInputState extends StObject {
  
  var focused: js.UndefOr[Boolean] = js.undefined
  
  var prevValue: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object PartialInputState {
  
  inline def apply(): PartialInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInputState]
  }
  
  extension [Self <: PartialInputState](x: Self) {
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setPrevValue(value: js.Any): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    inline def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
