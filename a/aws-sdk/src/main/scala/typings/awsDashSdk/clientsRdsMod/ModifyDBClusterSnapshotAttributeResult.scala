package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBClusterSnapshotAttributesResult] = js.undefined
}

object ModifyDBClusterSnapshotAttributeResult {
  @scala.inline
  def apply(DBClusterSnapshotAttributesResult: DBClusterSnapshotAttributesResult = null): ModifyDBClusterSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshotAttributesResult != null) __obj.updateDynamic("DBClusterSnapshotAttributesResult")(DBClusterSnapshotAttributesResult)
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
  }
}

