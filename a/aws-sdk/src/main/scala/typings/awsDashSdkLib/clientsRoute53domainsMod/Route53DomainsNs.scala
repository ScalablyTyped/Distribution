package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/route53domains", "Route53Domains")
@js.native
object Route53DomainsNs extends js.Object {
  trait BillingRecord extends js.Object {
    /**
      * The date that the operation was billed, in Unix format.
      */
    var BillDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more information, see DNS Domain Name Format in the Amazon Route 53 Developer Guidezzz.
      */
    var DomainName: js.UndefOr[DomainName] = js.undefined
    /**
      * The ID of the invoice that is associated with the billing record.
      */
    var InvoiceId: js.UndefOr[InvoiceId] = js.undefined
    /**
      * The operation that you were charged for.
      */
    var Operation: js.UndefOr[OperationType] = js.undefined
    /**
      * The price that you were charged for the operation, in US dollars. Example value: 12.0
      */
    var Price: js.UndefOr[Price] = js.undefined
  }
  
  trait CheckDomainAvailabilityRequest extends js.Object {
    /**
      * The name of the domain that you want to get availability for. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * Reserved for future use.
      */
    var IdnLangCode: js.UndefOr[LangCode] = js.undefined
  }
  
  trait CheckDomainAvailabilityResponse extends js.Object {
    /**
      * Whether the domain name is available for registering.  You can register only domains designated as AVAILABLE.  Valid values:  AVAILABLE  The domain name is available.  AVAILABLE_RESERVED  The domain name is reserved under specific conditions.  AVAILABLE_PREORDER  The domain name is available and can be preordered.  DONT_KNOW  The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is performing maintenance. Try again later.  PENDING  The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it usually takes just a few extra seconds. You can resubmit the request immediately.  RESERVED  The domain name has been reserved for another person or organization.  UNAVAILABLE  The domain name is not available.  UNAVAILABLE_PREMIUM  The domain name is not available.  UNAVAILABLE_RESTRICTED  The domain name is forbidden.  
      */
    var Availability: DomainAvailability
  }
  
  trait CheckDomainTransferabilityRequest extends js.Object {
    /**
      * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code that you got from the current registrar for the domain.
      */
    var AuthCode: js.UndefOr[DomainAuthCode] = js.undefined
    /**
      * The name of the domain that you want to transfer to Amazon Route 53. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait CheckDomainTransferabilityResponse extends js.Object {
    /**
      * A complex type that contains information about whether the specified domain can be transferred to Amazon Route 53.
      */
    var Transferability: DomainTransferability
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ContactDetail extends js.Object {
    /**
      * First line of the contact's address.
      */
    var AddressLine1: js.UndefOr[AddressLine] = js.undefined
    /**
      * Second line of contact's address, if any.
      */
    var AddressLine2: js.UndefOr[AddressLine] = js.undefined
    /**
      * The city of the contact's address.
      */
    var City: js.UndefOr[City] = js.undefined
    /**
      * Indicates whether the contact is a person, company, association, or public organization. If you choose an option other than PERSON, you must enter an organization name, and you can't enable privacy protection for the contact.
      */
    var ContactType: js.UndefOr[ContactType] = js.undefined
    /**
      * Code for the country of the contact's address.
      */
    var CountryCode: js.UndefOr[CountryCode] = js.undefined
    /**
      * Email address of the contact.
      */
    var Email: js.UndefOr[Email] = js.undefined
    /**
      * A list of name-value pairs for parameters required by certain top-level domains.
      */
    var ExtraParams: js.UndefOr[ExtraParamList] = js.undefined
    /**
      * Fax number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code]". For example, a US phone number might appear as "+1.1234567890".
      */
    var Fax: js.UndefOr[ContactNumber] = js.undefined
    /**
      * First name of contact.
      */
    var FirstName: js.UndefOr[ContactName] = js.undefined
    /**
      * Last name of contact.
      */
    var LastName: js.UndefOr[ContactName] = js.undefined
    /**
      * Name of the organization for contact types other than PERSON.
      */
    var OrganizationName: js.UndefOr[ContactName] = js.undefined
    /**
      * The phone number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as "+1.1234567890".
      */
    var PhoneNumber: js.UndefOr[ContactNumber] = js.undefined
    /**
      * The state or province of the contact's city.
      */
    var State: js.UndefOr[State] = js.undefined
    /**
      * The zip or postal code of the contact's address.
      */
    var ZipCode: js.UndefOr[ZipCode] = js.undefined
  }
  
  trait DeleteTagsForDomainRequest extends js.Object {
    /**
      * The domain for which you want to delete one or more tags.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * A list of tag keys to delete.
      */
    var TagsToDelete: TagKeyList
  }
  
