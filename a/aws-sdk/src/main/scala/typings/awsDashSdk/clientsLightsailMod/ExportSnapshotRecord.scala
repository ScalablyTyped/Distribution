package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotRecord extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the export snapshot record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * A list of objects describing the destination of the export snapshot record.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.native
  /**
    * The AWS Region and Availability Zone where the export snapshot record is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The export snapshot record name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * A list of objects describing the source of the export snapshot record.
    */
  var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.native
  /**
    * The state of the export snapshot record.
    */
  var state: js.UndefOr[RecordState] = js.native
}

object ExportSnapshotRecord {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    destinationInfo: DestinationInfo = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    sourceInfo: ExportSnapshotRecordSourceInfo = null,
    state: RecordState = null
  ): ExportSnapshotRecord = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (destinationInfo != null) __obj.updateDynamic("destinationInfo")(destinationInfo.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sourceInfo != null) __obj.updateDynamic("sourceInfo")(sourceInfo.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRecord]
  }
}

