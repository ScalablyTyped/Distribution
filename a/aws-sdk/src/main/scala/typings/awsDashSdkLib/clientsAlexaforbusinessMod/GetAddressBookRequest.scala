package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book for which to request details.
    */
  var AddressBookArn: Arn
}

object GetAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): GetAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn)
  
    __obj.asInstanceOf[GetAddressBookRequest]
  }
}

