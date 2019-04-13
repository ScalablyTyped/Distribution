package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route53Domains
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Route53Domains: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

