package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskTemplateRequest extends StObject {
  
  /**
    * Constraints that are applicable to the fields listed.
    */
  var Constraints: js.UndefOr[TaskTemplateConstraints] = js.undefined
  
  /**
    * The identifier of the flow that runs by default when a task is created by referencing this template.
    */
  var ContactFlowId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlowId] = js.undefined
  
  /**
    * The default values for fields when a task is created by referencing this template.
    */
  var Defaults: js.UndefOr[TaskTemplateDefaults] = js.undefined
  
  /**
    * The description of the task template.
    */
  var Description: js.UndefOr[TaskTemplateDescription] = js.undefined
  
  /**
    * Fields that are part of the template.
    */
  var Fields: js.UndefOr[TaskTemplateFields] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the task template.
    */
  var Name: js.UndefOr[TaskTemplateName] = js.undefined
  
  /**
    * Marks a template as ACTIVE or INACTIVE for a task to refer to it. Tasks can only be created from ACTIVE templates. If a template is marked as INACTIVE, then a task that refers to this template cannot be created.
    */
  var Status: js.UndefOr[TaskTemplateStatus] = js.undefined
  
  /**
    * A unique identifier for the task template.
    */
  var TaskTemplateId: typings.awsSdk.clientsConnectMod.TaskTemplateId
}
object UpdateTaskTemplateRequest {
  
  inline def apply(InstanceId: InstanceId, TaskTemplateId: TaskTemplateId): UpdateTaskTemplateRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], TaskTemplateId = TaskTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTaskTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: TaskTemplateConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContactFlowIdUndefined: Self = StObject.set(x, "ContactFlowId", js.undefined)
    
    inline def setDefaults(value: TaskTemplateDefaults): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "Defaults", js.undefined)
    
    inline def setDescription(value: TaskTemplateDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFields(value: TaskTemplateFields): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setFieldsVarargs(value: TaskTemplateField*): Self = StObject.set(x, "Fields", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: TaskTemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: TaskTemplateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskTemplateId(value: TaskTemplateId): Self = StObject.set(x, "TaskTemplateId", value.asInstanceOf[js.Any])
  }
}
