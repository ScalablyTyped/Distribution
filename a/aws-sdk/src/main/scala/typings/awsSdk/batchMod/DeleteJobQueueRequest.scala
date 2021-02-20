package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteJobQueueRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the queue to delete.
    */
  var jobQueue: String = js.native
}
object DeleteJobQueueRequest {
  
  @scala.inline
  def apply(jobQueue: String): DeleteJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobQueueRequest]
  }
  
  @scala.inline
  implicit class DeleteJobQueueRequestMutableBuilder[Self <: DeleteJobQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
  }
}
