package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceSnapshotRequest extends js.Object {
  /**
    * The Lightsail instance on which to base your snapshot.
    */
  var instanceName: ResourceName
  /**
    * The name for your new snapshot.
    */
  var instanceSnapshotName: ResourceName
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateInstanceSnapshotRequest {
  @scala.inline
  def apply(instanceName: ResourceName, instanceSnapshotName: ResourceName, tags: TagList = null): CreateInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName, instanceSnapshotName = instanceSnapshotName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateInstanceSnapshotRequest]
  }
}

