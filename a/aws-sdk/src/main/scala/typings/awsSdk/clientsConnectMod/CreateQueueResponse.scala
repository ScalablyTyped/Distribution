package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueueResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var QueueArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the queue.
    */
  var QueueId: js.UndefOr[typings.awsSdk.clientsConnectMod.QueueId] = js.undefined
}
object CreateQueueResponse {
  
  inline def apply(): CreateQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQueueResponse] (val x: Self) extends AnyVal {
    
    inline def setQueueArn(value: ARN): Self = StObject.set(x, "QueueArn", value.asInstanceOf[js.Any])
    
    inline def setQueueArnUndefined: Self = StObject.set(x, "QueueArn", js.undefined)
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQueueIdUndefined: Self = StObject.set(x, "QueueId", js.undefined)
  }
}
