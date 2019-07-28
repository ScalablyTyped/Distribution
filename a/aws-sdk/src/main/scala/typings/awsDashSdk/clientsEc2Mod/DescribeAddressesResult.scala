package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAddressesResult extends js.Object {
  /**
    * Information about the Elastic IP addresses.
    */
  var Addresses: js.UndefOr[AddressList] = js.undefined
}

object DescribeAddressesResult {
  @scala.inline
  def apply(Addresses: AddressList = null): DescribeAddressesResult = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses)
    __obj.asInstanceOf[DescribeAddressesResult]
  }
}

