package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableZonesResponse extends js.Object {
  /**
    * The list of Availability Zones that have available AWS CloudHSM capacity.
    */
  var AZList: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.AZList] = js.native
}

object ListAvailableZonesResponse {
  @scala.inline
  def apply(AZList: AZList = null): ListAvailableZonesResponse = {
    val __obj = js.Dynamic.literal()
    if (AZList != null) __obj.updateDynamic("AZList")(AZList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableZonesResponse]
  }
}

