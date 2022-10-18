package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobQueueRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the queue to delete.
    */
  var jobQueue: String
}
object DeleteJobQueueRequest {
  
  inline def apply(jobQueue: String): DeleteJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobQueueRequest]
  }
  
  extension [Self <: DeleteJobQueueRequest](x: Self) {
    
    inline def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
  }
}
