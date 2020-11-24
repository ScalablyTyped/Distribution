package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BatchEvent extends js.Object {
  
  var invocationId: String = js.native
  
  var invocationSchemaVersion: String = js.native
  
  var job: S3BatchEventJob = js.native
  
  var tasks: js.Array[S3BatchEventTask] = js.native
}
object S3BatchEvent {
  
  @scala.inline
  def apply(
    invocationId: String,
    invocationSchemaVersion: String,
    job: S3BatchEventJob,
    tasks: js.Array[S3BatchEventTask]
  ): S3BatchEvent = {
    val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchEvent]
  }
  
  @scala.inline
  implicit class S3BatchEventOps[Self <: S3BatchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvocationId(value: String): Self = this.set("invocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationSchemaVersion(value: String): Self = this.set("invocationSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob(value: S3BatchEventJob): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: S3BatchEventTask*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: js.Array[S3BatchEventTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
}
