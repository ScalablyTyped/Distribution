package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateQueueQuickConnectsRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typings.awsSdk.clientsConnectMod.QueueId
  
  /**
    * The quick connects to associate with this queue.
    */
  var QuickConnectIds: QuickConnectsList
}
object AssociateQueueQuickConnectsRequest {
  
  inline def apply(InstanceId: InstanceId, QueueId: QueueId, QuickConnectIds: QuickConnectsList): AssociateQueueQuickConnectsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any], QuickConnectIds = QuickConnectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateQueueQuickConnectsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateQueueQuickConnectsRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIds(value: QuickConnectsList): Self = StObject.set(x, "QuickConnectIds", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIdsVarargs(value: QuickConnectId*): Self = StObject.set(x, "QuickConnectIds", js.Array(value*))
  }
}
