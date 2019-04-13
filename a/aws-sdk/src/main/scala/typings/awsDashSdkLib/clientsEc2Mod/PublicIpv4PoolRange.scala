package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicIpv4PoolRange extends js.Object {
  /**
    * The number of addresses in the range.
    */
  var AddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of available addresses in the range.
    */
  var AvailableAddressCount: js.UndefOr[Integer] = js.undefined
  /**
    * The first IP address in the range.
    */
  var FirstAddress: js.UndefOr[String] = js.undefined
  /**
    * The last IP address in the range.
    */
  var LastAddress: js.UndefOr[String] = js.undefined
}

object PublicIpv4PoolRange {
  @scala.inline
  def apply(
    AddressCount: js.UndefOr[Integer] = js.undefined,
    AvailableAddressCount: js.UndefOr[Integer] = js.undefined,
    FirstAddress: String = null,
    LastAddress: String = null
  ): PublicIpv4PoolRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AddressCount)) __obj.updateDynamic("AddressCount")(AddressCount)
    if (!js.isUndefined(AvailableAddressCount)) __obj.updateDynamic("AvailableAddressCount")(AvailableAddressCount)
    if (FirstAddress != null) __obj.updateDynamic("FirstAddress")(FirstAddress)
    if (LastAddress != null) __obj.updateDynamic("LastAddress")(LastAddress)
    __obj.asInstanceOf[PublicIpv4PoolRange]
  }
}

