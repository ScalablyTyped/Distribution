package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalResourceInput extends js.Object {
  /**
    * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in the template.
    */
  var LogicalResourceId: awsDashSdkLib.clientsCloudformationMod.LogicalResourceId
  /**
    * The stack name or unique stack ID that includes the resource that you want to signal.
    */
  var StackName: StackNameOrId
  /**
    * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to immediately fail the stack creation or update.
    */
  var Status: ResourceSignalStatus
  /**
    * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a wait condition), each signal requires a different unique ID.
    */
  var UniqueId: ResourceSignalUniqueId
}

object SignalResourceInput {
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    StackName: StackNameOrId,
    Status: ResourceSignalStatus,
    UniqueId: ResourceSignalUniqueId
  ): SignalResourceInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, StackName = StackName, Status = Status.asInstanceOf[js.Any], UniqueId = UniqueId)
  
    __obj.asInstanceOf[SignalResourceInput]
  }
}

