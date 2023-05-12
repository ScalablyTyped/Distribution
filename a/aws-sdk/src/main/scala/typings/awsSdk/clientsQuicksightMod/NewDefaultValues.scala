package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewDefaultValues extends StObject {
  
  /**
    * A list of static default values for a given date time parameter.
    */
  var DateTimeStaticValues: js.UndefOr[DateTimeDatasetParameterValueList] = js.undefined
  
  /**
    * A list of static default values for a given decimal parameter.
    */
  var DecimalStaticValues: js.UndefOr[DecimalDatasetParameterValueList] = js.undefined
  
  /**
    * A list of static default values for a given integer parameter.
    */
  var IntegerStaticValues: js.UndefOr[IntegerDatasetParameterValueList] = js.undefined
  
  /**
    * A list of static default values for a given string parameter.
    */
  var StringStaticValues: js.UndefOr[StringDatasetParameterValueList] = js.undefined
}
object NewDefaultValues {
  
  inline def apply(): NewDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setDateTimeStaticValues(value: DateTimeDatasetParameterValueList): Self = StObject.set(x, "DateTimeStaticValues", value.asInstanceOf[js.Any])
    
    inline def setDateTimeStaticValuesUndefined: Self = StObject.set(x, "DateTimeStaticValues", js.undefined)
    
    inline def setDateTimeStaticValuesVarargs(value: js.Date*): Self = StObject.set(x, "DateTimeStaticValues", js.Array(value*))
    
    inline def setDecimalStaticValues(value: DecimalDatasetParameterValueList): Self = StObject.set(x, "DecimalStaticValues", value.asInstanceOf[js.Any])
    
    inline def setDecimalStaticValuesUndefined: Self = StObject.set(x, "DecimalStaticValues", js.undefined)
    
    inline def setDecimalStaticValuesVarargs(value: DecimalDatasetParameterDefaultValue*): Self = StObject.set(x, "DecimalStaticValues", js.Array(value*))
    
    inline def setIntegerStaticValues(value: IntegerDatasetParameterValueList): Self = StObject.set(x, "IntegerStaticValues", value.asInstanceOf[js.Any])
    
    inline def setIntegerStaticValuesUndefined: Self = StObject.set(x, "IntegerStaticValues", js.undefined)
    
    inline def setIntegerStaticValuesVarargs(value: IntegerDatasetParameterDefaultValue*): Self = StObject.set(x, "IntegerStaticValues", js.Array(value*))
    
    inline def setStringStaticValues(value: StringDatasetParameterValueList): Self = StObject.set(x, "StringStaticValues", value.asInstanceOf[js.Any])
    
    inline def setStringStaticValuesUndefined: Self = StObject.set(x, "StringStaticValues", js.undefined)
    
    inline def setStringStaticValuesVarargs(value: StringDatasetParameterDefaultValue*): Self = StObject.set(x, "StringStaticValues", js.Array(value*))
  }
}
