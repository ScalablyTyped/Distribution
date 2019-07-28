package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainContactPrivacyRequest extends js.Object {
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact.
    */
  var AdminPrivacy: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain that you want to update the privacy setting for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (domain owner).
    */
  var RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact.
    */
  var TechPrivacy: js.UndefOr[Boolean] = js.undefined
}

object UpdateDomainContactPrivacyRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AdminPrivacy: js.UndefOr[Boolean] = js.undefined,
    RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined,
    TechPrivacy: js.UndefOr[Boolean] = js.undefined
  ): UpdateDomainContactPrivacyRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(AdminPrivacy)) __obj.updateDynamic("AdminPrivacy")(AdminPrivacy)
    if (!js.isUndefined(RegistrantPrivacy)) __obj.updateDynamic("RegistrantPrivacy")(RegistrantPrivacy)
    if (!js.isUndefined(TechPrivacy)) __obj.updateDynamic("TechPrivacy")(TechPrivacy)
    __obj.asInstanceOf[UpdateDomainContactPrivacyRequest]
  }
}

