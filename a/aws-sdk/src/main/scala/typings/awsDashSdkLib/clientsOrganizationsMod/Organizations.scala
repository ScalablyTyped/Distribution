package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organizations
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Organizations: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.  This operation can be called only by the following principals when they also have the relevant IAM permissions:    Invitation to join or Approve all features request handshakes: only a principal from the member account.  The user who calls the API for an invitation to join must have the organizations:AcceptHandshake permission. If you enabled all features in the organization, then the user must also have the iam:CreateServiceLinkedRole permission so that Organizations can create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.    Enable all features final confirmation handshake: only a principal from the master account. For more information about invitations, see Inviting an AWS Account to Join Your Organization in the AWS Organizations User Guide. For more information about requests to enable all features in the organization, see Enabling All Features in Your Organization in the AWS Organizations User Guide.   After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
    */
  def acceptHandshake(): awsDashSdkLib.libRequestMod.Request[AcceptHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptHandshake(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.  This operation can be called only by the following principals when they also have the relevant IAM permissions:    Invitation to join or Approve all features request handshakes: only a principal from the member account.  The user who calls the API for an invitation to join must have the organizations:AcceptHandshake permission. If you enabled all features in the organization, then the user must also have the iam:CreateServiceLinkedRole permission so that Organizations can create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.    Enable all features final confirmation handshake: only a principal from the master account. For more information about invitations, see Inviting an AWS Account to Join Your Organization in the AWS Organizations User Guide. For more information about requests to enable all features in the organization, see Enabling All Features in Your Organization in the AWS Organizations User Guide.   After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
    */
  def acceptHandshake(params: AcceptHandshakeRequest): awsDashSdkLib.libRequestMod.Request[AcceptHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptHandshake(
    params: AcceptHandshakeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects accounts depends on the type of policy:    Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected member accounts. The scope of influence for a policy depends on what you attach the policy to:   If you attach an SCP to a root, it affects all accounts in the organization.   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.   If you attach the policy directly to an account, then it affects only that account.   SCPs are JSON policies that specify the maximum permissions for an organization or organizational unit (OU). When you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP. AWS Organizations attaches a default SCP named "FullAWSAccess to every root, OU, and account. This default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the permissions that you want to allow in that OU or account. For more information about how Organizations policies permissions work, see Using Service Control Policies in the AWS Organizations User Guide.   This operation can be called only from the organization's master account.
    */
  def attachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects accounts depends on the type of policy:    Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected member accounts. The scope of influence for a policy depends on what you attach the policy to:   If you attach an SCP to a root, it affects all accounts in the organization.   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.   If you attach the policy directly to an account, then it affects only that account.   SCPs are JSON policies that specify the maximum permissions for an organization or organizational unit (OU). When you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP. AWS Organizations attaches a default SCP named "FullAWSAccess to every root, OU, and account. This default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the permissions that you want to allow in that OU or account. For more information about how Organizations policies permissions work, see Using Service Control Policies in the AWS Organizations User Guide.   This operation can be called only from the organization's master account.
    */
  def attachPolicy(params: AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachPolicy(
    params: AttachPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a handshake. Canceling a handshake sets the handshake state to CANCELED.  This operation can be called only from the account that originated the handshake. The recipient of the handshake can't cancel it, but can use DeclineHandshake instead. After a handshake is canceled, the recipient can no longer respond to that handshake. After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
    */
  def cancelHandshake(): awsDashSdkLib.libRequestMod.Request[CancelHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelHandshake(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a handshake. Canceling a handshake sets the handshake state to CANCELED.  This operation can be called only from the account that originated the handshake. The recipient of the handshake can't cancel it, but can use DeclineHandshake instead. After a handshake is canceled, the recipient can no longer respond to that handshake. After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
    */
  def cancelHandshake(params: CancelHandshakeRequest): awsDashSdkLib.libRequestMod.Request[CancelHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelHandshake(
    params: CancelHandshakeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS account that is automatically a member of the organization whose credentials made the request. This is an asynchronous request that AWS performs in the background. Because CreateAccount operates asynchronously, it can return a successful completion message even though account initialization might still be in progress. You might need to wait a few minutes before you can successfully access the account. To check the status of the request, do one of the following:   Use the OperationId response element from this operation to provide as a parameter to the DescribeCreateAccountStatus operation.   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS CloudTrail with Organizations, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.     The user who calls the API to create an account must have the organizations:CreateAccount permission. If you enabled all features in the organization, AWS Organizations will create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide. AWS Organizations preconfigures the new member account with a role (named OrganizationAccountAccessRole by default) that grants users in the master account administrator permissions in the new member account. Principals in the master account can assume the role. AWS Organizations clones the company name and address information for the new account from the organization's master account. This operation can be called only from the organization's master account. For more information about creating accounts, see Creating an AWS Account in Your Organization in the AWS Organizations User Guide.     When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required for the account to operate as a standalone account, such as a payment method and signing the end user license agreement (EULA) is not automatically collected. If you must remove an account from your organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.   If you get an exception that indicates that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists, contact AWS Support.   Using CreateAccount to create multiple temporary accounts isn't recommended. You can only close an account from the Billing and Cost Management Console, and you must be signed in as the root user. For information on the requirements and process for closing an account, see Closing an AWS Account in the AWS Organizations User Guide.     When you create a member account with this operation, you can choose whether to create the account with the IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that have appropriate permissions can view billing information for the account. If you disable it, only the account root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your Billing Information and Tools. 
    */
  def createAccount(): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS account that is automatically a member of the organization whose credentials made the request. This is an asynchronous request that AWS performs in the background. Because CreateAccount operates asynchronously, it can return a successful completion message even though account initialization might still be in progress. You might need to wait a few minutes before you can successfully access the account. To check the status of the request, do one of the following:   Use the OperationId response element from this operation to provide as a parameter to the DescribeCreateAccountStatus operation.   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS CloudTrail with Organizations, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.     The user who calls the API to create an account must have the organizations:CreateAccount permission. If you enabled all features in the organization, AWS Organizations will create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide. AWS Organizations preconfigures the new member account with a role (named OrganizationAccountAccessRole by default) that grants users in the master account administrator permissions in the new member account. Principals in the master account can assume the role. AWS Organizations clones the company name and address information for the new account from the organization's master account. This operation can be called only from the organization's master account. For more information about creating accounts, see Creating an AWS Account in Your Organization in the AWS Organizations User Guide.     When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required for the account to operate as a standalone account, such as a payment method and signing the end user license agreement (EULA) is not automatically collected. If you must remove an account from your organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.   If you get an exception that indicates that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists, contact AWS Support.   Using CreateAccount to create multiple temporary accounts isn't recommended. You can only close an account from the Billing and Cost Management Console, and you must be signed in as the root user. For information on the requirements and process for closing an account, see Closing an AWS Account in the AWS Organizations User Guide.     When you create a member account with this operation, you can choose whether to create the account with the IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that have appropriate permissions can view billing information for the account. If you disable it, only the account root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your Billing Information and Tools. 
    */
  def createAccount(params: CreateAccountRequest): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAccount(
    params: CreateAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS organization. The account whose user is calling the CreateOrganization operation automatically becomes the master account of the new organization. This operation must be called using credentials from the account that is to become the new organization's master account. The principal must also have the relevant IAM permissions. By default (or if you set the FeatureSet parameter to ALL), the new organization is created with all features enabled and service control policies automatically enabled in the root. If you instead choose to create the organization supporting only the consolidated billing features by setting the FeatureSet parameter to CONSOLIDATED_BILLING", then no policy types are enabled by default and you cannot use organization policies.
    */
  def createOrganization(): awsDashSdkLib.libRequestMod.Request[CreateOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS organization. The account whose user is calling the CreateOrganization operation automatically becomes the master account of the new organization. This operation must be called using credentials from the account that is to become the new organization's master account. The principal must also have the relevant IAM permissions. By default (or if you set the FeatureSet parameter to ALL), the new organization is created with all features enabled and service control policies automatically enabled in the root. If you instead choose to create the organization supporting only the consolidated billing features by setting the FeatureSet parameter to CONSOLIDATED_BILLING", then no policy types are enabled by default and you cannot use organization policies.
    */
  def createOrganization(params: CreateOrganizationRequest): awsDashSdkLib.libRequestMod.Request[CreateOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOrganization(
    params: CreateOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables you to organize your accounts to apply policies according to your business requirements. The number of levels deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control policies, the limit is five.  For more information about OUs, see Managing Organizational Units in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
    */
  def createOrganizationalUnit(): awsDashSdkLib.libRequestMod.Request[CreateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOrganizationalUnit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOrganizationalUnitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables you to organize your accounts to apply policies according to your business requirements. The number of levels deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control policies, the limit is five.  For more information about OUs, see Managing Organizational Units in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
    */
  def createOrganizationalUnit(params: CreateOrganizationalUnitRequest): awsDashSdkLib.libRequestMod.Request[CreateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOrganizationalUnit(
    params: CreateOrganizationalUnitRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOrganizationalUnitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual AWS account. For more information about policies and their use, see Managing Organization Policies. This operation can be called only from the organization's master account.
    */
  def createPolicy(): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual AWS account. For more information about policies and their use, see Managing Organization Policies. This operation can be called only from the organization's master account.
    */
  def createPolicy(params: CreatePolicyRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPolicy(
    params: CreatePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Declines a handshake request. This sets the handshake state to DECLINED and effectively deactivates the request. This operation can be called only from the account that received the handshake. The originator of the handshake can use CancelHandshake instead. The originator can't reactivate a declined request, but can re-initiate the process with a new handshake request. After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
    */
  def declineHandshake(): awsDashSdkLib.libRequestMod.Request[DeclineHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def declineHandshake(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeclineHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeclineHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Declines a handshake request. This sets the handshake state to DECLINED and effectively deactivates the request. This operation can be called only from the account that received the handshake. The originator of the handshake can use CancelHandshake instead. The originator can't reactivate a declined request, but can re-initiate the process with a new handshake request. After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
    */
  def declineHandshake(params: DeclineHandshakeRequest): awsDashSdkLib.libRequestMod.Request[DeclineHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def declineHandshake(
    params: DeclineHandshakeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeclineHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeclineHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the organization. You can delete an organization only by using credentials from the master account. The organization must be empty of member accounts.
    */
  def deleteOrganization(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOrganization(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs from the OU that you want to delete. This operation can be called only from the organization's master account.
    */
  def deleteOrganizationalUnit(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOrganizationalUnit(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs from the OU that you want to delete. This operation can be called only from the organization's master account.
    */
  def deleteOrganizationalUnit(params: DeleteOrganizationalUnitRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOrganizationalUnit(
    params: DeleteOrganizationalUnitRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the policy from all organizational units (OUs), roots, and accounts. This operation can be called only from the organization's master account.
    */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the policy from all organizational units (OUs), roots, and accounts. This operation can be called only from the organization's master account.
    */
  def deletePolicy(params: DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves Organizations-related information about the specified account. This operation can be called only from the organization's master account.
    */
  def describeAccount(): awsDashSdkLib.libRequestMod.Request[DescribeAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves Organizations-related information about the specified account. This operation can be called only from the organization's master account.
    */
  def describeAccount(params: DescribeAccountRequest): awsDashSdkLib.libRequestMod.Request[DescribeAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccount(
    params: DescribeAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current status of an asynchronous request to create an account. This operation can be called only from the organization's master account.
    */
  def describeCreateAccountStatus(): awsDashSdkLib.libRequestMod.Request[DescribeCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCreateAccountStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCreateAccountStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current status of an asynchronous request to create an account. This operation can be called only from the organization's master account.
    */
  def describeCreateAccountStatus(params: DescribeCreateAccountStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCreateAccountStatus(
    params: DescribeCreateAccountStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCreateAccountStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the original InviteAccountToOrganization operation that generated the handshake. You can access handshakes that are ACCEPTED, DECLINED, or CANCELED for only 30 days after they change to that state. They are then deleted and no longer accessible. This operation can be called from any account in the organization.
    */
  def describeHandshake(): awsDashSdkLib.libRequestMod.Request[DescribeHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHandshake(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the original InviteAccountToOrganization operation that generated the handshake. You can access handshakes that are ACCEPTED, DECLINED, or CANCELED for only 30 days after they change to that state. They are then deleted and no longer accessible. This operation can be called from any account in the organization.
    */
  def describeHandshake(params: DescribeHandshakeRequest): awsDashSdkLib.libRequestMod.Request[DescribeHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHandshake(
    params: DescribeHandshakeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHandshakeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the organization that the user's account belongs to. This operation can be called from any account in the organization.  Even if a policy type is shown as available in the organization, it can be disabled separately at the root level with DisablePolicyType. Use ListRoots to see the status of policy types for a specified root. 
    */
  def describeOrganization(): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about an organizational unit (OU). This operation can be called only from the organization's master account.
    */
  def describeOrganizationalUnit(): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrganizationalUnit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrganizationalUnitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about an organizational unit (OU). This operation can be called only from the organization's master account.
    */
  def describeOrganizationalUnit(params: DescribeOrganizationalUnitRequest): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrganizationalUnit(
    params: DescribeOrganizationalUnitRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrganizationalUnitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a policy. This operation can be called only from the organization's master account.
    */
  def describePolicy(): awsDashSdkLib.libRequestMod.Request[DescribePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a policy. This operation can be called only from the organization's master account.
    */
  def describePolicy(params: DescribePolicyRequest): awsDashSdkLib.libRequestMod.Request[DescribePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePolicy(
    params: DescribePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are immediate.  Note: Every root, OU, and account must have at least one SCP attached. If you want to replace the default FullAWSAccess policy with one that limits the permissions that can be delegated, then you must attach the replacement policy before you can remove the default one. This is the authorization strategy of whitelisting. If you instead attach a second SCP and leave the FullAWSAccess SCP still attached, and specify "Effect": "Deny" in the second SCP to override the "Effect": "Allow" in the FullAWSAccess policy (or any other attached SCP), then you are using the authorization strategy of blacklisting.  This operation can be called only from the organization's master account.
    */
  def detachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are immediate.  Note: Every root, OU, and account must have at least one SCP attached. If you want to replace the default FullAWSAccess policy with one that limits the permissions that can be delegated, then you must attach the replacement policy before you can remove the default one. This is the authorization strategy of whitelisting. If you instead attach a second SCP and leave the FullAWSAccess SCP still attached, and specify "Effect": "Deny" in the second SCP to override the "Effect": "Allow" in the FullAWSAccess policy (or any other attached SCP), then you are using the authorization strategy of blacklisting.  This operation can be called only from the organization's master account.
    */
  def detachPolicy(params: DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachPolicy(
    params: DetachPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in new accounts in your organization. This means the service can't perform operations on your behalf on any new accounts in your organization. The service can still perform operations in older accounts until the service completes its clean-up from AWS Organizations.   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the other service is aware that it can clean up any resources that are required only for the integration. How the service cleans up its resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies that are attached to your roles.  For more information about integrating other services with AWS Organizations, including the list of services that work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
    */
  def disableAWSServiceAccess(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAWSServiceAccess(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in new accounts in your organization. This means the service can't perform operations on your behalf on any new accounts in your organization. The service can still perform operations in older accounts until the service completes its clean-up from AWS Organizations.   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the other service is aware that it can clean up any resources that are required only for the integration. How the service cleans up its resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies that are attached to your roles.  For more information about integrating other services with AWS Organizations, including the list of services that work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
    */
  def disableAWSServiceAccess(params: DisableAWSServiceAccessRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAWSServiceAccess(
    params: DisableAWSServiceAccessRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables an organizational control policy type in a root. A policy of a certain type can be attached to entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can attach policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can undo this by using the EnablePolicyType operation. This operation can be called only from the organization's master account.  If you disable a policy type for a root, it still shows as enabled for the organization if all features are enabled in that organization. Use ListRoots to see the status of policy types for a specified root. Use DescribeOrganization to see the status of policy types in the organization. 
    */
  def disablePolicyType(): awsDashSdkLib.libRequestMod.Request[DisablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disablePolicyType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisablePolicyTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables an organizational control policy type in a root. A policy of a certain type can be attached to entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can attach policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can undo this by using the EnablePolicyType operation. This operation can be called only from the organization's master account.  If you disable a policy type for a root, it still shows as enabled for the organization if all features are enabled in that organization. Use ListRoots to see the status of policy types for a specified root. Use DescribeOrganization to see the status of policy types in the organization. 
    */
  def disablePolicyType(params: DisablePolicyTypeRequest): awsDashSdkLib.libRequestMod.Request[DisablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disablePolicyType(
    params: DisablePolicyTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisablePolicyTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you enable integration, you allow the specified service to create a service-linked role in all the accounts in your organization. This allows the service to perform operations on your behalf in your organization and its accounts.  We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  For more information about enabling services to integrate with AWS Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account and only if the organization has enabled all features.
    */
  def enableAWSServiceAccess(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAWSServiceAccess(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you enable integration, you allow the specified service to create a service-linked role in all the accounts in your organization. This allows the service to perform operations on your behalf in your organization and its accounts.  We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  For more information about enabling services to integrate with AWS Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account and only if the organization has enabled all features.
    */
  def enableAWSServiceAccess(params: EnableAWSServiceAccessRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAWSServiceAccess(
    params: EnableAWSServiceAccessRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables all features in an organization. This enables the use of organization policies that can restrict the services and actions that can be called in each account. Until you enable all features, you have access only to consolidated billing, and you can't use any of the advanced account administration features that AWS Organizations supports. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.  This operation is required only for organizations that were created explicitly with only the consolidated billing features enabled. Calling this operation sends a handshake to every invited account in the organization. The feature set change can be finalized and the additional features enabled only after all administrators in the invited accounts approve the change by accepting the handshake.  After you enable all features, you can separately enable or disable individual policy types in a root using EnablePolicyType and DisablePolicyType. To see the status of policy types in a root, use ListRoots. After all invited member accounts accept the handshake, you finalize the feature set change by accepting the handshake that contains "Action": "ENABLE_ALL_FEATURES". This completes the change. After you enable all features in your organization, the master account in the organization can apply policies on all member accounts. These policies can restrict what users and even administrators in those accounts can do. The master account can apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are aware of this. This operation can be called only from the organization's master account. 
    */
  def enableAllFeatures(): awsDashSdkLib.libRequestMod.Request[EnableAllFeaturesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAllFeatures(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableAllFeaturesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableAllFeaturesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables all features in an organization. This enables the use of organization policies that can restrict the services and actions that can be called in each account. Until you enable all features, you have access only to consolidated billing, and you can't use any of the advanced account administration features that AWS Organizations supports. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.  This operation is required only for organizations that were created explicitly with only the consolidated billing features enabled. Calling this operation sends a handshake to every invited account in the organization. The feature set change can be finalized and the additional features enabled only after all administrators in the invited accounts approve the change by accepting the handshake.  After you enable all features, you can separately enable or disable individual policy types in a root using EnablePolicyType and DisablePolicyType. To see the status of policy types in a root, use ListRoots. After all invited member accounts accept the handshake, you finalize the feature set change by accepting the handshake that contains "Action": "ENABLE_ALL_FEATURES". This completes the change. After you enable all features in your organization, the master account in the organization can apply policies on all member accounts. These policies can restrict what users and even administrators in those accounts can do. The master account can apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are aware of this. This operation can be called only from the organization's master account. 
    */
  def enableAllFeatures(params: EnableAllFeaturesRequest): awsDashSdkLib.libRequestMod.Request[EnableAllFeaturesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAllFeatures(
    params: EnableAllFeaturesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableAllFeaturesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableAllFeaturesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type to the root, any organizational unit (OU), or account in that root. You can undo this by using the DisablePolicyType operation. This operation can be called only from the organization's master account. You can enable a policy type in a root only if that policy type is available in the organization. Use DescribeOrganization to view the status of available policy types in the organization. To view the status of policy type in a root, use ListRoots.
    */
  def enablePolicyType(): awsDashSdkLib.libRequestMod.Request[EnablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enablePolicyType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnablePolicyTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type to the root, any organizational unit (OU), or account in that root. You can undo this by using the DisablePolicyType operation. This operation can be called only from the organization's master account. You can enable a policy type in a root only if that policy type is available in the organization. Use DescribeOrganization to view the status of available policy types in the organization. To view the status of policy type in a root, use ListRoots.
    */
  def enablePolicyType(params: EnablePolicyTypeRequest): awsDashSdkLib.libRequestMod.Request[EnablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enablePolicyType(
    params: EnablePolicyTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnablePolicyTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends an invitation to another account to join your organization as a member account. Organizations sends email on your behalf to the email address that is associated with the other account's owner. The invitation is implemented as a Handshake whose details are in the response.    You can invite AWS accounts only from the same seller as the master account. For example, if your organization's master account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India, then you can only invite other AISPL accounts to your organization. You can't combine accounts from AISPL and AWS, or any other AWS seller. For more information, see Consolidated Billing in India.   If you receive an exception that indicates that you exceeded your account limits for the organization or that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists after an hour, then contact AWS Customer Support.    This operation can be called only from the organization's master account.
    */
  def inviteAccountToOrganization(): awsDashSdkLib.libRequestMod.Request[InviteAccountToOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteAccountToOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteAccountToOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteAccountToOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends an invitation to another account to join your organization as a member account. Organizations sends email on your behalf to the email address that is associated with the other account's owner. The invitation is implemented as a Handshake whose details are in the response.    You can invite AWS accounts only from the same seller as the master account. For example, if your organization's master account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India, then you can only invite other AISPL accounts to your organization. You can't combine accounts from AISPL and AWS, or any other AWS seller. For more information, see Consolidated Billing in India.   If you receive an exception that indicates that you exceeded your account limits for the organization or that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists after an hour, then contact AWS Customer Support.    This operation can be called only from the organization's master account.
    */
  def inviteAccountToOrganization(params: InviteAccountToOrganizationRequest): awsDashSdkLib.libRequestMod.Request[InviteAccountToOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteAccountToOrganization(
    params: InviteAccountToOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteAccountToOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteAccountToOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a member account from its parent organization. This version of the operation is performed by the account that wants to leave. To remove a member account as a user in the master account, use RemoveAccountFromOrganization instead. This operation can be called only from a member account in the organization.    The master account in an organization with all features enabled can set service control policies (SCPs) that can restrict what administrators of member accounts can do, including preventing them from successfully calling LeaveOrganization and leaving the organization.    You can leave an organization as a member account only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For each account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. Follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide.   You can leave an organization only after you enable IAM user access to billing in your account. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide.   
    */
  def leaveOrganization(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def leaveOrganization(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this list creates the resources that it requires for the integration, it can perform operations on your organization and its accounts. For more information about integrating other services with AWS Organizations, including the list of services that currently work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
    */
  def listAWSServiceAccessForOrganization(): awsDashSdkLib.libRequestMod.Request[ListAWSServiceAccessForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAWSServiceAccessForOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAWSServiceAccessForOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAWSServiceAccessForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this list creates the resources that it requires for the integration, it can perform operations on your organization and its accounts. For more information about integrating other services with AWS Organizations, including the list of services that currently work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
    */
  def listAWSServiceAccessForOrganization(params: ListAWSServiceAccessForOrganizationRequest): awsDashSdkLib.libRequestMod.Request[ListAWSServiceAccessForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAWSServiceAccessForOrganization(
    params: ListAWSServiceAccessForOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAWSServiceAccessForOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAWSServiceAccessForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational unit (OU), use the ListAccountsForParent operation instead.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listAccounts(): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational unit (OU), use the ListAccountsForParent operation instead.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listAccounts(params: ListAccountsRequest): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccounts(
    params: ListAccountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the accounts in an organization that are contained by the specified target root or organizational unit (OU). If you specify the root, you get a list of all the accounts that are not in any OU. If you specify an OU, you get a list of all the accounts in only that OU, and not in any child OUs. To get a list of all accounts in the organization, use the ListAccounts operation.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listAccountsForParent(): awsDashSdkLib.libRequestMod.Request[ListAccountsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccountsForParent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAccountsForParentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAccountsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the accounts in an organization that are contained by the specified target root or organizational unit (OU). If you specify the root, you get a list of all the accounts that are not in any OU. If you specify an OU, you get a list of all the accounts in only that OU, and not in any child OUs. To get a list of all accounts in the organization, use the ListAccounts operation.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listAccountsForParent(params: ListAccountsForParentRequest): awsDashSdkLib.libRequestMod.Request[ListAccountsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccountsForParent(
    params: ListAccountsForParentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAccountsForParentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAccountsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root. This operation, along with ListParents enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listChildren(): awsDashSdkLib.libRequestMod.Request[ListChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listChildren(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListChildrenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root. This operation, along with ListParents enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listChildren(params: ListChildrenRequest): awsDashSdkLib.libRequestMod.Request[ListChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listChildren(
    params: ListChildrenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListChildrenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the account creation requests that match the specified status that is currently being tracked for the organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listCreateAccountStatus(): awsDashSdkLib.libRequestMod.Request[ListCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCreateAccountStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCreateAccountStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the account creation requests that match the specified status that is currently being tracked for the organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listCreateAccountStatus(params: ListCreateAccountStatusRequest): awsDashSdkLib.libRequestMod.Request[ListCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCreateAccountStatus(
    params: ListCreateAccountStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCreateAccountStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCreateAccountStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the current handshakes that are associated with the account of the requesting user. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called from any account in the organization.
    */
  def listHandshakesForAccount(): awsDashSdkLib.libRequestMod.Request[ListHandshakesForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHandshakesForAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHandshakesForAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHandshakesForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the current handshakes that are associated with the account of the requesting user. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called from any account in the organization.
    */
  def listHandshakesForAccount(params: ListHandshakesForAccountRequest): awsDashSdkLib.libRequestMod.Request[ListHandshakesForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHandshakesForAccount(
    params: ListHandshakesForAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHandshakesForAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHandshakesForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the handshakes that are associated with the organization that the requesting user is part of. The ListHandshakesForOrganization operation returns a list of handshake structures. Each structure contains details and status about a handshake. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listHandshakesForOrganization(): awsDashSdkLib.libRequestMod.Request[ListHandshakesForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHandshakesForOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHandshakesForOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHandshakesForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the handshakes that are associated with the organization that the requesting user is part of. The ListHandshakesForOrganization operation returns a list of handshake structures. Each structure contains details and status about a handshake. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listHandshakesForOrganization(params: ListHandshakesForOrganizationRequest): awsDashSdkLib.libRequestMod.Request[ListHandshakesForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHandshakesForOrganization(
    params: ListHandshakesForOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHandshakesForOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHandshakesForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the organizational units (OUs) in a parent organizational unit or root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listOrganizationalUnitsForParent(): awsDashSdkLib.libRequestMod.Request[ListOrganizationalUnitsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOrganizationalUnitsForParent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOrganizationalUnitsForParentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOrganizationalUnitsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the organizational units (OUs) in a parent organizational unit or root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listOrganizationalUnitsForParent(params: ListOrganizationalUnitsForParentRequest): awsDashSdkLib.libRequestMod.Request[ListOrganizationalUnitsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOrganizationalUnitsForParent(
    params: ListOrganizationalUnitsForParentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOrganizationalUnitsForParentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOrganizationalUnitsForParentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or account. This operation, along with ListChildren enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  In the current release, a child can have only a single parent.  
    */
  def listParents(): awsDashSdkLib.libRequestMod.Request[ListParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listParents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListParentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or account. This operation, along with ListChildren enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  In the current release, a child can have only a single parent.  
    */
  def listParents(params: ListParentsRequest): awsDashSdkLib.libRequestMod.Request[ListParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listParents(
    params: ListParentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListParentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the list of all policies in an organization of a specified type.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listPolicies(): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the list of all policies in an organization of a specified type.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listPolicies(params: ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPolicies(
    params: ListPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account. You must specify the policy type that you want included in the returned list.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listPoliciesForTarget(): awsDashSdkLib.libRequestMod.Request[ListPoliciesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPoliciesForTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPoliciesForTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPoliciesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account. You must specify the policy type that you want included in the returned list.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listPoliciesForTarget(params: ListPoliciesForTargetRequest): awsDashSdkLib.libRequestMod.Request[ListPoliciesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPoliciesForTarget(
    params: ListPoliciesForTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPoliciesForTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPoliciesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the roots that are defined in the current organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  Policy types can be enabled and disabled in roots. This is distinct from whether they are available in the organization. When you enable all features, you make policy types available for use in that organization. Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in an organization, use DescribeOrganization. 
    */
  def listRoots(): awsDashSdkLib.libRequestMod.Request[ListRootsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRoots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRootsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRootsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the roots that are defined in the current organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  Policy types can be enabled and disabled in roots. This is distinct from whether they are available in the organization. When you enable all features, you make policy types available for use in that organization. Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in an organization, use DescribeOrganization. 
    */
  def listRoots(params: ListRootsRequest): awsDashSdkLib.libRequestMod.Request[ListRootsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRoots(
    params: ListRootsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRootsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRootsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the roots, organizaitonal units (OUs), and accounts to which the specified policy is attached.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listTargetsForPolicy(): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTargetsForPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTargetsForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the roots, organizaitonal units (OUs), and accounts to which the specified policy is attached.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
    */
  def listTargetsForPolicy(params: ListTargetsForPolicyRequest): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTargetsForPolicy(
    params: ListTargetsForPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTargetsForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves an account from its current source parent root or organizational unit (OU) to the specified destination parent root or OU. This operation can be called only from the organization's master account.
    */
  def moveAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def moveAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves an account from its current source parent root or organizational unit (OU) to the specified destination parent root or OU. This operation can be called only from the organization's master account.
    */
  def moveAccount(params: MoveAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def moveAccount(
    params: MoveAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified account from the organization. The removed account becomes a stand-alone account that is not a member of any organization. It is no longer subject to any policies and is responsible for its own bill payments. The organization's master account is no longer charged for any expenses accrued by the member account after it is removed from the organization. This operation can be called only from the organization's master account. Member accounts can remove themselves with LeaveOrganization instead.  You can remove an account from your organization only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For an account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. To remove an account that does not yet have this information, you must sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide. 
    */
  def removeAccountFromOrganization(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeAccountFromOrganization(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified account from the organization. The removed account becomes a stand-alone account that is not a member of any organization. It is no longer subject to any policies and is responsible for its own bill payments. The organization's master account is no longer charged for any expenses accrued by the member account after it is removed from the organization. This operation can be called only from the organization's master account. Member accounts can remove themselves with LeaveOrganization instead.  You can remove an account from your organization only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For an account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. To remove an account that does not yet have this information, you must sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide. 
    */
  def removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeAccountFromOrganization(
    params: RemoveAccountFromOrganizationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain in place, and any attached policies of the OU remain attached.  This operation can be called only from the organization's master account.
    */
  def updateOrganizationalUnit(): awsDashSdkLib.libRequestMod.Request[UpdateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateOrganizationalUnit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateOrganizationalUnitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain in place, and any attached policies of the OU remain attached.  This operation can be called only from the organization's master account.
    */
  def updateOrganizationalUnit(params: UpdateOrganizationalUnitRequest): awsDashSdkLib.libRequestMod.Request[UpdateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateOrganizationalUnit(
    params: UpdateOrganizationalUnitRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateOrganizationalUnitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing policy with a new name, description, or content. If any parameter is not supplied, that value remains unchanged. Note that you cannot change a policy's type. This operation can be called only from the organization's master account.
    */
  def updatePolicy(): awsDashSdkLib.libRequestMod.Request[UpdatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing policy with a new name, description, or content. If any parameter is not supplied, that value remains unchanged. Note that you cannot change a policy's type. This operation can be called only from the organization's master account.
    */
  def updatePolicy(params: UpdatePolicyRequest): awsDashSdkLib.libRequestMod.Request[UpdatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePolicy(
    params: UpdatePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

