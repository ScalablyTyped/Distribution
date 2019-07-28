package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeDetail extends js.Object {
  /**
    * The size of the volume, in GiB.
    */
  var Size: Long
}

object VolumeDetail {
  @scala.inline
  def apply(Size: Long): VolumeDetail = {
    val __obj = js.Dynamic.literal(Size = Size)
  
    __obj.asInstanceOf[VolumeDetail]
  }
}

