package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeSpecification extends js.Object {
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var SizeInGB: Integer
  /**
    * The volume type. Volume types supported are gp2, io1, standard.
    */
  var VolumeType: String
}

object VolumeSpecification {
  @scala.inline
  def apply(SizeInGB: Integer, VolumeType: String, Iops: js.UndefOr[Integer] = js.undefined): VolumeSpecification = {
    val __obj = js.Dynamic.literal(SizeInGB = SizeInGB, VolumeType = VolumeType)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    __obj.asInstanceOf[VolumeSpecification]
  }
}

