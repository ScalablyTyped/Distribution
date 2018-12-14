package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/organizations", "Organizations")
@js.native
object OrganizationsNs extends js.Object {
  
  trait AcceptHandshakeRequest extends js.Object {
    /**
         * The unique identifier (ID) of the handshake that you want to accept. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var HandshakeId: HandshakeId
  }
  
  
  trait AcceptHandshakeResponse extends js.Object {
    /**
         * A structure that contains details about the accepted handshake.
         */
    var Handshake: js.UndefOr[Handshake] = js.undefined
  }
  
  
  trait Account extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the account. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[AccountArn] = js.undefined
    /**
         * The email address associated with the AWS account. The regex pattern for this parameter is a string of characters that represents a standard Internet email address.
         */
    var Email: js.UndefOr[Email] = js.undefined
    /**
         * The unique identifier (ID) of the account. The regex pattern for an account ID string requires exactly 12 digits.
         */
    var Id: js.UndefOr[AccountId] = js.undefined
    /**
         * The method by which the account joined the organization.
         */
    var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined
    /**
         * The date the account became a part of the organization.
         */
    var JoinedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The friendly name of the account. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[AccountName] = js.undefined
    /**
         * The status of the account in the organization.
         */
    var Status: js.UndefOr[AccountStatus] = js.undefined
  }
  
  
  trait AttachPolicyRequest extends js.Object {
    /**
         * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy by calling the ListPolicies operation. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var PolicyId: PolicyId
    /**
         * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID by calling the ListRoots, ListOrganizationalUnitsForParent, or ListAccounts operations. The regex pattern for a target ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var TargetId: PolicyTargetId
  }
  
  
  trait CancelHandshakeRequest extends js.Object {
    /**
         * The unique identifier (ID) of the handshake that you want to cancel. You can get the ID from the ListHandshakesForOrganization operation. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var HandshakeId: HandshakeId
  }
  
  
  trait CancelHandshakeResponse extends js.Object {
    /**
         * A structure that contains details about the handshake that you canceled.
         */
    var Handshake: js.UndefOr[Handshake] = js.undefined
  }
  
  
  trait Child extends js.Object {
    /**
         * The unique identifier (ID) of this child entity. The regex pattern for a child ID string requires one of the following:   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var Id: js.UndefOr[ChildId] = js.undefined
    /**
         * The type of this child entity.
         */
    var Type: js.UndefOr[ChildType] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateAccountRequest extends js.Object {
    /**
         * The friendly name of the member account.
         */
    var AccountName: AccountName
    /**
         * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account. You must use a valid email address to complete account creation. You can't access the root user of the account or remove an account that was created with an invalid email address.
         */
    var Email: Email
    /**
         * If set to ALLOW, the new account enables IAM users to access account billing information if they have the required permissions. If set to DENY, only the root user of the new account can access account billing information. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide. If you don't specify this parameter, the value defaults to ALLOW, and IAM users and roles with the required permissions can access billing information for the new account.
         */
    var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.undefined
    /**
         * (Optional) The name of an IAM role that AWS Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. If you don't specify this parameter, the role name defaults to OrganizationAccountAccessRole. For more information about how to use this role to access the member account, see Accessing and Administering the Member Accounts in Your Organization in the AWS Organizations User Guide, and steps 2 and 3 in Tutorial: Delegate Access Across AWS Accounts Using IAM Roles in the IAM User Guide. The regex pattern that is used to validate this parameter is a string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces, and any of the following characters: =,.@-
         */
    var RoleName: js.UndefOr[RoleName] = js.undefined
  }
  
  
  trait CreateAccountResponse extends js.Object {
    /**
         * A structure that contains details about the request to create an account. This response structure might not be fully populated when you first receive it because account creation is an asynchronous process. You can pass the returned CreateAccountStatus ID as a parameter to DescribeCreateAccountStatus to get status about the progress of the request at later times. You can also check the AWS CloudTrail log for the CreateAccountResult event. For more information, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.
         */
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
  }
  
  
  trait CreateAccountStatus extends js.Object {
    /**
         * If the account was created successfully, the unique identifier (ID) of the new account. The regex pattern for an account ID string requires exactly 12 digits.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The account name given to the account when it was created.
         */
    var AccountName: js.UndefOr[AccountName] = js.undefined
    /**
         * The date and time that the account was created and the request completed.
         */
    var CompletedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * If the request failed, a description of the reason for the failure.   ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of accounts in your organization.   EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address already exists.   INVALID_ADDRESS: The account could not be created because the address you provided is not valid.   INVALID_EMAIL: The account could not be created because the email address you provided is not valid.   INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the problem persists, contact Customer Support.  
         */
    var FailureReason: js.UndefOr[CreateAccountFailureReason] = js.undefined
    /**
         * The unique identifier (ID) that references this request. You get this value from the response of the initial CreateAccount request to create the account. The regex pattern for an create account request ID string requires "car-" followed by from 8 to 32 lower-case letters or digits.
         */
    var Id: js.UndefOr[CreateAccountRequestId] = js.undefined
    /**
         * The date and time that the request was made for the account creation.
         */
    var RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The status of the request.
         */
    var State: js.UndefOr[CreateAccountState] = js.undefined
  }
  
  
  trait CreateOrganizationRequest extends js.Object {
    /**
         * Specifies the feature set supported by the new organization. Each feature set supports different levels of functionality.    CONSOLIDATED_BILLING: All member accounts have their bills consolidated to and paid by the master account. For more information, see Consolidated billing in the AWS Organizations User Guide.    ALL: In addition to all the features supported by the consolidated billing feature set, the master account can also apply any type of policy to any member account in the organization. For more information, see All features in the AWS Organizations User Guide.  
         */
    var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
  }
  
  
  trait CreateOrganizationResponse extends js.Object {
    /**
         * A structure that contains details about the newly created organization.
         */
    var Organization: js.UndefOr[Organization] = js.undefined
  }
  
  
  trait CreateOrganizationalUnitRequest extends js.Object {
    /**
         * The friendly name to assign to the new OU.
         */
    var Name: OrganizationalUnitName
    /**
         * The unique identifier (ID) of the parent root or OU in which you want to create the new OU. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var ParentId: ParentId
  }
  
  
  trait CreateOrganizationalUnitResponse extends js.Object {
    /**
         * A structure that contains details about the newly created OU.
         */
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
  }
  
  
  trait CreatePolicyRequest extends js.Object {
    /**
         * The policy content to add to the new policy. For example, if you create a service control policy (SCP), this string must be JSON text that specifies the permissions that admins in attached accounts can delegate to their users, groups, and roles. For more information about the SCP syntax, see Service Control Policy Syntax in the AWS Organizations User Guide.
         */
    var Content: PolicyContent
    /**
         * An optional description to assign to the policy.
         */
    var Description: PolicyDescription
    /**
         * The friendly name to assign to the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: PolicyName
    /**
         * The type of policy to create.  In the current release, the only type of policy that you can create is a service control policy (SCP). 
         */
    var Type: PolicyType
  }
  
  
  trait CreatePolicyResponse extends js.Object {
    /**
         * A structure that contains details about the newly created policy.
         */
    var Policy: js.UndefOr[Policy] = js.undefined
  }
  
  
  trait DeclineHandshakeRequest extends js.Object {
    /**
         * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the ListHandshakesForAccount operation. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var HandshakeId: HandshakeId
  }
  
  
  trait DeclineHandshakeResponse extends js.Object {
    /**
         * A structure that contains details about the declined handshake. The state is updated to show the value DECLINED.
         */
    var Handshake: js.UndefOr[Handshake] = js.undefined
  }
  
  
  trait DeleteOrganizationalUnitRequest extends js.Object {
    /**
         * The unique identifier (ID) of the organizational unit that you want to delete. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
         */
    var OrganizationalUnitId: OrganizationalUnitId
  }
  
  
  trait DeletePolicyRequest extends js.Object {
    /**
         * The unique identifier (ID) of the policy that you want to delete. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var PolicyId: PolicyId
  }
  
  
  trait DescribeAccountRequest extends js.Object {
    /**
         * The unique identifier (ID) of the AWS account that you want information about. You can get the ID from the ListAccounts or ListAccountsForParent operations. The regex pattern for an account ID string requires exactly 12 digits.
         */
    var AccountId: AccountId
  }
  
  
  trait DescribeAccountResponse extends js.Object {
    /**
         * A structure that contains information about the requested account.
         */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  
  trait DescribeCreateAccountStatusRequest extends js.Object {
    /**
         * Specifies the operationId that uniquely identifies the request. You can get the ID from the response to an earlier CreateAccount request, or from the ListCreateAccountStatus operation. The regex pattern for an create account request ID string requires "car-" followed by from 8 to 32 lower-case letters or digits.
         */
    var CreateAccountRequestId: CreateAccountRequestId
  }
  
  
  trait DescribeCreateAccountStatusResponse extends js.Object {
    /**
         * A structure that contains the current status of an account creation request.
         */
    var CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
  }
  
  
  trait DescribeHandshakeRequest extends js.Object {
    /**
         * The unique identifier (ID) of the handshake that you want information about. You can get the ID from the original call to InviteAccountToOrganization, or from a call to ListHandshakesForAccount or ListHandshakesForOrganization. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var HandshakeId: HandshakeId
  }
  
  
  trait DescribeHandshakeResponse extends js.Object {
    /**
         * A structure that contains information about the specified handshake.
         */
    var Handshake: js.UndefOr[Handshake] = js.undefined
  }
  
  
  trait DescribeOrganizationResponse extends js.Object {
    /**
         * A structure that contains information about the organization.
         */
    var Organization: js.UndefOr[Organization] = js.undefined
  }
  
  
  trait DescribeOrganizationalUnitRequest extends js.Object {
    /**
         * The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
         */
    var OrganizationalUnitId: OrganizationalUnitId
  }
  
  
  trait DescribeOrganizationalUnitResponse extends js.Object {
    /**
         * A structure that contains details about the specified OU.
         */
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
  }
  
  
  trait DescribePolicyRequest extends js.Object {
    /**
         * The unique identifier (ID) of the policy that you want details about. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var PolicyId: PolicyId
  }
  
  
  trait DescribePolicyResponse extends js.Object {
    /**
         * A structure that contains details about the specified policy.
         */
    var Policy: js.UndefOr[Policy] = js.undefined
  }
  
  
  trait DetachPolicyRequest extends js.Object {
    /**
         * The unique identifier (ID) of the policy you want to detach. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var PolicyId: PolicyId
    /**
         * The unique identifier (ID) of the root, OU, or account from which you want to detach the policy. You can get the ID from the ListRoots, ListOrganizationalUnitsForParent, or ListAccounts operations. The regex pattern for a target ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var TargetId: PolicyTargetId
  }
  
  
  trait DisableAWSServiceAccessRequest extends js.Object {
    /**
         * The service principal name of the AWS service for which you want to disable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
         */
    var ServicePrincipal: ServicePrincipal
  }
  
  
  trait DisablePolicyTypeRequest extends js.Object {
    /**
         * The policy type that you want to disable in this root.
         */
    var PolicyType: PolicyType
    /**
         * The unique identifier (ID) of the root in which you want to disable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lower-case letters or digits.
         */
    var RootId: RootId
  }
  
  
  trait DisablePolicyTypeResponse extends js.Object {
    /**
         * A structure that shows the root with the updated list of enabled policy types.
         */
    var Root: js.UndefOr[Root] = js.undefined
  }
  
  
  trait EnableAWSServiceAccessRequest extends js.Object {
    /**
         * The service principal name of the AWS service for which you want to enable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
         */
    var ServicePrincipal: ServicePrincipal
  }
  
  
  trait EnableAllFeaturesRequest extends js.Object
  
  
  trait EnableAllFeaturesResponse extends js.Object {
    /**
         * A structure that contains details about the handshake created to support this request to enable all features in the organization.
         */
    var Handshake: js.UndefOr[Handshake] = js.undefined
  }
  
  
  trait EnablePolicyTypeRequest extends js.Object {
    /**
         * The policy type that you want to enable.
         */
    var PolicyType: PolicyType
    /**
         * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lower-case letters or digits.
         */
    var RootId: RootId
  }
  
  
  trait EnablePolicyTypeResponse extends js.Object {
    /**
         * A structure that shows the root with the updated list of enabled policy types.
         */
    var Root: js.UndefOr[Root] = js.undefined
  }
  
  
  trait EnabledServicePrincipal extends js.Object {
    /**
         * The date that the service principal was enabled for integration with AWS Organizations.
         */
    var DateEnabled: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
         */
    var ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
  }
  
  
  trait Handshake extends js.Object {
    /**
         * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following handshake types are supported:    INVITE: This type of handshake represents a request to join an organization. It is always sent from the master account to only non-member accounts.    ENABLE_ALL_FEATURES: This type of handshake represents a request to enable all features in an organization. It is always sent from the master account to only invited member accounts. Created accounts do not receive this because those accounts were created by the organization's master account and approval is inferred.    APPROVE_ALL_FEATURES: This type of handshake is sent from the Organizations service when all member accounts have approved the ENABLE_ALL_FEATURES invitation. It is sent only to the master account and signals the master that it can finalize the process to enable all features.  
         */
    var Action: js.UndefOr[ActionType] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of a handshake. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[HandshakeArn] = js.undefined
    /**
         * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before the specified date and time, the handshake becomes inactive and is no longer valid.
         */
    var ExpirationTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the handshake. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var Id: js.UndefOr[HandshakeId] = js.undefined
    /**
         * Information about the two accounts that are participating in the handshake.
         */
    var Parties: js.UndefOr[HandshakeParties] = js.undefined
    /**
         * The date and time that the handshake request was made.
         */
    var RequestedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * Additional information that is needed to process the handshake.
         */
    var Resources: js.UndefOr[HandshakeResources] = js.undefined
    /**
         * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its creation to its acceptance. The meaning of each of the valid values is as follows:    REQUESTED: This handshake was sent to multiple recipients (applicable to only some handshake types) and not all recipients have responded yet. The request stays in this state until all recipients respond.    OPEN: This handshake was sent to multiple recipients (applicable to only some policy types) and all recipients have responded, allowing the originator to complete the handshake action.    CANCELED: This handshake is no longer active because it was canceled by the originating account.    ACCEPTED: This handshake is complete because it has been accepted by the recipient.    DECLINED: This handshake is no longer active because it was declined by the recipient account.    EXPIRED: This handshake is no longer active because the originator did not receive a response of any kind from the recipient before the expiration time (15 days).  
         */
    var State: js.UndefOr[HandshakeState] = js.undefined
  }
  
  
  trait HandshakeFilter extends js.Object {
    /**
         * Specifies the type of handshake action. If you specify ActionType, you cannot also specify ParentHandshakeId.
         */
    var ActionType: js.UndefOr[ActionType] = js.undefined
    /**
         * Specifies the parent handshake. Only used for handshake types that are a child of another type. If you specify ParentHandshakeId, you cannot also specify ActionType. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var ParentHandshakeId: js.UndefOr[HandshakeId] = js.undefined
  }
  
  
  trait HandshakeParty extends js.Object {
    /**
         * The unique identifier (ID) for the party. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
         */
    var Id: HandshakePartyId
    /**
         * The type of party.
         */
    var Type: HandshakePartyType
  }
  
  
  trait HandshakeResource extends js.Object {
    /**
         * When needed, contains an additional array of HandshakeResource objects.
         */
    var Resources: js.UndefOr[HandshakeResources] = js.undefined
    /**
         * The type of information being passed, specifying how the value is to be interpreted by the other party:    ACCOUNT - Specifies an AWS account ID number.    ORGANIZATION - Specifies an organization ID number.    EMAIL - Specifies the email address that is associated with the account that receives the handshake.     OWNER_EMAIL - Specifies the email address associated with the master account. Included as information about an organization.     OWNER_NAME - Specifies the name associated with the master account. Included as information about an organization.     NOTES - Additional text provided by the handshake initiator and intended for the recipient to read.  
         */
    var Type: js.UndefOr[HandshakeResourceType] = js.undefined
    /**
         * The information that is passed to the other party in the handshake. The format of the value string must match the requirements of the specified type.
         */
    var Value: js.UndefOr[HandshakeResourceValue] = js.undefined
  }
  
  
  trait InviteAccountToOrganizationRequest extends js.Object {
    /**
         * Additional information that you want to include in the generated email to the recipient account owner.
         */
    var Notes: js.UndefOr[HandshakeNotes] = js.undefined
    /**
         * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object that contains the following elements:   { "Type": "ACCOUNT", "Id": "&lt; account id number &gt;" }  If you use the AWS CLI, you can submit this as a single string, similar to the following example:  --target Id=123456789012,Type=ACCOUNT  If you specify "Type": "ACCOUNT", then you must provide the AWS account ID number as the Id. If you specify "Type": "EMAIL", then you must specify the email address that is associated with the account.  --target Id=diego@example.com,Type=EMAIL 
         */
    var Target: HandshakeParty
  }
  
  
  trait InviteAccountToOrganizationResponse extends js.Object {
    /**
         * A structure that contains details about the handshake that is created to support this invitation request.
         */
    var Handshake: js.UndefOr[Handshake] = js.undefined
  }
  
  
  trait ListAWSServiceAccessForOrganizationRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
    /**
         * A list of the service principals for the services that are enabled to integrate with your organization. Each principal is a structure that includes the name and the date that it was enabled for integration with AWS Organizations.
         */
    var EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListAccountsForParentRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The unique identifier (ID) for the parent root or organization unit (OU) whose accounts you want to list.
         */
    var ParentId: ParentId
  }
  
  
  trait ListAccountsForParentResponse extends js.Object {
    /**
         * A list of the accounts in the specified root or OU.
         */
    var Accounts: js.UndefOr[Accounts] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListAccountsRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListAccountsResponse extends js.Object {
    /**
         * A list of objects in the organization.
         */
    var Accounts: js.UndefOr[Accounts] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListChildrenRequest extends js.Object {
    /**
         * Filters the output to include only the specified child type.
         */
    var ChildType: ChildType
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The unique identifier (ID) for the parent root or OU whose children you want to list. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var ParentId: ParentId
  }
  
  
  trait ListChildrenResponse extends js.Object {
    /**
         * The list of children of the specified parent container.
         */
    var Children: js.UndefOr[Children] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListCreateAccountStatusRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of one or more states that you want included in the response. If this parameter is not present, then all requests are included in the response.
         */
    var States: js.UndefOr[CreateAccountStates] = js.undefined
  }
  
  
  trait ListCreateAccountStatusResponse extends js.Object {
    /**
         * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
         */
    var CreateAccountStatuses: js.UndefOr[CreateAccountStatuses] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListHandshakesForAccountRequest extends js.Object {
    /**
         * Filters the handshakes that you want included in the response. The default is all types. Use the ActionType element to limit the output to only a specified type, such as INVITE, ENABLE-FULL-CONTROL, or APPROVE-FULL-CONTROL. Alternatively, for the ENABLE-FULL-CONTROL handshake that generates a separate child handshake for each member account, you can specify ParentHandshakeId to see only the handshakes that were generated by that parent request.
         */
    var Filter: js.UndefOr[HandshakeFilter] = js.undefined
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListHandshakesForAccountResponse extends js.Object {
    /**
         * A list of Handshake objects with details about each of the handshakes that is associated with the specified account.
         */
    var Handshakes: js.UndefOr[Handshakes] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListHandshakesForOrganizationRequest extends js.Object {
    /**
         * A filter of the handshakes that you want included in the response. The default is all types. Use the ActionType element to limit the output to only a specified type, such as INVITE, ENABLE-ALL-FEATURES, or APPROVE-ALL-FEATURES. Alternatively, for the ENABLE-ALL-FEATURES handshake that generates a separate child handshake for each member account, you can specify the ParentHandshakeId to see only the handshakes that were generated by that parent request.
         */
    var Filter: js.UndefOr[HandshakeFilter] = js.undefined
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListHandshakesForOrganizationResponse extends js.Object {
    /**
         * A list of Handshake objects with details about each of the handshakes that are associated with an organization.
         */
    var Handshakes: js.UndefOr[Handshakes] = js.undefined
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListOrganizationalUnitsForParentRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The unique identifier (ID) of the root or OU whose child OUs you want to list. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var ParentId: ParentId
  }
  
  
  trait ListOrganizationalUnitsForParentResponse extends js.Object {
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of the OUs in the specified root or parent OU.
         */
    var OrganizationalUnits: js.UndefOr[OrganizationalUnits] = js.undefined
  }
  
  
  trait ListParentsRequest extends js.Object {
    /**
         * The unique identifier (ID) of the OU or account whose parent containers you want to list. Do not specify a root. The regex pattern for a child ID string requires one of the following:   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var ChildId: ChildId
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListParentsResponse extends js.Object {
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of parents for the specified child account or OU.
         */
    var Parents: js.UndefOr[Parents] = js.undefined
  }
  
  
  trait ListPoliciesForTargetRequest extends js.Object {
    /**
         * The type of policy that you want to include in the returned list.
         */
    var Filter: PolicyType
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The unique identifier (ID) of the root, organizational unit, or account whose policies you want to list. The regex pattern for a target ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var TargetId: PolicyTargetId
  }
  
  
  trait ListPoliciesForTargetResponse extends js.Object {
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The list of policies that match the criteria in the request.
         */
    var Policies: js.UndefOr[Policies] = js.undefined
  }
  
  
  trait ListPoliciesRequest extends js.Object {
    /**
         * Specifies the type of policy that you want to include in the response.
         */
    var Filter: PolicyType
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListPoliciesResponse extends js.Object {
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of policies that match the filter criteria in the request. The output list does not include the policy contents. To see the content for a policy, see DescribePolicy.
         */
    var Policies: js.UndefOr[Policies] = js.undefined
  }
  
  
  trait ListRootsRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListRootsResponse extends js.Object {
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of roots that are defined in an organization.
         */
    var Roots: js.UndefOr[Roots] = js.undefined
  }
  
  
  trait ListTargetsForPolicyRequest extends js.Object {
    /**
         * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The unique identifier (ID) of the policy for which you want to know its attachments. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var PolicyId: PolicyId
  }
  
  
  trait ListTargetsForPolicyResponse extends js.Object {
    /**
         * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of structures, each of which contains details about one of the entities to which the specified policy is attached.
         */
    var Targets: js.UndefOr[PolicyTargets] = js.undefined
  }
  
  
  trait MoveAccountRequest extends js.Object {
    /**
         * The unique identifier (ID) of the account that you want to move. The regex pattern for an account ID string requires exactly 12 digits.
         */
    var AccountId: AccountId
    /**
         * The unique identifier (ID) of the root or organizational unit that you want to move the account to. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var DestinationParentId: ParentId
    /**
         * The unique identifier (ID) of the root or organizational unit that you want to move the account from. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var SourceParentId: ParentId
  }
  
  
  trait Organization extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of an organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[OrganizationArn] = js.undefined
    /**
         * A list of policy types that are enabled for this organization. For example, if your organization has all features enabled, then service control policies (SCPs) are included in the list.  Even if a policy type is shown as available in the organization, you can separately enable and disable them at the root level by using EnablePolicyType and DisablePolicyType. Use ListRoots to see the status of a policy type in that root. 
         */
    var AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
    /**
         * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.
         */
    var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
    /**
         * The unique identifier (ID) of an organization. The regex pattern for an organization ID string requires "o-" followed by from 10 to 32 lower-case letters or digits.
         */
    var Id: js.UndefOr[OrganizationId] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var MasterAccountArn: js.UndefOr[AccountArn] = js.undefined
    /**
         * The email address that is associated with the AWS account that is designated as the master account for the organization.
         */
    var MasterAccountEmail: js.UndefOr[Email] = js.undefined
    /**
         * The unique identifier (ID) of the master account of an organization. The regex pattern for an account ID string requires exactly 12 digits.
         */
    var MasterAccountId: js.UndefOr[AccountId] = js.undefined
  }
  
  
  trait OrganizationalUnit extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of this OU. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[OrganizationalUnitArn] = js.undefined
    /**
         * The unique identifier (ID) associated with this OU. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
         */
    var Id: js.UndefOr[OrganizationalUnitId] = js.undefined
    /**
         * The friendly name of this OU. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[OrganizationalUnitName] = js.undefined
  }
  
  
  trait Parent extends js.Object {
    /**
         * The unique identifier (ID) of the parent entity. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var Id: js.UndefOr[ParentId] = js.undefined
    /**
         * The type of the parent entity.
         */
    var Type: js.UndefOr[ParentType] = js.undefined
  }
  
  
  trait Policy extends js.Object {
    /**
         * The text content of the policy.
         */
    var Content: js.UndefOr[PolicyContent] = js.undefined
    /**
         * A structure that contains additional details about the policy.
         */
    var PolicySummary: js.UndefOr[PolicySummary] = js.undefined
  }
  
  
  trait PolicySummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the policy. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[PolicyArn] = js.undefined
    /**
         * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can attach the policy to roots, OUs, or accounts, but you cannot edit it.
         */
    var AwsManaged: js.UndefOr[AwsManagedPolicy] = js.undefined
    /**
         * The description of the policy.
         */
    var Description: js.UndefOr[PolicyDescription] = js.undefined
    /**
         * The unique identifier (ID) of the policy. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var Id: js.UndefOr[PolicyId] = js.undefined
    /**
         * The friendly name of the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[PolicyName] = js.undefined
    /**
         * The type of policy.
         */
    var Type: js.UndefOr[PolicyType] = js.undefined
  }
  
  
  trait PolicyTargetSummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the policy target. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[GenericArn] = js.undefined
    /**
         * The friendly name of the policy target. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[TargetName] = js.undefined
    /**
         * The unique identifier (ID) of the policy target. The regex pattern for a target ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
         */
    var TargetId: js.UndefOr[PolicyTargetId] = js.undefined
    /**
         * The type of the policy target.
         */
    var Type: js.UndefOr[TargetType] = js.undefined
  }
  
  
  trait PolicyTypeSummary extends js.Object {
    /**
         * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a root or to an OU or account in that root, it must be available in the organization and enabled for that root.
         */
    var Status: js.UndefOr[PolicyTypeStatus] = js.undefined
    /**
         * The name of the policy type.
         */
    var Type: js.UndefOr[PolicyType] = js.undefined
  }
  
  
  trait RemoveAccountFromOrganizationRequest extends js.Object {
    /**
         * The unique identifier (ID) of the member account that you want to remove from the organization. The regex pattern for an account ID string requires exactly 12 digits.
         */
    var AccountId: AccountId
  }
  
  
  trait Root extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the root. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
         */
    var Arn: js.UndefOr[RootArn] = js.undefined
    /**
         * The unique identifier (ID) for the root. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lower-case letters or digits.
         */
    var Id: js.UndefOr[RootId] = js.undefined
    /**
         * The friendly name of the root. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[RootName] = js.undefined
    /**
         * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its OUs or accounts.  Even if a policy type is shown as available in the organization, you can separately enable and disable them at the root level by using EnablePolicyType and DisablePolicyType. Use DescribeOrganization to see the availability of the policy types in that organization. 
         */
    var PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.  This operation can be called only by the following principals when they also have the relevant IAM permissions:    Invitation to join or Approve all features request handshakes: only a principal from the member account.  The user who calls the API for an invitation to join must have the organizations:AcceptHandshake permission. If you enabled all features in the organization, then the user must also have the iam:CreateServiceLinkedRole permission so that Organizations can create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.    Enable all features final confirmation handshake: only a principal from the master account. For more information about invitations, see Inviting an AWS Account to Join Your Organization in the AWS Organizations User Guide. For more information about requests to enable all features in the organization, see Enabling All Features in Your Organization in the AWS Organizations User Guide.   After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
    def acceptHandshake(): awsDashSdkLib.libRequestMod.Request[AcceptHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.  This operation can be called only by the following principals when they also have the relevant IAM permissions:    Invitation to join or Approve all features request handshakes: only a principal from the member account.  The user who calls the API for an invitation to join must have the organizations:AcceptHandshake permission. If you enabled all features in the organization, then the user must also have the iam:CreateServiceLinkedRole permission so that Organizations can create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.    Enable all features final confirmation handshake: only a principal from the master account. For more information about invitations, see Inviting an AWS Account to Join Your Organization in the AWS Organizations User Guide. For more information about requests to enable all features in the organization, see Enabling All Features in Your Organization in the AWS Organizations User Guide.   After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
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
    /**
       * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.  This operation can be called only by the following principals when they also have the relevant IAM permissions:    Invitation to join or Approve all features request handshakes: only a principal from the member account.  The user who calls the API for an invitation to join must have the organizations:AcceptHandshake permission. If you enabled all features in the organization, then the user must also have the iam:CreateServiceLinkedRole permission so that Organizations can create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.    Enable all features final confirmation handshake: only a principal from the master account. For more information about invitations, see Inviting an AWS Account to Join Your Organization in the AWS Organizations User Guide. For more information about requests to enable all features in the organization, see Enabling All Features in Your Organization in the AWS Organizations User Guide.   After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
    def acceptHandshake(
      params: AcceptHandshakeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptHandshakeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects accounts depends on the type of policy:    Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected member accounts. The scope of influence for a policy depends on what you attach the policy to:   If you attach an SCP to a root, it affects all accounts in the organization.   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.   If you attach the policy directly to an account, then it affects only that account.   SCPs essentially are permission "filters". When you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP. AWS Organizations attaches a default SCP named "FullAWSAccess to every root, OU, and account. This default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the permissions that you want to allow in that OU or account. For more information about how Organizations policies permissions work, see Using Service Control Policies in the AWS Organizations User Guide.   This operation can be called only from the organization's master account.
       */
    def attachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects accounts depends on the type of policy:    Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected member accounts. The scope of influence for a policy depends on what you attach the policy to:   If you attach an SCP to a root, it affects all accounts in the organization.   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.   If you attach the policy directly to an account, then it affects only that account.   SCPs essentially are permission "filters". When you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP. AWS Organizations attaches a default SCP named "FullAWSAccess to every root, OU, and account. This default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the permissions that you want to allow in that OU or account. For more information about how Organizations policies permissions work, see Using Service Control Policies in the AWS Organizations User Guide.   This operation can be called only from the organization's master account.
       */
    def attachPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects accounts depends on the type of policy:    Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected member accounts. The scope of influence for a policy depends on what you attach the policy to:   If you attach an SCP to a root, it affects all accounts in the organization.   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.   If you attach the policy directly to an account, then it affects only that account.   SCPs essentially are permission "filters". When you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP. AWS Organizations attaches a default SCP named "FullAWSAccess to every root, OU, and account. This default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the permissions that you want to allow in that OU or account. For more information about how Organizations policies permissions work, see Using Service Control Policies in the AWS Organizations User Guide.   This operation can be called only from the organization's master account.
       */
    def attachPolicy(params: AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects accounts depends on the type of policy:    Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected member accounts. The scope of influence for a policy depends on what you attach the policy to:   If you attach an SCP to a root, it affects all accounts in the organization.   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.   If you attach the policy directly to an account, then it affects only that account.   SCPs essentially are permission "filters". When you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP. AWS Organizations attaches a default SCP named "FullAWSAccess to every root, OU, and account. This default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the permissions that you want to allow in that OU or account. For more information about how Organizations policies permissions work, see Using Service Control Policies in the AWS Organizations User Guide.   This operation can be called only from the organization's master account.
       */
    def attachPolicy(
      params: AttachPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a handshake. Canceling a handshake sets the handshake state to CANCELED.  This operation can be called only from the account that originated the handshake. The recipient of the handshake can't cancel it, but can use DeclineHandshake instead. After a handshake is canceled, the recipient can no longer respond to that handshake. After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
    def cancelHandshake(): awsDashSdkLib.libRequestMod.Request[CancelHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a handshake. Canceling a handshake sets the handshake state to CANCELED.  This operation can be called only from the account that originated the handshake. The recipient of the handshake can't cancel it, but can use DeclineHandshake instead. After a handshake is canceled, the recipient can no longer respond to that handshake. After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
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
    /**
       * Cancels a handshake. Canceling a handshake sets the handshake state to CANCELED.  This operation can be called only from the account that originated the handshake. The recipient of the handshake can't cancel it, but can use DeclineHandshake instead. After a handshake is canceled, the recipient can no longer respond to that handshake. After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
    def cancelHandshake(
      params: CancelHandshakeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelHandshakeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelHandshakeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS account that is automatically a member of the organization whose credentials made the request. This is an asynchronous request that AWS performs in the background. Because CreateAccount operates asynchronously, it can return a successful completion message even though account initialization might still be in progress. You might need to wait a few minutes before you can successfully access the account. To check the status of the request, do one of the following:   Use the OperationId response element from this operation to provide as a parameter to the DescribeCreateAccountStatus operation.   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS CloudTrail with Organizations, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.    The user who calls the API to create an account must have the organizations:CreateAccount permission. If you enabled all features in the organization, AWS Organizations will create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide. AWS Organizations preconfigures the new member account with a role (named OrganizationAccountAccessRole by default) that grants users in the master account administrator permissions in the new member account. Principals in the master account can assume the role. AWS Organizations clones the company name and address information for the new account from the organization's master account. This operation can be called only from the organization's master account. For more information about creating accounts, see Creating an AWS Account in Your Organization in the AWS Organizations User Guide.    When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required for the account to operate as a standalone account, such as a payment method and signing the end user license agreement (EULA) is not automatically collected. If you must remove an account from your organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.   If you get an exception that indicates that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists, contact AWS Support.   Using CreateAccount to create multiple temporary accounts is not recommended. You can only close an account from the Billing and Cost Management Console, and you must be signed in as the root user. For information on the requirements and process for closing an account, see Closing an AWS Account in the AWS Organizations User Guide.     When you create a member account with this operation, you can choose whether to create the account with the IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that have appropriate permissions can view billing information for the account. If you disable it, only the account root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your Billing Information and Tools. 
       */
    def createAccount(): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS account that is automatically a member of the organization whose credentials made the request. This is an asynchronous request that AWS performs in the background. Because CreateAccount operates asynchronously, it can return a successful completion message even though account initialization might still be in progress. You might need to wait a few minutes before you can successfully access the account. To check the status of the request, do one of the following:   Use the OperationId response element from this operation to provide as a parameter to the DescribeCreateAccountStatus operation.   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS CloudTrail with Organizations, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.    The user who calls the API to create an account must have the organizations:CreateAccount permission. If you enabled all features in the organization, AWS Organizations will create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide. AWS Organizations preconfigures the new member account with a role (named OrganizationAccountAccessRole by default) that grants users in the master account administrator permissions in the new member account. Principals in the master account can assume the role. AWS Organizations clones the company name and address information for the new account from the organization's master account. This operation can be called only from the organization's master account. For more information about creating accounts, see Creating an AWS Account in Your Organization in the AWS Organizations User Guide.    When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required for the account to operate as a standalone account, such as a payment method and signing the end user license agreement (EULA) is not automatically collected. If you must remove an account from your organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.   If you get an exception that indicates that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists, contact AWS Support.   Using CreateAccount to create multiple temporary accounts is not recommended. You can only close an account from the Billing and Cost Management Console, and you must be signed in as the root user. For information on the requirements and process for closing an account, see Closing an AWS Account in the AWS Organizations User Guide.     When you create a member account with this operation, you can choose whether to create the account with the IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that have appropriate permissions can view billing information for the account. If you disable it, only the account root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your Billing Information and Tools. 
       */
    def createAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS account that is automatically a member of the organization whose credentials made the request. This is an asynchronous request that AWS performs in the background. Because CreateAccount operates asynchronously, it can return a successful completion message even though account initialization might still be in progress. You might need to wait a few minutes before you can successfully access the account. To check the status of the request, do one of the following:   Use the OperationId response element from this operation to provide as a parameter to the DescribeCreateAccountStatus operation.   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS CloudTrail with Organizations, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.    The user who calls the API to create an account must have the organizations:CreateAccount permission. If you enabled all features in the organization, AWS Organizations will create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide. AWS Organizations preconfigures the new member account with a role (named OrganizationAccountAccessRole by default) that grants users in the master account administrator permissions in the new member account. Principals in the master account can assume the role. AWS Organizations clones the company name and address information for the new account from the organization's master account. This operation can be called only from the organization's master account. For more information about creating accounts, see Creating an AWS Account in Your Organization in the AWS Organizations User Guide.    When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required for the account to operate as a standalone account, such as a payment method and signing the end user license agreement (EULA) is not automatically collected. If you must remove an account from your organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.   If you get an exception that indicates that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists, contact AWS Support.   Using CreateAccount to create multiple temporary accounts is not recommended. You can only close an account from the Billing and Cost Management Console, and you must be signed in as the root user. For information on the requirements and process for closing an account, see Closing an AWS Account in the AWS Organizations User Guide.     When you create a member account with this operation, you can choose whether to create the account with the IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that have appropriate permissions can view billing information for the account. If you disable it, only the account root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your Billing Information and Tools. 
       */
    def createAccount(params: CreateAccountRequest): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS account that is automatically a member of the organization whose credentials made the request. This is an asynchronous request that AWS performs in the background. Because CreateAccount operates asynchronously, it can return a successful completion message even though account initialization might still be in progress. You might need to wait a few minutes before you can successfully access the account. To check the status of the request, do one of the following:   Use the OperationId response element from this operation to provide as a parameter to the DescribeCreateAccountStatus operation.   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS CloudTrail with Organizations, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.    The user who calls the API to create an account must have the organizations:CreateAccount permission. If you enabled all features in the organization, AWS Organizations will create the required service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide. AWS Organizations preconfigures the new member account with a role (named OrganizationAccountAccessRole by default) that grants users in the master account administrator permissions in the new member account. Principals in the master account can assume the role. AWS Organizations clones the company name and address information for the new account from the organization's master account. This operation can be called only from the organization's master account. For more information about creating accounts, see Creating an AWS Account in Your Organization in the AWS Organizations User Guide.    When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required for the account to operate as a standalone account, such as a payment method and signing the end user license agreement (EULA) is not automatically collected. If you must remove an account from your organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.   If you get an exception that indicates that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists, contact AWS Support.   Using CreateAccount to create multiple temporary accounts is not recommended. You can only close an account from the Billing and Cost Management Console, and you must be signed in as the root user. For information on the requirements and process for closing an account, see Closing an AWS Account in the AWS Organizations User Guide.     When you create a member account with this operation, you can choose whether to create the account with the IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that have appropriate permissions can view billing information for the account. If you disable it, only the account root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your Billing Information and Tools. 
       */
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
    /**
       * Creates an AWS organization. The account whose user is calling the CreateOrganization operation automatically becomes the master account of the new organization. This operation must be called using credentials from the account that is to become the new organization's master account. The principal must also have the relevant IAM permissions. By default (or if you set the FeatureSet parameter to ALL), the new organization is created with all features enabled and service control policies automatically enabled in the root. If you instead choose to create the organization supporting only the consolidated billing features by setting the FeatureSet parameter to CONSOLIDATED_BILLING", then no policy types are enabled by default and you cannot use organization policies.
       */
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
    /**
       * Creates an AWS organization. The account whose user is calling the CreateOrganization operation automatically becomes the master account of the new organization. This operation must be called using credentials from the account that is to become the new organization's master account. The principal must also have the relevant IAM permissions. By default (or if you set the FeatureSet parameter to ALL), the new organization is created with all features enabled and service control policies automatically enabled in the root. If you instead choose to create the organization supporting only the consolidated billing features by setting the FeatureSet parameter to CONSOLIDATED_BILLING", then no policy types are enabled by default and you cannot use organization policies.
       */
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
    /**
       * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables you to organize your accounts to apply policies according to your business requirements. The number of levels deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control policies, the limit is five.  For more information about OUs, see Managing Organizational Units in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
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
    /**
       * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables you to organize your accounts to apply policies according to your business requirements. The number of levels deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control policies, the limit is five.  For more information about OUs, see Managing Organizational Units in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
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
    /**
       * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual AWS account. For more information about policies and their use, see Managing Organization Policies. This operation can be called only from the organization's master account.
       */
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
    /**
       * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual AWS account. For more information about policies and their use, see Managing Organization Policies. This operation can be called only from the organization's master account.
       */
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
    /**
       * Declines a handshake request. This sets the handshake state to DECLINED and effectively deactivates the request. This operation can be called only from the account that received the handshake. The originator of the handshake can use CancelHandshake instead. The originator can't reactivate a declined request, but can re-initiate the process with a new handshake request. After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
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
    /**
       * Declines a handshake request. This sets the handshake state to DECLINED and effectively deactivates the request. This operation can be called only from the account that received the handshake. The originator of the handshake can use CancelHandshake instead. The originator can't reactivate a declined request, but can re-initiate the process with a new handshake request. After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After that it is deleted.
       */
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
    /**
       * Deletes the organization. You can delete an organization only by using credentials from the master account. The organization must be empty of member accounts.
       */
    def deleteOrganization(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs from the OU that you want to delete. This operation can be called only from the organization's master account.
       */
    def deleteOrganizationalUnit(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs from the OU that you want to delete. This operation can be called only from the organization's master account.
       */
    def deleteOrganizationalUnit(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs from the OU that you want to delete. This operation can be called only from the organization's master account.
       */
    def deleteOrganizationalUnit(params: DeleteOrganizationalUnitRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs from the OU that you want to delete. This operation can be called only from the organization's master account.
       */
    def deleteOrganizationalUnit(
      params: DeleteOrganizationalUnitRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the policy from all organizational units (OUs), roots, and accounts. This operation can be called only from the organization's master account.
       */
    def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the policy from all organizational units (OUs), roots, and accounts. This operation can be called only from the organization's master account.
       */
    def deletePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the policy from all organizational units (OUs), roots, and accounts. This operation can be called only from the organization's master account.
       */
    def deletePolicy(params: DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the policy from all organizational units (OUs), roots, and accounts. This operation can be called only from the organization's master account.
       */
    def deletePolicy(
      params: DeletePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves Organizations-related information about the specified account. This operation can be called only from the organization's master account.
       */
    def describeAccount(): awsDashSdkLib.libRequestMod.Request[DescribeAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves Organizations-related information about the specified account. This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves Organizations-related information about the specified account. This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves the current status of an asynchronous request to create an account. This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves the current status of an asynchronous request to create an account. This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the original InviteAccountToOrganization operation that generated the handshake. You can access handshakes that are ACCEPTED, DECLINED, or CANCELED for only 30 days after they change to that state. They are then deleted and no longer accessible. This operation can be called from any account in the organization.
       */
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
    /**
       * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the original InviteAccountToOrganization operation that generated the handshake. You can access handshakes that are ACCEPTED, DECLINED, or CANCELED for only 30 days after they change to that state. They are then deleted and no longer accessible. This operation can be called from any account in the organization.
       */
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
    /**
       * Retrieves information about the organization that the user's account belongs to. This operation can be called from any account in the organization.  Even if a policy type is shown as available in the organization, it can be disabled separately at the root level with DisablePolicyType. Use ListRoots to see the status of policy types for a specified root. 
       */
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
    /**
       * Retrieves information about an organizational unit (OU). This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves information about an organizational unit (OU). This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves information about a policy. This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves information about a policy. This operation can be called only from the organization's master account.
       */
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
    /**
       * Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are immediate.  Note: Every root, OU, and account must have at least one SCP attached. If you want to replace the default FullAWSAccess policy with one that limits the permissions that can be delegated, then you must attach the replacement policy before you can remove the default one. This is the authorization strategy of whitelisting. If you instead attach a second SCP and leave the FullAWSAccess SCP still attached, and specify "Effect": "Deny" in the second SCP to override the "Effect": "Allow" in the FullAWSAccess policy (or any other attached SCP), then you are using the authorization strategy of blacklisting.  This operation can be called only from the organization's master account.
       */
    def detachPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are immediate.  Note: Every root, OU, and account must have at least one SCP attached. If you want to replace the default FullAWSAccess policy with one that limits the permissions that can be delegated, then you must attach the replacement policy before you can remove the default one. This is the authorization strategy of whitelisting. If you instead attach a second SCP and leave the FullAWSAccess SCP still attached, and specify "Effect": "Deny" in the second SCP to override the "Effect": "Allow" in the FullAWSAccess policy (or any other attached SCP), then you are using the authorization strategy of blacklisting.  This operation can be called only from the organization's master account.
       */
    def detachPolicy(params: DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are immediate.  Note: Every root, OU, and account must have at least one SCP attached. If you want to replace the default FullAWSAccess policy with one that limits the permissions that can be delegated, then you must attach the replacement policy before you can remove the default one. This is the authorization strategy of whitelisting. If you instead attach a second SCP and leave the FullAWSAccess SCP still attached, and specify "Effect": "Deny" in the second SCP to override the "Effect": "Allow" in the FullAWSAccess policy (or any other attached SCP), then you are using the authorization strategy of blacklisting.  This operation can be called only from the organization's master account.
       */
    def detachPolicy(
      params: DetachPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in new accounts in your organization. This means the service can't perform operations on your behalf on any new accounts in your organization. The service can still perform operations in older accounts until the service completes its clean-up from AWS Organizations.   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the other service is aware that it can clean up any resources that are required only for the integration. How the service cleans up its resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies that are attached to your roles.  For more information about integrating other services with AWS Organizations, including the list of services that work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
    def disableAWSServiceAccess(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in new accounts in your organization. This means the service can't perform operations on your behalf on any new accounts in your organization. The service can still perform operations in older accounts until the service completes its clean-up from AWS Organizations.   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the other service is aware that it can clean up any resources that are required only for the integration. How the service cleans up its resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies that are attached to your roles.  For more information about integrating other services with AWS Organizations, including the list of services that work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
    def disableAWSServiceAccess(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in new accounts in your organization. This means the service can't perform operations on your behalf on any new accounts in your organization. The service can still perform operations in older accounts until the service completes its clean-up from AWS Organizations.   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the other service is aware that it can clean up any resources that are required only for the integration. How the service cleans up its resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies that are attached to your roles.  For more information about integrating other services with AWS Organizations, including the list of services that work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
    def disableAWSServiceAccess(params: DisableAWSServiceAccessRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in new accounts in your organization. This means the service can't perform operations on your behalf on any new accounts in your organization. The service can still perform operations in older accounts until the service completes its clean-up from AWS Organizations.   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the other service is aware that it can clean up any resources that are required only for the integration. How the service cleans up its resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies that are attached to your roles.  For more information about integrating other services with AWS Organizations, including the list of services that work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
    def disableAWSServiceAccess(
      params: DisableAWSServiceAccessRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables an organizational control policy type in a root. A policy of a certain type can be attached to entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can attach policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can undo this by using the EnablePolicyType operation. This operation can be called only from the organization's master account.  If you disable a policy type for a root, it still shows as enabled for the organization if all features are enabled in that organization. Use ListRoots to see the status of policy types for a specified root. Use DescribeOrganization to see the status of policy types in the organization. 
       */
    def disablePolicyType(): awsDashSdkLib.libRequestMod.Request[DisablePolicyTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables an organizational control policy type in a root. A policy of a certain type can be attached to entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can attach policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can undo this by using the EnablePolicyType operation. This operation can be called only from the organization's master account.  If you disable a policy type for a root, it still shows as enabled for the organization if all features are enabled in that organization. Use ListRoots to see the status of policy types for a specified root. Use DescribeOrganization to see the status of policy types in the organization. 
       */
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
    /**
       * Disables an organizational control policy type in a root. A policy of a certain type can be attached to entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can attach policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can undo this by using the EnablePolicyType operation. This operation can be called only from the organization's master account.  If you disable a policy type for a root, it still shows as enabled for the organization if all features are enabled in that organization. Use ListRoots to see the status of policy types for a specified root. Use DescribeOrganization to see the status of policy types in the organization. 
       */
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
    /**
       * Enables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you enable integration, you allow the specified service to create a service-linked role in all the accounts in your organization. This allows the service to perform operations on your behalf in your organization and its accounts.  We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  For more information about enabling services to integrate with AWS Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account and only if the organization has enabled all features.
       */
    def enableAWSServiceAccess(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you enable integration, you allow the specified service to create a service-linked role in all the accounts in your organization. This allows the service to perform operations on your behalf in your organization and its accounts.  We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  For more information about enabling services to integrate with AWS Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account and only if the organization has enabled all features.
       */
    def enableAWSServiceAccess(params: EnableAWSServiceAccessRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the integration of an AWS service (the service that is specified by ServicePrincipal) with AWS Organizations. When you enable integration, you allow the specified service to create a service-linked role in all the accounts in your organization. This allows the service to perform operations on your behalf in your organization and its accounts.  We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization's accounts depends on that service. For more information, see the documentation for the other AWS service.  For more information about enabling services to integrate with AWS Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account and only if the organization has enabled all features.
       */
    def enableAWSServiceAccess(
      params: EnableAWSServiceAccessRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables all features in an organization. This enables the use of organization policies that can restrict the services and actions that can be called in each account. Until you enable all features, you have access only to consolidated billing, and you can't use any of the advanced account administration features that AWS Organizations supports. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.  This operation is required only for organizations that were created explicitly with only the consolidated billing features enabled. Calling this operation sends a handshake to every invited account in the organization. The feature set change can be finalized and the additional features enabled only after all administrators in the invited accounts approve the change by accepting the handshake.  After you enable all features, you can separately enable or disable individual policy types in a root using EnablePolicyType and DisablePolicyType. To see the status of policy types in a root, use ListRoots. After all invited member accounts accept the handshake, you finalize the feature set change by accepting the handshake that contains "Action": "ENABLE_ALL_FEATURES". This completes the change. After you enable all features in your organization, the master account in the organization can apply policies on all member accounts. These policies can restrict what users and even administrators in those accounts can do. The master account can apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are aware of this. This operation can be called only from the organization's master account. 
       */
    def enableAllFeatures(): awsDashSdkLib.libRequestMod.Request[EnableAllFeaturesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables all features in an organization. This enables the use of organization policies that can restrict the services and actions that can be called in each account. Until you enable all features, you have access only to consolidated billing, and you can't use any of the advanced account administration features that AWS Organizations supports. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.  This operation is required only for organizations that were created explicitly with only the consolidated billing features enabled. Calling this operation sends a handshake to every invited account in the organization. The feature set change can be finalized and the additional features enabled only after all administrators in the invited accounts approve the change by accepting the handshake.  After you enable all features, you can separately enable or disable individual policy types in a root using EnablePolicyType and DisablePolicyType. To see the status of policy types in a root, use ListRoots. After all invited member accounts accept the handshake, you finalize the feature set change by accepting the handshake that contains "Action": "ENABLE_ALL_FEATURES". This completes the change. After you enable all features in your organization, the master account in the organization can apply policies on all member accounts. These policies can restrict what users and even administrators in those accounts can do. The master account can apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are aware of this. This operation can be called only from the organization's master account. 
       */
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
    /**
       * Enables all features in an organization. This enables the use of organization policies that can restrict the services and actions that can be called in each account. Until you enable all features, you have access only to consolidated billing, and you can't use any of the advanced account administration features that AWS Organizations supports. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.  This operation is required only for organizations that were created explicitly with only the consolidated billing features enabled. Calling this operation sends a handshake to every invited account in the organization. The feature set change can be finalized and the additional features enabled only after all administrators in the invited accounts approve the change by accepting the handshake.  After you enable all features, you can separately enable or disable individual policy types in a root using EnablePolicyType and DisablePolicyType. To see the status of policy types in a root, use ListRoots. After all invited member accounts accept the handshake, you finalize the feature set change by accepting the handshake that contains "Action": "ENABLE_ALL_FEATURES". This completes the change. After you enable all features in your organization, the master account in the organization can apply policies on all member accounts. These policies can restrict what users and even administrators in those accounts can do. The master account can apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are aware of this. This operation can be called only from the organization's master account. 
       */
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
    /**
       * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type to the root, any organizational unit (OU), or account in that root. You can undo this by using the DisablePolicyType operation. This operation can be called only from the organization's master account. You can enable a policy type in a root only if that policy type is available in the organization. Use DescribeOrganization to view the status of available policy types in the organization. To view the status of policy type in a root, use ListRoots.
       */
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
    /**
       * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type to the root, any organizational unit (OU), or account in that root. You can undo this by using the DisablePolicyType operation. This operation can be called only from the organization's master account. You can enable a policy type in a root only if that policy type is available in the organization. Use DescribeOrganization to view the status of available policy types in the organization. To view the status of policy type in a root, use ListRoots.
       */
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
    /**
       * Sends an invitation to another account to join your organization as a member account. Organizations sends email on your behalf to the email address that is associated with the other account's owner. The invitation is implemented as a Handshake whose details are in the response.    You can invite AWS accounts only from the same seller as the master account. For example, if your organization's master account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India, then you can only invite other AISPL accounts to your organization. You can't combine accounts from AISPL and AWS, or any other AWS seller. For more information, see Consolidated Billing in India.   If you receive an exception that indicates that you exceeded your account limits for the organization or that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists after an hour, then contact AWS Customer Support.    This operation can be called only from the organization's master account.
       */
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
    /**
       * Sends an invitation to another account to join your organization as a member account. Organizations sends email on your behalf to the email address that is associated with the other account's owner. The invitation is implemented as a Handshake whose details are in the response.    You can invite AWS accounts only from the same seller as the master account. For example, if your organization's master account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India, then you can only invite other AISPL accounts to your organization. You can't combine accounts from AISPL and AWS, or any other AWS seller. For more information, see Consolidated Billing in India.   If you receive an exception that indicates that you exceeded your account limits for the organization or that the operation failed because your organization is still initializing, wait one hour and then try again. If the error persists after an hour, then contact AWS Customer Support.    This operation can be called only from the organization's master account.
       */
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
    /**
       * Removes a member account from its parent organization. This version of the operation is performed by the account that wants to leave. To remove a member account as a user in the master account, use RemoveAccountFromOrganization instead. This operation can be called only from a member account in the organization.    The master account in an organization with all features enabled can set service control policies (SCPs) that can restrict what administrators of member accounts can do, including preventing them from successfully calling LeaveOrganization and leaving the organization.    You can leave an organization as a member account only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For each account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. Follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide.   You can leave an organization only after you enable IAM user access to billing in your account. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide.   
       */
    def leaveOrganization(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this list creates the resources that it requires for the integration, it can perform operations on your organization and its accounts. For more information about integrating other services with AWS Organizations, including the list of services that currently work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
    def listAWSServiceAccessForOrganization(): awsDashSdkLib.libRequestMod.Request[ListAWSServiceAccessForOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this list creates the resources that it requires for the integration, it can perform operations on your organization and its accounts. For more information about integrating other services with AWS Organizations, including the list of services that currently work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
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
    /**
       * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this list creates the resources that it requires for the integration, it can perform operations on your organization and its accounts. For more information about integrating other services with AWS Organizations, including the list of services that currently work with Organizations, see Integrating AWS Organizations with Other AWS Services in the AWS Organizations User Guide. This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational unit (OU), use the ListAccountsForParent operation instead.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational unit (OU), use the ListAccountsForParent operation instead.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the accounts in an organization that are contained by the specified target root or organizational unit (OU). If you specify the root, you get a list of all the accounts that are not in any OU. If you specify an OU, you get a list of all the accounts in only that OU, and not in any child OUs. To get a list of all accounts in the organization, use the ListAccounts operation.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the accounts in an organization that are contained by the specified target root or organizational unit (OU). If you specify the root, you get a list of all the accounts that are not in any OU. If you specify an OU, you get a list of all the accounts in only that OU, and not in any child OUs. To get a list of all accounts in the organization, use the ListAccounts operation.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root. This operation, along with ListParents enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root. This operation, along with ListParents enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the account creation requests that match the specified status that is currently being tracked for the organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the account creation requests that match the specified status that is currently being tracked for the organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the current handshakes that are associated with the account of the requesting user. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called from any account in the organization.
       */
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
    /**
       * Lists the current handshakes that are associated with the account of the requesting user. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called from any account in the organization.
       */
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
    /**
       * Lists the handshakes that are associated with the organization that the requesting user is part of. The ListHandshakesForOrganization operation returns a list of handshake structures. Each structure contains details and status about a handshake. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the handshakes that are associated with the organization that the requesting user is part of. The ListHandshakesForOrganization operation returns a list of handshake structures. Each structure contains details and status about a handshake. Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results of this API for only 30 days after changing to that state. After that they are deleted and no longer accessible.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the organizational units (OUs) in a parent organizational unit or root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the organizational units (OUs) in a parent organizational unit or root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or account. This operation, along with ListChildren enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  In the current release, a child can have only a single parent.  
       */
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
    /**
       * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or account. This operation, along with ListChildren enables you to traverse the tree structure that makes up this root.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  In the current release, a child can have only a single parent.  
       */
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
    /**
       * Retrieves the list of all policies in an organization of a specified type.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Retrieves the list of all policies in an organization of a specified type.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account. You must specify the policy type that you want included in the returned list.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account. You must specify the policy type that you want included in the returned list.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists the roots that are defined in the current organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  Policy types can be enabled and disabled in roots. This is distinct from whether they are available in the organization. When you enable all features, you make policy types available for use in that organization. Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in an organization, use DescribeOrganization. 
       */
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
    /**
       * Lists the roots that are defined in the current organization.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.  Policy types can be enabled and disabled in roots. This is distinct from whether they are available in the organization. When you enable all features, you make policy types available for use in that organization. Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in an organization, use DescribeOrganization. 
       */
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
    /**
       * Lists all the roots, organizaitonal units (OUs), and accounts to which the specified policy is attached.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Lists all the roots, organizaitonal units (OUs), and accounts to which the specified policy is attached.  Always check the NextToken response parameter for a null value when calling a List* operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Moves an account from its current source parent root or organizational unit (OU) to the specified destination parent root or OU. This operation can be called only from the organization's master account.
       */
    def moveAccount(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves an account from its current source parent root or organizational unit (OU) to the specified destination parent root or OU. This operation can be called only from the organization's master account.
       */
    def moveAccount(params: MoveAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves an account from its current source parent root or organizational unit (OU) to the specified destination parent root or OU. This operation can be called only from the organization's master account.
       */
    def moveAccount(
      params: MoveAccountRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified account from the organization. The removed account becomes a stand-alone account that is not a member of any organization. It is no longer subject to any policies and is responsible for its own bill payments. The organization's master account is no longer charged for any expenses accrued by the member account after it is removed from the organization. This operation can be called only from the organization's master account. Member accounts can remove themselves with LeaveOrganization instead.  You can remove an account from your organization only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For an account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. To remove an account that does not yet have this information, you must sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide. 
       */
    def removeAccountFromOrganization(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified account from the organization. The removed account becomes a stand-alone account that is not a member of any organization. It is no longer subject to any policies and is responsible for its own bill payments. The organization's master account is no longer charged for any expenses accrued by the member account after it is removed from the organization. This operation can be called only from the organization's master account. Member accounts can remove themselves with LeaveOrganization instead.  You can remove an account from your organization only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For an account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. To remove an account that does not yet have this information, you must sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide. 
       */
    def removeAccountFromOrganization(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified account from the organization. The removed account becomes a stand-alone account that is not a member of any organization. It is no longer subject to any policies and is responsible for its own bill payments. The organization's master account is no longer charged for any expenses accrued by the member account after it is removed from the organization. This operation can be called only from the organization's master account. Member accounts can remove themselves with LeaveOrganization instead.  You can remove an account from your organization only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For an account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. To remove an account that does not yet have this information, you must sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide. 
       */
    def removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified account from the organization. The removed account becomes a stand-alone account that is not a member of any organization. It is no longer subject to any policies and is responsible for its own bill payments. The organization's master account is no longer charged for any expenses accrued by the member account after it is removed from the organization. This operation can be called only from the organization's master account. Member accounts can remove themselves with LeaveOrganization instead.  You can remove an account from your organization only if the account is configured with the information required to operate as a standalone account. When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the information required of standalone accounts is not automatically collected. For an account that you want to make standalone, you must accept the End User License Agreement (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account is not attached to an organization. To remove an account that does not yet have this information, you must sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS Organizations User Guide. 
       */
    def removeAccountFromOrganization(
      params: RemoveAccountFromOrganizationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain in place, and any attached policies of the OU remain attached.  This operation can be called only from the organization's master account.
       */
    def updateOrganizationalUnit(): awsDashSdkLib.libRequestMod.Request[UpdateOrganizationalUnitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain in place, and any attached policies of the OU remain attached.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain in place, and any attached policies of the OU remain attached.  This operation can be called only from the organization's master account.
       */
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
    /**
       * Updates an existing policy with a new name, description, or content. If any parameter is not supplied, that value remains unchanged. Note that you cannot change a policy's type. This operation can be called only from the organization's master account.
       */
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
    /**
       * Updates an existing policy with a new name, description, or content. If any parameter is not supplied, that value remains unchanged. Note that you cannot change a policy's type. This operation can be called only from the organization's master account.
       */
    def updatePolicy(
      params: UpdatePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateOrganizationalUnitRequest extends js.Object {
    /**
         * The new name that you want to assign to the OU. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[OrganizationalUnitName] = js.undefined
    /**
         * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
         */
    var OrganizationalUnitId: OrganizationalUnitId
  }
  
  
  trait UpdateOrganizationalUnitResponse extends js.Object {
    /**
         * A structure that contains the details about the specified OU, including its new name.
         */
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
  }
  
  
  trait UpdatePolicyRequest extends js.Object {
    /**
         * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the syntax for the policy's type. For more information, see Service Control Policy Syntax in the AWS Organizations User Guide.
         */
    var Content: js.UndefOr[PolicyContent] = js.undefined
    /**
         * If provided, the new description for the policy.
         */
    var Description: js.UndefOr[PolicyDescription] = js.undefined
    /**
         * If provided, the new name for the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
         */
    var Name: js.UndefOr[PolicyName] = js.undefined
    /**
         * The unique identifier (ID) of the policy that you want to update. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
         */
    var PolicyId: PolicyId
  }
  
  
  trait UpdatePolicyResponse extends js.Object {
    /**
         * A structure that contains details about the updated policy, showing the requested changes.
         */
    var Policy: js.UndefOr[Policy] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AccountArn = java.lang.String
  type AccountId = java.lang.String
  type AccountJoinedMethod = awsDashSdkLib.awsDashSdkLibStrings.INVITED | awsDashSdkLib.awsDashSdkLibStrings.CREATED | java.lang.String
  type AccountName = java.lang.String
  type AccountStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED | java.lang.String
  type Accounts = js.Array[Account]
  type ActionType = awsDashSdkLib.awsDashSdkLibStrings.INVITE | awsDashSdkLib.awsDashSdkLibStrings.ENABLE_ALL_FEATURES | awsDashSdkLib.awsDashSdkLibStrings.APPROVE_ALL_FEATURES | awsDashSdkLib.awsDashSdkLibStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE | java.lang.String
  type AwsManagedPolicy = scala.Boolean
  type ChildId = java.lang.String
  type ChildType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT | java.lang.String
  type Children = js.Array[Child]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CreateAccountFailureReason = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.EMAIL_ALREADY_EXISTS | awsDashSdkLib.awsDashSdkLibStrings.INVALID_ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.INVALID_EMAIL | awsDashSdkLib.awsDashSdkLibStrings.CONCURRENT_ACCOUNT_MODIFICATION | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_FAILURE | java.lang.String
  type CreateAccountRequestId = java.lang.String
  type CreateAccountState = awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type CreateAccountStates = js.Array[CreateAccountState]
  type CreateAccountStatuses = js.Array[CreateAccountStatus]
  type Email = java.lang.String
  type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]
  type GenericArn = java.lang.String
  type HandshakeArn = java.lang.String
  type HandshakeId = java.lang.String
  type HandshakeNotes = java.lang.String
  type HandshakeParties = js.Array[HandshakeParty]
  type HandshakePartyId = java.lang.String
  type HandshakePartyType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION | awsDashSdkLib.awsDashSdkLibStrings.EMAIL | java.lang.String
  type HandshakeResourceType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION_FEATURE_SET | awsDashSdkLib.awsDashSdkLibStrings.EMAIL | awsDashSdkLib.awsDashSdkLibStrings.MASTER_EMAIL | awsDashSdkLib.awsDashSdkLibStrings.MASTER_NAME | awsDashSdkLib.awsDashSdkLibStrings.NOTES | awsDashSdkLib.awsDashSdkLibStrings.PARENT_HANDSHAKE | java.lang.String
  type HandshakeResourceValue = java.lang.String
  type HandshakeResources = js.Array[HandshakeResource]
  type HandshakeState = awsDashSdkLib.awsDashSdkLibStrings.REQUESTED | awsDashSdkLib.awsDashSdkLibStrings.OPEN | awsDashSdkLib.awsDashSdkLibStrings.CANCELED | awsDashSdkLib.awsDashSdkLibStrings.ACCEPTED | awsDashSdkLib.awsDashSdkLibStrings.DECLINED | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED | java.lang.String
  type Handshakes = js.Array[Handshake]
  type IAMUserAccessToBilling = awsDashSdkLib.awsDashSdkLibStrings.ALLOW | awsDashSdkLib.awsDashSdkLibStrings.DENY | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type OrganizationArn = java.lang.String
  type OrganizationFeatureSet = awsDashSdkLib.awsDashSdkLibStrings.ALL | awsDashSdkLib.awsDashSdkLibStrings.CONSOLIDATED_BILLING | java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationalUnitArn = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitName = java.lang.String
  type OrganizationalUnits = js.Array[OrganizationalUnit]
  type ParentId = java.lang.String
  type ParentType = awsDashSdkLib.awsDashSdkLibStrings.ROOT | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT | java.lang.String
  type Parents = js.Array[Parent]
  type Policies = js.Array[PolicySummary]
  type PolicyArn = java.lang.String
  type PolicyContent = java.lang.String
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyName = java.lang.String
  type PolicyTargetId = java.lang.String
  type PolicyTargets = js.Array[PolicyTargetSummary]
  type PolicyType = awsDashSdkLib.awsDashSdkLibStrings.SERVICE_CONTROL_POLICY | java.lang.String
  type PolicyTypeStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.PENDING_ENABLE | awsDashSdkLib.awsDashSdkLibStrings.PENDING_DISABLE | java.lang.String
  type PolicyTypes = js.Array[PolicyTypeSummary]
  type RoleName = java.lang.String
  type RootArn = java.lang.String
  type RootId = java.lang.String
  type RootName = java.lang.String
  type Roots = js.Array[Root]
  type ServicePrincipal = java.lang.String
  type TargetName = java.lang.String
  type TargetType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT | awsDashSdkLib.awsDashSdkLibStrings.ROOT | java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

