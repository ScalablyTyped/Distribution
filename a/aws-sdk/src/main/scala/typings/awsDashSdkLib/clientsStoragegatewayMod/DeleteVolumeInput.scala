package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVolumeInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.VolumeARN
}

object DeleteVolumeInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DeleteVolumeInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN)
  
    __obj.asInstanceOf[DeleteVolumeInput]
  }
}

