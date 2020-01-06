package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedCapacityOutput extends js.Object {
  /**
    * The response body contains the following JSON fields.
    */
  var ProvisionedCapacityList: js.UndefOr[typings.awsDashSdk.clientsGlacierMod.ProvisionedCapacityList] = js.native
}

object ListProvisionedCapacityOutput {
  @scala.inline
  def apply(ProvisionedCapacityList: ProvisionedCapacityList = null): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    if (ProvisionedCapacityList != null) __obj.updateDynamic("ProvisionedCapacityList")(ProvisionedCapacityList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
}

