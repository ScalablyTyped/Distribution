package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDomainIdentityResponse extends js.Object {
  /**
    * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon SES. As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning.
    */
  var VerificationToken: awsDashSdkLib.clientsSesMod.VerificationToken
}

object VerifyDomainIdentityResponse {
  @scala.inline
  def apply(VerificationToken: VerificationToken): VerifyDomainIdentityResponse = {
    val __obj = js.Dynamic.literal(VerificationToken = VerificationToken)
  
    __obj.asInstanceOf[VerifyDomainIdentityResponse]
  }
}

