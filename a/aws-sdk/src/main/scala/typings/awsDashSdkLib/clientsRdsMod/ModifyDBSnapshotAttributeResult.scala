package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBSnapshotAttributeResult extends js.Object {
  var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
}

object ModifyDBSnapshotAttributeResult {
  @scala.inline
  def apply(DBSnapshotAttributesResult: DBSnapshotAttributesResult = null): ModifyDBSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshotAttributesResult != null) __obj.updateDynamic("DBSnapshotAttributesResult")(DBSnapshotAttributesResult)
    __obj.asInstanceOf[ModifyDBSnapshotAttributeResult]
  }
}

