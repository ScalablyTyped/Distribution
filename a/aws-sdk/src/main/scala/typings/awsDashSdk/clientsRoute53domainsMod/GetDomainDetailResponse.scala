package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainDetailResponse extends js.Object {
  /**
    * Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
    */
  var AbuseContactEmail: js.UndefOr[Email] = js.undefined
  /**
    * Phone number for reporting abuse.
    */
  var AbuseContactPhone: js.UndefOr[ContactNumber] = js.undefined
  /**
    * Provides details about the domain administrative contact.
    */
  var AdminContact: ContactDetail
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the admin contact.
    */
  var AdminPrivacy: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the domain registration is set to renew automatically.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.undefined
  /**
    * The date when the domain was created as found in the response to a WHOIS query. The date and time is in Coordinated Universal time (UTC).
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * Reserved for future use.
    */
  var DnsSec: js.UndefOr[DNSSec] = js.undefined
  /**
    * The name of a domain.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
  /**
    * The date when the registration for the domain is set to expire. The date and time is in Coordinated Universal time (UTC).
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the domain.
    */
  var Nameservers: NameserverList
  /**
    * Provides details about the domain registrant.
    */
  var RegistrantContact: ContactDetail
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the registrant contact (domain owner).
    */
  var RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the registrar of the domain as identified in the registry. Domains with a .com, .net, or .org TLD are registered by Amazon Registrar. All other domains are registered by our registrar associate, Gandi. The value for domains that are registered by Gandi is "GANDI SAS". 
    */
  var RegistrarName: js.UndefOr[typings.awsDashSdk.clientsRoute53domainsMod.RegistrarName] = js.undefined
  /**
    * Web address of the registrar.
    */
  var RegistrarUrl: js.UndefOr[typings.awsDashSdk.clientsRoute53domainsMod.RegistrarUrl] = js.undefined
  /**
    * Reserved for future use.
    */
  var RegistryDomainId: js.UndefOr[typings.awsDashSdk.clientsRoute53domainsMod.RegistryDomainId] = js.undefined
  /**
    * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have "Amazon" as the reseller. 
    */
  var Reseller: js.UndefOr[typings.awsDashSdk.clientsRoute53domainsMod.Reseller] = js.undefined
  /**
    * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes. ICANN, the organization that maintains a central database of domain names, has developed a set of domain name status codes that tell you the status of a variety of operations on a domain name, for example, registering a domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so on. All registrars use this same set of status codes. For a current list of domain name status codes and an explanation of what each code means, go to the ICANN website and search for epp status codes. (Search on the ICANN website; web searches sometimes return an old version of the document.)
    */
  var StatusList: js.UndefOr[DomainStatusList] = js.undefined
  /**
    * Provides details about the domain technical contact.
    */
  var TechContact: ContactDetail
  /**
    * Specifies whether contact information is concealed from WHOIS queries. If the value is true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If the value is false, WHOIS queries return the information that you entered for the technical contact.
    */
  var TechPrivacy: js.UndefOr[Boolean] = js.undefined
  /**
    * The last updated date of the domain as found in the response to a WHOIS query. The date and time is in Coordinated Universal time (UTC).
    */
  var UpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
    */
  var WhoIsServer: js.UndefOr[RegistrarWhoIsServer] = js.undefined
}

object GetDomainDetailResponse {
  @scala.inline
  def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    Nameservers: NameserverList,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail,
    AbuseContactEmail: Email = null,
    AbuseContactPhone: ContactNumber = null,
    AdminPrivacy: js.UndefOr[scala.Boolean] = js.undefined,
    AutoRenew: js.UndefOr[scala.Boolean] = js.undefined,
    CreationDate: Timestamp = null,
    DnsSec: DNSSec = null,
    ExpirationDate: Timestamp = null,
    RegistrantPrivacy: js.UndefOr[scala.Boolean] = js.undefined,
    RegistrarName: RegistrarName = null,
    RegistrarUrl: RegistrarUrl = null,
    RegistryDomainId: RegistryDomainId = null,
    Reseller: Reseller = null,
    StatusList: DomainStatusList = null,
    TechPrivacy: js.UndefOr[scala.Boolean] = js.undefined,
    UpdatedDate: Timestamp = null,
    WhoIsServer: RegistrarWhoIsServer = null
  ): GetDomainDetailResponse = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact, DomainName = DomainName, Nameservers = Nameservers, RegistrantContact = RegistrantContact, TechContact = TechContact)
    if (AbuseContactEmail != null) __obj.updateDynamic("AbuseContactEmail")(AbuseContactEmail)
    if (AbuseContactPhone != null) __obj.updateDynamic("AbuseContactPhone")(AbuseContactPhone)
    if (!js.isUndefined(AdminPrivacy)) __obj.updateDynamic("AdminPrivacy")(AdminPrivacy)
    if (!js.isUndefined(AutoRenew)) __obj.updateDynamic("AutoRenew")(AutoRenew)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (DnsSec != null) __obj.updateDynamic("DnsSec")(DnsSec)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (!js.isUndefined(RegistrantPrivacy)) __obj.updateDynamic("RegistrantPrivacy")(RegistrantPrivacy)
    if (RegistrarName != null) __obj.updateDynamic("RegistrarName")(RegistrarName)
    if (RegistrarUrl != null) __obj.updateDynamic("RegistrarUrl")(RegistrarUrl)
    if (RegistryDomainId != null) __obj.updateDynamic("RegistryDomainId")(RegistryDomainId)
    if (Reseller != null) __obj.updateDynamic("Reseller")(Reseller)
    if (StatusList != null) __obj.updateDynamic("StatusList")(StatusList)
    if (!js.isUndefined(TechPrivacy)) __obj.updateDynamic("TechPrivacy")(TechPrivacy)
    if (UpdatedDate != null) __obj.updateDynamic("UpdatedDate")(UpdatedDate)
    if (WhoIsServer != null) __obj.updateDynamic("WhoIsServer")(WhoIsServer)
    __obj.asInstanceOf[GetDomainDetailResponse]
  }
}

