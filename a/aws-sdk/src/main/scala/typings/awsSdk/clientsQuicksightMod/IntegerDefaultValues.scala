package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerDefaultValues extends StObject {
  
  /**
    * The dynamic value of the IntegerDefaultValues. Different defaults are displayed according to users, groups, and values mapping.
    */
  var DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined
  
  /**
    * The static values of the IntegerDefaultValues.
    */
  var StaticValues: js.UndefOr[IntegerDefaultValueList] = js.undefined
}
object IntegerDefaultValues {
  
  inline def apply(): IntegerDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setDynamicValue(value: DynamicDefaultValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setDynamicValueUndefined: Self = StObject.set(x, "DynamicValue", js.undefined)
    
    inline def setStaticValues(value: IntegerDefaultValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: SensitiveLongObject*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
