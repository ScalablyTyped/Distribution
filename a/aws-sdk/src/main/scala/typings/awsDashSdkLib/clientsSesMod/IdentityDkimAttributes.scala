package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityDkimAttributes extends js.Object {
  /**
    * True if DKIM signing is enabled for email sent from the identity; false otherwise. The default value is true.
    */
  var DkimEnabled: Enabled
  /**
    * A set of character strings that represent the domain's identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  var DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined
  /**
    * Describes whether Amazon SES has successfully verified the DKIM DNS records (tokens) published in the domain name's DNS. (This only applies to domain identities, not email address identities.)
    */
  var DkimVerificationStatus: VerificationStatus
}

object IdentityDkimAttributes {
  @scala.inline
  def apply(
    DkimEnabled: Enabled,
    DkimVerificationStatus: VerificationStatus,
    DkimTokens: VerificationTokenList = null
  ): IdentityDkimAttributes = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled, DkimVerificationStatus = DkimVerificationStatus.asInstanceOf[js.Any])
    if (DkimTokens != null) __obj.updateDynamic("DkimTokens")(DkimTokens)
    __obj.asInstanceOf[IdentityDkimAttributes]
  }
}

