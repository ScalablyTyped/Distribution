package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityVerificationAttributesRequest extends js.Object {
  /**
    * A list of identities.
    */
  var Identities: IdentityList
}

object GetIdentityVerificationAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityVerificationAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities)
  
    __obj.asInstanceOf[GetIdentityVerificationAttributesRequest]
  }
}

