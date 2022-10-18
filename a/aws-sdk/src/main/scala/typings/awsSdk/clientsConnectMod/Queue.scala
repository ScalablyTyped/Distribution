package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue extends StObject {
  
  /**
    * The description of the queue.
    */
  var Description: js.UndefOr[QueueDescription] = js.undefined
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: js.UndefOr[typings.awsSdk.clientsConnectMod.HoursOfOperationId] = js.undefined
  
  /**
    * The maximum number of contacts that can be in the queue before it is considered full.
    */
  var MaxContacts: js.UndefOr[QueueMaxContacts] = js.undefined
  
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[CommonNameLength127] = js.undefined
  
  /**
    * The outbound caller ID name, number, and outbound whisper flow.
    */
  var OutboundCallerConfig: js.UndefOr[typings.awsSdk.clientsConnectMod.OutboundCallerConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the queue.
    */
  var QueueArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the queue.
    */
  var QueueId: js.UndefOr[typings.awsSdk.clientsConnectMod.QueueId] = js.undefined
  
  /**
    * The status of the queue.
    */
  var Status: js.UndefOr[QueueStatus] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Queue {
  
  inline def apply(): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Queue]
  }
  
  extension [Self <: Queue](x: Self) {
    
    inline def setDescription(value: QueueDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationIdUndefined: Self = StObject.set(x, "HoursOfOperationId", js.undefined)
    
    inline def setMaxContacts(value: QueueMaxContacts): Self = StObject.set(x, "MaxContacts", value.asInstanceOf[js.Any])
    
    inline def setMaxContactsUndefined: Self = StObject.set(x, "MaxContacts", js.undefined)
    
    inline def setName(value: CommonNameLength127): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutboundCallerConfig(value: OutboundCallerConfig): Self = StObject.set(x, "OutboundCallerConfig", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallerConfigUndefined: Self = StObject.set(x, "OutboundCallerConfig", js.undefined)
    
    inline def setQueueArn(value: ARN): Self = StObject.set(x, "QueueArn", value.asInstanceOf[js.Any])
    
    inline def setQueueArnUndefined: Self = StObject.set(x, "QueueArn", js.undefined)
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQueueIdUndefined: Self = StObject.set(x, "QueueId", js.undefined)
    
    inline def setStatus(value: QueueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
