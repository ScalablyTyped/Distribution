package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationSnapshotRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The identifier of an application snapshot. You can retrieve this value using .
    */
  var SnapshotName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotName
}

object DescribeApplicationSnapshotRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotName: SnapshotName): DescribeApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, SnapshotName = SnapshotName)
  
    __obj.asInstanceOf[DescribeApplicationSnapshotRequest]
  }
}

