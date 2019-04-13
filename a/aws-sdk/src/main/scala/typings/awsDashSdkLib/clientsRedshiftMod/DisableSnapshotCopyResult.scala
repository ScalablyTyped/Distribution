package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableSnapshotCopyResult extends js.Object {
  var Cluster: js.UndefOr[Cluster] = js.undefined
}

object DisableSnapshotCopyResult {
  @scala.inline
  def apply(Cluster: Cluster = null): DisableSnapshotCopyResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[DisableSnapshotCopyResult]
  }
}

