package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVolumeInitiatorsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes for the gateway.
    */
  var VolumeARN: typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN
}

object ListVolumeInitiatorsInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): ListVolumeInitiatorsInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN)
  
    __obj.asInstanceOf[ListVolumeInitiatorsInput]
  }
}

