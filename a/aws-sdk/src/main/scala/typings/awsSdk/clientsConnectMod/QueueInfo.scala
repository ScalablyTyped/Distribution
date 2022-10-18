package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueInfo extends StObject {
  
  /**
    * The timestamp when the contact was added to the queue.
    */
  var EnqueueTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the agent who accepted the contact.
    */
  var Id: js.UndefOr[QueueId] = js.undefined
}
object QueueInfo {
  
  inline def apply(): QueueInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueInfo]
  }
  
  extension [Self <: QueueInfo](x: Self) {
    
    inline def setEnqueueTimestamp(value: js.Date): Self = StObject.set(x, "EnqueueTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEnqueueTimestampUndefined: Self = StObject.set(x, "EnqueueTimestamp", js.undefined)
    
    inline def setId(value: QueueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
