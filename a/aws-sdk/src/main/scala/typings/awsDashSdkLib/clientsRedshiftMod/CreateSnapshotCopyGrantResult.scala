package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotCopyGrantResult extends js.Object {
  var SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant] = js.undefined
}

object CreateSnapshotCopyGrantResult {
  @scala.inline
  def apply(SnapshotCopyGrant: SnapshotCopyGrant = null): CreateSnapshotCopyGrantResult = {
    val __obj = js.Dynamic.literal()
    if (SnapshotCopyGrant != null) __obj.updateDynamic("SnapshotCopyGrant")(SnapshotCopyGrant)
    __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
  }
}

