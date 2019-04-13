package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAddressRequest extends js.Object {
  /**
    * The address that you want the Snowball shipped to.
    */
  var Address: awsDashSdkLib.clientsSnowballMod.Address
}

object CreateAddressRequest {
  @scala.inline
  def apply(Address: Address): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(Address = Address)
  
    __obj.asInstanceOf[CreateAddressRequest]
  }
}

