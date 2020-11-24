package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttemptContainerDetail extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS container instance that hosts the job attempt.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The exit code for the job attempt. A non-zero exit code is considered a failure.
    */
  var exitCode: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.native
  
  /**
    * The network interfaces associated with the job attempt.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.native
  
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the job attempt. Each container attempt receives a task ARN when they reach the STARTING status.
    */
  var taskArn: js.UndefOr[String] = js.native
}
object AttemptContainerDetail {
  
  @scala.inline
  def apply(): AttemptContainerDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttemptContainerDetail]
  }
  
  @scala.inline
  implicit class AttemptContainerDetailOps[Self <: AttemptContainerDetail] (val x: Self) extends AnyVal {
    
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
    def setContainerInstanceArn(value: String): Self = this.set("containerInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerInstanceArn: Self = this.set("containerInstanceArn", js.undefined)
    
    @scala.inline
    def setExitCode(value: Integer): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: String): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamName: Self = this.set("logStreamName", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaceList): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setTaskArn(value: String): Self = this.set("taskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskArn: Self = this.set("taskArn", js.undefined)
  }
}
