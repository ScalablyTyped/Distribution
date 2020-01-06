package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskRequest extends js.Object {
  /**
    * The name of the disk (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
}

object GetDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName): GetDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDiskRequest]
  }
}

