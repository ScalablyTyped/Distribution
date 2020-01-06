package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationSnapshotResponse extends js.Object {
  /**
    * An object containing information about the application snapshot.
    */
  var SnapshotDetails: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotDetails = js.native
}

object DescribeApplicationSnapshotResponse {
  @scala.inline
  def apply(SnapshotDetails: SnapshotDetails): DescribeApplicationSnapshotResponse = {
    val __obj = js.Dynamic.literal(SnapshotDetails = SnapshotDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeApplicationSnapshotResponse]
  }
}

