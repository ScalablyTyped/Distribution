package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalDatasetParameterDefaultValues extends StObject {
  
  /**
    * A list of static default values for a given decimal parameter.
    */
  var StaticValues: js.UndefOr[DecimalDatasetParameterValueList] = js.undefined
}
object DecimalDatasetParameterDefaultValues {
  
  inline def apply(): DecimalDatasetParameterDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalDatasetParameterDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalDatasetParameterDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setStaticValues(value: DecimalDatasetParameterValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: DecimalDatasetParameterDefaultValue*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
