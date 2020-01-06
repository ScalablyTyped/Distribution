package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPC extends js.Object {
  var VPCId: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.VPCId] = js.native
  /**
    * (Private hosted zones only) The region that an Amazon VPC was created in.
    */
  var VPCRegion: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.VPCRegion] = js.native
}

object VPC {
  @scala.inline
  def apply(VPCId: VPCId = null, VPCRegion: VPCRegion = null): VPC = {
    val __obj = js.Dynamic.literal()
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId.asInstanceOf[js.Any])
    if (VPCRegion != null) __obj.updateDynamic("VPCRegion")(VPCRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPC]
  }
}

