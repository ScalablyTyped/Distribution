package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FMS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_FMS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsFmsMod.FMSNs.ClientConfiguration = js.native
  /**
    * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master account your AWS organization or associated with a member account that has the appropriate permissions. If the account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the appropriate permissions for the given member account. The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator account. 
    */
  def associateAdminAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateAdminAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master account your AWS organization or associated with a member account that has the appropriate permissions. If the account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the appropriate permissions for the given member account. The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator account. 
    */
  def associateAdminAccount(params: awsDashSdkLib.clientsFmsMod.FMSNs.AssociateAdminAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateAdminAccount(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.AssociateAdminAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def deleteNotificationChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotificationChannel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def deleteNotificationChannel(params: awsDashSdkLib.clientsFmsMod.FMSNs.DeleteNotificationChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotificationChannel(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.DeleteNotificationChannelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes an AWS Firewall Manager policy. 
    */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes an AWS Firewall Manager policy. 
    */
  def deletePolicy(params: awsDashSdkLib.clientsFmsMod.FMSNs.DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.DeletePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the account that has been set as the AWS Firewall Manager administrator account. You will need to submit an AssociateAdminAccount request to set a new account as the AWS Firewall administrator.
    */
  def disassociateAdminAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateAdminAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the account that has been set as the AWS Firewall Manager administrator account. You will need to submit an AssociateAdminAccount request to set a new account as the AWS Firewall administrator.
    */
  def disassociateAdminAccount(params: awsDashSdkLib.clientsFmsMod.FMSNs.DisassociateAdminAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateAdminAccount(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.DisassociateAdminAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall Manager administrator.
    */
  def getAdminAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAdminAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall Manager administrator.
    */
  def getAdminAccount(params: awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAdminAccount(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetAdminAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy has not been applied to them.
    */
  def getComplianceDetail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceDetail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy has not been applied to them.
    */
  def getComplianceDetail(params: awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceDetail(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetComplianceDetailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def getNotificationChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getNotificationChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
    */
  def getNotificationChannel(params: awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getNotificationChannel(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetNotificationChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the specified AWS Firewall Manager policy.
    */
  def getPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the specified AWS Firewall Manager policy.
    */
  def getPolicy(params: awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPolicy(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of PolicyComplianceStatus objects in the response. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
    */
  def listComplianceStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listComplianceStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of PolicyComplianceStatus objects in the response. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
    */
  def listComplianceStatus(params: awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listComplianceStatus(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListComplianceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a MemberAccounts object that lists the member accounts in the administrator's AWS organization. The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager administrator.
    */
  def listMemberAccounts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMemberAccounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a MemberAccounts object that lists the member accounts in the administrator's AWS organization. The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager administrator.
    */
  def listMemberAccounts(params: awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMemberAccounts(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListMemberAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of PolicySummary objects in the response.
    */
  def listPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of PolicySummary objects in the response.
    */
  def listPolicies(params: awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPolicies(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to record SNS logs.
    */
  def putNotificationChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putNotificationChannel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to record SNS logs.
    */
  def putNotificationChannel(params: awsDashSdkLib.clientsFmsMod.FMSNs.PutNotificationChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putNotificationChannel(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.PutNotificationChannelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS Firewall Manager policy.
    */
  def putPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Firewall Manager policy.
    */
  def putPolicy(params: awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putPolicy(
    params: awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsFmsMod.FMSNs.PutPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

