package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeDefaultValues extends StObject {
  
  /**
    * The dynamic value of the DataTimeDefaultValues. Different defaults are displayed according to users, groups, and values mapping.
    */
  var DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined
  
  /**
    * The rolling date of the DataTimeDefaultValues. The date is determined from the dataset based on input expression.
    */
  var RollingDate: js.UndefOr[RollingDateConfiguration] = js.undefined
  
  /**
    * The static values of the DataTimeDefaultValues.
    */
  var StaticValues: js.UndefOr[DateTimeDefaultValueList] = js.undefined
}
object DateTimeDefaultValues {
  
  inline def apply(): DateTimeDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setDynamicValue(value: DynamicDefaultValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setDynamicValueUndefined: Self = StObject.set(x, "DynamicValue", js.undefined)
    
    inline def setRollingDate(value: RollingDateConfiguration): Self = StObject.set(x, "RollingDate", value.asInstanceOf[js.Any])
    
    inline def setRollingDateUndefined: Self = StObject.set(x, "RollingDate", js.undefined)
    
    inline def setStaticValues(value: DateTimeDefaultValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: js.Date*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
