package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/fms", "FMS")
@js.native
object FMSNs extends js.Object {
  trait AssociateAdminAccountRequest extends js.Object {
    /**
      * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. For more information about AWS Organizations and master accounts, see Managing the AWS Accounts in Your Organization.
      */
    var AdminAccount: AWSAccountId
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ComplianceViolator extends js.Object {
    /**
      * The resource ID.
      */
    var ResourceId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The resource type. This is in the format shown in AWS Resource Types Reference. Valid values are AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The reason that the resource is not protected by the policy.
      */
    var ViolationReason: js.UndefOr[ViolationReason] = js.undefined
  }
  
  trait CustomerPolicyScopeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[CustomerPolicyScopeIdList]
  
  trait DeleteNotificationChannelRequest extends js.Object
  
  trait DeletePolicyRequest extends js.Object {
    /**
      * The ID of the policy that you want to delete. PolicyId is returned by PutPolicy and by ListPolicies.
      */
    var PolicyId: PolicyId
  }
  
  trait DisassociateAdminAccountRequest extends js.Object
  
  trait EvaluationResult extends js.Object {
    /**
      * Describes an AWS account's compliance with the AWS Firewall Manager policy.
      */
    var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.undefined
    /**
      * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
      */
    var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined
    /**
      * Number of resources that are non-compliant with the specified policy. A resource is considered non-compliant if it is not associated with the specified policy.
      */
    var ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
  }
  
  trait GetAdminAccountRequest extends js.Object
  
  trait GetAdminAccountResponse extends js.Object {
    /**
      * The AWS account that is set as the AWS Firewall Manager administrator.
      */
    var AdminAccount: js.UndefOr[AWSAccountId] = js.undefined
    /**
      * The status of the AWS account that you set as the AWS Firewall Manager administrator.
      */
    var RoleStatus: js.UndefOr[AccountRoleStatus] = js.undefined
  }
  
  trait GetComplianceDetailRequest extends js.Object {
    /**
      * The AWS account that owns the resources that you want to get the details for.
      */
    var MemberAccount: AWSAccountId
    /**
      * The ID of the policy that you want to get the details for. PolicyId is returned by PutPolicy and by ListPolicies.
      */
    var PolicyId: PolicyId
  }
  
  trait GetComplianceDetailResponse extends js.Object {
    /**
      * Information about the resources and the policy that you specified in the GetComplianceDetail request.
      */
    var PolicyComplianceDetail: js.UndefOr[PolicyComplianceDetail] = js.undefined
  }
  
  trait GetNotificationChannelRequest extends js.Object
  
  trait GetNotificationChannelResponse extends js.Object {
    /**
      * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
      */
    var SnsRoleName: js.UndefOr[ResourceArn] = js.undefined
    /**
      * The SNS topic that records AWS Firewall Manager activity. 
      */
    var SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined
  }
  
  trait GetPolicyRequest extends js.Object {
    /**
      * The ID of the AWS Firewall Manager policy that you want the details for.
      */
    var PolicyId: PolicyId
  }
  
  trait GetPolicyResponse extends js.Object {
    /**
      * Information about the specified AWS Firewall Manager policy.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the specified policy.
      */
    var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
  }
  
  trait IssueInfoMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DetailedInfo]
  
  trait ListComplianceStatusRequest extends js.Object {
    /**
      * Specifies the number of PolicyComplianceStatus objects that you want AWS Firewall Manager to return for this request. If you have more PolicyComplianceStatus objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of PolicyComplianceStatus objects.
      */
    var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
    /**
      * If you specify a value for MaxResults and you have more PolicyComplianceStatus objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of PolicyComplianceStatus objects. For the second and subsequent ListComplianceStatus requests, specify the value of NextToken from the previous response to get information about another batch of PolicyComplianceStatus objects.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The ID of the AWS Firewall Manager policy that you want the details for.
      */
    var PolicyId: PolicyId
  }
  
