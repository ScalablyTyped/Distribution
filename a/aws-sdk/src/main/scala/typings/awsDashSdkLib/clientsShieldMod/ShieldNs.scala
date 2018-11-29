package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/shield", "Shield")
@js.native
object ShieldNs extends js.Object {
  
  trait AssociateDRTLogBucketRequest extends js.Object {
    /**
         * The Amazon S3 bucket that contains your flow logs.
         */
    var LogBucket: LogBucket
  }
  
  
  trait AssociateDRTLogBucketResponse extends js.Object
  
  
  trait AssociateDRTRoleRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the role the DRT will use to access your AWS account. Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to this role. For more information see Attaching and Detaching IAM Policies.
         */
    var RoleArn: RoleArn
  }
  
  
  trait AssociateDRTRoleResponse extends js.Object
  
  
  trait AttackDetail extends js.Object {
    /**
         * List of counters that describe the attack for the specified time period.
         */
    var AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined
    /**
         * The unique identifier (ID) of the attack.
         */
    var AttackId: js.UndefOr[AttackId] = js.undefined
    /**
         * The array of AttackProperty objects.
         */
    var AttackProperties: js.UndefOr[AttackProperties] = js.undefined
    /**
         * The time the attack ended, in Unix time in seconds. For more information see timestamp.
         */
    var EndTime: js.UndefOr[AttackTimestamp] = js.undefined
    /**
         * List of mitigation actions taken for the attack.
         */
    var Mitigations: js.UndefOr[MitigationList] = js.undefined
    /**
         * The ARN (Amazon Resource Name) of the resource that was attacked.
         */
    var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    /**
         * The time the attack started, in Unix time in seconds. For more information see timestamp.
         */
    var StartTime: js.UndefOr[AttackTimestamp] = js.undefined
    /**
         * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
         */
    var SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined
  }
  
  
  trait AttackProperty extends js.Object {
    /**
         * The type of DDoS event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
         */
    var AttackLayer: js.UndefOr[AttackLayer] = js.undefined
    /**
         * Defines the DDoS attack property information that is provided.
         */
    var AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined
    /**
         * The array of Contributor objects that includes the top five contributors to an attack. 
         */
    var TopContributors: js.UndefOr[TopContributors] = js.undefined
    /**
         * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
         */
    var Total: js.UndefOr[Long] = js.undefined
    /**
         * The unit of the Value of the contributions.
         */
    var Unit: js.UndefOr[Unit] = js.undefined
  }
  
  
  trait AttackSummary extends js.Object {
    /**
         * The unique identifier (ID) of the attack.
         */
    var AttackId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The list of attacks for a specified time period.
         */
    var AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined
    /**
         * The end time of the attack, in Unix time in seconds. For more information see timestamp.
         */
    var EndTime: js.UndefOr[AttackTimestamp] = js.undefined
    /**
         * The ARN (Amazon Resource Name) of the resource that was attacked.
         */
    var ResourceArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The start time of the attack, in Unix time in seconds. For more information see timestamp.
         */
    var StartTime: js.UndefOr[AttackTimestamp] = js.undefined
  }
  
  
  trait AttackVectorDescription extends js.Object {
    /**
         * The attack type. Valid values:   UDP_TRAFFIC   UDP_FRAGMENT   GENERIC_UDP_REFLECTION   DNS_REFLECTION   NTP_REFLECTION   CHARGEN_REFLECTION   SSDP_REFLECTION   PORT_MAPPER   RIP_REFLECTION   SNMP_REFLECTION   MSSQL_REFLECTION   NET_BIOS_REFLECTION   SYN_FLOOD   ACK_FLOOD   REQUEST_FLOOD  
         */
    var VectorType: java.lang.String
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Contributor extends js.Object {
    /**
         * The name of the contributor. This is dependent on the AttackPropertyIdentifier. For example, if the AttackPropertyIdentifier is SOURCE_COUNTRY, the Name could be United States.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The contribution of this contributor expressed in Protection units. For example 10,000.
         */
    var Value: js.UndefOr[Long] = js.undefined
  }
  
  
  trait CreateProtectionRequest extends js.Object {
    /**
         * Friendly name for the Protection you are creating.
         */
    var Name: ProtectionName
    /**
         * The ARN (Amazon Resource Name) of the resource to be protected. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Elastic Load Balancer (Classic Load Balancer): arn:aws:elasticloadbalancing:region:account-id:loadbalancer/load-balancer-name     For AWS CloudFront distribution: arn:aws:cloudfront::account-id:distribution/distribution-id     For Amazon Route 53: arn:aws:route53:::hostedzone/hosted-zone-id     For an Elastic IP address: arn:aws:ec2:region:account-id:eip-allocation/allocation-id    
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait CreateProtectionResponse extends js.Object {
    /**
         * The unique identifier (ID) for the Protection object that is created.
         */
    var ProtectionId: js.UndefOr[ProtectionId] = js.undefined
  }
  
  
  trait CreateSubscriptionRequest extends js.Object
  
  
  trait CreateSubscriptionResponse extends js.Object
  
  
  trait DeleteProtectionRequest extends js.Object {
    /**
         * The unique identifier (ID) for the Protection object to be deleted.
         */
    var ProtectionId: ProtectionId
  }
  
  
  trait DeleteProtectionResponse extends js.Object
  
  
  trait DeleteSubscriptionRequest extends js.Object
  
  
  trait DeleteSubscriptionResponse extends js.Object
  
  
  trait DescribeAttackRequest extends js.Object {
    /**
         * The unique identifier (ID) for the attack that to be described.
         */
    var AttackId: AttackId
  }
  
  
  trait DescribeAttackResponse extends js.Object {
    /**
         * The attack that is described.
         */
    var Attack: js.UndefOr[AttackDetail] = js.undefined
  }
  
  
  trait DescribeDRTAccessRequest extends js.Object
  
  
  trait DescribeDRTAccessResponse extends js.Object {
    /**
         * The list of Amazon S3 buckets accessed by the DRT.
         */
    var LogBucketList: js.UndefOr[LogBucketList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  
  trait DescribeEmergencyContactSettingsRequest extends js.Object
  
  
  trait DescribeEmergencyContactSettingsResponse extends js.Object {
    /**
         * A list of email addresses that the DRT can use to contact you during a suspected attack.
         */
    var EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
  }
  
  
  trait DescribeProtectionRequest extends js.Object {
    /**
         * The unique identifier (ID) for the Protection object that is described.
         */
    var ProtectionId: ProtectionId
  }
  
  
  trait DescribeProtectionResponse extends js.Object {
    /**
         * The Protection object that is described.
         */
    var Protection: js.UndefOr[Protection] = js.undefined
  }
  
  
  trait DescribeSubscriptionRequest extends js.Object
  
  
  trait DescribeSubscriptionResponse extends js.Object {
    /**
         * The AWS Shield Advanced subscription details for an account.
         */
    var Subscription: js.UndefOr[Subscription] = js.undefined
  }
  
  
  trait DisassociateDRTLogBucketRequest extends js.Object {
    /**
         * The Amazon S3 bucket that contains your flow logs.
         */
    var LogBucket: LogBucket
  }
  
  
  trait DisassociateDRTLogBucketResponse extends js.Object
  
  
  trait DisassociateDRTRoleRequest extends js.Object
  
  
  trait DisassociateDRTRoleResponse extends js.Object
  
  
  trait EmergencyContact extends js.Object {
    /**
         * An email address that the DRT can use to contact you during a suspected attack.
         */
    var EmailAddress: EmailAddress
  }
  
  
  trait GetSubscriptionStateRequest extends js.Object
  
  
  trait GetSubscriptionStateResponse extends js.Object {
    /**
         * The status of the subscription.
         */
    var SubscriptionState: SubscriptionState
  }
  
  
  trait Limit extends js.Object {
    /**
         * The maximum number of protections that can be created for the specified Type.
         */
    var Max: js.UndefOr[Long] = js.undefined
    /**
         * The type of protection.
         */
    var Type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListAttacksRequest extends js.Object {
    /**
         * The end of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
         */
    var EndTime: js.UndefOr[TimeRange] = js.undefined
    /**
         * The maximum number of AttackSummary objects to be returned. If this is left blank, the first 20 results will be returned. This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the number of AttackSummary objects returned could be less than MaxResults, even if there are still more AttackSummary objects yet to return. If there are more AttackSummary objects to return, AWS WAF will always also return a NextToken.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The ListAttacksRequest.NextMarker value from a previous call to ListAttacksRequest. Pass null if this is the first call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The ARN (Amazon Resource Name) of the resource that was attacked. If this is left blank, all applicable resources for this account will be included.
         */
    var ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined
    /**
         * The start of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
         */
    var StartTime: js.UndefOr[TimeRange] = js.undefined
  }
  
  
  trait ListAttacksResponse extends js.Object {
    /**
         * The attack information for the specified time range.
         */
    var AttackSummaries: js.UndefOr[AttackSummaries] = js.undefined
    /**
         * The token returned by a previous call to indicate that there is more data available. If not null, more results are available. Pass this value for the NextMarker parameter in a subsequent call to ListAttacks to retrieve the next set of items. AWS WAF might return the list of AttackSummary objects in batches smaller than the number specified by MaxResults. If there are more AttackSummary objects to return, AWS WAF will always also return a NextToken.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait ListProtectionsRequest extends js.Object {
    /**
         * The maximum number of Protection objects to be returned. If this is left blank the first 20 results will be returned. This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the number of Protection objects returned could be less than MaxResults, even if there are still more Protection objects yet to return. If there are more Protection objects to return, AWS WAF will always also return a NextToken.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The ListProtectionsRequest.NextToken value from a previous call to ListProtections. Pass null if this is the first call.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  
  trait ListProtectionsResponse extends js.Object {
    /**
         * If you specify a value for MaxResults and you have more Protections than the value of MaxResults, AWS Shield Advanced returns a NextToken value in the response that allows you to list another group of Protections. For the second and subsequent ListProtections requests, specify the value of NextToken from the previous response to get information about another batch of Protections. AWS WAF might return the list of Protection objects in batches smaller than the number specified by MaxResults. If there are more Protection objects to return, AWS WAF will always also return a NextToken.
         */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
         * The array of enabled Protection objects.
         */
    var Protections: js.UndefOr[Protections] = js.undefined
  }
  
  
  trait Mitigation extends js.Object {
    /**
         * The name of the mitigation taken for this attack.
         */
    var MitigationName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Protection extends js.Object {
    /**
         * The unique identifier (ID) of the protection.
         */
    var Id: js.UndefOr[ProtectionId] = js.undefined
    /**
         * The friendly name of the protection. For example, My CloudFront distributions.
         */
    var Name: js.UndefOr[ProtectionName] = js.undefined
    /**
         * The ARN (Amazon Resource Name) of the AWS resource that is protected.
         */
    var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
  }
  
  
  trait SubResourceSummary extends js.Object {
    /**
         * The list of attack types and associated counters.
         */
    var AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined
    /**
         * The counters that describe the details of the attack.
         */
    var Counters: js.UndefOr[SummarizedCounterList] = js.undefined
    /**
         * The unique identifier (ID) of the SubResource.
         */
    var Id: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The SubResource type.
         */
    var Type: js.UndefOr[SubResourceType] = js.undefined
  }
  
  
  trait Subscription extends js.Object {
    /**
         * If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. When you initally create a subscription, AutoRenew is set to ENABLED. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
         */
    var AutoRenew: js.UndefOr[AutoRenew] = js.undefined
    /**
         * The date and time your subscription will end.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Specifies how many protections of a given type you can create.
         */
    var Limits: js.UndefOr[Limits] = js.undefined
    /**
         * The start time of the subscription, in Unix time in seconds. For more information see timestamp.
         */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The length, in seconds, of the AWS Shield Advanced subscription for the account.
         */
    var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  }
  
  
  trait SummarizedAttackVector extends js.Object {
    /**
         * The list of counters that describe the details of the attack.
         */
    var VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined
    /**
         * The attack type, for example, SNMP reflection or SYN flood.
         */
    var VectorType: java.lang.String
  }
  
  
  trait SummarizedCounter extends js.Object {
    /**
         * The average value of the counter for a specified time period.
         */
    var Average: js.UndefOr[Double] = js.undefined
    /**
         * The maximum value of the counter for a specified time period.
         */
    var Max: js.UndefOr[Double] = js.undefined
    /**
         * The number of counters for a specified time period.
         */
    var N: js.UndefOr[Integer] = js.undefined
    /**
         * The counter name.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The total of counter values for a specified time period.
         */
    var Sum: js.UndefOr[Double] = js.undefined
    /**
         * The unit of the counters.
         */
    var Unit: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait TimeRange extends js.Object {
    /**
         * The start time, in Unix time in seconds. For more information see timestamp.
         */
    var FromInclusive: js.UndefOr[AttackTimestamp] = js.undefined
    /**
         * The end time, in Unix time in seconds. For more information see timestamp.
         */
    var ToExclusive: js.UndefOr[AttackTimestamp] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTLogBucket(): awsDashSdkLib.libRequestMod.Request[AssociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTLogBucket(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDRTLogBucketResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): awsDashSdkLib.libRequestMod.Request[AssociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTLogBucket(
      params: AssociateDRTLogBucketRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDRTLogBucketResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTRole(): awsDashSdkLib.libRequestMod.Request[AssociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDRTRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTRole(params: AssociateDRTRoleRequest): awsDashSdkLib.libRequestMod.Request[AssociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
       */
    def associateDRTRole(
      params: AssociateDRTRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDRTRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
       */
    def createProtection(): awsDashSdkLib.libRequestMod.Request[CreateProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
       */
    def createProtection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProtectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
       */
    def createProtection(params: CreateProtectionRequest): awsDashSdkLib.libRequestMod.Request[CreateProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
       */
    def createProtection(
      params: CreateProtectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProtectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
       */
    def createSubscription(): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
       */
    def createSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
       */
    def createSubscription(params: CreateSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
       */
    def createSubscription(
      params: CreateSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Shield Advanced Protection.
       */
    def deleteProtection(): awsDashSdkLib.libRequestMod.Request[DeleteProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Shield Advanced Protection.
       */
    def deleteProtection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProtectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Shield Advanced Protection.
       */
    def deleteProtection(params: DeleteProtectionRequest): awsDashSdkLib.libRequestMod.Request[DeleteProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Shield Advanced Protection.
       */
    def deleteProtection(
      params: DeleteProtectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProtectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
       */
    def deleteSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
       */
    def deleteSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
       */
    def deleteSubscription(params: DeleteSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
       */
    def deleteSubscription(
      params: DeleteSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the details of a DDoS attack. 
       */
    def describeAttack(): awsDashSdkLib.libRequestMod.Request[DescribeAttackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the details of a DDoS attack. 
       */
    def describeAttack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAttackResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAttackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the details of a DDoS attack. 
       */
    def describeAttack(params: DescribeAttackRequest): awsDashSdkLib.libRequestMod.Request[DescribeAttackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the details of a DDoS attack. 
       */
    def describeAttack(
      params: DescribeAttackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAttackResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAttackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
       */
    def describeDRTAccess(): awsDashSdkLib.libRequestMod.Request[DescribeDRTAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
       */
    def describeDRTAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDRTAccessResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDRTAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
       */
    def describeDRTAccess(params: DescribeDRTAccessRequest): awsDashSdkLib.libRequestMod.Request[DescribeDRTAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
       */
    def describeDRTAccess(
      params: DescribeDRTAccessRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDRTAccessResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDRTAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the email addresses that the DRT can use to contact you during a suspected attack.
       */
    def describeEmergencyContactSettings(): awsDashSdkLib.libRequestMod.Request[DescribeEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the email addresses that the DRT can use to contact you during a suspected attack.
       */
    def describeEmergencyContactSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEmergencyContactSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the email addresses that the DRT can use to contact you during a suspected attack.
       */
    def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the email addresses that the DRT can use to contact you during a suspected attack.
       */
    def describeEmergencyContactSettings(
      params: DescribeEmergencyContactSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEmergencyContactSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the details of a Protection object.
       */
    def describeProtection(): awsDashSdkLib.libRequestMod.Request[DescribeProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the details of a Protection object.
       */
    def describeProtection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeProtectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the details of a Protection object.
       */
    def describeProtection(params: DescribeProtectionRequest): awsDashSdkLib.libRequestMod.Request[DescribeProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the details of a Protection object.
       */
    def describeProtection(
      params: DescribeProtectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeProtectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeProtectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides details about the AWS Shield Advanced subscription for an account.
       */
    def describeSubscription(): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides details about the AWS Shield Advanced subscription for an account.
       */
    def describeSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides details about the AWS Shield Advanced subscription for an account.
       */
    def describeSubscription(params: DescribeSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides details about the AWS Shield Advanced subscription for an account.
       */
    def describeSubscription(
      params: DescribeSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
       */
    def disassociateDRTLogBucket(): awsDashSdkLib.libRequestMod.Request[DisassociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
       */
    def disassociateDRTLogBucket(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDRTLogBucketResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
       */
    def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
       */
    def disassociateDRTLogBucket(
      params: DisassociateDRTLogBucketRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDRTLogBucketResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDRTLogBucketResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
       */
    def disassociateDRTRole(): awsDashSdkLib.libRequestMod.Request[DisassociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
       */
    def disassociateDRTRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDRTRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
       */
    def disassociateDRTRole(params: DisassociateDRTRoleRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
       */
    def disassociateDRTRole(
      params: DisassociateDRTRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDRTRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDRTRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SubscriptionState, either Active or Inactive.
       */
    def getSubscriptionState(): awsDashSdkLib.libRequestMod.Request[GetSubscriptionStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SubscriptionState, either Active or Inactive.
       */
    def getSubscriptionState(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSubscriptionStateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SubscriptionState, either Active or Inactive.
       */
    def getSubscriptionState(params: GetSubscriptionStateRequest): awsDashSdkLib.libRequestMod.Request[GetSubscriptionStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SubscriptionState, either Active or Inactive.
       */
    def getSubscriptionState(
      params: GetSubscriptionStateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSubscriptionStateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
       */
    def listAttacks(): awsDashSdkLib.libRequestMod.Request[ListAttacksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
       */
    def listAttacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttacksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttacksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
       */
    def listAttacks(params: ListAttacksRequest): awsDashSdkLib.libRequestMod.Request[ListAttacksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
       */
    def listAttacks(
      params: ListAttacksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttacksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttacksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Protection objects for the account.
       */
    def listProtections(): awsDashSdkLib.libRequestMod.Request[ListProtectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Protection objects for the account.
       */
    def listProtections(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProtectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProtectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Protection objects for the account.
       */
    def listProtections(params: ListProtectionsRequest): awsDashSdkLib.libRequestMod.Request[ListProtectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Protection objects for the account.
       */
    def listProtections(
      params: ListProtectionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProtectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProtectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
       */
    def updateEmergencyContactSettings(): awsDashSdkLib.libRequestMod.Request[UpdateEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
       */
    def updateEmergencyContactSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEmergencyContactSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
       */
    def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
       */
    def updateEmergencyContactSettings(
      params: UpdateEmergencyContactSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEmergencyContactSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEmergencyContactSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
       */
    def updateSubscription(): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
       */
    def updateSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
       */
    def updateSubscription(params: UpdateSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
       */
    def updateSubscription(
      params: UpdateSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    /**
         * A list of email addresses that the DRT can use to contact you during a suspected attack.
         */
    var EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
  }
  
  
  trait UpdateEmergencyContactSettingsResponse extends js.Object
  
  
  trait UpdateSubscriptionRequest extends js.Object {
    /**
         * When you initally create a subscription, AutoRenew is set to ENABLED. If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
         */
    var AutoRenew: js.UndefOr[AutoRenew] = js.undefined
  }
  
  
  trait UpdateSubscriptionResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type AttackId = java.lang.String
  type AttackLayer = awsDashSdkLib.awsDashSdkLibStrings.NETWORK | awsDashSdkLib.awsDashSdkLibStrings.APPLICATION | java.lang.String
  type AttackProperties = js.Array[AttackProperty]
  type AttackPropertyIdentifier = awsDashSdkLib.awsDashSdkLibStrings.DESTINATION_URL | awsDashSdkLib.awsDashSdkLibStrings.REFERRER | awsDashSdkLib.awsDashSdkLibStrings.SOURCE_ASN | awsDashSdkLib.awsDashSdkLibStrings.SOURCE_COUNTRY | awsDashSdkLib.awsDashSdkLibStrings.SOURCE_IP_ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.SOURCE_USER_AGENT | java.lang.String
  type AttackSummaries = js.Array[AttackSummary]
  type AttackTimestamp = stdLib.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  type AutoRenew = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EmailAddress = java.lang.String
  type EmergencyContactList = js.Array[EmergencyContact]
  type Integer = scala.Double
  type Limits = js.Array[Limit]
  type LogBucket = java.lang.String
  type LogBucketList = js.Array[LogBucket]
  type Long = scala.Double
  type MaxResults = scala.Double
  type MitigationList = js.Array[Mitigation]
  type ProtectionId = java.lang.String
  type ProtectionName = java.lang.String
  type Protections = js.Array[Protection]
  type ResourceArn = java.lang.String
  type ResourceArnFilterList = js.Array[ResourceArn]
  type RoleArn = java.lang.String
  type String = java.lang.String
  type SubResourceSummaryList = js.Array[SubResourceSummary]
  type SubResourceType = awsDashSdkLib.awsDashSdkLibStrings.IP | awsDashSdkLib.awsDashSdkLibStrings.URL | java.lang.String
  type SubscriptionState = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.INACTIVE | java.lang.String
  type SummarizedAttackVectorList = js.Array[SummarizedAttackVector]
  type SummarizedCounterList = js.Array[SummarizedCounter]
  type Timestamp = stdLib.Date
  type Token = java.lang.String
  type TopContributors = js.Array[Contributor]
  type Unit = awsDashSdkLib.awsDashSdkLibStrings.BITS | awsDashSdkLib.awsDashSdkLibStrings.BYTES | awsDashSdkLib.awsDashSdkLibStrings.PACKETS | awsDashSdkLib.awsDashSdkLibStrings.REQUESTS | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-06-02` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