  trait DeleteTagsForDomainResponse extends js.Object
  
  trait DisableDomainAutoRenewRequest extends js.Object {
    /**
      * The name of the domain that you want to disable automatic renewal for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait DisableDomainAutoRenewResponse extends js.Object
  
  trait DisableDomainTransferLockRequest extends js.Object {
    /**
      * The name of the domain that you want to remove the transfer lock for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait DisableDomainTransferLockResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait DomainSuggestion extends js.Object {
    /**
      * Whether the domain name is available for registering.  You can register only the domains that are designated as AVAILABLE.  Valid values:  AVAILABLE  The domain name is available.  AVAILABLE_RESERVED  The domain name is reserved under specific conditions.  AVAILABLE_PREORDER  The domain name is available and can be preordered.  DONT_KNOW  The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is performing maintenance. Try again later.  PENDING  The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it usually takes just a few extra seconds. You can resubmit the request immediately.  RESERVED  The domain name has been reserved for another person or organization.  UNAVAILABLE  The domain name is not available.  UNAVAILABLE_PREMIUM  The domain name is not available.  UNAVAILABLE_RESTRICTED  The domain name is forbidden.  
      */
    var Availability: js.UndefOr[String] = js.undefined
    /**
      * A suggested domain name.
      */
    var DomainName: js.UndefOr[DomainName] = js.undefined
  }
  
  trait DomainSummary extends js.Object {
    /**
      * Indicates whether the domain is automatically renewed upon expiration.
      */
    var AutoRenew: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain that the summary information applies to.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * Expiration date of the domain in Coordinated Universal Time (UTC).
      */
    var Expiry: js.UndefOr[Timestamp] = js.undefined
    /**
      * Indicates whether a domain is locked from unauthorized transfer to another party.
      */
    var TransferLock: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DomainTransferability extends js.Object {
    var Transferable: js.UndefOr[Transferable] = js.undefined
  }
  
  trait EnableDomainAutoRenewRequest extends js.Object {
    /**
      * The name of the domain that you want to enable automatic renewal for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait EnableDomainAutoRenewResponse extends js.Object
  
  trait EnableDomainTransferLockRequest extends js.Object {
    /**
      * The name of the domain that you want to set the transfer lock for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait EnableDomainTransferLockResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait ExtraParam extends js.Object {
    /**
      * Name of the additional parameter required by the top-level domain. Here are the top-level domains that require additional parameters and which parameters they require:    .com.au and .net.au: AU_ID_NUMBER and AU_ID_TYPE     .ca: BRAND_NUMBER, CA_LEGAL_TYPE, and CA_BUSINESS_ENTITY_TYPE     .es: ES_IDENTIFICATION, ES_IDENTIFICATION_TYPE, and ES_LEGAL_FORM     .fi: BIRTH_DATE_IN_YYYY_MM_DD, FI_BUSINESS_NUMBER, FI_ID_NUMBER, FI_NATIONALITY, and FI_ORGANIZATION_TYPE     .fr: BRAND_NUMBER, BIRTH_DEPARTMENT, BIRTH_DATE_IN_YYYY_MM_DD, BIRTH_COUNTRY, and BIRTH_CITY     .it: BIRTH_COUNTRY, IT_PIN, and IT_REGISTRANT_ENTITY_TYPE     .ru: BIRTH_DATE_IN_YYYY_MM_DD and RU_PASSPORT_DATA     .se: BIRTH_COUNTRY and SE_ID_NUMBER     .sg: SG_ID_NUMBER     .co.uk, .me.uk, and .org.uk: UK_CONTACT_TYPE and UK_COMPANY_NUMBER    In addition, many TLDs require VAT_NUMBER.
      */
    var Name: ExtraParamName
    /**
      * Values corresponding to the additional parameter names required by some top-level domains.
      */
    var Value: ExtraParamValue
  }
  
  trait GetContactReachabilityStatusRequest extends js.Object {
    /**
      * The name of the domain for which you want to know whether the registrant contact has confirmed that the email address is valid.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
  }
  
  trait GetContactReachabilityStatusResponse extends js.Object {
    /**
      * The domain name for which you requested the reachability status.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
    /**
      * Whether the registrant contact has responded. Values include the following:  PENDING  We sent the confirmation email and haven't received a response yet.  DONE  We sent the email and got confirmation from the registrant contact.  EXPIRED  The time limit expired before the registrant contact responded.  
      */
    var status: js.UndefOr[ReachabilityStatus] = js.undefined
  }
  