  trait ListComplianceStatusResponse extends js.Object {
    /**
      * If you have more PolicyComplianceStatus objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicyComplianceStatus objects, submit another ListComplianceStatus request, and specify the NextToken value from the response in the NextToken value in the next request.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * An array of PolicyComplianceStatus objects.
      */
    var PolicyComplianceStatusList: js.UndefOr[PolicyComplianceStatusList] = js.undefined
  }
  
  trait ListMemberAccountsRequest extends js.Object {
    /**
      * Specifies the number of member account IDs that you want AWS Firewall Manager to return for this request. If you have more IDs than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of member account IDs. The maximum value for MaxResults is 100.
      */
    var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
    /**
      * If you specify a value for MaxResults and you have more account IDs than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of IDs. For the second and subsequent ListMemberAccountsRequest requests, specify the value of NextToken from the previous response to get information about another batch of member account IDs.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListMemberAccountsResponse extends js.Object {
    /**
      * An array of account IDs.
      */
    var MemberAccounts: js.UndefOr[MemberAccounts] = js.undefined
    /**
      * If you have more member account IDs than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more IDs, submit another ListMemberAccounts request, and specify the NextToken value from the response in the NextToken value in the next request.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListPoliciesRequest extends js.Object {
    /**
      * Specifies the number of PolicySummary objects that you want AWS Firewall Manager to return for this request. If you have more PolicySummary objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of PolicySummary objects.
      */
    var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
    /**
      * If you specify a value for MaxResults and you have more PolicySummary objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of PolicySummary objects. For the second and subsequent ListPolicies requests, specify the value of NextToken from the previous response to get information about another batch of PolicySummary objects.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListPoliciesResponse extends js.Object {
    /**
      * If you have more PolicySummary objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicySummary objects, submit another ListPolicies request, and specify the NextToken value from the response in the NextToken value in the next request.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * An array of PolicySummary objects.
      */
    var PolicyList: js.UndefOr[PolicySummaryList] = js.undefined
  }
  
  trait Policy extends js.Object {
    /**
      * Specifies the AWS account IDs to exclude from the policy. The IncludeMap values are evaluated first, with all of the appropriate account IDs added to the policy. Then the accounts listed in ExcludeMap are removed, resulting in the final list of accounts to add to the policy. The key to the map is ACCOUNT. For example, a valid ExcludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
      */
    var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined
    /**
      * If set to True, resources with the tags that are specified in the ResourceTag array are not protected by the policy. If set to False, and the ResourceTag array is not null, only resources with the specified tags are associated with the policy.
      */
    var ExcludeResourceTags: Boolean
    /**
      * Specifies the AWS account IDs to include in the policy. If IncludeMap is null, all accounts in the AWS Organization are included in the policy. If IncludeMap is not null, only values listed in IncludeMap will be included in the policy. The key to the map is ACCOUNT. For example, a valid IncludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
      */
    var IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined
    /**
      * The ID of the AWS Firewall Manager policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
    /**
      * The friendly name of the AWS Firewall Manager policy.
      */
    var PolicyName: ResourceName
    /**
      * A unique identifier for each update to the policy. When issuing a PutPolicy request, the PolicyUpdateToken in the request must match the PolicyUpdateToken of the current policy version. To get the PolicyUpdateToken of the current policy version, use a GetPolicy request.
      */
    var PolicyUpdateToken: js.UndefOr[PolicyUpdateToken] = js.undefined
    /**
      * Indicates if the policy should be automatically applied to new resources.
      */
    var RemediationEnabled: Boolean
    /**
      * An array of ResourceTag objects.
      */
    var ResourceTags: js.UndefOr[ResourceTags] = js.undefined
    /**
      * The type of resource to protect with the policy, either an Application Load Balancer or a CloudFront distribution. This is in the format shown in AWS Resource Types Reference. Valid values are AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
      */
    var ResourceType: ResourceType
    /**
      * Details about the security service that is being used to protect the resources.
      */
    var SecurityServicePolicyData: SecurityServicePolicyData
  }
  
