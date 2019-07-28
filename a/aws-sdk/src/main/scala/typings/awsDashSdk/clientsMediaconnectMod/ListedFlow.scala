package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListedFlow extends js.Object {
  /**
    * The Availability Zone that the flow was created in.
    */
  var AvailabilityZone: __string
  /**
    * A description of the flow.
    */
  var Description: __string
  /**
    * The ARN of the flow.
    */
  var FlowArn: __string
  /**
    * The name of the flow.
    */
  var Name: __string
  /**
    * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
    */
  var SourceType: typings.awsDashSdk.clientsMediaconnectMod.SourceType
  /**
    * The current status of the flow.
    */
  var Status: typings.awsDashSdk.clientsMediaconnectMod.Status
}

object ListedFlow {
  @scala.inline
  def apply(
    AvailabilityZone: __string,
    Description: __string,
    FlowArn: __string,
    Name: __string,
    SourceType: SourceType,
    Status: Status
  ): ListedFlow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, Description = Description, FlowArn = FlowArn, Name = Name, SourceType = SourceType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListedFlow]
  }
}

