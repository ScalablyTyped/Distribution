package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateQueueQuickConnectsRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typings.awsSdk.clientsConnectMod.QueueId
  
  /**
    * The quick connects to disassociate from the queue.
    */
  var QuickConnectIds: QuickConnectsList
}
object DisassociateQueueQuickConnectsRequest {
  
  inline def apply(InstanceId: InstanceId, QueueId: QueueId, QuickConnectIds: QuickConnectsList): DisassociateQueueQuickConnectsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any], QuickConnectIds = QuickConnectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateQueueQuickConnectsRequest]
  }
  
  extension [Self <: DisassociateQueueQuickConnectsRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIds(value: QuickConnectsList): Self = StObject.set(x, "QuickConnectIds", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIdsVarargs(value: QuickConnectId*): Self = StObject.set(x, "QuickConnectIds", js.Array(value*))
  }
}
