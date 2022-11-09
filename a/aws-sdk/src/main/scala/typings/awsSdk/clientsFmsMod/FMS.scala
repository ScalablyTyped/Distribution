package typings.awsSdk.clientsFmsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FMS extends Service {
  
  /**
    * Sets the Firewall Manager administrator account. The account must be a member of the organization in Organizations whose resources you want to protect. Firewall Manager sets the permissions that allow the account to administer your Firewall Manager policies. The account that you associate with Firewall Manager is called the Firewall Manager administrator account. 
    */
  def associateAdminAccount(): Request[js.Object, AWSError] = js.native
  def associateAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the Firewall Manager administrator account. The account must be a member of the organization in Organizations whose resources you want to protect. Firewall Manager sets the permissions that allow the account to administer your Firewall Manager policies. The account that you associate with Firewall Manager is called the Firewall Manager administrator account. 
    */
  def associateAdminAccount(params: AssociateAdminAccountRequest): Request[js.Object, AWSError] = js.native
  def associateAdminAccount(
    params: AssociateAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the Firewall Manager policy administrator as a tenant administrator of a third-party firewall service. A tenant is an instance of the third-party firewall service that's associated with your Amazon Web Services customer account.
    */
  def associateThirdPartyFirewall(): Request[AssociateThirdPartyFirewallResponse, AWSError] = js.native
  def associateThirdPartyFirewall(callback: js.Function2[/* err */ AWSError, /* data */ AssociateThirdPartyFirewallResponse, Unit]): Request[AssociateThirdPartyFirewallResponse, AWSError] = js.native
  /**
    * Sets the Firewall Manager policy administrator as a tenant administrator of a third-party firewall service. A tenant is an instance of the third-party firewall service that's associated with your Amazon Web Services customer account.
    */
  def associateThirdPartyFirewall(params: AssociateThirdPartyFirewallRequest): Request[AssociateThirdPartyFirewallResponse, AWSError] = js.native
  def associateThirdPartyFirewall(
    params: AssociateThirdPartyFirewallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateThirdPartyFirewallResponse, Unit]
  ): Request[AssociateThirdPartyFirewallResponse, AWSError] = js.native
  
  /**
    * Associate resources to a Firewall Manager resource set.
    */
  def batchAssociateResource(): Request[BatchAssociateResourceResponse, AWSError] = js.native
  def batchAssociateResource(callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateResourceResponse, Unit]): Request[BatchAssociateResourceResponse, AWSError] = js.native
  /**
    * Associate resources to a Firewall Manager resource set.
    */
  def batchAssociateResource(params: BatchAssociateResourceRequest): Request[BatchAssociateResourceResponse, AWSError] = js.native
  def batchAssociateResource(
    params: BatchAssociateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateResourceResponse, Unit]
  ): Request[BatchAssociateResourceResponse, AWSError] = js.native
  
  /**
    * Disassociates resources from a Firewall Manager resource set.
    */
  def batchDisassociateResource(): Request[BatchDisassociateResourceResponse, AWSError] = js.native
  def batchDisassociateResource(callback: js.Function2[/* err */ AWSError, /* data */ BatchDisassociateResourceResponse, Unit]): Request[BatchDisassociateResourceResponse, AWSError] = js.native
  /**
    * Disassociates resources from a Firewall Manager resource set.
    */
  def batchDisassociateResource(params: BatchDisassociateResourceRequest): Request[BatchDisassociateResourceResponse, AWSError] = js.native
  def batchDisassociateResource(
    params: BatchDisassociateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisassociateResourceResponse, Unit]
  ): Request[BatchDisassociateResourceResponse, AWSError] = js.native
  
  @JSName("config")
  var config_FMS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Permanently deletes an Firewall Manager applications list.
    */
  def deleteAppsList(): Request[js.Object, AWSError] = js.native
  def deleteAppsList(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes an Firewall Manager applications list.
    */
  def deleteAppsList(params: DeleteAppsListRequest): Request[js.Object, AWSError] = js.native
  def deleteAppsList(
    params: DeleteAppsListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS logs.
    */
  def deleteNotificationChannel(): Request[js.Object, AWSError] = js.native
  def deleteNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS logs.
    */
  def deleteNotificationChannel(params: DeleteNotificationChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteNotificationChannel(
    params: DeleteNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Permanently deletes an Firewall Manager policy. 
    */
  def deletePolicy(): Request[js.Object, AWSError] = js.native
  def deletePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes an Firewall Manager policy. 
    */
  def deletePolicy(params: DeletePolicyRequest): Request[js.Object, AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Permanently deletes an Firewall Manager protocols list.
    */
  def deleteProtocolsList(): Request[js.Object, AWSError] = js.native
  def deleteProtocolsList(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes an Firewall Manager protocols list.
    */
  def deleteProtocolsList(params: DeleteProtocolsListRequest): Request[js.Object, AWSError] = js.native
  def deleteProtocolsList(
    params: DeleteProtocolsListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified ResourceSet.
    */
  def deleteResourceSet(): Request[js.Object, AWSError] = js.native
  def deleteResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified ResourceSet.
    */
  def deleteResourceSet(params: DeleteResourceSetRequest): Request[js.Object, AWSError] = js.native
  def deleteResourceSet(
    params: DeleteResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates the account that has been set as the Firewall Manager administrator account. To set a different account as the administrator account, you must submit an AssociateAdminAccount request.
    */
  def disassociateAdminAccount(): Request[js.Object, AWSError] = js.native
  def disassociateAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates the account that has been set as the Firewall Manager administrator account. To set a different account as the administrator account, you must submit an AssociateAdminAccount request.
    */
  def disassociateAdminAccount(params: DisassociateAdminAccountRequest): Request[js.Object, AWSError] = js.native
  def disassociateAdminAccount(
    params: DisassociateAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates a Firewall Manager policy administrator from a third-party firewall tenant. When you call DisassociateThirdPartyFirewall, the third-party firewall vendor deletes all of the firewalls that are associated with the account.
    */
  def disassociateThirdPartyFirewall(): Request[DisassociateThirdPartyFirewallResponse, AWSError] = js.native
  def disassociateThirdPartyFirewall(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateThirdPartyFirewallResponse, Unit]
  ): Request[DisassociateThirdPartyFirewallResponse, AWSError] = js.native
  /**
    * Disassociates a Firewall Manager policy administrator from a third-party firewall tenant. When you call DisassociateThirdPartyFirewall, the third-party firewall vendor deletes all of the firewalls that are associated with the account.
    */
  def disassociateThirdPartyFirewall(params: DisassociateThirdPartyFirewallRequest): Request[DisassociateThirdPartyFirewallResponse, AWSError] = js.native
  def disassociateThirdPartyFirewall(
    params: DisassociateThirdPartyFirewallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateThirdPartyFirewallResponse, Unit]
  ): Request[DisassociateThirdPartyFirewallResponse, AWSError] = js.native
  
  /**
    * Returns the Organizations account that is associated with Firewall Manager as the Firewall Manager administrator.
    */
  def getAdminAccount(): Request[GetAdminAccountResponse, AWSError] = js.native
  def getAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetAdminAccountResponse, Unit]): Request[GetAdminAccountResponse, AWSError] = js.native
  /**
    * Returns the Organizations account that is associated with Firewall Manager as the Firewall Manager administrator.
    */
  def getAdminAccount(params: GetAdminAccountRequest): Request[GetAdminAccountResponse, AWSError] = js.native
  def getAdminAccount(
    params: GetAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAdminAccountResponse, Unit]
  ): Request[GetAdminAccountResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified Firewall Manager applications list.
    */
  def getAppsList(): Request[GetAppsListResponse, AWSError] = js.native
  def getAppsList(callback: js.Function2[/* err */ AWSError, /* data */ GetAppsListResponse, Unit]): Request[GetAppsListResponse, AWSError] = js.native
  /**
    * Returns information about the specified Firewall Manager applications list.
    */
  def getAppsList(params: GetAppsListRequest): Request[GetAppsListResponse, AWSError] = js.native
  def getAppsList(
    params: GetAppsListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppsListResponse, Unit]
  ): Request[GetAppsListResponse, AWSError] = js.native
  
  /**
    * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy.    Resources are considered noncompliant for WAF and Shield Advanced policies if the specified policy has not been applied to them.   Resources are considered noncompliant for security group policies if they are in scope of the policy, they violate one or more of the policy rules, and remediation is disabled or not possible.   Resources are considered noncompliant for Network Firewall policies if a firewall is missing in the VPC, if the firewall endpoint isn't set up in an expected Availability Zone and subnet, if a subnet created by the Firewall Manager doesn't have the expected route table, and for modifications to a firewall policy that violate the Firewall Manager policy's rules.   Resources are considered noncompliant for DNS Firewall policies if a DNS Firewall rule group is missing from the rule group associations for the VPC.   
    */
  def getComplianceDetail(): Request[GetComplianceDetailResponse, AWSError] = js.native
  def getComplianceDetail(callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailResponse, Unit]): Request[GetComplianceDetailResponse, AWSError] = js.native
  /**
    * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy.    Resources are considered noncompliant for WAF and Shield Advanced policies if the specified policy has not been applied to them.   Resources are considered noncompliant for security group policies if they are in scope of the policy, they violate one or more of the policy rules, and remediation is disabled or not possible.   Resources are considered noncompliant for Network Firewall policies if a firewall is missing in the VPC, if the firewall endpoint isn't set up in an expected Availability Zone and subnet, if a subnet created by the Firewall Manager doesn't have the expected route table, and for modifications to a firewall policy that violate the Firewall Manager policy's rules.   Resources are considered noncompliant for DNS Firewall policies if a DNS Firewall rule group is missing from the rule group associations for the VPC.   
    */
  def getComplianceDetail(params: GetComplianceDetailRequest): Request[GetComplianceDetailResponse, AWSError] = js.native
  def getComplianceDetail(
    params: GetComplianceDetailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailResponse, Unit]
  ): Request[GetComplianceDetailResponse, AWSError] = js.native
  
  /**
    * Information about the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS logs.
    */
  def getNotificationChannel(): Request[GetNotificationChannelResponse, AWSError] = js.native
  def getNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetNotificationChannelResponse, Unit]): Request[GetNotificationChannelResponse, AWSError] = js.native
  /**
    * Information about the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS logs.
    */
  def getNotificationChannel(params: GetNotificationChannelRequest): Request[GetNotificationChannelResponse, AWSError] = js.native
  def getNotificationChannel(
    params: GetNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNotificationChannelResponse, Unit]
  ): Request[GetNotificationChannelResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified Firewall Manager policy.
    */
  def getPolicy(): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Returns information about the specified Firewall Manager policy.
    */
  def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  
  /**
    * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a potential DDoS attack. Other policy types are currently unsupported.
    */
  def getProtectionStatus(): Request[GetProtectionStatusResponse, AWSError] = js.native
  def getProtectionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetProtectionStatusResponse, Unit]): Request[GetProtectionStatusResponse, AWSError] = js.native
  /**
    * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a potential DDoS attack. Other policy types are currently unsupported.
    */
  def getProtectionStatus(params: GetProtectionStatusRequest): Request[GetProtectionStatusResponse, AWSError] = js.native
  def getProtectionStatus(
    params: GetProtectionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProtectionStatusResponse, Unit]
  ): Request[GetProtectionStatusResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified Firewall Manager protocols list.
    */
  def getProtocolsList(): Request[GetProtocolsListResponse, AWSError] = js.native
  def getProtocolsList(callback: js.Function2[/* err */ AWSError, /* data */ GetProtocolsListResponse, Unit]): Request[GetProtocolsListResponse, AWSError] = js.native
  /**
    * Returns information about the specified Firewall Manager protocols list.
    */
  def getProtocolsList(params: GetProtocolsListRequest): Request[GetProtocolsListResponse, AWSError] = js.native
  def getProtocolsList(
    params: GetProtocolsListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProtocolsListResponse, Unit]
  ): Request[GetProtocolsListResponse, AWSError] = js.native
  
  /**
    * Gets information about a specific resource set.
    */
  def getResourceSet(): Request[GetResourceSetResponse, AWSError] = js.native
  def getResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSetResponse, Unit]): Request[GetResourceSetResponse, AWSError] = js.native
  /**
    * Gets information about a specific resource set.
    */
  def getResourceSet(params: GetResourceSetRequest): Request[GetResourceSetResponse, AWSError] = js.native
  def getResourceSet(
    params: GetResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSetResponse, Unit]
  ): Request[GetResourceSetResponse, AWSError] = js.native
  
  /**
    * The onboarding status of a Firewall Manager admin account to third-party firewall vendor tenant.
    */
  def getThirdPartyFirewallAssociationStatus(): Request[GetThirdPartyFirewallAssociationStatusResponse, AWSError] = js.native
  def getThirdPartyFirewallAssociationStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetThirdPartyFirewallAssociationStatusResponse, Unit]
  ): Request[GetThirdPartyFirewallAssociationStatusResponse, AWSError] = js.native
  /**
    * The onboarding status of a Firewall Manager admin account to third-party firewall vendor tenant.
    */
  def getThirdPartyFirewallAssociationStatus(params: GetThirdPartyFirewallAssociationStatusRequest): Request[GetThirdPartyFirewallAssociationStatusResponse, AWSError] = js.native
  def getThirdPartyFirewallAssociationStatus(
    params: GetThirdPartyFirewallAssociationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThirdPartyFirewallAssociationStatusResponse, Unit]
  ): Request[GetThirdPartyFirewallAssociationStatusResponse, AWSError] = js.native
  
  /**
    * Retrieves violations for a resource based on the specified Firewall Manager policy and Amazon Web Services account.
    */
  def getViolationDetails(): Request[GetViolationDetailsResponse, AWSError] = js.native
  def getViolationDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetViolationDetailsResponse, Unit]): Request[GetViolationDetailsResponse, AWSError] = js.native
  /**
    * Retrieves violations for a resource based on the specified Firewall Manager policy and Amazon Web Services account.
    */
  def getViolationDetails(params: GetViolationDetailsRequest): Request[GetViolationDetailsResponse, AWSError] = js.native
  def getViolationDetails(
    params: GetViolationDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetViolationDetailsResponse, Unit]
  ): Request[GetViolationDetailsResponse, AWSError] = js.native
  
  /**
    * Returns an array of AppsListDataSummary objects.
    */
  def listAppsLists(): Request[ListAppsListsResponse, AWSError] = js.native
  def listAppsLists(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsListsResponse, Unit]): Request[ListAppsListsResponse, AWSError] = js.native
  /**
    * Returns an array of AppsListDataSummary objects.
    */
  def listAppsLists(params: ListAppsListsRequest): Request[ListAppsListsResponse, AWSError] = js.native
  def listAppsLists(
    params: ListAppsListsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsListsResponse, Unit]
  ): Request[ListAppsListsResponse, AWSError] = js.native
  
  /**
    * Returns an array of PolicyComplianceStatus objects. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
    */
  def listComplianceStatus(): Request[ListComplianceStatusResponse, AWSError] = js.native
  def listComplianceStatus(callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceStatusResponse, Unit]): Request[ListComplianceStatusResponse, AWSError] = js.native
  /**
    * Returns an array of PolicyComplianceStatus objects. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
    */
  def listComplianceStatus(params: ListComplianceStatusRequest): Request[ListComplianceStatusResponse, AWSError] = js.native
  def listComplianceStatus(
    params: ListComplianceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceStatusResponse, Unit]
  ): Request[ListComplianceStatusResponse, AWSError] = js.native
  
  /**
    * Returns an array of resources in the organization's accounts that are available to be associated with a resource set.
    */
  def listDiscoveredResources(): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  def listDiscoveredResources(callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveredResourcesResponse, Unit]): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * Returns an array of resources in the organization's accounts that are available to be associated with a resource set.
    */
  def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  def listDiscoveredResources(
    params: ListDiscoveredResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveredResourcesResponse, Unit]
  ): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  
  /**
    * Returns a MemberAccounts object that lists the member accounts in the administrator's Amazon Web Services organization. The ListMemberAccounts must be submitted by the account that is set as the Firewall Manager administrator.
    */
  def listMemberAccounts(): Request[ListMemberAccountsResponse, AWSError] = js.native
  def listMemberAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListMemberAccountsResponse, Unit]): Request[ListMemberAccountsResponse, AWSError] = js.native
  /**
    * Returns a MemberAccounts object that lists the member accounts in the administrator's Amazon Web Services organization. The ListMemberAccounts must be submitted by the account that is set as the Firewall Manager administrator.
    */
  def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResponse, AWSError] = js.native
  def listMemberAccounts(
    params: ListMemberAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMemberAccountsResponse, Unit]
  ): Request[ListMemberAccountsResponse, AWSError] = js.native
  
  /**
    * Returns an array of PolicySummary objects.
    */
  def listPolicies(): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]): Request[ListPoliciesResponse, AWSError] = js.native
  /**
    * Returns an array of PolicySummary objects.
    */
  def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(
    params: ListPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]
  ): Request[ListPoliciesResponse, AWSError] = js.native
  
  /**
    * Returns an array of ProtocolsListDataSummary objects.
    */
  def listProtocolsLists(): Request[ListProtocolsListsResponse, AWSError] = js.native
  def listProtocolsLists(callback: js.Function2[/* err */ AWSError, /* data */ ListProtocolsListsResponse, Unit]): Request[ListProtocolsListsResponse, AWSError] = js.native
  /**
    * Returns an array of ProtocolsListDataSummary objects.
    */
  def listProtocolsLists(params: ListProtocolsListsRequest): Request[ListProtocolsListsResponse, AWSError] = js.native
  def listProtocolsLists(
    params: ListProtocolsListsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtocolsListsResponse, Unit]
  ): Request[ListProtocolsListsResponse, AWSError] = js.native
  
  /**
    * Returns an array of resources that are currently associated to a resource set.
    */
  def listResourceSetResources(): Request[ListResourceSetResourcesResponse, AWSError] = js.native
  def listResourceSetResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSetResourcesResponse, Unit]): Request[ListResourceSetResourcesResponse, AWSError] = js.native
  /**
    * Returns an array of resources that are currently associated to a resource set.
    */
  def listResourceSetResources(params: ListResourceSetResourcesRequest): Request[ListResourceSetResourcesResponse, AWSError] = js.native
  def listResourceSetResources(
    params: ListResourceSetResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSetResourcesResponse, Unit]
  ): Request[ListResourceSetResourcesResponse, AWSError] = js.native
  
  /**
    * Returns an array of ResourceSetSummary objects.
    */
  def listResourceSets(): Request[ListResourceSetsResponse, AWSError] = js.native
  def listResourceSets(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSetsResponse, Unit]): Request[ListResourceSetsResponse, AWSError] = js.native
  /**
    * Returns an array of ResourceSetSummary objects.
    */
  def listResourceSets(params: ListResourceSetsRequest): Request[ListResourceSetsResponse, AWSError] = js.native
  def listResourceSets(
    params: ListResourceSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSetsResponse, Unit]
  ): Request[ListResourceSetsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of tags for the specified Amazon Web Services resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the list of tags for the specified Amazon Web Services resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of all of the third-party firewall policies that are associated with the third-party firewall administrator's account.
    */
  def listThirdPartyFirewallFirewallPolicies(): Request[ListThirdPartyFirewallFirewallPoliciesResponse, AWSError] = js.native
  def listThirdPartyFirewallFirewallPolicies(
    callback: js.Function2[/* err */ AWSError, /* data */ ListThirdPartyFirewallFirewallPoliciesResponse, Unit]
  ): Request[ListThirdPartyFirewallFirewallPoliciesResponse, AWSError] = js.native
  /**
    * Retrieves a list of all of the third-party firewall policies that are associated with the third-party firewall administrator's account.
    */
  def listThirdPartyFirewallFirewallPolicies(params: ListThirdPartyFirewallFirewallPoliciesRequest): Request[ListThirdPartyFirewallFirewallPoliciesResponse, AWSError] = js.native
  def listThirdPartyFirewallFirewallPolicies(
    params: ListThirdPartyFirewallFirewallPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThirdPartyFirewallFirewallPoliciesResponse, Unit]
  ): Request[ListThirdPartyFirewallFirewallPoliciesResponse, AWSError] = js.native
  
  /**
    * Creates an Firewall Manager applications list.
    */
  def putAppsList(): Request[PutAppsListResponse, AWSError] = js.native
  def putAppsList(callback: js.Function2[/* err */ AWSError, /* data */ PutAppsListResponse, Unit]): Request[PutAppsListResponse, AWSError] = js.native
  /**
    * Creates an Firewall Manager applications list.
    */
  def putAppsList(params: PutAppsListRequest): Request[PutAppsListResponse, AWSError] = js.native
  def putAppsList(
    params: PutAppsListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppsListResponse, Unit]
  ): Request[PutAppsListResponse, AWSError] = js.native
  
  /**
    * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that Firewall Manager uses to record SNS logs. To perform this action outside of the console, you must configure the SNS topic to allow the Firewall Manager role AWSServiceRoleForFMS to publish SNS logs. For more information, see Firewall Manager required permissions for API actions in the Firewall Manager Developer Guide.
    */
  def putNotificationChannel(): Request[js.Object, AWSError] = js.native
  def putNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that Firewall Manager uses to record SNS logs. To perform this action outside of the console, you must configure the SNS topic to allow the Firewall Manager role AWSServiceRoleForFMS to publish SNS logs. For more information, see Firewall Manager required permissions for API actions in the Firewall Manager Developer Guide.
    */
  def putNotificationChannel(params: PutNotificationChannelRequest): Request[js.Object, AWSError] = js.native
  def putNotificationChannel(
    params: PutNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates an Firewall Manager policy. Firewall Manager provides the following types of policies:    An WAF policy (type WAFV2), which defines rule groups to run first in the corresponding WAF web ACL and rule groups to run last in the web ACL.   An WAF Classic policy (type WAF), which defines a rule group.    A Shield Advanced policy, which applies Shield Advanced protection to specified accounts and resources.   A security group policy, which manages VPC security groups across your Amazon Web Services organization.    An Network Firewall policy, which provides firewall rules to filter network traffic in specified Amazon VPCs.   A DNS Firewall policy, which provides Route 53 Resolver DNS Firewall rules to filter DNS queries for specified VPCs.   Each policy is specific to one of the types. If you want to enforce more than one policy type across accounts, create multiple policies. You can create multiple policies for each type. You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information about subscribing to Shield Advanced, see CreateSubscription.
    */
  def putPolicy(): Request[PutPolicyResponse, AWSError] = js.native
  def putPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutPolicyResponse, Unit]): Request[PutPolicyResponse, AWSError] = js.native
  /**
    * Creates an Firewall Manager policy. Firewall Manager provides the following types of policies:    An WAF policy (type WAFV2), which defines rule groups to run first in the corresponding WAF web ACL and rule groups to run last in the web ACL.   An WAF Classic policy (type WAF), which defines a rule group.    A Shield Advanced policy, which applies Shield Advanced protection to specified accounts and resources.   A security group policy, which manages VPC security groups across your Amazon Web Services organization.    An Network Firewall policy, which provides firewall rules to filter network traffic in specified Amazon VPCs.   A DNS Firewall policy, which provides Route 53 Resolver DNS Firewall rules to filter DNS queries for specified VPCs.   Each policy is specific to one of the types. If you want to enforce more than one policy type across accounts, create multiple policies. You can create multiple policies for each type. You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information about subscribing to Shield Advanced, see CreateSubscription.
    */
  def putPolicy(params: PutPolicyRequest): Request[PutPolicyResponse, AWSError] = js.native
  def putPolicy(
    params: PutPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPolicyResponse, Unit]
  ): Request[PutPolicyResponse, AWSError] = js.native
  
  /**
    * Creates an Firewall Manager protocols list.
    */
  def putProtocolsList(): Request[PutProtocolsListResponse, AWSError] = js.native
  def putProtocolsList(callback: js.Function2[/* err */ AWSError, /* data */ PutProtocolsListResponse, Unit]): Request[PutProtocolsListResponse, AWSError] = js.native
  /**
    * Creates an Firewall Manager protocols list.
    */
  def putProtocolsList(params: PutProtocolsListRequest): Request[PutProtocolsListResponse, AWSError] = js.native
  def putProtocolsList(
    params: PutProtocolsListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutProtocolsListResponse, Unit]
  ): Request[PutProtocolsListResponse, AWSError] = js.native
  
  /**
    * Creates the resource set. An Firewall Manager resource set defines the resources to import into an Firewall Manager policy from another Amazon Web Services service.
    */
  def putResourceSet(): Request[PutResourceSetResponse, AWSError] = js.native
  def putResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ PutResourceSetResponse, Unit]): Request[PutResourceSetResponse, AWSError] = js.native
  /**
    * Creates the resource set. An Firewall Manager resource set defines the resources to import into an Firewall Manager policy from another Amazon Web Services service.
    */
  def putResourceSet(params: PutResourceSetRequest): Request[PutResourceSetResponse, AWSError] = js.native
  def putResourceSet(
    params: PutResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourceSetResponse, Unit]
  ): Request[PutResourceSetResponse, AWSError] = js.native
  
  /**
    * Adds one or more tags to an Amazon Web Services resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to an Amazon Web Services resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from an Amazon Web Services resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from an Amazon Web Services resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
