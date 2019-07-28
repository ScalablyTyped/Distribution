package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Cluster] = js.undefined
}

object ModifySnapshotCopyRetentionPeriodResult {
  @scala.inline
  def apply(Cluster: Cluster = null): ModifySnapshotCopyRetentionPeriodResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
  }
}

