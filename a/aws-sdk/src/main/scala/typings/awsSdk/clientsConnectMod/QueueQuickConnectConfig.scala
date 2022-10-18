package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueQuickConnectConfig extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typings.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typings.awsSdk.clientsConnectMod.QueueId
}
object QueueQuickConnectConfig {
  
  inline def apply(ContactFlowId: ContactFlowId, QueueId: QueueId): QueueQuickConnectConfig = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueQuickConnectConfig]
  }
  
  extension [Self <: QueueQuickConnectConfig](x: Self) {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
