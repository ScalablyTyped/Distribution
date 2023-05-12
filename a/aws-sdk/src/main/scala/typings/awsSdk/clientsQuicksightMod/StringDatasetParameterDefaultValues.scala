package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringDatasetParameterDefaultValues extends StObject {
  
  /**
    * A list of static default values for a given string parameter.
    */
  var StaticValues: js.UndefOr[StringDatasetParameterValueList] = js.undefined
}
object StringDatasetParameterDefaultValues {
  
  inline def apply(): StringDatasetParameterDefaultValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringDatasetParameterDefaultValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringDatasetParameterDefaultValues] (val x: Self) extends AnyVal {
    
    inline def setStaticValues(value: StringDatasetParameterValueList): Self = StObject.set(x, "StaticValues", value.asInstanceOf[js.Any])
    
    inline def setStaticValuesUndefined: Self = StObject.set(x, "StaticValues", js.undefined)
    
    inline def setStaticValuesVarargs(value: StringDatasetParameterDefaultValue*): Self = StObject.set(x, "StaticValues", js.Array(value*))
  }
}
