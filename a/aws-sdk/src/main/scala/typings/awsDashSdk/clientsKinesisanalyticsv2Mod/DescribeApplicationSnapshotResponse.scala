package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationSnapshotResponse extends js.Object {
  /**
    * An object containing information about the application snapshot.
    */
  var SnapshotDetails: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotDetails
}

object DescribeApplicationSnapshotResponse {
  @scala.inline
  def apply(SnapshotDetails: SnapshotDetails): DescribeApplicationSnapshotResponse = {
    val __obj = js.Dynamic.literal(SnapshotDetails = SnapshotDetails)
  
    __obj.asInstanceOf[DescribeApplicationSnapshotResponse]
  }
}

