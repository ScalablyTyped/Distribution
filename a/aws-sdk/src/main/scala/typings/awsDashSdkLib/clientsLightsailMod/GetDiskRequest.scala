package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDiskRequest extends js.Object {
  /**
    * The name of the disk (e.g., my-disk).
    */
  var diskName: ResourceName
}

object GetDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName): GetDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName)
  
    __obj.asInstanceOf[GetDiskRequest]
  }
}