  trait GetDomainDetailRequest extends js.Object {
    /**
      * The name of the domain that you want to get detailed information about.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
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
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
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
    var RegistrarName: js.UndefOr[RegistrarName] = js.undefined
    /**
      * Web address of the registrar.
      */
    var RegistrarUrl: js.UndefOr[RegistrarUrl] = js.undefined
    /**
      * Reserved for future use.
      */
    var RegistryDomainId: js.UndefOr[RegistryDomainId] = js.undefined
    /**
      * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have "Amazon" as the reseller. 
      */
    var Reseller: js.UndefOr[Reseller] = js.undefined
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
  
  trait GetDomainSuggestionsRequest extends js.Object {
    /**
      * A domain name that you want to use as the basis for a list of possible domain names. The domain name must contain a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * If OnlyAvailable is true, Amazon Route 53 returns only domain names that are available. If OnlyAvailable is false, Amazon Route 53 returns domain names without checking whether they're available to be registered. To determine whether the domain is available, you can call checkDomainAvailability for each suggestion.
      */
    var OnlyAvailable: Boolean
    /**
      * The number of suggested domain names that you want Amazon Route 53 to return.
      */
    var SuggestionCount: Integer
  }
  
  trait GetDomainSuggestionsResponse extends js.Object {
    /**
      * A list of possible domain names. If you specified true for OnlyAvailable in the request, the list contains only domains that are available for registration.
      */
    var SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.undefined
  }
  
  trait GetOperationDetailRequest extends js.Object {
    /**
      * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in the response to the original request.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait GetOperationDetailResponse extends js.Object {
    /**
      * The name of a domain.
      */
    var DomainName: js.UndefOr[DomainName] = js.undefined
    /**
      * Detailed information on the status including possible errors.
      */
    var Message: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * The identifier for the operation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
    /**
      * The current status of the requested operation in the system.
      */
    var Status: js.UndefOr[OperationStatus] = js.undefined
    /**
      * The date when the request was submitted.
      */
    var SubmittedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The type of operation that was requested.
      */
    var Type: js.UndefOr[OperationType] = js.undefined
  }
  
  trait ListDomainsRequest extends js.Object {
    /**
      * For an initial request for a list of domains, omit this element. If the number of domains that are associated with the current AWS account is greater than the value that you specified for MaxItems, you can use Marker to return additional domains. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element. Constraints: The marker must match the value specified in the previous request.
      */
    var Marker: js.UndefOr[PageMarker] = js.undefined
    /**
      * Number of domains to be returned. Default: 20
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  }
  
  trait ListDomainsResponse extends js.Object {
    /**
      * A summary of domains.
      */
    var Domains: DomainSummaryList
    /**
      * If there are more domains than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
      */
    var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
  }
  
  trait ListOperationsRequest extends js.Object {
    /**
      * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
      */
    var Marker: js.UndefOr[PageMarker] = js.undefined
    /**
      * Number of domains to be returned. Default: 20
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Coordinated Universal time (UTC).
      */
    var SubmittedSince: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ListOperationsResponse extends js.Object {
    /**
      * If there are more operations than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
      */
    var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    /**
      * Lists summaries of the operations.
      */
    var Operations: OperationSummaryList
  }
  
  trait ListTagsForDomainRequest extends js.Object {
    /**
      * The domain for which you want to get a list of tags.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait ListTagsForDomainResponse extends js.Object {
    /**
      * A list of the tags that are associated with the specified domain.
      */
    var TagList: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.TagList
  }
  
  trait Nameserver extends js.Object {
    /**
      * Glue IP address of a name server entry. Glue IP addresses are required only when the name of the name server is a subdomain of the domain. For example, if your domain is example.com and the name server for the domain is ns.example.com, you need to specify the IP address for ns.example.com. Constraints: The list can contain only one IPv4 and one IPv6 address.
      */
    var GlueIps: js.UndefOr[GlueIpList] = js.undefined
    /**
      * The fully qualified host name of the name server. Constraint: Maximum 255 characters
      */
    var Name: HostName
  }
  
  trait OperationSummary extends js.Object {
    /**
      * Identifier returned to track the requested action.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
    /**
      * The current status of the requested operation in the system.
      */
    var Status: OperationStatus
    /**
      * The date when the request was submitted.
      */
    var SubmittedDate: Timestamp
    /**
      * Type of the action requested.
      */
    var Type: OperationType
  }
  
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
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
      */
    var DurationInYears: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DurationInYears
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
  
  trait RegisterDomainResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait RenewDomainRequest extends js.Object {
    /**
      * The year when the registration for the domain is set to expire. This value must match the current expiration date for the domain.
      */
    var CurrentExpiryYear: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.CurrentExpiryYear
    /**
      * The name of the domain that you want to renew.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
      */
    var DurationInYears: js.UndefOr[DurationInYears] = js.undefined
  }
  
