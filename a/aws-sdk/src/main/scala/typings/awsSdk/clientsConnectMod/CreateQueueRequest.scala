package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueueRequest extends StObject {
  
  /**
    * The description of the queue.
    */
  var Description: js.UndefOr[QueueDescription] = js.undefined
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: typings.awsSdk.clientsConnectMod.HoursOfOperationId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of contacts that can be in the queue before it is considered full.
    */
  var MaxContacts: js.UndefOr[QueueMaxContacts] = js.undefined
  
  /**
    * The name of the queue.
    */
  var Name: CommonNameLength127
  
  /**
    * The outbound caller ID name, number, and outbound whisper flow.
    */
  var OutboundCallerConfig: js.UndefOr[typings.awsSdk.clientsConnectMod.OutboundCallerConfig] = js.undefined
  
  /**
    * The quick connects available to agents who are working the queue.
    */
  var QuickConnectIds: js.UndefOr[QuickConnectsList] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateQueueRequest {
  
  inline def apply(HoursOfOperationId: HoursOfOperationId, InstanceId: InstanceId, Name: CommonNameLength127): CreateQueueRequest = {
    val __obj = js.Dynamic.literal(HoursOfOperationId = HoursOfOperationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: QueueDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxContacts(value: QueueMaxContacts): Self = StObject.set(x, "MaxContacts", value.asInstanceOf[js.Any])
    
    inline def setMaxContactsUndefined: Self = StObject.set(x, "MaxContacts", js.undefined)
    
    inline def setName(value: CommonNameLength127): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallerConfig(value: OutboundCallerConfig): Self = StObject.set(x, "OutboundCallerConfig", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallerConfigUndefined: Self = StObject.set(x, "OutboundCallerConfig", js.undefined)
    
    inline def setQuickConnectIds(value: QuickConnectsList): Self = StObject.set(x, "QuickConnectIds", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIdsUndefined: Self = StObject.set(x, "QuickConnectIds", js.undefined)
    
    inline def setQuickConnectIdsVarargs(value: QuickConnectId*): Self = StObject.set(x, "QuickConnectIds", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
