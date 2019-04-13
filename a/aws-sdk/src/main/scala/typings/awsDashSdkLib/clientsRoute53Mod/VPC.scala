package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPC extends js.Object {
  var VPCId: js.UndefOr[VPCId] = js.undefined
  /**
    * (Private hosted zones only) The region that an Amazon VPC was created in.
    */
  var VPCRegion: js.UndefOr[VPCRegion] = js.undefined
}

object VPC {
  @scala.inline
  def apply(VPCId: VPCId = null, VPCRegion: VPCRegion = null): VPC = {
    val __obj = js.Dynamic.literal()
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId)
    if (VPCRegion != null) __obj.updateDynamic("VPCRegion")(VPCRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPC]
  }
}

