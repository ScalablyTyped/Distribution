package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
    */
  var accessPolicy: js.UndefOr[AccessPolicy] = js.undefined
  /**
    * The ARN of this destination.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[DestinationName] = js.undefined
  /**
    * A role for impersonation, used when delivering log events to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a Kinesis stream).
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
}

object Destination {
  @scala.inline
  def apply(
    accessPolicy: AccessPolicy = null,
    arn: Arn = null,
    creationTime: js.UndefOr[Timestamp] = js.undefined,
    destinationName: DestinationName = null,
    roleArn: RoleArn = null,
    targetArn: TargetArn = null
  ): Destination = {
    val __obj = js.Dynamic.literal()
    if (accessPolicy != null) __obj.updateDynamic("accessPolicy")(accessPolicy)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime)
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn)
    __obj.asInstanceOf[Destination]
  }
}

