package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAddressRequest extends js.Object {
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: awsDashSdkLib.clientsSnowballMod.AddressId
}

object DescribeAddressRequest {
  @scala.inline
  def apply(AddressId: AddressId): DescribeAddressRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId)
  
    __obj.asInstanceOf[DescribeAddressRequest]
  }
}

