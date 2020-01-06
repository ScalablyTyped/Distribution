package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedFlow extends js.Object {
  /**
    * The Availability Zone that the flow was created in.
    */
  var AvailabilityZone: __string = js.native
  /**
    * A description of the flow.
    */
  var Description: __string = js.native
  /**
    * The ARN of the flow.
    */
  var FlowArn: __string = js.native
  /**
    * The name of the flow.
    */
  var Name: __string = js.native
  /**
    * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
    */
  var SourceType: typings.awsDashSdk.clientsMediaconnectMod.SourceType = js.native
  /**
    * The current status of the flow.
    */
  var Status: typings.awsDashSdk.clientsMediaconnectMod.Status = js.native
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
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListedFlow]
  }
}