  trait PolicyComplianceDetail extends js.Object {
    /**
      * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
      */
    var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined
    /**
      * A time stamp that indicates when the returned information should be considered out-of-date.
      */
    var ExpiredAt: js.UndefOr[TimeStamp] = js.undefined
    /**
      * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be non-compliant. The details include the name of the dependent service and the error message recieved indicating the problem with the service.
      */
    var IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined
    /**
      * The AWS account ID.
      */
    var MemberAccount: js.UndefOr[AWSAccountId] = js.undefined
    /**
      * The ID of the AWS Firewall Manager policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
    /**
      * The AWS account that created the AWS Firewall Manager policy.
      */
    var PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
    /**
      * An array of resources that are not protected by the policy.
      */
    var Violators: js.UndefOr[ComplianceViolators] = js.undefined
  }
  
  trait PolicyComplianceStatus extends js.Object {
    /**
      * An array of EvaluationResult objects.
      */
    var EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined
    /**
      * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be non-compliant. The details include the name of the dependent service and the error message recieved indicating the problem with the service.
      */
    var IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined
    /**
      * Time stamp of the last update to the EvaluationResult objects.
      */
    var LastUpdated: js.UndefOr[TimeStamp] = js.undefined
    /**
      * The member account ID.
      */
    var MemberAccount: js.UndefOr[AWSAccountId] = js.undefined
    /**
      * The ID of the AWS Firewall Manager policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
    /**
      * The friendly name of the AWS Firewall Manager policy.
      */
    var PolicyName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The AWS account that created the AWS Firewall Manager policy.
      */
    var PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
  }
  
