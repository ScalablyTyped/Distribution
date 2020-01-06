package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopySnapshotResult extends js.Object {
  /**
    * The ID of the new snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * Any tags applied to the new snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CopySnapshotResult {
  @scala.inline
  def apply(SnapshotId: String = null, Tags: TagList = null): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotResult]
  }
}

