package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttemptContainerDetail extends StObject {
  
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
  implicit class AttemptContainerDetailMutableBuilder[Self <: AttemptContainerDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
    @scala.inline
    def setExitCode(value: Integer): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
  }
}