  trait PolicySummary extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the specified policy.
      */
    var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
    /**
      * The ID of the specified policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
    /**
      * The friendly name of the specified policy.
      */
    var PolicyName: js.UndefOr[ResourceName] = js.undefined
    /**
      * Indicates if the policy should be automatically applied to new resources.
      */
    var RemediationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The type of resource to protect with the policy, either an Application Load Balancer or a CloudFront distribution. This is in the format shown in AWS Resource Types Reference. Valid values are AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The service that the policy is using to protect the resources. This value is WAF.
      */
    var SecurityServiceType: js.UndefOr[SecurityServiceType] = js.undefined
  }
  
  trait PutNotificationChannelRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity. 
      */
    var SnsRoleName: ResourceArn
    /**
      * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
      */
    var SnsTopicArn: ResourceArn
  }
  
  trait PutPolicyRequest extends js.Object {
    /**
      * The details of the AWS Firewall Manager policy to be created.
      */
    var Policy: Policy
  }
  
  trait PutPolicyResponse extends js.Object {
    /**
      * The details of the AWS Firewall Manager policy that was created.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the policy that was created.
      */
    var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
  }
  
  trait ResourceTag extends js.Object {
    /**
      * The resource tag key.
      */
    var Key: TagKey
    /**
      * The resource tag value.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait SecurityServicePolicyData extends js.Object {
    /**
      * Details about the service. This contains WAF data in JSON format, as shown in the following example:  ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}} 
      */
    var ManagedServiceData: js.UndefOr[ManagedServiceData] = js.undefined
    /**
      * The service that the policy is using to protect the resources. This value is WAF.
      */
    var Type: SecurityServiceType
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    def associateAdminAccount(params: AssociateAdminAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateAdminAccount(
      params: AssociateAdminAccountRequest,
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
    def deleteNotificationChannel(params: DeleteNotificationChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNotificationChannel(
      params: DeleteNotificationChannelRequest,
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
    def deletePolicy(params: DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicy(
      params: DeletePolicyRequest,
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
    def disassociateAdminAccount(params: DisassociateAdminAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateAdminAccount(
      params: DisassociateAdminAccountRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall Manager administrator.
      */
    def getAdminAccount(): awsDashSdkLib.libRequestMod.Request[GetAdminAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAdminAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAdminAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAdminAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall Manager administrator.
      */
    def getAdminAccount(params: GetAdminAccountRequest): awsDashSdkLib.libRequestMod.Request[GetAdminAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAdminAccount(
      params: GetAdminAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAdminAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAdminAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy has not been applied to them.
      */
    def getComplianceDetail(): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getComplianceDetail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceDetailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed compliance information about the specified member account. Details include resources that are in and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy has not been applied to them.
      */
    def getComplianceDetail(params: GetComplianceDetailRequest): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getComplianceDetail(
      params: GetComplianceDetailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceDetailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
      */
    def getNotificationChannel(): awsDashSdkLib.libRequestMod.Request[GetNotificationChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getNotificationChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNotificationChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNotificationChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall Manager SNS logs.
      */
    def getNotificationChannel(params: GetNotificationChannelRequest): awsDashSdkLib.libRequestMod.Request[GetNotificationChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getNotificationChannel(
      params: GetNotificationChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNotificationChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNotificationChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified AWS Firewall Manager policy.
      */
    def getPolicy(): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified AWS Firewall Manager policy.
      */
    def getPolicy(params: GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      params: GetPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of PolicyComplianceStatus objects in the response. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
      */
    def listComplianceStatus(): awsDashSdkLib.libRequestMod.Request[ListComplianceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listComplianceStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListComplianceStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListComplianceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of PolicyComplianceStatus objects in the response. Use PolicyComplianceStatus to get a summary of which member accounts are protected by the specified policy. 
      */
    def listComplianceStatus(params: ListComplianceStatusRequest): awsDashSdkLib.libRequestMod.Request[ListComplianceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listComplianceStatus(
      params: ListComplianceStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListComplianceStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListComplianceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a MemberAccounts object that lists the member accounts in the administrator's AWS organization. The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager administrator.
      */
    def listMemberAccounts(): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMemberAccounts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMemberAccountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a MemberAccounts object that lists the member accounts in the administrator's AWS organization. The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager administrator.
      */
    def listMemberAccounts(params: ListMemberAccountsRequest): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMemberAccounts(
      params: ListMemberAccountsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMemberAccountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of PolicySummary objects in the response.
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
      * Returns an array of PolicySummary objects in the response.
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
      * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to record SNS logs.
      */
    def putNotificationChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putNotificationChannel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to record SNS logs.
      */
    def putNotificationChannel(params: PutNotificationChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putNotificationChannel(
      params: PutNotificationChannelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Firewall Manager policy.
      */
    def putPolicy(): awsDashSdkLib.libRequestMod.Request[PutPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Firewall Manager policy.
      */
    def putPolicy(params: PutPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPolicy(
      params: PutPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AWSAccountId = java.lang.String
  type AccountRoleStatus = awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.PENDING_DELETION | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.DELETED | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComplianceViolators = js.Array[ComplianceViolator]
  type CustomerPolicyScopeId = java.lang.String
  type CustomerPolicyScopeIdList = js.Array[CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  type DependentServiceName = awsDashSdkLib.awsDashSdkLibStrings.AWSCONFIG | awsDashSdkLib.awsDashSdkLibStrings.AWSWAF | java.lang.String
  type DetailedInfo = java.lang.String
  type EvaluationResults = js.Array[EvaluationResult]
  type ManagedServiceData = java.lang.String
  type MemberAccounts = js.Array[AWSAccountId]
  type PaginationMaxResults = scala.Double
  type PaginationToken = java.lang.String
  type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]
  type PolicyComplianceStatusType = awsDashSdkLib.awsDashSdkLibStrings.COMPLIANT | awsDashSdkLib.awsDashSdkLibStrings.NON_COMPLIANT | java.lang.String
  type PolicyId = java.lang.String
  type PolicySummaryList = js.Array[PolicySummary]
  type PolicyUpdateToken = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceCount = scala.Double
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceTags = js.Array[ResourceTag]
  type ResourceType = java.lang.String
  type SecurityServiceType = awsDashSdkLib.awsDashSdkLibStrings.WAF | java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type TimeStamp = stdLib.Date
  type ViolationReason = awsDashSdkLib.awsDashSdkLibStrings.WEB_ACL_MISSING_RULE_GROUP | awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_MISSING_WEB_ACL | awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_INCORRECT_WEB_ACL | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-01-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

