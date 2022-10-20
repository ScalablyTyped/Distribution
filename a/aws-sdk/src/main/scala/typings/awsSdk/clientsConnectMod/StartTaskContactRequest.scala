package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskContactRequest extends StObject {
  
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typings.awsSdk.clientsConnectMod.Attributes] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The identifier of the flow for initiating the tasks. To see the ContactFlowId in the Amazon Connect console user interface, on the navigation menu go to Routing, Contact Flows. Choose the flow. On the flow page, under the name of the flow, choose Show additional flow information. The ContactFlowId is the last part of the ARN, shown here in bold:  arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/846ec553-a005-41c0-8341-xxxxxxxxxxxx 
    */
  var ContactFlowId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlowId] = js.undefined
  
  /**
    * A description of the task that is shown to an agent in the Contact Control Panel (CCP).
    */
  var Description: js.UndefOr[typings.awsSdk.clientsConnectMod.Description] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of a task that is shown to an agent in the Contact Control Panel (CCP).
    */
  var Name: typings.awsSdk.clientsConnectMod.Name
  
  /**
    * The identifier of the previous chat, voice, or task contact. 
    */
  var PreviousContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * The identifier for the quick connect.
    */
  var QuickConnectId: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectId] = js.undefined
  
  /**
    * A formatted URL that is shown to an agent in the Contact Control Panel (CCP).
    */
  var References: js.UndefOr[ContactReferences] = js.undefined
  
  /**
    * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time cannot be in the past. It must be within up to 6 days in future. 
    */
  var ScheduledTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier for the task template.
    */
  var TaskTemplateId: js.UndefOr[typings.awsSdk.clientsConnectMod.TaskTemplateId] = js.undefined
}
object StartTaskContactRequest {
  
  inline def apply(InstanceId: InstanceId, Name: Name): StartTaskContactRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskContactRequest]
  }
  
  extension [Self <: StartTaskContactRequest](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContactFlowIdUndefined: Self = StObject.set(x, "ContactFlowId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPreviousContactId(value: ContactId): Self = StObject.set(x, "PreviousContactId", value.asInstanceOf[js.Any])
    
    inline def setPreviousContactIdUndefined: Self = StObject.set(x, "PreviousContactId", js.undefined)
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIdUndefined: Self = StObject.set(x, "QuickConnectId", js.undefined)
    
    inline def setReferences(value: ContactReferences): Self = StObject.set(x, "References", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "References", js.undefined)
    
    inline def setScheduledTime(value: js.Date): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeUndefined: Self = StObject.set(x, "ScheduledTime", js.undefined)
    
    inline def setTaskTemplateId(value: TaskTemplateId): Self = StObject.set(x, "TaskTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTaskTemplateIdUndefined: Self = StObject.set(x, "TaskTemplateId", js.undefined)
  }
}
