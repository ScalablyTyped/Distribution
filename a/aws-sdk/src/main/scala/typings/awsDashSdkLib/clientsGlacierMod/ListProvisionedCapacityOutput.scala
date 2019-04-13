package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProvisionedCapacityOutput extends js.Object {
  /**
    * The response body contains the following JSON fields.
    */
  var ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList] = js.undefined
}

object ListProvisionedCapacityOutput {
  @scala.inline
  def apply(ProvisionedCapacityList: ProvisionedCapacityList = null): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    if (ProvisionedCapacityList != null) __obj.updateDynamic("ProvisionedCapacityList")(ProvisionedCapacityList)
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
}

