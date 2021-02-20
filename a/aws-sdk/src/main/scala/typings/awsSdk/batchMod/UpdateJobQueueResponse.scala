package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobQueueResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the job queue.
    */
  var jobQueueName: js.UndefOr[String] = js.native
}
object UpdateJobQueueResponse {
  
  @scala.inline
  def apply(): UpdateJobQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobQueueResponse]
  }
  
  @scala.inline
  implicit class UpdateJobQueueResponseMutableBuilder[Self <: UpdateJobQueueResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobQueueArn(value: String): Self = StObject.set(x, "jobQueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueueArnUndefined: Self = StObject.set(x, "jobQueueArn", js.undefined)
    
    @scala.inline
    def setJobQueueName(value: String): Self = StObject.set(x, "jobQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueueNameUndefined: Self = StObject.set(x, "jobQueueName", js.undefined)
  }
}
