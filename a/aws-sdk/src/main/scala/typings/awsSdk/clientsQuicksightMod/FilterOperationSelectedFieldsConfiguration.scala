package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperationSelectedFieldsConfiguration extends StObject {
  
  /**
    * The selected columns of a dataset.
    */
  var SelectedColumns: js.UndefOr[CustomActionColumnList] = js.undefined
  
  /**
    * A structure that contains the options that choose which fields are filtered in the CustomActionFilterOperation. Valid values are defined as follows:    ALL_FIELDS: Applies the filter operation to all fields.  
    */
  var SelectedFieldOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SelectedFieldOptions] = js.undefined
  
  /**
    * Chooses the fields that are filtered in CustomActionFilterOperation.
    */
  var SelectedFields: js.UndefOr[SelectedFieldList] = js.undefined
}
object FilterOperationSelectedFieldsConfiguration {
  
  inline def apply(): FilterOperationSelectedFieldsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperationSelectedFieldsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOperationSelectedFieldsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSelectedColumns(value: CustomActionColumnList): Self = StObject.set(x, "SelectedColumns", value.asInstanceOf[js.Any])
    
    inline def setSelectedColumnsUndefined: Self = StObject.set(x, "SelectedColumns", js.undefined)
    
    inline def setSelectedColumnsVarargs(value: ColumnIdentifier*): Self = StObject.set(x, "SelectedColumns", js.Array(value*))
    
    inline def setSelectedFieldOptions(value: SelectedFieldOptions): Self = StObject.set(x, "SelectedFieldOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldOptionsUndefined: Self = StObject.set(x, "SelectedFieldOptions", js.undefined)
    
    inline def setSelectedFields(value: SelectedFieldList): Self = StObject.set(x, "SelectedFields", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldsUndefined: Self = StObject.set(x, "SelectedFields", js.undefined)
    
    inline def setSelectedFieldsVarargs(value: FieldId*): Self = StObject.set(x, "SelectedFields", js.Array(value*))
  }
}
