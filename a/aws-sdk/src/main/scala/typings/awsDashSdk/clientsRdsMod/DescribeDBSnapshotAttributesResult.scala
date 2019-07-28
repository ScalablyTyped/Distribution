package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBSnapshotAttributesResult extends js.Object {
  var DBSnapshotAttributesResult: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSnapshotAttributesResult] = js.undefined
}

object DescribeDBSnapshotAttributesResult {
  @scala.inline
  def apply(DBSnapshotAttributesResult: DBSnapshotAttributesResult = null): DescribeDBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshotAttributesResult != null) __obj.updateDynamic("DBSnapshotAttributesResult")(DBSnapshotAttributesResult)
    __obj.asInstanceOf[DescribeDBSnapshotAttributesResult]
  }
}

