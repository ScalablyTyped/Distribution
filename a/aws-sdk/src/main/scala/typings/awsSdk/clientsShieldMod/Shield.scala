package typings.awsSdk.clientsShieldMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shield extends Service {
  
  /**
    * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing log data such as Application Load Balancer access logs, CloudFront logs, or logs from third party sources. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the SRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  def associateDRTLogBucket(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTLogBucketResponse, scala.Unit]): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing log data such as Application Load Balancer access logs, CloudFront logs, or logs from third party sources. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the SRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  def associateDRTLogBucket(
    params: AssociateDRTLogBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTLogBucketResponse, scala.Unit]
  ): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  
  /**
    * Authorizes the Shield Response Team (SRT) using the specified role, to access your Amazon Web Services account to assist with DDoS attack mitigation during potential attacks. This enables the SRT to inspect your WAF configuration and create or update WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role that you'll specify in the request. You can access this policy in the IAM console at AWSShieldDRTAccessPolicy. For more information see Adding and removing IAM identity permissions. The role must also trust the service principal drt.shield.amazonaws.com. For more information, see IAM JSON policy elements: Principal. The SRT will have access only to your WAF and Shield resources. By submitting this request, you authorize the SRT to inspect your WAF and Shield configuration and create and update WAF rules and web ACLs on your behalf. The SRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a user permissions to pass a role to an Amazon Web Services service.  To use the services of the SRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(): Request[AssociateDRTRoleResponse, AWSError] = js.native
  def associateDRTRole(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTRoleResponse, scala.Unit]): Request[AssociateDRTRoleResponse, AWSError] = js.native
  /**
    * Authorizes the Shield Response Team (SRT) using the specified role, to access your Amazon Web Services account to assist with DDoS attack mitigation during potential attacks. This enables the SRT to inspect your WAF configuration and create or update WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role that you'll specify in the request. You can access this policy in the IAM console at AWSShieldDRTAccessPolicy. For more information see Adding and removing IAM identity permissions. The role must also trust the service principal drt.shield.amazonaws.com. For more information, see IAM JSON policy elements: Principal. The SRT will have access only to your WAF and Shield resources. By submitting this request, you authorize the SRT to inspect your WAF and Shield configuration and create and update WAF rules and web ACLs on your behalf. The SRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a user permissions to pass a role to an Amazon Web Services service.  To use the services of the SRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse, AWSError] = js.native
  def associateDRTRole(
    params: AssociateDRTRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTRoleResponse, scala.Unit]
  ): Request[AssociateDRTRoleResponse, AWSError] = js.native
  
  /**
    * Adds health-based detection to the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack detection and response.  You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the WAF Developer Guide. 
    */
  def associateHealthCheck(): Request[AssociateHealthCheckResponse, AWSError] = js.native
  def associateHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ AssociateHealthCheckResponse, scala.Unit]): Request[AssociateHealthCheckResponse, AWSError] = js.native
  /**
    * Adds health-based detection to the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack detection and response.  You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the WAF Developer Guide. 
    */
  def associateHealthCheck(params: AssociateHealthCheckRequest): Request[AssociateHealthCheckResponse, AWSError] = js.native
  def associateHealthCheck(
    params: AssociateHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateHealthCheckResponse, scala.Unit]
  ): Request[AssociateHealthCheckResponse, AWSError] = js.native
  
  /**
    * Initializes proactive engagement and sets the list of contacts for the Shield Response Team (SRT) to use. You must provide at least one phone number in the emergency contact list.  After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use the calls DisableProactiveEngagement and EnableProactiveEngagement.   This call defines the list of email addresses and phone numbers that the SRT can use to contact you for escalations to the SRT and to initiate proactive customer support. The contacts that you provide in the request replace any contacts that were already defined. If you already have contacts defined and want to use them, retrieve the list using DescribeEmergencyContactSettings and then provide it to this call.  
    */
  def associateProactiveEngagementDetails(): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  def associateProactiveEngagementDetails(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateProactiveEngagementDetailsResponse, 
      scala.Unit
    ]
  ): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  /**
    * Initializes proactive engagement and sets the list of contacts for the Shield Response Team (SRT) to use. You must provide at least one phone number in the emergency contact list.  After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use the calls DisableProactiveEngagement and EnableProactiveEngagement.   This call defines the list of email addresses and phone numbers that the SRT can use to contact you for escalations to the SRT and to initiate proactive customer support. The contacts that you provide in the request replace any contacts that were already defined. If you already have contacts defined and want to use them, retrieve the list using DescribeEmergencyContactSettings and then provide it to this call.  
    */
  def associateProactiveEngagementDetails(params: AssociateProactiveEngagementDetailsRequest): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  def associateProactiveEngagementDetails(
    params: AssociateProactiveEngagementDetailsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateProactiveEngagementDetailsResponse, 
      scala.Unit
    ]
  ): Request[AssociateProactiveEngagementDetailsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Shield: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Enables Shield Advanced for a specific Amazon Web Services resource. The resource can be an Amazon CloudFront distribution, Amazon Route 53 hosted zone, Global Accelerator standard accelerator, Elastic IP Address, Application Load Balancer, or a Classic Load Balancer. You can protect Amazon EC2 instances and Network Load Balancers by association with protected Amazon EC2 Elastic IP addresses. You can add protection to only a single resource with each CreateProtection request. You can add protection to multiple resources at once through the Shield Advanced console at https://console.aws.amazon.com/wafv2/shieldv2#/. For more information see Getting Started with Shield Advanced and Adding Shield Advanced protection to Amazon Web Services resources.
    */
  def createProtection(): Request[CreateProtectionResponse, AWSError] = js.native
  def createProtection(callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionResponse, scala.Unit]): Request[CreateProtectionResponse, AWSError] = js.native
  /**
    * Enables Shield Advanced for a specific Amazon Web Services resource. The resource can be an Amazon CloudFront distribution, Amazon Route 53 hosted zone, Global Accelerator standard accelerator, Elastic IP Address, Application Load Balancer, or a Classic Load Balancer. You can protect Amazon EC2 instances and Network Load Balancers by association with protected Amazon EC2 Elastic IP addresses. You can add protection to only a single resource with each CreateProtection request. You can add protection to multiple resources at once through the Shield Advanced console at https://console.aws.amazon.com/wafv2/shieldv2#/. For more information see Getting Started with Shield Advanced and Adding Shield Advanced protection to Amazon Web Services resources.
    */
  def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse, AWSError] = js.native
  def createProtection(
    params: CreateProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionResponse, scala.Unit]
  ): Request[CreateProtectionResponse, AWSError] = js.native
  
  /**
    * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def createProtectionGroup(): Request[CreateProtectionGroupResponse, AWSError] = js.native
  def createProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionGroupResponse, scala.Unit]): Request[CreateProtectionGroupResponse, AWSError] = js.native
  /**
    * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def createProtectionGroup(params: CreateProtectionGroupRequest): Request[CreateProtectionGroupResponse, AWSError] = js.native
  def createProtectionGroup(
    params: CreateProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionGroupResponse, scala.Unit]
  ): Request[CreateProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Activates Shield Advanced for an account.  For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against the organization's payer account, regardless of whether the payer account itself is subscribed.   When you initially create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(): Request[CreateSubscriptionResponse, AWSError] = js.native
  def createSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionResponse, scala.Unit]): Request[CreateSubscriptionResponse, AWSError] = js.native
  /**
    * Activates Shield Advanced for an account.  For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against the organization's payer account, regardless of whether the payer account itself is subscribed.   When you initially create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse, AWSError] = js.native
  def createSubscription(
    params: CreateSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionResponse, scala.Unit]
  ): Request[CreateSubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes an Shield Advanced Protection.
    */
  def deleteProtection(): Request[DeleteProtectionResponse, AWSError] = js.native
  def deleteProtection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionResponse, scala.Unit]): Request[DeleteProtectionResponse, AWSError] = js.native
  /**
    * Deletes an Shield Advanced Protection.
    */
  def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse, AWSError] = js.native
  def deleteProtection(
    params: DeleteProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionResponse, scala.Unit]
  ): Request[DeleteProtectionResponse, AWSError] = js.native
  
  /**
    * Removes the specified protection group.
    */
  def deleteProtectionGroup(): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  def deleteProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionGroupResponse, scala.Unit]): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  /**
    * Removes the specified protection group.
    */
  def deleteProtectionGroup(params: DeleteProtectionGroupRequest): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  def deleteProtectionGroup(
    params: DeleteProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionGroupResponse, scala.Unit]
  ): Request[DeleteProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Removes Shield Advanced from an account. Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(): Request[DeleteSubscriptionResponse, AWSError] = js.native
  def deleteSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionResponse, scala.Unit]): Request[DeleteSubscriptionResponse, AWSError] = js.native
  /**
    * Removes Shield Advanced from an account. Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse, AWSError] = js.native
  def deleteSubscription(
    params: DeleteSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionResponse, scala.Unit]
  ): Request[DeleteSubscriptionResponse, AWSError] = js.native
  
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(): Request[DescribeAttackResponse, AWSError] = js.native
  def describeAttack(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackResponse, scala.Unit]): Request[DescribeAttackResponse, AWSError] = js.native
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse, AWSError] = js.native
  def describeAttack(
    params: DescribeAttackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackResponse, scala.Unit]
  ): Request[DescribeAttackResponse, AWSError] = js.native
  
  /**
    * Provides information about the number and type of attacks Shield has detected in the last year for all resources that belong to your account, regardless of whether you've defined Shield protections for them. This operation is available to Shield customers as well as to Shield Advanced customers. The operation returns data for the time range of midnight UTC, one year ago, to midnight UTC, today. For example, if the current time is 2020-10-26 15:39:32 PDT, equal to 2020-10-26 22:39:32 UTC, then the time range for the attack data returned is from 2019-10-26 00:00:00 UTC to 2020-10-26 00:00:00 UTC.  The time range indicates the period covered by the attack statistics data items.
    */
  def describeAttackStatistics(): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  def describeAttackStatistics(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackStatisticsResponse, scala.Unit]
  ): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  /**
    * Provides information about the number and type of attacks Shield has detected in the last year for all resources that belong to your account, regardless of whether you've defined Shield protections for them. This operation is available to Shield customers as well as to Shield Advanced customers. The operation returns data for the time range of midnight UTC, one year ago, to midnight UTC, today. For example, if the current time is 2020-10-26 15:39:32 PDT, equal to 2020-10-26 22:39:32 UTC, then the time range for the attack data returned is from 2019-10-26 00:00:00 UTC to 2020-10-26 00:00:00 UTC.  The time range indicates the period covered by the attack statistics data items.
    */
  def describeAttackStatistics(params: DescribeAttackStatisticsRequest): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  def describeAttackStatistics(
    params: DescribeAttackStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackStatisticsResponse, scala.Unit]
  ): Request[DescribeAttackStatisticsResponse, AWSError] = js.native
  
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the Shield Response Team (SRT) to access your Amazon Web Services account while assisting with attack mitigation.
    */
  def describeDRTAccess(): Request[DescribeDRTAccessResponse, AWSError] = js.native
  def describeDRTAccess(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDRTAccessResponse, scala.Unit]): Request[DescribeDRTAccessResponse, AWSError] = js.native
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the Shield Response Team (SRT) to access your Amazon Web Services account while assisting with attack mitigation.
    */
  def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse, AWSError] = js.native
  def describeDRTAccess(
    params: DescribeDRTAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDRTAccessResponse, scala.Unit]
  ): Request[DescribeDRTAccessResponse, AWSError] = js.native
  
  /**
    * A list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
    */
  def describeEmergencyContactSettings(): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  def describeEmergencyContactSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmergencyContactSettingsResponse, scala.Unit]
  ): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * A list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
    */
  def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  def describeEmergencyContactSettings(
    params: DescribeEmergencyContactSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmergencyContactSettingsResponse, scala.Unit]
  ): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(): Request[DescribeProtectionResponse, AWSError] = js.native
  def describeProtection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionResponse, scala.Unit]): Request[DescribeProtectionResponse, AWSError] = js.native
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse, AWSError] = js.native
  def describeProtection(
    params: DescribeProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionResponse, scala.Unit]
  ): Request[DescribeProtectionResponse, AWSError] = js.native
  
  /**
    * Returns the specification for the specified protection group.
    */
  def describeProtectionGroup(): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  def describeProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionGroupResponse, scala.Unit]): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  /**
    * Returns the specification for the specified protection group.
    */
  def describeProtectionGroup(params: DescribeProtectionGroupRequest): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  def describeProtectionGroup(
    params: DescribeProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionGroupResponse, scala.Unit]
  ): Request[DescribeProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Provides details about the Shield Advanced subscription for an account.
    */
  def describeSubscription(): Request[DescribeSubscriptionResponse, AWSError] = js.native
  def describeSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionResponse, scala.Unit]): Request[DescribeSubscriptionResponse, AWSError] = js.native
  /**
    * Provides details about the Shield Advanced subscription for an account.
    */
  def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse, AWSError] = js.native
  def describeSubscription(
    params: DescribeSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionResponse, scala.Unit]
  ): Request[DescribeSubscriptionResponse, AWSError] = js.native
  
  /**
    * Disable the Shield Advanced automatic application layer DDoS mitigation feature for the protected resource. This stops Shield Advanced from creating, verifying, and applying WAF rules for attacks that it detects for the resource. 
    */
  def disableApplicationLayerAutomaticResponse(): Request[DisableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  def disableApplicationLayerAutomaticResponse(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisableApplicationLayerAutomaticResponseResponse, 
      scala.Unit
    ]
  ): Request[DisableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  /**
    * Disable the Shield Advanced automatic application layer DDoS mitigation feature for the protected resource. This stops Shield Advanced from creating, verifying, and applying WAF rules for attacks that it detects for the resource. 
    */
  def disableApplicationLayerAutomaticResponse(params: DisableApplicationLayerAutomaticResponseRequest): Request[DisableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  def disableApplicationLayerAutomaticResponse(
    params: DisableApplicationLayerAutomaticResponseRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisableApplicationLayerAutomaticResponseResponse, 
      scala.Unit
    ]
  ): Request[DisableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  
  /**
    * Removes authorization from the Shield Response Team (SRT) to notify contacts about escalations to the SRT and to initiate proactive customer support.
    */
  def disableProactiveEngagement(): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  def disableProactiveEngagement(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableProactiveEngagementResponse, scala.Unit]
  ): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  /**
    * Removes authorization from the Shield Response Team (SRT) to notify contacts about escalations to the SRT and to initiate proactive customer support.
    */
  def disableProactiveEngagement(params: DisableProactiveEngagementRequest): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  def disableProactiveEngagement(
    params: DisableProactiveEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableProactiveEngagementResponse, scala.Unit]
  ): Request[DisableProactiveEngagementResponse, AWSError] = js.native
  
  /**
    * Removes the Shield Response Team's (SRT) access to the specified Amazon S3 bucket containing the logs that you shared previously.
    */
  def disassociateDRTLogBucket(): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  def disassociateDRTLogBucket(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTLogBucketResponse, scala.Unit]
  ): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Removes the Shield Response Team's (SRT) access to the specified Amazon S3 bucket containing the logs that you shared previously.
    */
  def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  def disassociateDRTLogBucket(
    params: DisassociateDRTLogBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTLogBucketResponse, scala.Unit]
  ): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  
  /**
    * Removes the Shield Response Team's (SRT) access to your Amazon Web Services account.
    */
  def disassociateDRTRole(): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  def disassociateDRTRole(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTRoleResponse, scala.Unit]): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  /**
    * Removes the Shield Response Team's (SRT) access to your Amazon Web Services account.
    */
  def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  def disassociateDRTRole(
    params: DisassociateDRTRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTRoleResponse, scala.Unit]
  ): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  
  /**
    * Removes health-based detection from the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack detection and response.  You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the WAF Developer Guide. 
    */
  def disassociateHealthCheck(): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  def disassociateHealthCheck(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateHealthCheckResponse, scala.Unit]): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  /**
    * Removes health-based detection from the Shield Advanced protection for a resource. Shield Advanced health-based detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack detection and response.  You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced protection. For more information, see Shield Advanced Health-Based Detection in the WAF Developer Guide. 
    */
  def disassociateHealthCheck(params: DisassociateHealthCheckRequest): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  def disassociateHealthCheck(
    params: DisassociateHealthCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateHealthCheckResponse, scala.Unit]
  ): Request[DisassociateHealthCheckResponse, AWSError] = js.native
  
  /**
    * Enable the Shield Advanced automatic application layer DDoS mitigation for the protected resource.   This feature is available for Amazon CloudFront distributions and Application Load Balancers only.  This causes Shield Advanced to create, verify, and apply WAF rules for DDoS attacks that it detects for the resource. Shield Advanced applies the rules in a Shield rule group inside the web ACL that you've associated with the resource. For information about how automatic mitigation works and the requirements for using it, see Shield Advanced automatic application layer DDoS mitigation.  Don't use this action to make changes to automatic mitigation settings when it's already enabled for a resource. Instead, use UpdateApplicationLayerAutomaticResponse.  To use this feature, you must associate a web ACL with the protected resource. The web ACL must be created using the latest version of WAF (v2). You can associate the web ACL through the Shield Advanced console at https://console.aws.amazon.com/wafv2/shieldv2#/. For more information, see Getting Started with Shield Advanced. You can also associate the web ACL to the resource through the WAF console or the WAF API, but you must manage Shield Advanced automatic mitigation through Shield Advanced. For information about WAF, see WAF Developer Guide.
    */
  def enableApplicationLayerAutomaticResponse(): Request[EnableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  def enableApplicationLayerAutomaticResponse(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ EnableApplicationLayerAutomaticResponseResponse, 
      scala.Unit
    ]
  ): Request[EnableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  /**
    * Enable the Shield Advanced automatic application layer DDoS mitigation for the protected resource.   This feature is available for Amazon CloudFront distributions and Application Load Balancers only.  This causes Shield Advanced to create, verify, and apply WAF rules for DDoS attacks that it detects for the resource. Shield Advanced applies the rules in a Shield rule group inside the web ACL that you've associated with the resource. For information about how automatic mitigation works and the requirements for using it, see Shield Advanced automatic application layer DDoS mitigation.  Don't use this action to make changes to automatic mitigation settings when it's already enabled for a resource. Instead, use UpdateApplicationLayerAutomaticResponse.  To use this feature, you must associate a web ACL with the protected resource. The web ACL must be created using the latest version of WAF (v2). You can associate the web ACL through the Shield Advanced console at https://console.aws.amazon.com/wafv2/shieldv2#/. For more information, see Getting Started with Shield Advanced. You can also associate the web ACL to the resource through the WAF console or the WAF API, but you must manage Shield Advanced automatic mitigation through Shield Advanced. For information about WAF, see WAF Developer Guide.
    */
  def enableApplicationLayerAutomaticResponse(params: EnableApplicationLayerAutomaticResponseRequest): Request[EnableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  def enableApplicationLayerAutomaticResponse(
    params: EnableApplicationLayerAutomaticResponseRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ EnableApplicationLayerAutomaticResponseResponse, 
      scala.Unit
    ]
  ): Request[EnableApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  
  /**
    * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT and to initiate proactive customer support.
    */
  def enableProactiveEngagement(): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  def enableProactiveEngagement(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableProactiveEngagementResponse, scala.Unit]
  ): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  /**
    * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT and to initiate proactive customer support.
    */
  def enableProactiveEngagement(params: EnableProactiveEngagementRequest): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  def enableProactiveEngagement(
    params: EnableProactiveEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableProactiveEngagementResponse, scala.Unit]
  ): Request[EnableProactiveEngagementResponse, AWSError] = js.native
  
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(): Request[GetSubscriptionStateResponse, AWSError] = js.native
  def getSubscriptionState(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionStateResponse, scala.Unit]): Request[GetSubscriptionStateResponse, AWSError] = js.native
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse, AWSError] = js.native
  def getSubscriptionState(
    params: GetSubscriptionStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionStateResponse, scala.Unit]
  ): Request[GetSubscriptionStateResponse, AWSError] = js.native
  
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(): Request[ListAttacksResponse, AWSError] = js.native
  def listAttacks(callback: js.Function2[/* err */ AWSError, /* data */ ListAttacksResponse, scala.Unit]): Request[ListAttacksResponse, AWSError] = js.native
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse, AWSError] = js.native
  def listAttacks(
    params: ListAttacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttacksResponse, scala.Unit]
  ): Request[ListAttacksResponse, AWSError] = js.native
  
  /**
    * Retrieves ProtectionGroup objects for the account. You can retrieve all protection groups or you can provide filtering criteria and retrieve just the subset of protection groups that match the criteria. 
    */
  def listProtectionGroups(): Request[ListProtectionGroupsResponse, AWSError] = js.native
  def listProtectionGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionGroupsResponse, scala.Unit]): Request[ListProtectionGroupsResponse, AWSError] = js.native
  /**
    * Retrieves ProtectionGroup objects for the account. You can retrieve all protection groups or you can provide filtering criteria and retrieve just the subset of protection groups that match the criteria. 
    */
  def listProtectionGroups(params: ListProtectionGroupsRequest): Request[ListProtectionGroupsResponse, AWSError] = js.native
  def listProtectionGroups(
    params: ListProtectionGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionGroupsResponse, scala.Unit]
  ): Request[ListProtectionGroupsResponse, AWSError] = js.native
  
  /**
    * Retrieves Protection objects for the account. You can retrieve all protections or you can provide filtering criteria and retrieve just the subset of protections that match the criteria. 
    */
  def listProtections(): Request[ListProtectionsResponse, AWSError] = js.native
  def listProtections(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionsResponse, scala.Unit]): Request[ListProtectionsResponse, AWSError] = js.native
  /**
    * Retrieves Protection objects for the account. You can retrieve all protections or you can provide filtering criteria and retrieve just the subset of protections that match the criteria. 
    */
  def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse, AWSError] = js.native
  def listProtections(
    params: ListProtectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionsResponse, scala.Unit]
  ): Request[ListProtectionsResponse, AWSError] = js.native
  
  /**
    * Retrieves the resources that are included in the protection group. 
    */
  def listResourcesInProtectionGroup(): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  def listResourcesInProtectionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesInProtectionGroupResponse, scala.Unit]
  ): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  /**
    * Retrieves the resources that are included in the protection group. 
    */
  def listResourcesInProtectionGroup(params: ListResourcesInProtectionGroupRequest): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  def listResourcesInProtectionGroup(
    params: ListResourcesInProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesInProtectionGroupResponse, scala.Unit]
  ): Request[ListResourcesInProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in Shield.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in Shield.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds or updates tags for a resource in Shield.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, scala.Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or updates tags for a resource in Shield.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, scala.Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a resource in Shield.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, scala.Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource in Shield.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, scala.Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing Shield Advanced automatic application layer DDoS mitigation configuration for the specified resource.
    */
  def updateApplicationLayerAutomaticResponse(): Request[UpdateApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  def updateApplicationLayerAutomaticResponse(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateApplicationLayerAutomaticResponseResponse, 
      scala.Unit
    ]
  ): Request[UpdateApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  /**
    * Updates an existing Shield Advanced automatic application layer DDoS mitigation configuration for the specified resource.
    */
  def updateApplicationLayerAutomaticResponse(params: UpdateApplicationLayerAutomaticResponseRequest): Request[UpdateApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  def updateApplicationLayerAutomaticResponse(
    params: UpdateApplicationLayerAutomaticResponseRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateApplicationLayerAutomaticResponseResponse, 
      scala.Unit
    ]
  ): Request[UpdateApplicationLayerAutomaticResponseResponse, AWSError] = js.native
  
  /**
    * Updates the details of the list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
    */
  def updateEmergencyContactSettings(): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  def updateEmergencyContactSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmergencyContactSettingsResponse, scala.Unit]
  ): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * Updates the details of the list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
    */
  def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  def updateEmergencyContactSettings(
    params: UpdateEmergencyContactSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmergencyContactSettingsResponse, scala.Unit]
  ): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  
  /**
    * Updates an existing protection group. A protection group is a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def updateProtectionGroup(): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  def updateProtectionGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProtectionGroupResponse, scala.Unit]): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  /**
    * Updates an existing protection group. A protection group is a grouping of protected resources so they can be handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  def updateProtectionGroup(params: UpdateProtectionGroupRequest): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  def updateProtectionGroup(
    params: UpdateProtectionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProtectionGroupResponse, scala.Unit]
  ): Request[UpdateProtectionGroupResponse, AWSError] = js.native
  
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.  For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against the organization's payer account, regardless of whether the payer account itself is subscribed.  
    */
  def updateSubscription(): Request[UpdateSubscriptionResponse, AWSError] = js.native
  def updateSubscription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionResponse, scala.Unit]): Request[UpdateSubscriptionResponse, AWSError] = js.native
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.  For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against the organization's payer account, regardless of whether the payer account itself is subscribed.  
    */
  def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse, AWSError] = js.native
  def updateSubscription(
    params: UpdateSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionResponse, scala.Unit]
  ): Request[UpdateSubscriptionResponse, AWSError] = js.native
}
