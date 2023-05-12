package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomParameterValues extends StObject {
  
  /**
    * A list of datetime-type parameter values.
    */
  var DateTimeValues: js.UndefOr[DateTimeDefaultValueList] = js.undefined
  
  /**
    * A list of decimal-type parameter values.
    */
  var DecimalValues: js.UndefOr[DecimalDefaultValueList] = js.undefined
  
  /**
    * A list of integer-type parameter values.
    */
  var IntegerValues: js.UndefOr[IntegerDefaultValueList] = js.undefined
  
  /**
    * A list of string-type parameter values.
    */
  var StringValues: js.UndefOr[StringDefaultValueList] = js.undefined
}
object CustomParameterValues {
  
  inline def apply(): CustomParameterValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomParameterValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomParameterValues] (val x: Self) extends AnyVal {
    
    inline def setDateTimeValues(value: DateTimeDefaultValueList): Self = StObject.set(x, "DateTimeValues", value.asInstanceOf[js.Any])
    
    inline def setDateTimeValuesUndefined: Self = StObject.set(x, "DateTimeValues", js.undefined)
    
    inline def setDateTimeValuesVarargs(value: js.Date*): Self = StObject.set(x, "DateTimeValues", js.Array(value*))
    
    inline def setDecimalValues(value: DecimalDefaultValueList): Self = StObject.set(x, "DecimalValues", value.asInstanceOf[js.Any])
    
    inline def setDecimalValuesUndefined: Self = StObject.set(x, "DecimalValues", js.undefined)
    
    inline def setDecimalValuesVarargs(value: SensitiveDoubleObject*): Self = StObject.set(x, "DecimalValues", js.Array(value*))
    
    inline def setIntegerValues(value: IntegerDefaultValueList): Self = StObject.set(x, "IntegerValues", value.asInstanceOf[js.Any])
    
    inline def setIntegerValuesUndefined: Self = StObject.set(x, "IntegerValues", js.undefined)
    
    inline def setIntegerValuesVarargs(value: SensitiveLongObject*): Self = StObject.set(x, "IntegerValues", js.Array(value*))
    
    inline def setStringValues(value: StringDefaultValueList): Self = StObject.set(x, "StringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "StringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: SensitiveStringObject*): Self = StObject.set(x, "StringValues", js.Array(value*))
  }
}
