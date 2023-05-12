package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterSelectableValues extends StObject {
  
  /**
    * The values that are used in the FilterSelectableValues.
    */
  var Values: js.UndefOr[ParameterSelectableValueList] = js.undefined
}
object FilterSelectableValues {
  
  inline def apply(): FilterSelectableValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSelectableValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterSelectableValues] (val x: Self) extends AnyVal {
    
    inline def setValues(value: ParameterSelectableValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
