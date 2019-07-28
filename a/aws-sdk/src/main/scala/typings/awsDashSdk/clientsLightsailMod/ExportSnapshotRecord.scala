package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSnapshotRecord extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date when the export snapshot record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * A list of objects describing the destination of the export snapshot record.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.undefined
  /**
    * The AWS Region and Availability Zone where the export snapshot record is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The export snapshot record name.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * A list of objects describing the source of the export snapshot record.
    */
  var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.undefined
  /**
    * The state of the export snapshot record.
    */
  var state: js.UndefOr[RecordState] = js.undefined
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
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (destinationInfo != null) __obj.updateDynamic("destinationInfo")(destinationInfo)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sourceInfo != null) __obj.updateDynamic("sourceInfo")(sourceInfo)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRecord]
  }
}

