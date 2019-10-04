package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoSnapshotsRequest extends js.Object {
  /**
    * The name of the source resource from which to get automatic snapshot information.
    */
  var resourceName: ResourceName
}

object GetAutoSnapshotsRequest {
  @scala.inline
  def apply(resourceName: ResourceName): GetAutoSnapshotsRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName)
  
    __obj.asInstanceOf[GetAutoSnapshotsRequest]
  }
}

