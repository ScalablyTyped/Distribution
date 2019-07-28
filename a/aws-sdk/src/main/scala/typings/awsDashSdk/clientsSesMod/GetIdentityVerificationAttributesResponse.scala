package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityVerificationAttributesResponse extends js.Object {
  /**
    * A map of Identities to IdentityVerificationAttributes objects.
    */
  var VerificationAttributes: typings.awsDashSdk.clientsSesMod.VerificationAttributes
}

object GetIdentityVerificationAttributesResponse {
  @scala.inline
  def apply(VerificationAttributes: VerificationAttributes): GetIdentityVerificationAttributesResponse = {
    val __obj = js.Dynamic.literal(VerificationAttributes = VerificationAttributes)
  
    __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
  }
}

