package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDomainDkimResponse extends js.Object {
  /**
    * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens represent the domain of that address. Using these tokens, you need to create DNS CNAME records that point to DKIM public keys that are hosted by Amazon SES. Amazon Web Services eventually detects that you've updated your DNS records. This detection process might take up to 72 hours. After successful detection, Amazon SES is able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, see the Amazon SES Developer Guide.
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

