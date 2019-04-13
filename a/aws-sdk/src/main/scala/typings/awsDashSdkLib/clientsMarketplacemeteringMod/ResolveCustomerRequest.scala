package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveCustomerRequest extends js.Object {
  /**
    * When a buyer visits your website during the registration process, the buyer submits a registration token through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
    */
  var RegistrationToken: NonEmptyString
}

object ResolveCustomerRequest {
  @scala.inline
  def apply(RegistrationToken: NonEmptyString): ResolveCustomerRequest = {
    val __obj = js.Dynamic.literal(RegistrationToken = RegistrationToken)
  
    __obj.asInstanceOf[ResolveCustomerRequest]
  }
}

