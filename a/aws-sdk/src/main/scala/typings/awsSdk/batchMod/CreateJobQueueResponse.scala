package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobQueueResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String = js.native
  
  /**
    * The name of the job queue.
    */
  var jobQueueName: String = js.native
}
object CreateJobQueueResponse {
  
  @scala.inline
  def apply(jobQueueArn: String, jobQueueName: String): CreateJobQueueResponse = {
    val __obj = js.Dynamic.literal(jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobQueueResponse]
  }
  
  @scala.inline
  implicit class CreateJobQueueResponseOps[Self <: CreateJobQueueResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobQueueArn(value: String): Self = this.set("jobQueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueueName(value: String): Self = this.set("jobQueueName", value.asInstanceOf[js.Any])
  }
}
