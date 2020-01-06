package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationSnapshotRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The identifier of an application snapshot. You can retrieve this value using .
    */
  var SnapshotName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotName = js.native
}

object DescribeApplicationSnapshotRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotName: SnapshotName): DescribeApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeApplicationSnapshotRequest]
  }
}

