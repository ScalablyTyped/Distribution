package typings.antDesignReactNative.anon

import typings.antDesignReactNative.radioPropsTypeMod.RadioValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueRadioValue extends StObject {
  
  var value: RadioValue
}
object ValueRadioValue {
  
  inline def apply(): ValueRadioValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueRadioValue]
  }
  
  extension [Self <: ValueRadioValue](x: Self) {
    
    inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
