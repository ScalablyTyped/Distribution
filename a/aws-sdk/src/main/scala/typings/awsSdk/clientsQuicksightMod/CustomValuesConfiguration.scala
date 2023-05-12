package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomValuesConfiguration extends StObject {
  
  var CustomValues: CustomParameterValues
  
  /**
    * Includes the null value in custom action parameter values.
    */
  var IncludeNullValue: js.UndefOr[BooleanObject] = js.undefined
}
object CustomValuesConfiguration {
  
  inline def apply(CustomValues: CustomParameterValues): CustomValuesConfiguration = {
    val __obj = js.Dynamic.literal(CustomValues = CustomValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomValuesConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomValuesConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomValues(value: CustomParameterValues): Self = StObject.set(x, "CustomValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeNullValue(value: BooleanObject): Self = StObject.set(x, "IncludeNullValue", value.asInstanceOf[js.Any])
    
    inline def setIncludeNullValueUndefined: Self = StObject.set(x, "IncludeNullValue", js.undefined)
  }
}
