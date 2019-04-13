package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotRequest extends js.Object {
  /**
    * The AWS Region where the source snapshot is located.
    */
  var sourceRegion: RegionName
  /**
    * The name of the source instance or disk snapshot to be copied.
    */
  var sourceSnapshotName: ResourceName
  /**
    * The name of the new instance or disk snapshot to be created as a copy.
    */
  var targetSnapshotName: ResourceName
}

object CopySnapshotRequest {
  @scala.inline
  def apply(sourceRegion: RegionName, sourceSnapshotName: ResourceName, targetSnapshotName: ResourceName): CopySnapshotRequest = {
    val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], sourceSnapshotName = sourceSnapshotName, targetSnapshotName = targetSnapshotName)
  
    __obj.asInstanceOf[CopySnapshotRequest]
  }
}

