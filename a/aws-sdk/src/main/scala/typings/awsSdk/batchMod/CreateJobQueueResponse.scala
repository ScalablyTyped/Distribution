package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobQueueResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String
  
  /**
    * The name of the job queue.
    */
  var jobQueueName: String
}
object CreateJobQueueResponse {
  
  @scala.inline
  def apply(jobQueueArn: String, jobQueueName: String): CreateJobQueueResponse = {
    val __obj = js.Dynamic.literal(jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobQueueResponse]
  }
  
  @scala.inline
  implicit class CreateJobQueueResponseMutableBuilder[Self <: CreateJobQueueResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobQueueArn(value: String): Self = StObject.set(x, "jobQueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueueName(value: String): Self = StObject.set(x, "jobQueueName", value.asInstanceOf[js.Any])
  }
}
