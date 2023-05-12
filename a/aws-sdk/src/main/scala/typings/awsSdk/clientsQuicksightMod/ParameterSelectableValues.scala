package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterSelectableValues extends StObject {
  
  /**
    * The column identifier that fetches values from the data set.
    */
  var LinkToDataSetColumn: js.UndefOr[ColumnIdentifier] = js.undefined
  
  /**
    * The values that are used in ParameterSelectableValues.
    */
  var Values: js.UndefOr[ParameterSelectableValueList] = js.undefined
}
object ParameterSelectableValues {
  
  inline def apply(): ParameterSelectableValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterSelectableValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterSelectableValues] (val x: Self) extends AnyVal {
    
    inline def setLinkToDataSetColumn(value: ColumnIdentifier): Self = StObject.set(x, "LinkToDataSetColumn", value.asInstanceOf[js.Any])
    
    inline def setLinkToDataSetColumnUndefined: Self = StObject.set(x, "LinkToDataSetColumn", js.undefined)
    
    inline def setValues(value: ParameterSelectableValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
