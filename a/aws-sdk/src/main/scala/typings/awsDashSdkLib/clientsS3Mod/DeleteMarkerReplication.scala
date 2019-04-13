package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMarkerReplication extends js.Object {
  /**
    * The status of the delete marker replication.   In the current implementation, Amazon S3 doesn't replicate the delete markers. The status must be Disabled.  
    */
  var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.undefined
}

object DeleteMarkerReplication {
  @scala.inline
  def apply(Status: DeleteMarkerReplicationStatus = null): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
}

