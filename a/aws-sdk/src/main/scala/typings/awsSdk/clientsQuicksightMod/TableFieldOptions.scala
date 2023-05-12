package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldOptions extends StObject {
  
  /**
    * The order of field IDs of the field options for a table visual.
    */
  var Order: js.UndefOr[FieldOrderList] = js.undefined
  
  /**
    * The selected field options for the table field options.
    */
  var SelectedFieldOptions: js.UndefOr[TableFieldOptionList] = js.undefined
}
object TableFieldOptions {
  
  inline def apply(): TableFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: FieldOrderList): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
    
    inline def setOrderVarargs(value: FieldId*): Self = StObject.set(x, "Order", js.Array(value*))
    
    inline def setSelectedFieldOptions(value: TableFieldOptionList): Self = StObject.set(x, "SelectedFieldOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldOptionsUndefined: Self = StObject.set(x, "SelectedFieldOptions", js.undefined)
    
    inline def setSelectedFieldOptionsVarargs(value: TableFieldOption*): Self = StObject.set(x, "SelectedFieldOptions", js.Array(value*))
  }
}
