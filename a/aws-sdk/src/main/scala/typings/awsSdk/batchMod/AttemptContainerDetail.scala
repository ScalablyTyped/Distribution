package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    containerInstanceArn: String = null,
    exitCode: Int | Double = null,
    logStreamName: String = null,
    networkInterfaces: NetworkInterfaceList = null,
    reason: String = null,
    taskArn: String = null
  ): AttemptContainerDetail = {
    val __obj = js.Dynamic.literal()
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptContainerDetail]
  }
}

