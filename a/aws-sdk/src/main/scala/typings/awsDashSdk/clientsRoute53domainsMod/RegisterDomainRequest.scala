package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDomainRequest extends js.Object {
  /**
    * Provides detailed contact information.
    */
  var AdminContact: ContactDetail
  /**
    * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true 
    */
  var AutoRenew: js.UndefOr[Boolean] = js.undefined
  /**
    * The domain name that you want to register. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
  /**
    * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: typings.awsDashSdk.clientsRoute53domainsMod.DurationInYears
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.undefined
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact. Default: true 
    */
  var PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (the domain owner). Default: true 
    */
  var PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact. Default: true 
    */
  var PrivacyProtectTechContact: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: ContactDetail
  /**
    * Provides detailed contact information.
    */
  var TechContact: ContactDetail
}

object RegisterDomainRequest {
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    DurationInYears: DurationInYears,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail,
    AutoRenew: js.UndefOr[scala.Boolean] = js.undefined,
    IdnLangCode: LangCode = null,
    PrivacyProtectAdminContact: js.UndefOr[scala.Boolean] = js.undefined,
    PrivacyProtectRegistrantContact: js.UndefOr[scala.Boolean] = js.undefined,
    PrivacyProtectTechContact: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact, DomainName = DomainName, DurationInYears = DurationInYears, RegistrantContact = RegistrantContact, TechContact = TechContact)
    if (!js.isUndefined(AutoRenew)) __obj.updateDynamic("AutoRenew")(AutoRenew)
    if (IdnLangCode != null) __obj.updateDynamic("IdnLangCode")(IdnLangCode)
    if (!js.isUndefined(PrivacyProtectAdminContact)) __obj.updateDynamic("PrivacyProtectAdminContact")(PrivacyProtectAdminContact)
    if (!js.isUndefined(PrivacyProtectRegistrantContact)) __obj.updateDynamic("PrivacyProtectRegistrantContact")(PrivacyProtectRegistrantContact)
    if (!js.isUndefined(PrivacyProtectTechContact)) __obj.updateDynamic("PrivacyProtectTechContact")(PrivacyProtectTechContact)
    __obj.asInstanceOf[RegisterDomainRequest]
  }
}

