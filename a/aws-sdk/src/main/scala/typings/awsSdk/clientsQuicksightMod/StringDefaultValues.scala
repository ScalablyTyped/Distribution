package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringDefaultValues extends StObject {
  
  /**
    * The dynamic value of the StringDefaultValues. Different defaults displayed according to users, groups, and values mapping.
    */
  var DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined
  
  /**
    * The static values of the DecimalDefaultValues.
    */
  var StaticValues: js.UndefOr[StringDefaultValueList] = js.undefined
}
object StringDefaultValues {
  
  inline def apply(): StringDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setDynamicValue(value: DynamicDefaultValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setDynamicValueUndefined: Self = StObject.set(x, "DynamicValue", js.undefined)
    
    inline def setStaticValues(value: StringDefaultValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: SensitiveStringObject*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
