package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicIpv4Pool extends js.Object {
  /**
    * A description of the address pool.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The address ranges.
    */
  var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet] = js.undefined
  /**
    * The ID of the IPv4 address pool.
    */
  var PoolId: js.UndefOr[String] = js.undefined
  /**
    * The total number of addresses.
    */
  var TotalAddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * The total number of available addresses.
    */
  var TotalAvailableAddressCount: js.UndefOr[Integer] = js.undefined
}

object PublicIpv4Pool {
  @scala.inline
  def apply(
    Description: String = null,
    PoolAddressRanges: PublicIpv4PoolRangeSet = null,
    PoolId: String = null,
    TotalAddressCount: js.UndefOr[Integer] = js.undefined,
    TotalAvailableAddressCount: js.UndefOr[Integer] = js.undefined
  ): PublicIpv4Pool = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (PoolAddressRanges != null) __obj.updateDynamic("PoolAddressRanges")(PoolAddressRanges)
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId)
    if (!js.isUndefined(TotalAddressCount)) __obj.updateDynamic("TotalAddressCount")(TotalAddressCount)
    if (!js.isUndefined(TotalAvailableAddressCount)) __obj.updateDynamic("TotalAvailableAddressCount")(TotalAvailableAddressCount)
    __obj.asInstanceOf[PublicIpv4Pool]
  }
}

