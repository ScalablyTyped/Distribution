package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DkimAttributes extends js.Object {
  /**
    * If the value is true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. If the value is false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.undefined
  /**
    * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the domain. The status can be one of the following:    PENDING – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the domain, but will continue to attempt to locate them.    SUCCESS – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.    FAILED – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain, and won't continue to search for them.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon Pinpoint from determining the DKIM status for the domain.    NOT_STARTED – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records for the domain.  
    */
  var Status: js.UndefOr[DkimStatus] = js.undefined
  /**
    * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding them to the DNS configuration for your domain.
    */
  var Tokens: js.UndefOr[DnsTokenList] = js.undefined
}

object DkimAttributes {
  @scala.inline
  def apply(
    SigningEnabled: js.UndefOr[Enabled] = js.undefined,
    Status: DkimStatus = null,
    Tokens: DnsTokenList = null
  ): DkimAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SigningEnabled)) __obj.updateDynamic("SigningEnabled")(SigningEnabled)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tokens != null) __obj.updateDynamic("Tokens")(Tokens)
    __obj.asInstanceOf[DkimAttributes]
  }
}

