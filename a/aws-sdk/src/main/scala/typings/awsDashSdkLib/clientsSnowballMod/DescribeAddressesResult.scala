package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAddressesResult extends js.Object {
  /**
    * The Snowball shipping addresses that were created for this account.
    */
  var Addresses: js.UndefOr[AddressList] = js.undefined
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next DescribeAddresses call, your list of returned addresses will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeAddressesResult {
  @scala.inline
  def apply(Addresses: AddressList = null, NextToken: String = null): DescribeAddressesResult = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAddressesResult]
  }
}

