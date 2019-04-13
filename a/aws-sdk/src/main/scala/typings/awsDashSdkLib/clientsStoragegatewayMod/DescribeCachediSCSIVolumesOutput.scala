package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCachediSCSIVolumesOutput extends js.Object {
  /**
    * An array of objects where each object contains metadata about one cached volume.
    */
  var CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes] = js.undefined
}

object DescribeCachediSCSIVolumesOutput {
  @scala.inline
  def apply(CachediSCSIVolumes: CachediSCSIVolumes = null): DescribeCachediSCSIVolumesOutput = {
    val __obj = js.Dynamic.literal()
    if (CachediSCSIVolumes != null) __obj.updateDynamic("CachediSCSIVolumes")(CachediSCSIVolumes)
    __obj.asInstanceOf[DescribeCachediSCSIVolumesOutput]
  }
}

