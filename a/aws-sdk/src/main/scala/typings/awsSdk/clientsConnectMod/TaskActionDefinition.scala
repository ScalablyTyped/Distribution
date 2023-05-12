package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskActionDefinition extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typings.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The description. Supports variable injection. For more information, see JSONPath reference in the Amazon Connect Administrators Guide.
    */
  var Description: js.UndefOr[TaskDescriptionExpression] = js.undefined
  
  /**
    * The name. Supports variable injection. For more information, see JSONPath reference in the Amazon Connect Administrators Guide.
    */
  var Name: TaskNameExpression
  
  /**
    * Information about the reference when the referenceType is URL. Otherwise, null. (Supports variable injection in the Value field.)
    */
  var References: js.UndefOr[ContactReferences] = js.undefined
}
object TaskActionDefinition {
  
  inline def apply(ContactFlowId: ContactFlowId, Name: TaskNameExpression): TaskActionDefinition = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskActionDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskActionDefinition] (val x: Self) extends AnyVal {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TaskDescriptionExpression): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: TaskNameExpression): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: ContactReferences): Self = StObject.set(x, "References", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "References", js.undefined)
  }
}
