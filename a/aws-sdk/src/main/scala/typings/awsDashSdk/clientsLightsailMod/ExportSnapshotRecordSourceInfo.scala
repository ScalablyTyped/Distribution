package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSnapshotRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date when the source instance or disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * A list of objects describing a disk snapshot.
    */
  var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
    */
  var fromResourceArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the snapshot's source instance or disk.
    */
  var fromResourceName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A list of objects describing an instance snapshot.
    */
  var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.undefined
  /**
    * The name of the source instance or disk snapshot.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The Lightsail resource type (e.g., InstanceSnapshot or DiskSnapshot).
    */
  var resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.undefined
}

object ExportSnapshotRecordSourceInfo {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    diskSnapshotInfo: DiskSnapshotInfo = null,
    fromResourceArn: NonEmptyString = null,
    fromResourceName: NonEmptyString = null,
    instanceSnapshotInfo: InstanceSnapshotInfo = null,
    name: NonEmptyString = null,
    resourceType: ExportSnapshotRecordSourceType = null
  ): ExportSnapshotRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (diskSnapshotInfo != null) __obj.updateDynamic("diskSnapshotInfo")(diskSnapshotInfo)
    if (fromResourceArn != null) __obj.updateDynamic("fromResourceArn")(fromResourceArn)
    if (fromResourceName != null) __obj.updateDynamic("fromResourceName")(fromResourceName)
    if (instanceSnapshotInfo != null) __obj.updateDynamic("instanceSnapshotInfo")(instanceSnapshotInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRecordSourceInfo]
  }
}

