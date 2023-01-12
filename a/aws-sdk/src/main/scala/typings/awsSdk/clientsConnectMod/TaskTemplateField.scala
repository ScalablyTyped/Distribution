package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTemplateField extends StObject {
  
  /**
    * The description of the field.
    */
  var Description: js.UndefOr[TaskTemplateFieldDescription] = js.undefined
  
  /**
    * The unique identifier for the field.
    */
  var Id: TaskTemplateFieldIdentifier
  
  /**
    * A list of options for a single select field.
    */
  var SingleSelectOptions: js.UndefOr[typings.awsSdk.clientsConnectMod.SingleSelectOptions] = js.undefined
  
  /**
    * Indicates the type of field.
    */
  var Type: js.UndefOr[TaskTemplateFieldType] = js.undefined
}
object TaskTemplateField {
  
  inline def apply(Id: TaskTemplateFieldIdentifier): TaskTemplateField = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskTemplateField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskTemplateField] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: TaskTemplateFieldDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: TaskTemplateFieldIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setSingleSelectOptions(value: SingleSelectOptions): Self = StObject.set(x, "SingleSelectOptions", value.asInstanceOf[js.Any])
    
    inline def setSingleSelectOptionsUndefined: Self = StObject.set(x, "SingleSelectOptions", js.undefined)
    
    inline def setSingleSelectOptionsVarargs(value: TaskTemplateSingleSelectOption*): Self = StObject.set(x, "SingleSelectOptions", js.Array(value*))
    
    inline def setType(value: TaskTemplateFieldType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
