package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBSStorageInfo extends js.Object {
  /**
    * 
    The size in GiB of the EBS volume for the data drive on each broker node.
    
    */
  var VolumeSize: js.UndefOr[__integerMin1Max16384] = js.native
}

object EBSStorageInfo {
  @scala.inline
  def apply(VolumeSize: Int | Double = null): EBSStorageInfo = {
    val __obj = js.Dynamic.literal()
    if (VolumeSize != null) __obj.updateDynamic("VolumeSize")(VolumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBSStorageInfo]
  }
}

