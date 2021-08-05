package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue extends StObject {
  
  /** The name of the queue. */
  val name: String
  
  /** The ARN of the queue. */
  val queueARN: String
  
  /** Alias for `queueARN`. */
  val queueId: String
}
object Queue {
  
  inline def apply(name: String, queueARN: String, queueId: String): Queue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queueARN = queueARN.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  extension [Self <: Queue](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueueARN(value: String): Self = StObject.set(x, "queueARN", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: String): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
  }
}
