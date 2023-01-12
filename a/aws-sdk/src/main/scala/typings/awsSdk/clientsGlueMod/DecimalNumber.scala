package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalNumber extends StObject {
  
  /**
    * The scale that determines where the decimal point falls in the unscaled value.
    */
  var Scale: Integer
  
  /**
    * The unscaled numeric value.
    */
  var UnscaledValue: _Blob
}
object DecimalNumber {
  
  inline def apply(Scale: Integer, UnscaledValue: _Blob): DecimalNumber = {
    val __obj = js.Dynamic.literal(Scale = Scale.asInstanceOf[js.Any], UnscaledValue = UnscaledValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalNumber] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Integer): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    inline def setUnscaledValue(value: _Blob): Self = StObject.set(x, "UnscaledValue", value.asInstanceOf[js.Any])
  }
}
