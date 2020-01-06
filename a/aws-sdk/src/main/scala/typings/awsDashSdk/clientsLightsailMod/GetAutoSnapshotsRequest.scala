package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoSnapshotsRequest extends js.Object {
  /**
    * The name of the source instance or disk from which to get automatic snapshot information.
    */
  var resourceName: ResourceName = js.native
}

object GetAutoSnapshotsRequest {
  @scala.inline
  def apply(resourceName: ResourceName): GetAutoSnapshotsRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAutoSnapshotsRequest]
  }
}

