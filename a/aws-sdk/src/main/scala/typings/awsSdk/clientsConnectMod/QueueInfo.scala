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
    * The unique identifier for the queue.
    */
  var Id: js.UndefOr[QueueId] = js.undefined
}
object QueueInfo {
  
  inline def apply(): QueueInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueInfo] (val x: Self) extends AnyVal {
    
    inline def setEnqueueTimestamp(value: js.Date): Self = StObject.set(x, "EnqueueTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEnqueueTimestampUndefined: Self = StObject.set(x, "EnqueueTimestamp", js.undefined)
    
    inline def setId(value: QueueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
