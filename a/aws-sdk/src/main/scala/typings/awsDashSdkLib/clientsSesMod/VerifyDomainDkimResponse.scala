package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDomainDkimResponse extends js.Object {
  /**
    * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens represent the domain of that address. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign emails originating from that domain. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  var DkimTokens: VerificationTokenList
}

object VerifyDomainDkimResponse {
  @scala.inline
  def apply(DkimTokens: VerificationTokenList): VerifyDomainDkimResponse = {
    val __obj = js.Dynamic.literal(DkimTokens = DkimTokens)
  
    __obj.asInstanceOf[VerifyDomainDkimResponse]
  }
}

