package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeChapCredentialsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsDashSdk.clientsStoragegatewayMod.TargetARN
}

object DescribeChapCredentialsInput {
  @scala.inline
  def apply(TargetARN: TargetARN): DescribeChapCredentialsInput = {
    val __obj = js.Dynamic.literal(TargetARN = TargetARN)
  
    __obj.asInstanceOf[DescribeChapCredentialsInput]
  }
}