  trait RenewDomainResponse extends js.Object {
    /**
      * The identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait ResendContactReachabilityEmailRequest extends js.Object {
    /**
      * The name of the domain for which you want Amazon Route 53 to resend a confirmation email to the registrant contact.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
  }
  
  trait ResendContactReachabilityEmailResponse extends js.Object {
    /**
      * The domain name for which you requested a confirmation email.
      */
    var domainName: js.UndefOr[DomainName] = js.undefined
    /**
      * The email address for the registrant contact at the time that we sent the verification email.
      */
    var emailAddress: js.UndefOr[Email] = js.undefined
    /**
      *  True if the email address for the registrant contact has already been verified, and false otherwise. If the email address has already been verified, we don't send another confirmation email.
      */
    var isAlreadyVerified: js.UndefOr[Boolean] = js.undefined
  }
  
  trait RetrieveDomainAuthCodeRequest extends js.Object {
    /**
      * The name of the domain that you want to get an authorization code for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
  }
  
  trait RetrieveDomainAuthCodeResponse extends js.Object {
    /**
      * The authorization code for the domain.
      */
    var AuthCode: DomainAuthCode
  }
  
  trait Tag extends js.Object {
    /**
      * The key (name) of a tag. Valid values: A-Z, a-z, 0-9, space, ".:/=+\-@" Constraints: Each key can be 1-128 characters long.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value of a tag. Valid values: A-Z, a-z, 0-9, space, ".:/=+\-@" Constraints: Each value can be 0-256 characters long.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TransferDomainRequest extends js.Object {
    /**
      * Provides detailed contact information.
      */
    var AdminContact: ContactDetail
    /**
      * The authorization code for the domain. You get this value from the current registrar.
      */
    var AuthCode: js.UndefOr[DomainAuthCode] = js.undefined
    /**
      * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true
      */
    var AutoRenew: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain that you want to transfer to Amazon Route 53. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. Default: 1
      */
    var DurationInYears: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DurationInYears
    /**
      * Reserved for future use.
      */
    var IdnLangCode: js.UndefOr[LangCode] = js.undefined
    /**
      * Contains details for the host and glue IP addresses.
      */
    var Nameservers: js.UndefOr[NameserverList] = js.undefined
    /**
      * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact. Default: true 
      */
    var PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (domain owner). Default: true 
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
  
