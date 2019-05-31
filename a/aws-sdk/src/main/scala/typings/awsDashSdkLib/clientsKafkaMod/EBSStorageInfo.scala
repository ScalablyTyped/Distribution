package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EBSStorageInfo extends js.Object {
  /**
    * 
    The size in GiB of the EBS volume for the data drive on each broker node.
    
    */
  var VolumeSize: js.UndefOr[__integerMin1Max16384] = js.undefined
}

object EBSStorageInfo {
  @scala.inline
  def apply(VolumeSize: js.UndefOr[__integerMin1Max16384] = js.undefined): EBSStorageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize)
    __obj.asInstanceOf[EBSStorageInfo]
  }
}

