package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterValue extends StObject {
  
  /**
    * The type of filter value.
    */
  var Type: FilterValueType
  
  /**
    * The value to be associated.
    */
  var Value: EnclosedInStringProperties
}
object FilterValue {
  
  inline def apply(Type: FilterValueType, Value: EnclosedInStringProperties): FilterValue = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  
  extension [Self <: FilterValue](x: Self) {
    
    inline def setType(value: FilterValueType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: EnclosedInStringProperties): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Value", js.Array(value*))
  }
}
