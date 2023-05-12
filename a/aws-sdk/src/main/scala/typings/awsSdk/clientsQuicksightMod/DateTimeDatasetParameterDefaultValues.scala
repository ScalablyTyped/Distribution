package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeDatasetParameterDefaultValues extends StObject {
  
  /**
    * A list of static default values for a given date time parameter.
    */
  var StaticValues: js.UndefOr[DateTimeDatasetParameterValueList] = js.undefined
}
object DateTimeDatasetParameterDefaultValues {
  
  inline def apply(): DateTimeDatasetParameterDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeDatasetParameterDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeDatasetParameterDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setStaticValues(value: DateTimeDatasetParameterValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: js.Date*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
