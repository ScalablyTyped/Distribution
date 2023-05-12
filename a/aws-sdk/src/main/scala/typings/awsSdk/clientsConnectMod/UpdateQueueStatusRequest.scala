package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueStatusRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typings.awsSdk.clientsConnectMod.QueueId
  
  /**
    * The status of the queue.
    */
  var Status: QueueStatus
}
object UpdateQueueStatusRequest {
  
  inline def apply(InstanceId: InstanceId, QueueId: QueueId, Status: QueueStatus): UpdateQueueStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateQueueStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: QueueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
