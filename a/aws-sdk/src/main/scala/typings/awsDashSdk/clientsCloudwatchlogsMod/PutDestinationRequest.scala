package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDestinationRequest extends js.Object {
  /**
    * A name for the destination.
    */
  var destinationName: DestinationName
  /**
    * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis PutRecord operation on the destination stream.
    */
  var roleArn: RoleArn
  /**
    * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
    */
  var targetArn: TargetArn
}

object PutDestinationRequest {
  @scala.inline
  def apply(destinationName: DestinationName, roleArn: RoleArn, targetArn: TargetArn): PutDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName, roleArn = roleArn, targetArn = targetArn)
  
    __obj.asInstanceOf[PutDestinationRequest]
  }
}

