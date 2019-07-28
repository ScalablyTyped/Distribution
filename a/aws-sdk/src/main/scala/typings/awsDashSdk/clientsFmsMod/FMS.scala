package typings.awsDashSdk.clientsFmsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FMS extends Service {
  @JSName("config")
  var config_FMS: ConfigBase with ClientConfiguration = js.native
  /**
    * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master account your AWS organization or associated with a member account that has the appropriate permissions. If the account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the appropriate permissions for the given member account. The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator account. 
    */
  def associateAdminAccount(): Request[js.Object, AWSError] = js.native
  def associateAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master account your AWS organization or associated with a member account that has the appropriate permissions. If the account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the appropriate permissions for the given member account. The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator account. 
    */
  def associateAdminAccount(params: AssociateAdminAccountRequest): Request[js.Object, AWSError] = js.native
  def associateAdminAccount(
    params: AssociateAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def deleteNotificationChannel(): Request[js.Object, AWSError] = js.native
  def deleteNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def deleteNotificationChannel(params: DeleteNotificationChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteNotificationChannel(
    params: DeleteNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes an AWS Firewall Manager policy. 
    */
  def deletePolicy(): Request[js.Object, AWSError] = js.native
  def deletePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Permanently deletes an AWS Firewall Manager policy. 
    */
  def deletePolicy(params: DeletePolicyRequest): Request[js.Object, AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different account as the administrator account, you must submit an AssociateAdminAccount request .
    */
  def disassociateAdminAccount(): Request[js.Object, AWSError] = js.native
  def disassociateAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different account as the administrator account, you must submit an AssociateAdminAccount request .
    */
  def disassociateAdminAccount(params: DisassociateAdminAccountRequest): Request[js.Object, AWSError] = js.native
  def disassociateAdminAccount(
    params: DisassociateAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall Manager administrator.
    */
  def getAdminAccount(): Request[GetAdminAccountResponse, AWSError] = js.native
  def getAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetAdminAccountResponse, Unit]): Request[GetAdminAccountResponse, AWSError] = js.native
  /**
    * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall Manager administrator.
    */
  def getAdminAccount(params: GetAdminAccountRequest): Request[GetAdminAccountResponse, AWSError] = js.native
  def getAdminAccount(
    params: GetAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAdminAccountResponse, Unit]
  ): Request[GetAdminAccountResponse, AWSError] = js.native
  /**
    * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy has not been applied to them.
    */
  def getComplianceDetail(): Request[GetComplianceDetailResponse, AWSError] = js.native
  def getComplianceDetail(callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailResponse, Unit]): Request[GetComplianceDetailResponse, AWSError] = js.native
  /**
    * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy has not been applied to them.
    */
  def getComplianceDetail(params: GetComplianceDetailRequest): Request[GetComplianceDetailResponse, AWSError] = js.native
  def getComplianceDetail(
    params: GetComplianceDetailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailResponse, Unit]
  ): Request[GetComplianceDetailResponse, AWSError] = js.native
  /**
    * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def getNotificationChannel(): Request[GetNotificationChannelResponse, AWSError] = js.native
  def getNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetNotificationChannelResponse, Unit]): Request[GetNotificationChannelResponse, AWSError] = js.native
  /**
    * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def getNotificationChannel(params: GetNotificationChannelRequest): Request[GetNotificationChannelResponse, AWSError] = js.native
  def getNotificationChannel(
    params: GetNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNotificationChannelResponse, Unit]
  ): Request[GetNotificationChannelResponse, AWSError] = js.native
  /**
    * Returns information about the specified AWS Firewall Manager policy.
    */
  def getPolicy(): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Returns information about the specified AWS Firewall Manager policy.
    */
  def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a potential DDoS attack.
    */
  def getProtectionStatus(): Request[GetProtectionStatusResponse, AWSError] = js.native
  def getProtectionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetProtectionStatusResponse, Unit]): Request[GetProtectionStatusResponse, AWSError] = js.native
  /**
    * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a potential DDoS attack.
    */
  def getProtectionStatus(params: GetProtectionStatusRequest): Request[GetProtectionStatusResponse, AWSError] = js.native
  def getProtectionStatus(
    params: GetProtectionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProtectionStatusResponse, Unit]
  ): Request[GetProtectionStatusResponse, AWSError] = js.native
  /**
    * Returns an array of PolicyComplianceStatus objects in the response. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
    */
  def listComplianceStatus(): Request[ListComplianceStatusResponse, AWSError] = js.native
  def listComplianceStatus(callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceStatusResponse, Unit]): Request[ListComplianceStatusResponse, AWSError] = js.native
  /**
    * Returns an array of PolicyComplianceStatus objects in the response. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
    */
  def listComplianceStatus(params: ListComplianceStatusRequest): Request[ListComplianceStatusResponse, AWSError] = js.native
  def listComplianceStatus(
    params: ListComplianceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComplianceStatusResponse, Unit]
  ): Request[ListComplianceStatusResponse, AWSError] = js.native
  /**
    * Returns a MemberAccounts object that lists the member accounts in the administrator's AWS organization. The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager administrator.
    */
  def listMemberAccounts(): Request[ListMemberAccountsResponse, AWSError] = js.native
  def listMemberAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListMemberAccountsResponse, Unit]): Request[ListMemberAccountsResponse, AWSError] = js.native
  /**
    * Returns a MemberAccounts object that lists the member accounts in the administrator's AWS organization. The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager administrator.
    */
  def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResponse, AWSError] = js.native
  def listMemberAccounts(
    params: ListMemberAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMemberAccountsResponse, Unit]
  ): Request[ListMemberAccountsResponse, AWSError] = js.native
  /**
    * Returns an array of PolicySummary objects in the response.
    */
  def listPolicies(): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]): Request[ListPoliciesResponse, AWSError] = js.native
  /**
    * Returns an array of PolicySummary objects in the response.
    */
  def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(
    params: ListPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]
  ): Request[ListPoliciesResponse, AWSError] = js.native
  /**
    * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to record SNS logs.
    */
  def putNotificationChannel(): Request[js.Object, AWSError] = js.native
  def putNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to record SNS logs.
    */
  def putNotificationChannel(params: PutNotificationChannelRequest): Request[js.Object, AWSError] = js.native
  def putNotificationChannel(
    params: PutNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates an AWS Firewall Manager policy. Firewall Manager provides two types of policies: A Shield Advanced policy, which applies Shield Advanced protection to specified accounts and resources, or a WAF policy, which contains a rule group and defines which resources are to be protected by that rule group. A policy is specific to either WAF or Shield Advanced. If you want to enforce both WAF rules and Shield Advanced protection across accounts, you can create multiple policies. You can create one or more policies for WAF rules, and one or more policies for Shield Advanced. You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information on subscribing to Shield Advanced, see CreateSubscription.
    */
  def putPolicy(): Request[PutPolicyResponse, AWSError] = js.native
  def putPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutPolicyResponse, Unit]): Request[PutPolicyResponse, AWSError] = js.native
  /**
    * Creates an AWS Firewall Manager policy. Firewall Manager provides two types of policies: A Shield Advanced policy, which applies Shield Advanced protection to specified accounts and resources, or a WAF policy, which contains a rule group and defines which resources are to be protected by that rule group. A policy is specific to either WAF or Shield Advanced. If you want to enforce both WAF rules and Shield Advanced protection across accounts, you can create multiple policies. You can create one or more policies for WAF rules, and one or more policies for Shield Advanced. You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information on subscribing to Shield Advanced, see CreateSubscription.
    */
  def putPolicy(params: PutPolicyRequest): Request[PutPolicyResponse, AWSError] = js.native
  def putPolicy(
    params: PutPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPolicyResponse, Unit]
  ): Request[PutPolicyResponse, AWSError] = js.native
}