  trait TransferDomainResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * This operation checks the availability of one domain name. Note that if the availability status of a domain is pending, you must submit another request to determine the availability of the domain name.
      */
    def checkDomainAvailability(): awsDashSdkLib.libRequestMod.Request[CheckDomainAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def checkDomainAvailability(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckDomainAvailabilityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckDomainAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation checks the availability of one domain name. Note that if the availability status of a domain is pending, you must submit another request to determine the availability of the domain name.
      */
    def checkDomainAvailability(params: CheckDomainAvailabilityRequest): awsDashSdkLib.libRequestMod.Request[CheckDomainAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def checkDomainAvailability(
      params: CheckDomainAvailabilityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckDomainAvailabilityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckDomainAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Checks whether a domain name can be transferred to Amazon Route 53. 
      */
    def checkDomainTransferability(): awsDashSdkLib.libRequestMod.Request[CheckDomainTransferabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def checkDomainTransferability(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckDomainTransferabilityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckDomainTransferabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Checks whether a domain name can be transferred to Amazon Route 53. 
      */
    def checkDomainTransferability(params: CheckDomainTransferabilityRequest): awsDashSdkLib.libRequestMod.Request[CheckDomainTransferabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def checkDomainTransferability(
      params: CheckDomainTransferabilityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckDomainTransferabilityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckDomainTransferabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes the specified tags for a domain. All tag operations are eventually consistent; subsequent operations might not immediately represent all issued operations.
      */
    def deleteTagsForDomain(): awsDashSdkLib.libRequestMod.Request[DeleteTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTagsForDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsForDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes the specified tags for a domain. All tag operations are eventually consistent; subsequent operations might not immediately represent all issued operations.
      */
    def deleteTagsForDomain(params: DeleteTagsForDomainRequest): awsDashSdkLib.libRequestMod.Request[DeleteTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTagsForDomain(
      params: DeleteTagsForDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsForDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation disables automatic renewal of domain registration for the specified domain.
      */
    def disableDomainAutoRenew(): awsDashSdkLib.libRequestMod.Request[DisableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableDomainAutoRenew(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableDomainAutoRenewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation disables automatic renewal of domain registration for the specified domain.
      */
    def disableDomainAutoRenew(params: DisableDomainAutoRenewRequest): awsDashSdkLib.libRequestMod.Request[DisableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableDomainAutoRenew(
      params: DisableDomainAutoRenewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableDomainAutoRenewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation removes the transfer lock on the domain (specifically the clientTransferProhibited status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def disableDomainTransferLock(): awsDashSdkLib.libRequestMod.Request[DisableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableDomainTransferLock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableDomainTransferLockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation removes the transfer lock on the domain (specifically the clientTransferProhibited status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def disableDomainTransferLock(params: DisableDomainTransferLockRequest): awsDashSdkLib.libRequestMod.Request[DisableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableDomainTransferLock(
      params: DisableDomainTransferLockRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableDomainTransferLockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation configures Amazon Route 53 to automatically renew the specified domain before the domain registration expires. The cost of renewing your domain registration is billed to your AWS account. The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies, see "Renewal, restoration, and deletion times" on the website for our registrar associate, Gandi. Amazon Route 53 requires that you renew before the end of the renewal period that is listed on the Gandi website so we can complete processing before the deadline.
      */
    def enableDomainAutoRenew(): awsDashSdkLib.libRequestMod.Request[EnableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableDomainAutoRenew(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableDomainAutoRenewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation configures Amazon Route 53 to automatically renew the specified domain before the domain registration expires. The cost of renewing your domain registration is billed to your AWS account. The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies, see "Renewal, restoration, and deletion times" on the website for our registrar associate, Gandi. Amazon Route 53 requires that you renew before the end of the renewal period that is listed on the Gandi website so we can complete processing before the deadline.
      */
    def enableDomainAutoRenew(params: EnableDomainAutoRenewRequest): awsDashSdkLib.libRequestMod.Request[EnableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableDomainAutoRenew(
      params: EnableDomainAutoRenewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableDomainAutoRenewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableDomainAutoRenewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation sets the transfer lock on the domain (specifically the clientTransferProhibited status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def enableDomainTransferLock(): awsDashSdkLib.libRequestMod.Request[EnableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableDomainTransferLock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableDomainTransferLockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation sets the transfer lock on the domain (specifically the clientTransferProhibited status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def enableDomainTransferLock(params: EnableDomainTransferLockRequest): awsDashSdkLib.libRequestMod.Request[EnableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableDomainTransferLock(
      params: EnableDomainTransferLockRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableDomainTransferLockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableDomainTransferLockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For operations that require confirmation that the email address for the registrant contact is valid, such as registering a new domain, this operation returns information about whether the registrant contact has responded. If you want us to resend the email, use the ResendContactReachabilityEmail operation.
      */
    def getContactReachabilityStatus(): awsDashSdkLib.libRequestMod.Request[GetContactReachabilityStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContactReachabilityStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContactReachabilityStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContactReachabilityStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For operations that require confirmation that the email address for the registrant contact is valid, such as registering a new domain, this operation returns information about whether the registrant contact has responded. If you want us to resend the email, use the ResendContactReachabilityEmail operation.
      */
    def getContactReachabilityStatus(params: GetContactReachabilityStatusRequest): awsDashSdkLib.libRequestMod.Request[GetContactReachabilityStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContactReachabilityStatus(
      params: GetContactReachabilityStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContactReachabilityStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContactReachabilityStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns detailed information about a specified domain that is associated with the current AWS account. Contact information for the domain is also returned as part of the output.
      */
    def getDomainDetail(): awsDashSdkLib.libRequestMod.Request[GetDomainDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDomainDetail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainDetailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns detailed information about a specified domain that is associated with the current AWS account. Contact information for the domain is also returned as part of the output.
      */
    def getDomainDetail(params: GetDomainDetailRequest): awsDashSdkLib.libRequestMod.Request[GetDomainDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDomainDetail(
      params: GetDomainDetailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainDetailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a domain name or simply a word or phrase (without spaces).
      */
    def getDomainSuggestions(): awsDashSdkLib.libRequestMod.Request[GetDomainSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDomainSuggestions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainSuggestionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a domain name or simply a word or phrase (without spaces).
      */
    def getDomainSuggestions(params: GetDomainSuggestionsRequest): awsDashSdkLib.libRequestMod.Request[GetDomainSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDomainSuggestions(
      params: GetDomainSuggestionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainSuggestionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainSuggestionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the current status of an operation that is not completed.
      */
    def getOperationDetail(): awsDashSdkLib.libRequestMod.Request[GetOperationDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOperationDetail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOperationDetailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOperationDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the current status of an operation that is not completed.
      */
    def getOperationDetail(params: GetOperationDetailRequest): awsDashSdkLib.libRequestMod.Request[GetOperationDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOperationDetail(
      params: GetOperationDetailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOperationDetailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOperationDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.
      */
    def listDomains(): awsDashSdkLib.libRequestMod.Request[ListDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDomains(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.
      */
    def listDomains(params: ListDomainsRequest): awsDashSdkLib.libRequestMod.Request[ListDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDomains(
      params: ListDomainsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the operation IDs of operations that are not yet complete.
      */
    def listOperations(): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOperations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOperationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the operation IDs of operations that are not yet complete.
      */
    def listOperations(params: ListOperationsRequest): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOperations(
      params: ListOperationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOperationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns all of the tags that are associated with the specified domain. All tag operations are eventually consistent; subsequent operations might not immediately represent all issued operations.
      */
    def listTagsForDomain(): awsDashSdkLib.libRequestMod.Request[ListTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns all of the tags that are associated with the specified domain. All tag operations are eventually consistent; subsequent operations might not immediately represent all issued operations.
      */
    def listTagsForDomain(params: ListTagsForDomainRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForDomain(
      params: ListTagsForDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation registers a domain. Domains are registered either by Amazon Registrar (for .com, .net, and .org domains) or by our registrar associate, Gandi (for all other domains). For some top-level domains (TLDs), this operation requires extra parameters. When you register a domain, Amazon Route 53 does the following:   Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name servers to your hosted zone and automatically updates your domain registration with the names of these name servers.   Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in advance of the renewal date so you can choose whether to renew the registration.   Optionally enables privacy protection, so WHOIS queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you don't enable privacy protection, WHOIS queries return the information that you entered for the registrant, admin, and tech contacts.   If registration is successful, returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant is notified by email.   Charges your AWS account an amount based on the top-level domain. For more information, see Amazon Route 53 Pricing.  
      */
    def registerDomain(): awsDashSdkLib.libRequestMod.Request[RegisterDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation registers a domain. Domains are registered either by Amazon Registrar (for .com, .net, and .org domains) or by our registrar associate, Gandi (for all other domains). For some top-level domains (TLDs), this operation requires extra parameters. When you register a domain, Amazon Route 53 does the following:   Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name servers to your hosted zone and automatically updates your domain registration with the names of these name servers.   Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in advance of the renewal date so you can choose whether to renew the registration.   Optionally enables privacy protection, so WHOIS queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you don't enable privacy protection, WHOIS queries return the information that you entered for the registrant, admin, and tech contacts.   If registration is successful, returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant is notified by email.   Charges your AWS account an amount based on the top-level domain. For more information, see Amazon Route 53 Pricing.  
      */
    def registerDomain(params: RegisterDomainRequest): awsDashSdkLib.libRequestMod.Request[RegisterDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerDomain(
      params: RegisterDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to your AWS account. We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete domains before the expiration date if you haven't renewed far enough in advance. For more information about renewing domain registration, see Renewing Registration for a Domain in the Amazon Route 53 Developer Guide.
      */
    def renewDomain(): awsDashSdkLib.libRequestMod.Request[RenewDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def renewDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RenewDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RenewDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to your AWS account. We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete domains before the expiration date if you haven't renewed far enough in advance. For more information about renewing domain registration, see Renewing Registration for a Domain in the Amazon Route 53 Developer Guide.
      */
    def renewDomain(params: RenewDomainRequest): awsDashSdkLib.libRequestMod.Request[RenewDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def renewDomain(
      params: RenewDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RenewDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RenewDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For operations that require confirmation that the email address for the registrant contact is valid, such as registering a new domain, this operation resends the confirmation email to the current email address for the registrant contact.
      */
    def resendContactReachabilityEmail(): awsDashSdkLib.libRequestMod.Request[ResendContactReachabilityEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resendContactReachabilityEmail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResendContactReachabilityEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResendContactReachabilityEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For operations that require confirmation that the email address for the registrant contact is valid, such as registering a new domain, this operation resends the confirmation email to the current email address for the registrant contact.
      */
    def resendContactReachabilityEmail(params: ResendContactReachabilityEmailRequest): awsDashSdkLib.libRequestMod.Request[ResendContactReachabilityEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resendContactReachabilityEmail(
      params: ResendContactReachabilityEmailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResendContactReachabilityEmailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResendContactReachabilityEmailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this value to the new registrar.
      */
    def retrieveDomainAuthCode(): awsDashSdkLib.libRequestMod.Request[RetrieveDomainAuthCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveDomainAuthCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveDomainAuthCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveDomainAuthCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this value to the new registrar.
      */
    def retrieveDomainAuthCode(params: RetrieveDomainAuthCodeRequest): awsDashSdkLib.libRequestMod.Request[RetrieveDomainAuthCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveDomainAuthCode(
      params: RetrieveDomainAuthCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveDomainAuthCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveDomainAuthCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the domain is registered either with Amazon Registrar (for .com, .net, and .org domains) or with our registrar associate, Gandi (for all other TLDs). For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer, see Transferring Registration for a Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide. If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer your registration. Some registrars provide free DNS service when you purchase a domain registration. When you transfer the registration, the previous registrar will not renew your domain registration and could end your DNS service at any time.  If the registrar for your domain is also the DNS service provider for the domain and you don't transfer DNS service to another provider, your website, email, and the web applications associated with the domain might become unavailable.  If the transfer is successful, this method returns an operation ID that you can use to track the progress and completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified by email.
      */
    def transferDomain(): awsDashSdkLib.libRequestMod.Request[TransferDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transferDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransferDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransferDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the domain is registered either with Amazon Registrar (for .com, .net, and .org domains) or with our registrar associate, Gandi (for all other TLDs). For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer, see Transferring Registration for a Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide. If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer your registration. Some registrars provide free DNS service when you purchase a domain registration. When you transfer the registration, the previous registrar will not renew your domain registration and could end your DNS service at any time.  If the registrar for your domain is also the DNS service provider for the domain and you don't transfer DNS service to another provider, your website, email, and the web applications associated with the domain might become unavailable.  If the transfer is successful, this method returns an operation ID that you can use to track the progress and completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified by email.
      */
    def transferDomain(params: TransferDomainRequest): awsDashSdkLib.libRequestMod.Request[TransferDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transferDomain(
      params: TransferDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransferDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransferDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation updates the contact information for a particular domain. You must specify information for at least one contact: registrant, administrator, or technical. If the update is successful, this method returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def updateDomainContact(): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDomainContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation updates the contact information for a particular domain. You must specify information for at least one contact: registrant, administrator, or technical. If the update is successful, this method returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def updateDomainContact(params: UpdateDomainContactRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDomainContact(
      params: UpdateDomainContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation updates the specified domain contact's privacy setting. When privacy protection is enabled, contact information such as email address is replaced either with contact information for Amazon Registrar (for .com, .net, and .org domains) or with contact information for our registrar associate, Gandi. This operation affects only the contact information for the specified contact type (registrant, administrator, or tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with GetOperationDetail to track the progress and completion of the action. If the request doesn't complete successfully, the domain registrant will be notified by email.
      */
    def updateDomainContactPrivacy(): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactPrivacyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDomainContactPrivacy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainContactPrivacyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactPrivacyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation updates the specified domain contact's privacy setting. When privacy protection is enabled, contact information such as email address is replaced either with contact information for Amazon Registrar (for .com, .net, and .org domains) or with contact information for our registrar associate, Gandi. This operation affects only the contact information for the specified contact type (registrant, administrator, or tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with GetOperationDetail to track the progress and completion of the action. If the request doesn't complete successfully, the domain registrant will be notified by email.
      */
    def updateDomainContactPrivacy(params: UpdateDomainContactPrivacyRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactPrivacyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDomainContactPrivacy(
      params: UpdateDomainContactPrivacyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainContactPrivacyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainContactPrivacyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def updateDomainNameservers(): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameserversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDomainNameservers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainNameserversResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameserversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
      */
    def updateDomainNameservers(params: UpdateDomainNameserversRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameserversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDomainNameservers(
      params: UpdateDomainNameserversRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainNameserversResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameserversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation adds or updates tags for a specified domain. All tag operations are eventually consistent; subsequent operations might not immediately represent all issued operations.
      */
    def updateTagsForDomain(): awsDashSdkLib.libRequestMod.Request[UpdateTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTagsForDomain(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTagsForDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation adds or updates tags for a specified domain. All tag operations are eventually consistent; subsequent operations might not immediately represent all issued operations.
      */
    def updateTagsForDomain(params: UpdateTagsForDomainRequest): awsDashSdkLib.libRequestMod.Request[UpdateTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTagsForDomain(
      params: UpdateTagsForDomainRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTagsForDomainResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTagsForDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns all the domain-related billing records for the current AWS account for a specified period
      */
    def viewBilling(): awsDashSdkLib.libRequestMod.Request[ViewBillingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def viewBilling(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ViewBillingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ViewBillingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns all the domain-related billing records for the current AWS account for a specified period
      */
    def viewBilling(params: ViewBillingRequest): awsDashSdkLib.libRequestMod.Request[ViewBillingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def viewBilling(
      params: ViewBillingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ViewBillingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ViewBillingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateDomainContactPrivacyRequest extends js.Object {
    /**
      * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact.
      */
    var AdminPrivacy: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain that you want to update the privacy setting for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (domain owner).
      */
    var RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact.
      */
    var TechPrivacy: js.UndefOr[Boolean] = js.undefined
  }
  
  trait UpdateDomainContactPrivacyResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait UpdateDomainContactRequest extends js.Object {
    /**
      * Provides detailed contact information.
      */
    var AdminContact: js.UndefOr[ContactDetail] = js.undefined
    /**
      * The name of the domain that you want to update contact information for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * Provides detailed contact information.
      */
    var RegistrantContact: js.UndefOr[ContactDetail] = js.undefined
    /**
      * Provides detailed contact information.
      */
    var TechContact: js.UndefOr[ContactDetail] = js.undefined
  }
  
  trait UpdateDomainContactResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait UpdateDomainNameserversRequest extends js.Object {
    /**
      * The name of the domain that you want to change name servers for.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * The authorization key for .fi domains
      */
    var FIAuthKey: js.UndefOr[FIAuthKey] = js.undefined
    /**
      * A list of new name servers for the domain.
      */
    var Nameservers: NameserverList
  }
  
  trait UpdateDomainNameserversResponse extends js.Object {
    /**
      * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
      */
    var OperationId: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.OperationId
  }
  
  trait UpdateTagsForDomainRequest extends js.Object {
    /**
      * The domain for which you want to add or update tags.
      */
    var DomainName: awsDashSdkLib.clientsRoute53domainsMod.Route53DomainsNs.DomainName
    /**
      * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the corresponding value will be replaced.
      */
    var TagsToUpdate: js.UndefOr[TagList] = js.undefined
  }
  
  trait UpdateTagsForDomainResponse extends js.Object
  
  trait ViewBillingRequest extends js.Object {
    /**
      * The end date and time for the time period for which you want a list of billing records. Specify the date and time in Coordinated Universal time (UTC).
      */
    var End: js.UndefOr[Timestamp] = js.undefined
    /**
      * For an initial request for a list of billing records, omit this element. If the number of billing records that are associated with the current AWS account during the specified period is greater than the value that you specified for MaxItems, you can use Marker to return additional billing records. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.  Constraints: The marker must match the value of NextPageMarker that was returned in the previous response.
      */
    var Marker: js.UndefOr[PageMarker] = js.undefined
    /**
      * The number of billing records to be returned. Default: 20
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * The beginning date and time for the time period for which you want a list of billing records. Specify the date and time in Coordinated Universal time (UTC).
      */
    var Start: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ViewBillingResponse extends js.Object {
    /**
      * A summary of billing records.
      */
    var BillingRecords: js.UndefOr[BillingRecords] = js.undefined
    /**
      * If there are more billing records than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
      */
    var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
  }
  
  trait _ContactType extends js.Object
  
  trait _CountryCode extends js.Object
  
  trait _DomainAvailability extends js.Object
  
  trait _ExtraParamName extends js.Object
  
  trait _OperationStatus extends js.Object
  
  trait _OperationType extends js.Object
  
  trait _ReachabilityStatus extends js.Object
  
  trait _Transferable extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AddressLine = java.lang.String
  type BillingRecords = js.Array[BillingRecord]
  type Boolean = scala.Boolean
  type City = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContactName = java.lang.String
  type ContactNumber = java.lang.String
  type ContactType = _ContactType | java.lang.String
  type CountryCode = _CountryCode | java.lang.String
  type CurrentExpiryYear = scala.Double
  type DNSSec = java.lang.String
  type DomainAuthCode = java.lang.String
  type DomainAvailability = _DomainAvailability | java.lang.String
  type DomainName = java.lang.String
  type DomainStatus = java.lang.String
  type DomainStatusList = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList = js.Array[DomainSummary]
  type DurationInYears = scala.Double
  type Email = java.lang.String
  type ErrorMessage = java.lang.String
  type ExtraParamList = js.Array[ExtraParam]
  type ExtraParamName = _ExtraParamName | java.lang.String
  type ExtraParamValue = java.lang.String
  type FIAuthKey = java.lang.String
  type GlueIp = java.lang.String
  type GlueIpList = js.Array[GlueIp]
  type HostName = java.lang.String
  type Integer = scala.Double
  type InvoiceId = java.lang.String
  type LangCode = java.lang.String
  type NameserverList = js.Array[Nameserver]
  type OperationId = java.lang.String
  type OperationStatus = _OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[OperationSummary]
  type OperationType = _OperationType | java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = scala.Double
  type Price = scala.Double
  type ReachabilityStatus = _ReachabilityStatus | java.lang.String
  type RegistrarName = java.lang.String
  type RegistrarUrl = java.lang.String
  type RegistrarWhoIsServer = java.lang.String
  type RegistryDomainId = java.lang.String
  type Reseller = java.lang.String
  type State = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type Transferable = _Transferable | java.lang.String
  type ZipCode = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

