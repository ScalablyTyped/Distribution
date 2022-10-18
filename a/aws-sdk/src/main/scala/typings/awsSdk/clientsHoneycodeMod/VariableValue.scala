package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableValue extends StObject {
  
  /**
    * Raw value of the variable.
    */
  var rawValue: RawValue
}
object VariableValue {
  
  inline def apply(rawValue: RawValue): VariableValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
  
  extension [Self <: VariableValue](x: Self) {
    
    inline def setRawValue(value: RawValue): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
  }
}
