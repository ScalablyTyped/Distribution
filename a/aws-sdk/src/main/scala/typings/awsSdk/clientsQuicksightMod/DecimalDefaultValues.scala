package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalDefaultValues extends StObject {
  
  /**
    * The dynamic value of the DecimalDefaultValues. Different defaults are displayed according to users, groups, and values mapping.
    */
  var DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined
  
  /**
    * The static values of the DecimalDefaultValues.
    */
  var StaticValues: js.UndefOr[DecimalDefaultValueList] = js.undefined
}
object DecimalDefaultValues {
  
  inline def apply(): DecimalDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setDynamicValue(value: DynamicDefaultValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setDynamicValueUndefined: Self = StObject.set(x, "DynamicValue", js.undefined)
    
    inline def setStaticValues(value: DecimalDefaultValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: SensitiveDoubleObject*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
