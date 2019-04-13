package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NielsenConfiguration extends js.Object {
  /**
    * Use Nielsen Configuration (NielsenConfiguration) to set the Nielsen measurement system breakout code. Supported values are 0, 3, 7, and 9.
    */
  var BreakoutCode: js.UndefOr[__integerMin0Max9] = js.undefined
  /**
    * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by Neilsen.
    */
  var DistributorId: js.UndefOr[__string] = js.undefined
}

object NielsenConfiguration {
  @scala.inline
  def apply(BreakoutCode: js.UndefOr[__integerMin0Max9] = js.undefined, DistributorId: __string = null): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BreakoutCode)) __obj.updateDynamic("BreakoutCode")(BreakoutCode)
    if (DistributorId != null) __obj.updateDynamic("DistributorId")(DistributorId)
    __obj.asInstanceOf[NielsenConfiguration]
  }
}

