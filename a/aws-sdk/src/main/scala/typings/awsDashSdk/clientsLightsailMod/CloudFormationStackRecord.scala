package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationStackRecord extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CloudFormation stack record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the CloudFormation stack record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * A list of objects describing the destination service, which is AWS CloudFormation, and the Amazon Resource Name (ARN) of the AWS CloudFormation stack.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.native
  /**
    * A list of objects describing the Availability Zone and AWS Region of the CloudFormation stack record.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the CloudFormation stack record. It starts with CloudFormationStackRecord followed by a GUID.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type (e.g., CloudFormationStackRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * A list of objects describing the source of the CloudFormation stack record.
    */
  var sourceInfo: js.UndefOr[CloudFormationStackRecordSourceInfoList] = js.native
  /**
    * The current state of the CloudFormation stack record.
    */
  var state: js.UndefOr[RecordState] = js.native
}

object CloudFormationStackRecord {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    destinationInfo: DestinationInfo = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    sourceInfo: CloudFormationStackRecordSourceInfoList = null,
    state: RecordState = null
  ): CloudFormationStackRecord = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (destinationInfo != null) __obj.updateDynamic("destinationInfo")(destinationInfo.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sourceInfo != null) __obj.updateDynamic("sourceInfo")(sourceInfo.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationStackRecord]
  }
}

