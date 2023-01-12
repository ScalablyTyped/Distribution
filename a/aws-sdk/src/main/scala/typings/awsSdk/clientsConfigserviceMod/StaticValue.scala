package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticValue extends StObject {
  
  /**
    * A list of values. For example, the ARN of the assumed role. 
    */
  var Values: StaticParameterValues
}
object StaticValue {
  
  inline def apply(Values: StaticParameterValues): StaticValue = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticValue] (val x: Self) extends AnyVal {
    
    inline def setValues(value: StaticParameterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
