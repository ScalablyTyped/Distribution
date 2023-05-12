package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerDatasetParameterDefaultValues extends StObject {
  
  /**
    * A list of static default values for a given integer parameter.
    */
  var StaticValues: js.UndefOr[IntegerDatasetParameterValueList] = js.undefined
}
object IntegerDatasetParameterDefaultValues {
  
  inline def apply(): IntegerDatasetParameterDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerDatasetParameterDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerDatasetParameterDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setStaticValues(value: IntegerDatasetParameterValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: IntegerDatasetParameterDefaultValue*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
